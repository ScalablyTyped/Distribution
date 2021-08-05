package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersPaymentMethodTokenizationParameters extends StObject {
  
  /**
    * If tokenization_type is set to `PAYMENT_GATEWAY` then the list of
    * parameters should contain payment gateway specific parameters required to
    * tokenize payment method as well as parameter with the name \"gateway\" with
    * the value set to one of the gateways that we support e.g. \"stripe\" or
    * \"braintree\".
    * A sample tokenization configuration used for Stripe in JSON format.
    * `{
    *   \"gateway\" : \"stripe\",
    *   \"stripe:publishableKey\" : \"pk_1234\",
    *   \"stripe:version\" : \"1.5\"
    * }`
    * A sample tokenization configuration used for Braintree in JSON format.
    * `{
    *   \"gateway\" : \"braintree\",
    *   \"braintree:merchantId\" : \"abc\"
    *   \"braintree:sdkVersion\" : \"1.4.0\"
    *   \"braintree:apiVersion\" : \"v1\"
    *   \"braintree:clientKey\" : \"production_a12b34\"
    *   \"braintree:authorizationFingerprint\" : \"production_a12b34\"
    * }`
    * A sample configuration used for Adyen in JSON format.
    * `{
    *   \"gateway\" : \"adyen\",
    *   \"gatewayMerchantId\" : \"gateway-merchant-id\"
    * }`
    * If tokenization_type is set to DIRECT, integrators must specify a parameter
    * named \"publicKey\" which will contain an Elliptic Curve public key using
    * the uncompressed point format and base64 encoded. This publicKey will be
    * used by Google to encrypt the payment information.
    * Example of the parameter in JSON format:
    * {
    *   \"publicKey\": \"base64encoded...\"
    * }
    */
  var parameters: js.UndefOr[ApiClientObjectMap[String]] = js.undefined
  
  /**
    * Required.
    */
  var tokenizationType: js.UndefOr[GoogleActionsV2OrdersPaymentMethodTokenizationParametersTokenizationType] = js.undefined
}
object GoogleActionsV2OrdersPaymentMethodTokenizationParameters {
  
  inline def apply(): GoogleActionsV2OrdersPaymentMethodTokenizationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentMethodTokenizationParameters]
  }
  
  extension [Self <: GoogleActionsV2OrdersPaymentMethodTokenizationParameters](x: Self) {
    
    inline def setParameters(value: ApiClientObjectMap[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setTokenizationType(value: GoogleActionsV2OrdersPaymentMethodTokenizationParametersTokenizationType): Self = StObject.set(x, "tokenizationType", value.asInstanceOf[js.Any])
    
    inline def setTokenizationTypeUndefined: Self = StObject.set(x, "tokenizationType", js.undefined)
  }
}
