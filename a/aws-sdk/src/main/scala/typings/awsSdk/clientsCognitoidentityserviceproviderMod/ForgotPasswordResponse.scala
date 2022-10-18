package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForgotPasswordResponse extends StObject {
  
  /**
    * The code delivery details returned by the server in response to the request to reset a password.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
}
object ForgotPasswordResponse {
  
  inline def apply(): ForgotPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForgotPasswordResponse]
  }
  
  extension [Self <: ForgotPasswordResponse](x: Self) {
    
    inline def setCodeDeliveryDetails(value: CodeDeliveryDetailsType): Self = StObject.set(x, "CodeDeliveryDetails", value.asInstanceOf[js.Any])
    
    inline def setCodeDeliveryDetailsUndefined: Self = StObject.set(x, "CodeDeliveryDetails", js.undefined)
  }
}
