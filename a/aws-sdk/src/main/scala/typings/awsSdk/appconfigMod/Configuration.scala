package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /**
    * The configuration version.
    */
  var ConfigurationVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The content of the configuration or the configuration data.  The Content attribute only contains data if the system finds new or updated configuration data. If there is no new or updated data and ClientConfigurationVersion matches the version of the current configuration, AppConfig returns a 204 No Content HTTP response code and the Content value will be empty. 
    */
  var Content: js.UndefOr[_Blob] = js.undefined
  
  /**
    * A standard MIME type describing the format of the configuration content. For more information, see Content-Type.
    */
  var ContentType: js.UndefOr[String] = js.undefined
}
object Configuration {
  
  inline def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setConfigurationVersion(value: Version): Self = StObject.set(x, "ConfigurationVersion", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVersionUndefined: Self = StObject.set(x, "ConfigurationVersion", js.undefined)
    
    inline def setContent(value: _Blob): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
  }
}
