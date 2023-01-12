package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceAction extends StObject {
  
  /**
    * The token used to authenticate access to the Salesforce IoT Cloud Input Stream. The token is available from the Salesforce IoT Cloud platform after creation of the Input Stream.
    */
  var token: SalesforceToken
  
  /**
    * The URL exposed by the Salesforce IoT Cloud Input Stream. The URL is available from the Salesforce IoT Cloud platform after creation of the Input Stream.
    */
  var url: SalesforceEndpoint
}
object SalesforceAction {
  
  inline def apply(token: SalesforceToken, url: SalesforceEndpoint): SalesforceAction = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SalesforceAction] (val x: Self) extends AnyVal {
    
    inline def setToken(value: SalesforceToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: SalesforceEndpoint): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
