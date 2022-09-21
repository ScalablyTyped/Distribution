package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.DecryptPaymentDataRequest")
@js.native
open class DecryptPaymentDataRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var callId: Any = js.native
  
  def getCallId(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.DecryptPaymentDataRequest = js.native
  
  def getOpaqueData(): Any = js.native
  
  var opaqueData: Any = js.native
  
  def setCallId(p_callId: Any): Unit = js.native
  
  def setOpaqueData(p_opaqueData: Any): Unit = js.native
}
