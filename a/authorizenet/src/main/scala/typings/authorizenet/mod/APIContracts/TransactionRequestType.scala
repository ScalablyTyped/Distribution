package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.TransactionRequestType")
@js.native
open class TransactionRequestType protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var amount: Any = js.native
  
  var authCode: Any = js.native
  
  var authorizationIndicatorType: Any = js.native
  
  var billTo: Any = js.native
  
  var callId: Any = js.native
  
  var cardholderAuthentication: Any = js.native
  
  var currencyCode: Any = js.native
  
  var customer: Any = js.native
  
  var customerIP: Any = js.native
  
  var duty: Any = js.native
  
  var employeeId: Any = js.native
  
  def getAmount(): Any = js.native
  
  def getAuthCode(): Any = js.native
  
  def getAuthorizationIndicatorType(): Any = js.native
  
  def getBillTo(): Any = js.native
  
  def getCallId(): Any = js.native
  
  def getCardholderAuthentication(): Any = js.native
  
  def getCurrencyCode(): Any = js.native
  
  def getCustomer(): Any = js.native
  
  def getCustomerIP(): Any = js.native
  
  def getDuty(): Any = js.native
  
  def getEmployeeId(): Any = js.native
  
  def getLineItems(): Any = js.native
  
  def getMerchantDescriptor(): Any = js.native
  
  def getOrder(): Any = js.native
  
  def getOtherTax(): Any = js.native
  
  def getPayment(): Any = js.native
  
  def getPoNumber(): Any = js.native
  
  def getProcessingOptions(): Any = js.native
  
  def getProfile(): Any = js.native
  
  def getRefTransId(): Any = js.native
  
  def getRetail(): Any = js.native
  
  def getShipFrom(): Any = js.native
  
  def getShipTo(): Any = js.native
  
  def getShipping(): Any = js.native
  
  def getSolution(): Any = js.native
  
  def getSplitTenderId(): Any = js.native
  
  def getSubMerchant(): Any = js.native
  
  def getSubsequentAuthInformation(): Any = js.native
  
  def getSurcharge(): Any = js.native
  
  def getTax(): Any = js.native
  
  def getTaxExempt(): Any = js.native
  
  def getTerminalNumber(): Any = js.native
  
  def getTip(): Any = js.native
  
  def getTransactionSettings(): Any = js.native
  
  def getTransactionType(): Any = js.native
  
  def getUserFields(): Any = js.native
  
  var lineItems: Any = js.native
  
  var merchantDescriptor: Any = js.native
  
  var order: Any = js.native
  
  var otherTax: Any = js.native
  
  var payment: Any = js.native
  
  var poNumber: Any = js.native
  
  var processingOptions: Any = js.native
  
  var profile: Any = js.native
  
  var refTransId: Any = js.native
  
  var retail: Any = js.native
  
  def setAmount(p_amount: Any): Unit = js.native
  
  def setAuthCode(p_authCode: Any): Unit = js.native
  
  def setAuthorizationIndicatorType(p_authorizationIndicatorType: Any): Unit = js.native
  
  def setBillTo(p_billTo: Any): Unit = js.native
  
  def setCallId(p_callId: Any): Unit = js.native
  
  def setCardholderAuthentication(p_cardholderAuthentication: Any): Unit = js.native
  
  def setCurrencyCode(p_currencyCode: Any): Unit = js.native
  
  def setCustomer(p_customer: Any): Unit = js.native
  
  def setCustomerIP(p_customerIP: Any): Unit = js.native
  
  def setDuty(p_duty: Any): Unit = js.native
  
  def setEmployeeId(p_employeeId: Any): Unit = js.native
  
  def setLineItems(p_lineItems: Any): Unit = js.native
  
  def setMerchantDescriptor(p_merchantDescriptor: Any): Unit = js.native
  
  def setOrder(p_order: Any): Unit = js.native
  
  def setOtherTax(p_otherTax: Any): Unit = js.native
  
  def setPayment(p_payment: Any): Unit = js.native
  
  def setPoNumber(p_poNumber: Any): Unit = js.native
  
  def setProcessingOptions(p_processingOptions: Any): Unit = js.native
  
  def setProfile(p_profile: Any): Unit = js.native
  
  def setRefTransId(p_refTransId: Any): Unit = js.native
  
  def setRetail(p_retail: Any): Unit = js.native
  
  def setShipFrom(p_shipFrom: Any): Unit = js.native
  
  def setShipTo(p_shipTo: Any): Unit = js.native
  
  def setShipping(p_shipping: Any): Unit = js.native
  
  def setSolution(p_solution: Any): Unit = js.native
  
  def setSplitTenderId(p_splitTenderId: Any): Unit = js.native
  
  def setSubMerchant(p_subMerchant: Any): Unit = js.native
  
  def setSubsequentAuthInformation(p_subsequentAuthInformation: Any): Unit = js.native
  
  def setSurcharge(p_surcharge: Any): Unit = js.native
  
  def setTax(p_tax: Any): Unit = js.native
  
  def setTaxExempt(p_taxExempt: Any): Unit = js.native
  
  def setTerminalNumber(p_terminalNumber: Any): Unit = js.native
  
  def setTip(p_tip: Any): Unit = js.native
  
  def setTransactionSettings(p_transactionSettings: Any): Unit = js.native
  
  def setTransactionType(p_transactionType: Any): Unit = js.native
  
  def setUserFields(p_userFields: Any): Unit = js.native
  
  var shipFrom: Any = js.native
  
  var shipTo: Any = js.native
  
  var shipping: Any = js.native
  
  var solution: Any = js.native
  
  var splitTenderId: Any = js.native
  
  var subMerchant: Any = js.native
  
  var subsequentAuthInformation: Any = js.native
  
  var surcharge: Any = js.native
  
  var tax: Any = js.native
  
  var taxExempt: Any = js.native
  
  var terminalNumber: Any = js.native
  
  var tip: Any = js.native
  
  var transactionSettings: Any = js.native
  
  var transactionType: Any = js.native
  
  var userFields: Any = js.native
}
object TransactionRequestType {
  
  @JSImport("authorizenet", "APIContracts.TransactionRequestType.UserFields")
  @js.native
  open class UserFields () extends StObject {
    def this(obj: Any) = this()
    
    def getUserField(): String = js.native
    
    def setUserField(p_userField: String): Unit = js.native
    
    var userField: String = js.native
  }
}
