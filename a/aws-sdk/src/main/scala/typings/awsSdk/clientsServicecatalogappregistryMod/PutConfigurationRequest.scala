package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationRequest extends StObject {
  
  /**
    *  Associates a TagKey configuration to an account. 
    */
  var configuration: AppRegistryConfiguration
}
object PutConfigurationRequest {
  
  inline def apply(configuration: AppRegistryConfiguration): PutConfigurationRequest = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: AppRegistryConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
  }
}
