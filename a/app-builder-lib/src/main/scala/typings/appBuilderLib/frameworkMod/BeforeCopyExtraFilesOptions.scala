package typings.appBuilderLib.frameworkMod

import typings.appBuilderLib.integrityMod.AsarIntegrity
import typings.appBuilderLib.mod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeCopyExtraFilesOptions extends js.Object {
  
  var appOutDir: String = js.native
  
  var asarIntegrity: AsarIntegrity | Null = js.native
  
  var packager: PlatformPackager[_] = js.native
  
  var platformName: String = js.native
}
object BeforeCopyExtraFilesOptions {
  
  @scala.inline
  def apply(appOutDir: String, packager: PlatformPackager[_], platformName: String): BeforeCopyExtraFilesOptions = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCopyExtraFilesOptions]
  }
  
  @scala.inline
  implicit class BeforeCopyExtraFilesOptionsOps[Self <: BeforeCopyExtraFilesOptions] (val x: Self) extends AnyVal {
    
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
    def setAppOutDir(value: String): Self = this.set("appOutDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackager(value: PlatformPackager[_]): Self = this.set("packager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformName(value: String): Self = this.set("platformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsarIntegrity(value: AsarIntegrity): Self = this.set("asarIntegrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsarIntegrityNull: Self = this.set("asarIntegrity", null)
  }
}
