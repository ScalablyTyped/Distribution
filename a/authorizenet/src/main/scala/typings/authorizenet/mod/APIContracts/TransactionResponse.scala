package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.TransactionResponse")
@js.native
open class TransactionResponse protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var accountNumber: Any = js.native
  
  var accountType: Any = js.native
  
  var authCode: Any = js.native
  
  var avsResultCode: Any = js.native
  
  var cavvResultCode: Any = js.native
  
  var cvvResultCode: Any = js.native
  
  var emvResponse: Any = js.native
  
  var entryMode: Any = js.native
  
  var errors: Any = js.native
  
  def getAccountNumber(): Any = js.native
  
  def getAccountType(): Any = js.native
  
  def getAuthCode(): Any = js.native
  
  def getAvsResultCode(): Any = js.native
  
  def getCavvResultCode(): Any = js.native
  
  def getCvvResultCode(): Any = js.native
  
  def getEmvResponse(): Any = js.native
  
  def getEntryMode(): Any = js.native
  
  def getErrors(): Any = js.native
  
  def getMessages(): Any = js.native
  
  def getNetworkTransId(): Any = js.native
  
  def getPrePaidCard(): Any = js.native
  
  def getProfile(): Any = js.native
  
  def getRawResponseCode(): Any = js.native
  
  def getRefTransID(): Any = js.native
  
  def getResponseCode(): Any = js.native
  
  def getSecureAcceptance(): Any = js.native
  
  def getShipTo(): Any = js.native
  
  def getSplitTenderId(): Any = js.native
  
  def getSplitTenderPayments(): Any = js.native
  
  def getTestRequest(): Any = js.native
  
  def getTransHash(): Any = js.native
  
  def getTransHashSha2(): Any = js.native
  
  def getTransId(): Any = js.native
  
  def getUserFields(): Any = js.native
  
  var messages: Any = js.native
  
  var networkTransId: Any = js.native
  
  var prePaidCard: Any = js.native
  
  var profile: Any = js.native
  
  var rawResponseCode: Any = js.native
  
  var refTransID: Any = js.native
  
  var responseCode: Any = js.native
  
  var secureAcceptance: Any = js.native
  
  def setAccountNumber(p_accountNumber: Any): Unit = js.native
  
  def setAccountType(p_accountType: Any): Unit = js.native
  
  def setAuthCode(p_authCode: Any): Unit = js.native
  
  def setAvsResultCode(p_avsResultCode: Any): Unit = js.native
  
  def setCavvResultCode(p_cavvResultCode: Any): Unit = js.native
  
  def setCvvResultCode(p_cvvResultCode: Any): Unit = js.native
  
  def setEmvResponse(p_emvResponse: Any): Unit = js.native
  
  def setEntryMode(p_entryMode: Any): Unit = js.native
  
  def setErrors(p_errors: Any): Unit = js.native
  
  def setMessages(p_messages: Any): Unit = js.native
  
  def setNetworkTransId(p_networkTransId: Any): Unit = js.native
  
  def setPrePaidCard(p_prePaidCard: Any): Unit = js.native
  
  def setProfile(p_profile: Any): Unit = js.native
  
  def setRawResponseCode(p_rawResponseCode: Any): Unit = js.native
  
  def setRefTransID(p_refTransID: Any): Unit = js.native
  
  def setResponseCode(p_responseCode: Any): Unit = js.native
  
  def setSecureAcceptance(p_secureAcceptance: Any): Unit = js.native
  
  def setShipTo(p_shipTo: Any): Unit = js.native
  
  def setSplitTenderId(p_splitTenderId: Any): Unit = js.native
  
  def setSplitTenderPayments(p_splitTenderPayments: Any): Unit = js.native
  
  def setTestRequest(p_testRequest: Any): Unit = js.native
  
  def setTransHash(p_transHash: Any): Unit = js.native
  
  def setTransHashSha2(p_transHashSha2: Any): Unit = js.native
  
  def setTransId(p_transId: Any): Unit = js.native
  
  def setUserFields(p_userFields: Any): Unit = js.native
  
  var shipTo: Any = js.native
  
  var splitTenderId: Any = js.native
  
  var splitTenderPayments: Any = js.native
  
  var testRequest: Any = js.native
  
  var transHash: Any = js.native
  
  var transHashSha2: Any = js.native
  
  var transId: Any = js.native
  
  var userFields: Any = js.native
}
object TransactionResponse {
  
  @JSImport("authorizenet", "APIContracts.TransactionResponse.EmvResponse")
  @js.native
  open class EmvResponse () extends StObject {
    def this(obj: Any) = this()
    
    def getTags(): Any = js.native
    
    def getTlvData(): Any = js.native
    
    def setTags(p_tags: Any): Unit = js.native
    
    def setTlvData(p_tlvData: Any): Unit = js.native
    
    var tags: Any = js.native
    
    var tlvData: Any = js.native
  }
  
  @JSImport("authorizenet", "APIContracts.TransactionResponse.Errors")
  @js.native
  open class Errors () extends StObject {
    def this(obj: Any) = this()
    
    var error: Any = js.native
    
    def getError(): Any = js.native
    
    def setError(p_error: Any): Unit = js.native
  }
  
  @JSImport("authorizenet", "APIContracts.TransactionResponse.Messages")
  @js.native
  open class Messages () extends StObject {
    def this(obj: Any) = this()
    
    def getMessage(): Any = js.native
    
    var message: Any = js.native
    
    def setMessage(p_message: Any): Unit = js.native
  }
  
  @JSImport("authorizenet", "APIContracts.TransactionResponse.PrePaidCard")
  @js.native
  open class PrePaidCard () extends StObject {
    def this(obj: Any) = this()
    
    var approvedAmount: Any = js.native
    
    var balanceOnCard: Any = js.native
    
    def getApprovedAmount(): Any = js.native
    
    def getBalanceOnCard(): Any = js.native
    
    def getRequestedAmount(): Any = js.native
    
    var requestedAmount: Any = js.native
    
    def setApprovedAmount(p_approvedAmount: Any): Unit = js.native
    
    def setBalanceOnCard(p_balanceOnCard: Any): Unit = js.native
    
    def setRequestedAmount(p_requestedAmount: Any): Unit = js.native
  }
  
  @JSImport("authorizenet", "APIContracts.TransactionResponse.SecureAcceptance")
  @js.native
  open class SecureAcceptance () extends StObject {
    def this(obj: Any) = this()
    
    def getPayerEmail(): Any = js.native
    
    def getPayerID(): Any = js.native
    
    def getSecureAcceptanceUrl(): Any = js.native
    
    var payerEmail: Any = js.native
    
    var payerID: Any = js.native
    
    var secureAcceptanceUrl: Any = js.native
    
    def setPayerEmail(p_payerEmail: Any): Unit = js.native
    
    def setPayerID(p_payerID: Any): Unit = js.native
    
    def setSecureAcceptanceUrl(p_secureAcceptanceUrl: Any): Unit = js.native
  }
  
  @JSImport("authorizenet", "APIContracts.TransactionResponse.SplitTenderPayments")
  @js.native
  open class SplitTenderPayments () extends StObject {
    def this(obj: Any) = this()
    
    def getSplitTenderPayment(): Any = js.native
    
    def setSplitTenderPayment(p_splitTenderPayment: Any): Unit = js.native
    
    var splitTenderPayment: Any = js.native
  }
  
  @JSImport("authorizenet", "APIContracts.TransactionResponse.UserFields")
  @js.native
  open class UserFields protected () extends StObject {
    def this(obj: Any, args: Any*) = this()
    def this(obj: Unit, args: Any*) = this()
    
    def getUserField(): Any = js.native
    
    def setUserField(p_userField: Any): Unit = js.native
    
    var userField: Any = js.native
  }
}
