package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.TransactionDetailsType")
@js.native
open class TransactionDetailsType protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var AVSResponse: String = js.native
  
  var CAVVResponse: String = js.native
  
  var FDSFilterAction: String = js.native
  
  var FDSFilters: ArrayOfFDSFilter = js.native
  
  var authAmount: String = js.native
  
  var authCode: String = js.native
  
  var authorizationIndicator: String = js.native
  
  var batch: BatchDetailsType = js.native
  
  var billTo: CustomerAddressType = js.native
  
  var cardCodeResponse: String = js.native
  
  var customer: CustomerDataType = js.native
  
  var customerIP: String = js.native
  
  var customerSignature: String = js.native
  
  var duty: String = js.native
  
  var employeeId: String = js.native
  
  var emvDetails: typings.authorizenet.mod.APIContracts.TransactionDetailsType.EmvDetails = js.native
  
  var entryMode: String = js.native
  
  def getAVSResponse(): String = js.native
  
  def getAuthAmount(): String = js.native
  
  def getAuthCode(): String = js.native
  
  def getAuthorizationIndicator(): String = js.native
  
  def getBatch(): BatchDetailsType = js.native
  
  def getBillTo(): CustomerAddressType = js.native
  
  def getCAVVResponse(): String = js.native
  
  def getCardCodeResponse(): String = js.native
  
  def getCustomer(): CustomerDataType = js.native
  
  def getCustomerIP(): String = js.native
  
  def getCustomerSignature(): String = js.native
  
  def getDuty(): String = js.native
  
  def getEmployeeId(): String = js.native
  
  def getEmvDetails(): typings.authorizenet.mod.APIContracts.TransactionDetailsType.EmvDetails = js.native
  
  def getEntryMode(): String = js.native
  
  def getFDSFilterAction(): String = js.native
  
  def getFDSFilters(): ArrayOfFDSFilter = js.native
  
  def getLineItems(): String = js.native
  
  def getMarketType(): String = js.native
  
  def getMobileDeviceId(): String = js.native
  
  def getNetworkTransId(): String = js.native
  
  def getOrder(): OrderExType = js.native
  
  def getOriginalAuthAmount(): String = js.native
  
  def getOriginalNetworkTransId(): String = js.native
  
  def getOtherTax(): OtherTaxType = js.native
  
  def getPayment(): PaymentMaskedType = js.native
  
  def getPrepaidBalanceRemaining(): String = js.native
  
  def getProduct(): String = js.native
  
  def getProfile(): CustomerProfileIdType = js.native
  
  def getRecurringBilling(): String = js.native
  
  def getRefTransId(): String = js.native
  
  def getRequestedAmount(): String = js.native
  
  def getResponseCode(): String = js.native
  
  def getResponseReasonCode(): String = js.native
  
  def getResponseReasonDescription(): String = js.native
  
  def getReturnedItems(): ArrayOfReturnedItem = js.native
  
  def getSettleAmount(): String = js.native
  
  def getShipFrom(): NameAndAddressType = js.native
  
  def getShipTo(): NameAndAddressType = js.native
  
  def getShipping(): String = js.native
  
  def getSolution(): SolutionType = js.native
  
  def getSplitTenderId(): String = js.native
  
  def getSubmitTimeLocal(): String = js.native
  
  def getSubmitTimeUTC(): String = js.native
  
  def getSubscription(): SubscriptionPaymentType = js.native
  
  def getSurcharge(): ExtendedAmountType = js.native
  
  def getTax(): String = js.native
  
  def getTaxExempt(): String = js.native
  
  def getTip(): ExtendedAmountType = js.native
  
  def getTransId(): String = js.native
  
  def getTransactionStatus(): String = js.native
  
  def getTransactionType(): String = js.native
  
  var lineItems: String = js.native
  
  var marketType: String = js.native
  
  var mobileDeviceId: String = js.native
  
  var networkTransId: String = js.native
  
  var order: OrderExType = js.native
  
  var originalAuthAmount: String = js.native
  
  var originalNetworkTransId: String = js.native
  
  var otherTax: OtherTaxType = js.native
  
  var payment: PaymentMaskedType = js.native
  
  var prepaidBalanceRemaining: String = js.native
  
  var product: String = js.native
  
  var profile: CustomerProfileIdType = js.native
  
  var recurringBilling: String = js.native
  
  var refTransId: String = js.native
  
  var requestedAmount: String = js.native
  
  var responseCode: String = js.native
  
  var responseReasonCode: String = js.native
  
  var responseReasonDescription: String = js.native
  
  var returnedItems: ArrayOfReturnedItem = js.native
  
  def setAVSResponse(p_AVSResponse: String): Unit = js.native
  
  def setAuthAmount(p_authAmount: String): Unit = js.native
  
  def setAuthCode(p_authCode: String): Unit = js.native
  
  def setAuthorizationIndicator(p_authorizationIndicator: String): Unit = js.native
  
  def setBatch(p_batch: BatchDetailsType): Unit = js.native
  
  def setBillTo(p_billTo: CustomerAddressType): Unit = js.native
  
  def setCAVVResponse(p_CAVVResponse: String): Unit = js.native
  
  def setCardCodeResponse(p_cardCodeResponse: String): Unit = js.native
  
  def setCustomer(p_customer: CustomerDataType): Unit = js.native
  
  def setCustomerIP(p_customerIP: String): Unit = js.native
  
  def setCustomerSignature(p_customerSignature: String): Unit = js.native
  
  def setDuty(p_duty: String): Unit = js.native
  
  def setEmployeeId(p_employeeId: String): Unit = js.native
  
  def setEmvDetails(p_emvDetails: typings.authorizenet.mod.APIContracts.TransactionDetailsType.EmvDetails): Unit = js.native
  
  def setEntryMode(p_entryMode: String): Unit = js.native
  
  def setFDSFilterAction(p_FDSFilterAction: String): Unit = js.native
  
  def setFDSFilters(p_FDSFilters: ArrayOfFDSFilter): Unit = js.native
  
  def setLineItems(p_lineItems: String): Unit = js.native
  
  def setMarketType(p_marketType: String): Unit = js.native
  
  def setMobileDeviceId(p_mobileDeviceId: String): Unit = js.native
  
  def setNetworkTransId(p_networkTransId: String): Unit = js.native
  
  def setOrder(p_order: OrderExType): Unit = js.native
  
  def setOriginalAuthAmount(p_originalAuthAmount: String): Unit = js.native
  
  def setOriginalNetworkTransId(p_originalNetworkTransId: String): Unit = js.native
  
  def setOtherTax(p_otherTax: OtherTaxType): Unit = js.native
  
  def setPayment(p_payment: PaymentMaskedType): Unit = js.native
  
  def setPrepaidBalanceRemaining(p_prepaidBalanceRemaining: String): Unit = js.native
  
  def setProduct(p_product: String): Unit = js.native
  
  def setProfile(p_profile: CustomerProfileIdType): Unit = js.native
  
  def setRecurringBilling(p_recurringBilling: String): Unit = js.native
  
  def setRefTransId(p_refTransId: String): Unit = js.native
  
  def setRequestedAmount(p_requestedAmount: String): Unit = js.native
  
  def setResponseCode(p_responseCode: String): Unit = js.native
  
  def setResponseReasonCode(p_responseReasonCode: String): Unit = js.native
  
  def setResponseReasonDescription(p_responseReasonDescription: String): Unit = js.native
  
  def setReturnedItems(p_returnedItems: ArrayOfReturnedItem): Unit = js.native
  
  def setSettleAmount(p_settleAmount: String): Unit = js.native
  
  def setShipFrom(p_shipFrom: NameAndAddressType): Unit = js.native
  
  def setShipTo(p_shipTo: NameAndAddressType): Unit = js.native
  
  def setShipping(p_shipping: String): Unit = js.native
  
  def setSolution(p_solution: SolutionType): Unit = js.native
  
  def setSplitTenderId(p_splitTenderId: String): Unit = js.native
  
  def setSubmitTimeLocal(p_submitTimeLocal: String): Unit = js.native
  
  def setSubmitTimeUTC(p_submitTimeUTC: String): Unit = js.native
  
  def setSubscription(p_subscription: SubscriptionPaymentType): Unit = js.native
  
  def setSurcharge(p_surcharge: ExtendedAmountType): Unit = js.native
  
  def setTax(p_tax: String): Unit = js.native
  
  def setTaxExempt(p_taxExempt: String): Unit = js.native
  
  def setTip(p_tip: ExtendedAmountType): Unit = js.native
  
  def setTransId(p_transId: String): Unit = js.native
  
  def setTransactionStatus(p_transactionStatus: String): Unit = js.native
  
  def setTransactionType(p_transactionType: String): Unit = js.native
  
  var settleAmount: String = js.native
  
  var shipFrom: NameAndAddressType = js.native
  
  var shipTo: NameAndAddressType = js.native
  
  var shipping: String = js.native
  
  var solution: SolutionType = js.native
  
  var splitTenderId: String = js.native
  
  var submitTimeLocal: String = js.native
  
  var submitTimeUTC: String = js.native
  
  var subscription: SubscriptionPaymentType = js.native
  
  var surcharge: ExtendedAmountType = js.native
  
  var tax: String = js.native
  
  var taxExempt: String = js.native
  
  var tip: ExtendedAmountType = js.native
  
  var transId: String = js.native
  
  var transactionStatus: String = js.native
  
  var transactionType: String = js.native
}
object TransactionDetailsType {
  
  @JSImport("authorizenet", "APIContracts.TransactionDetailsType.EmvDetails")
  @js.native
  open class EmvDetails () extends StObject {
    def this(obj: Any) = this()
    
    def getTag(): String = js.native
    
    def setTag(p_tag: String): Unit = js.native
    
    var tag: String = js.native
  }
}
