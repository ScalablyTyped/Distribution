package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CreateTransactionResponse")
@js.native
open class CreateTransactionResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getProfileResponse(): Any = js.native
  
  def getTransactionResponse(): Any = js.native
  
  var profileResponse: Any = js.native
  
  def setProfileResponse(p_profileResponse: Any): Unit = js.native
  
  def setTransactionResponse(p_transactionResponse: Any): Unit = js.native
  
  var transactionResponse: Any = js.native
}
