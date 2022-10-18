package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvisionedConcurrencyConfigsResponse extends StObject {
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of provisioned concurrency configurations.
    */
  var ProvisionedConcurrencyConfigs: js.UndefOr[ProvisionedConcurrencyConfigList] = js.undefined
}
object ListProvisionedConcurrencyConfigsResponse {
  
  inline def apply(): ListProvisionedConcurrencyConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisionedConcurrencyConfigsResponse]
  }
  
  extension [Self <: ListProvisionedConcurrencyConfigsResponse](x: Self) {
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setProvisionedConcurrencyConfigs(value: ProvisionedConcurrencyConfigList): Self = StObject.set(x, "ProvisionedConcurrencyConfigs", value.asInstanceOf[js.Any])
    
    inline def setProvisionedConcurrencyConfigsUndefined: Self = StObject.set(x, "ProvisionedConcurrencyConfigs", js.undefined)
    
    inline def setProvisionedConcurrencyConfigsVarargs(value: ProvisionedConcurrencyConfigListItem*): Self = StObject.set(x, "ProvisionedConcurrencyConfigs", js.Array(value*))
  }
}
