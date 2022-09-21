package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.SecurePaymentContainerResponse")
@js.native
open class SecurePaymentContainerResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getOpaqueData(): Any = js.native
  
  var opaqueData: Any = js.native
  
  def setOpaqueData(p_opaqueData: Any): Unit = js.native
}
