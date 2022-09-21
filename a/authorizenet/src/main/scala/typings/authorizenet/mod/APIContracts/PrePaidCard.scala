package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.PrePaidCard")
@js.native
open class PrePaidCard protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
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
