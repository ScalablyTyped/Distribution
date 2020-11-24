package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersPaymentMethodTokenizationParameters extends js.Object {
  
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
  var parameters: js.UndefOr[ApiClientObjectMap[String]] = js.native
  
  /**
    * Required.
    */
  var tokenizationType: js.UndefOr[GoogleActionsV2OrdersPaymentMethodTokenizationParametersTokenizationType] = js.native
}
object GoogleActionsV2OrdersPaymentMethodTokenizationParameters {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersPaymentMethodTokenizationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPaymentMethodTokenizationParameters]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersPaymentMethodTokenizationParametersOps[Self <: GoogleActionsV2OrdersPaymentMethodTokenizationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: ApiClientObjectMap[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setTokenizationType(value: GoogleActionsV2OrdersPaymentMethodTokenizationParametersTokenizationType): Self = this.set("tokenizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenizationType: Self = this.set("tokenizationType", js.undefined)
  }
}
