package typings.appBuilderLib.nsisOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.admin
import typings.appBuilderLib.appBuilderLibStrings.highest
import typings.appBuilderLib.appBuilderLibStrings.user
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortableOptions
  extends TargetSpecificOptions
     with CommonNsisOptions {
  
  /**
    * The [requested execution level](http://nsis.sourceforge.net/Reference/RequestExecutionLevel) for Windows.
    * @default user
    */
  val requestExecutionLevel: js.UndefOr[user | highest | admin] = js.native
  
  /**
    * The image to show while the portable executable is extracting. This image must be a bitmap (`.bmp`) image.
    */
  val splashImage: js.UndefOr[String | Null] = js.native
  
  /**
    * The unpack directory name in [TEMP](https://www.askvg.com/where-does-windows-store-temporary-files-and-how-to-change-temp-folder-location/) directory.
    *
    * Defaults to [uuid](https://github.com/segmentio/ksuid) of build (changed on each build of portable executable).
    */
  val unpackDirName: js.UndefOr[String] = js.native
}
object PortableOptions {
  
  @scala.inline
  def apply(): PortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortableOptions]
  }
  
  @scala.inline
  implicit class PortableOptionsOps[Self <: PortableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRequestExecutionLevel(value: user | highest | admin): Self = this.set("requestExecutionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestExecutionLevel: Self = this.set("requestExecutionLevel", js.undefined)
    
    @scala.inline
    def setSplashImage(value: String): Self = this.set("splashImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplashImage: Self = this.set("splashImage", js.undefined)
    
    @scala.inline
    def setSplashImageNull: Self = this.set("splashImage", null)
    
    @scala.inline
    def setUnpackDirName(value: String): Self = this.set("unpackDirName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnpackDirName: Self = this.set("unpackDirName", js.undefined)
  }
}
