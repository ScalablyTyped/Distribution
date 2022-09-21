package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CreateCustomerProfileTransactionRequest")
@js.native
open class CreateCustomerProfileTransactionRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var extraOptions: Any = js.native
  
  def getExtraOptions(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.CreateCustomerProfileTransactionRequest = js.native
  
  def getTransaction(): Any = js.native
  
  def setExtraOptions(p_extraOptions: Any): Unit = js.native
  
  def setTransaction(p_transaction: Any): Unit = js.native
  
  var transaction: Any = js.native
}
