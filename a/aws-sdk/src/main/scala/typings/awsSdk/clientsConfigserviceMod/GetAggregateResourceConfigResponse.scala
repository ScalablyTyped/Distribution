package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAggregateResourceConfigResponse extends StObject {
  
  /**
    * Returns a ConfigurationItem object.
    */
  var ConfigurationItem: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConfigurationItem] = js.undefined
}
object GetAggregateResourceConfigResponse {
  
  inline def apply(): GetAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateResourceConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAggregateResourceConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setConfigurationItem(value: ConfigurationItem): Self = StObject.set(x, "ConfigurationItem", value.asInstanceOf[js.Any])
    
    inline def setConfigurationItemUndefined: Self = StObject.set(x, "ConfigurationItem", js.undefined)
  }
}
