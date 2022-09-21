package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.MerchantAuthenticationType")
@js.native
open class MerchantAuthenticationType () extends StObject {
  def this(obj: MerchantAuthenticationTypeConstructor) = this()
  
  var accessToken: String | Null = js.native
  
  var clientKey: String | Null = js.native
  
  var fingerprint: js.Object | Null = js.native
  
  def getAccessToken(): String = js.native
  
  def getClientKey(): String = js.native
  
  def getFingerPrint(): Any = js.native
  
  def getImpersonationAuthentication(): Any = js.native
  
  def getMobileDeviceId(): String = js.native
  
  def getName(): String = js.native
  
  def getPassword(): String = js.native
  
  def getSessionToken(): String = js.native
  
  def getTransactionKey(): String = js.native
  
  var impersonationAuthentication: ImpersonationAuthenticationType | Null = js.native
  
  var mobileDeviceId: String | Null = js.native
  
  var name: String | Null = js.native
  
  var password: String | Null = js.native
  
  var sessionToken: String | Null = js.native
  
  def setAccessToken(p_accessToken: String): Unit = js.native
  
  def setClientKey(p_clientKey: String): Unit = js.native
  
  def setFingerPrint(p_fingerPrint: Any): Unit = js.native
  
  def setImpersonationAuthentication(p_impersonationAuthentication: Any): Unit = js.native
  
  def setMobileDeviceId(p_mobileDeviceId: String): Unit = js.native
  
  def setName(p_name: String): Unit = js.native
  
  def setPassword(p_password: String): Unit = js.native
  
  def setSessionToken(p_sessionToken: String): Unit = js.native
  
  def setTransactionKey(p_transactionKey: String): Unit = js.native
  
  var transactionKey: String | Null = js.native
}
