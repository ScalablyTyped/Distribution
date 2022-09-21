package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CcAuthenticationType")
@js.native
open class CcAuthenticationType protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var authenticationIndicator: Any = js.native
  
  var cardholderAuthenticationValue: Any = js.native
  
  def getAuthenticationIndicator(): Any = js.native
  
  def getCardholderAuthenticationValue(): Any = js.native
  
  def setAuthenticationIndicator(p_authenticationIndicator: Any): Unit = js.native
  
  def setCardholderAuthenticationValue(p_cardholderAuthenticationValue: Any): Unit = js.native
}
