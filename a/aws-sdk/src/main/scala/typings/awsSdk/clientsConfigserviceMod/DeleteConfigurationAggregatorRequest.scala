package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationAggregatorRequest extends StObject {
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.clientsConfigserviceMod.ConfigurationAggregatorName
}
object DeleteConfigurationAggregatorRequest {
  
  inline def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): DeleteConfigurationAggregatorRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationAggregatorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConfigurationAggregatorRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
  }
}
