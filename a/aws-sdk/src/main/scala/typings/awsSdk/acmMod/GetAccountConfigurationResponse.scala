package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountConfigurationResponse extends StObject {
  
  /**
    * Expiration events configuration options associated with the Amazon Web Services account.
    */
  var ExpiryEvents: js.UndefOr[ExpiryEventsConfiguration] = js.undefined
}
object GetAccountConfigurationResponse {
  
  inline def apply(): GetAccountConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountConfigurationResponse]
  }
  
  extension [Self <: GetAccountConfigurationResponse](x: Self) {
    
    inline def setExpiryEvents(value: ExpiryEventsConfiguration): Self = StObject.set(x, "ExpiryEvents", value.asInstanceOf[js.Any])
    
    inline def setExpiryEventsUndefined: Self = StObject.set(x, "ExpiryEvents", js.undefined)
  }
}
