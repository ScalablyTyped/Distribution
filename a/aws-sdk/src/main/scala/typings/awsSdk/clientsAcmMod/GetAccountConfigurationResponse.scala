package typings.awsSdk.clientsAcmMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setExpiryEvents(value: ExpiryEventsConfiguration): Self = StObject.set(x, "ExpiryEvents", value.asInstanceOf[js.Any])
    
    inline def setExpiryEventsUndefined: Self = StObject.set(x, "ExpiryEvents", js.undefined)
  }
}
