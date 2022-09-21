package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.SubsequentAuthInformation")
@js.native
open class SubsequentAuthInformation protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getOriginalAuthAmount(): Any = js.native
  
  def getOriginalNetworkTransId(): Any = js.native
  
  def getReason(): Any = js.native
  
  var originalAuthAmount: Any = js.native
  
  var originalNetworkTransId: Any = js.native
  
  var reason: Any = js.native
  
  def setOriginalAuthAmount(p_originalAuthAmount: Any): Unit = js.native
  
  def setOriginalNetworkTransId(p_originalNetworkTransId: Any): Unit = js.native
  
  def setReason(p_reason: Any): Unit = js.native
}
