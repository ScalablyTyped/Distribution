package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationAggregatorResponse extends StObject {
  
  /**
    * Returns a ConfigurationAggregator object.
    */
  var ConfigurationAggregator: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConfigurationAggregator] = js.undefined
}
object PutConfigurationAggregatorResponse {
  
  inline def apply(): PutConfigurationAggregatorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutConfigurationAggregatorResponse]
  }
  
  extension [Self <: PutConfigurationAggregatorResponse](x: Self) {
    
    inline def setConfigurationAggregator(value: ConfigurationAggregator): Self = StObject.set(x, "ConfigurationAggregator", value.asInstanceOf[js.Any])
    
    inline def setConfigurationAggregatorUndefined: Self = StObject.set(x, "ConfigurationAggregator", js.undefined)
  }
}
