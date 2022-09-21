package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.SendCustomerTransactionReceiptRequest")
@js.native
open class SendCustomerTransactionReceiptRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customerEmail: Any = js.native
  
  var emailSettings: Any = js.native
  
  def getCustomerEmail(): Any = js.native
  
  def getEmailSettings(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.SendCustomerTransactionReceiptRequest = js.native
  
  def getTransId(): Any = js.native
  
  def setCustomerEmail(p_customerEmail: Any): Unit = js.native
  
  def setEmailSettings(p_emailSettings: Any): Unit = js.native
  
  def setTransId(p_transId: Any): Unit = js.native
  
  var transId: Any = js.native
}
