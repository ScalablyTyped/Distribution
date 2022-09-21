package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CreditCardType")
@js.native
open class CreditCardType protected () extends CreditCardSimpleType {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var cardCode: Any = js.native
  
  var cryptogram: Any = js.native
  
  def getCardCode(): Any = js.native
  
  def getCryptogram(): Any = js.native
  
  def getIsPaymentToken(): Any = js.native
  
  def getTokenRequestorEci(): Any = js.native
  
  def getTokenRequestorId(): Any = js.native
  
  def getTokenRequestorName(): Any = js.native
  
  var isPaymentToken: Any = js.native
  
  def setCardCode(p_cardCode: Any): Unit = js.native
  
  def setCryptogram(p_cryptogram: Any): Unit = js.native
  
  def setIsPaymentToken(p_isPaymentToken: Any): Unit = js.native
  
  def setTokenRequestorEci(p_tokenRequestorEci: Any): Unit = js.native
  
  def setTokenRequestorId(p_tokenRequestorId: Any): Unit = js.native
  
  def setTokenRequestorName(p_tokenRequestorName: Any): Unit = js.native
  
  var tokenRequestorEci: Any = js.native
  
  var tokenRequestorId: Any = js.native
  
  var tokenRequestorName: Any = js.native
}
