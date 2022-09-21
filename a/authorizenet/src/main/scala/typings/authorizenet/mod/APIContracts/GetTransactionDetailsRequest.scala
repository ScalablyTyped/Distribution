package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetTransactionDetailsRequest")
@js.native
open class GetTransactionDetailsRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): typings.authorizenet.anon.GetTransactionDetailsRequest = js.native
  
  def getTransId(): Any = js.native
  
  def setTransId(p_transId: Any): Unit = js.native
  
  var transId: Any = js.native
}
