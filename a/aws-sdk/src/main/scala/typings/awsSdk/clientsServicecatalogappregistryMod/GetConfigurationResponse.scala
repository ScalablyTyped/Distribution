package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigurationResponse extends StObject {
  
  /**
    *  Retrieves TagKey configuration from an account. 
    */
  var configuration: js.UndefOr[AppRegistryConfiguration] = js.undefined
}
object GetConfigurationResponse {
  
  inline def apply(): GetConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: AppRegistryConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
