package typings.appBuilderLib.macOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.dir
import typings.appBuilderLib.appBuilderLibStrings.file
import typings.appBuilderLib.appBuilderLibStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DmgContent extends js.Object {
  
  /**
    * The name of the file within the DMG. Defaults to basename of `path`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The path of the file within the DMG.
    */
  var path: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[link | file | dir] = js.native
  
  /**
    * The device-independent pixel offset from the left of the window to the **center** of the icon.
    */
  var x: Double = js.native
  
  /**
    * The device-independent pixel offset from the top of the window to the **center** of the icon.
    */
  var y: Double = js.native
}
object DmgContent {
  
  @scala.inline
  def apply(x: Double, y: Double): DmgContent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DmgContent]
  }
  
  @scala.inline
  implicit class DmgContentOps[Self <: DmgContent] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setType(value: link | file | dir): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
