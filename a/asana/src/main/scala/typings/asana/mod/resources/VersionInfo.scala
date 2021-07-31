package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionInfo extends StObject {
  
  var language: String
  
  var language_version: String
  
  var os: String
  
  var os_version: String
  
  var version: String
}
object VersionInfo {
  
  @scala.inline
  def apply(language: String, language_version: String, os: String, os_version: String, version: String): VersionInfo = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], language_version = language_version.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], os_version = os_version.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionInfo]
  }
  
  @scala.inline
  implicit class VersionInfoMutableBuilder[Self <: VersionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_version(value: String): Self = StObject.set(x, "language_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs_version(value: String): Self = StObject.set(x, "os_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
