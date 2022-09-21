package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetHostedPaymentPageRequest")
@js.native
open class GetHostedPaymentPageRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getHostedPaymentSettings(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.GetHostedPaymentPageRequest = js.native
  
  def getTransactionRequest(): Any = js.native
  
  var hostedPaymentSettings: Any = js.native
  
  def setHostedPaymentSettings(p_hostedPaymentSettings: Any): Unit = js.native
  
  def setTransactionRequest(p_transactionRequest: Any): Unit = js.native
  
  var transactionRequest: Any = js.native
}
