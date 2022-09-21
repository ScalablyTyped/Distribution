package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetMerchantDetailsResponse")
@js.native
open class GetMerchantDetailsResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var businessInformation: Any = js.native
  
  var contactDetails: Any = js.native
  
  var currencies: Any = js.native
  
  var gatewayId: Any = js.native
  
  def getBusinessInformation(): Any = js.native
  
  def getContactDetails(): Any = js.native
  
  def getCurrencies(): Any = js.native
  
  def getGatewayId(): Any = js.native
  
  def getIsTestMode(): Any = js.native
  
  def getMarketTypes(): Any = js.native
  
  def getMerchantName(): Any = js.native
  
  def getMerchantTimeZone(): Any = js.native
  
  def getPaymentMethods(): Any = js.native
  
  def getProcessors(): Any = js.native
  
  def getProductCodes(): Any = js.native
  
  def getPublicClientKey(): Any = js.native
  
  var isTestMode: Any = js.native
  
  var marketTypes: Any = js.native
  
  var merchantName: Any = js.native
  
  var merchantTimeZone: Any = js.native
  
  var paymentMethods: Any = js.native
  
  var processors: Any = js.native
  
  var productCodes: Any = js.native
  
  var publicClientKey: Any = js.native
  
  def setBusinessInformation(p_businessInformation: Any): Unit = js.native
  
  def setContactDetails(p_contactDetails: Any): Unit = js.native
  
  def setCurrencies(p_currencies: Any): Unit = js.native
  
  def setGatewayId(p_gatewayId: Any): Unit = js.native
  
  def setIsTestMode(p_isTestMode: Any): Unit = js.native
  
  def setMarketTypes(p_marketTypes: Any): Unit = js.native
  
  def setMerchantName(p_merchantName: Any): Unit = js.native
  
  def setMerchantTimeZone(p_merchantTimeZone: Any): Unit = js.native
  
  def setPaymentMethods(p_paymentMethods: Any): Unit = js.native
  
  def setProcessors(p_processors: Any): Unit = js.native
  
  def setProductCodes(p_productCodes: Any): Unit = js.native
  
  def setPublicClientKey(p_publicClientKey: Any): Unit = js.native
}
