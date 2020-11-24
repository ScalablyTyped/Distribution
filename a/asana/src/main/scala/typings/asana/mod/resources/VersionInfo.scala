package typings.asana.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionInfo extends js.Object {
  
  var language: String = js.native
  
  var language_version: String = js.native
  
  var os: String = js.native
  
  var os_version: String = js.native
  
  var version: String = js.native
}
object VersionInfo {
  
  @scala.inline
  def apply(language: String, language_version: String, os: String, os_version: String, version: String): VersionInfo = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], language_version = language_version.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], os_version = os_version.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionInfo]
  }
  
  @scala.inline
  implicit class VersionInfoOps[Self <: VersionInfo] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_version(value: String): Self = this.set("language_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs_version(value: String): Self = this.set("os_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
