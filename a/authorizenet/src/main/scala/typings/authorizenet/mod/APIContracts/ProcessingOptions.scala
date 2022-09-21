package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ProcessingOptions")
@js.native
open class ProcessingOptions protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getIsFirstRecurringPayment(): Any = js.native
  
  def getIsFirstSubsequentAuth(): Any = js.native
  
  def getIsStoredCredentials(): Any = js.native
  
  def getIsSubsequentAuth(): Any = js.native
  
  var isFirstRecurringPayment: Any = js.native
  
  var isFirstSubsequentAuth: Any = js.native
  
  var isStoredCredentials: Any = js.native
  
  var isSubsequentAuth: Any = js.native
  
  def setIsFirstRecurringPayment(p_isFirstRecurringPayment: Any): Unit = js.native
  
  def setIsFirstSubsequentAuth(p_isFirstSubsequentAuth: Any): Unit = js.native
  
  def setIsStoredCredentials(p_isStoredCredentials: Any): Unit = js.native
  
  def setIsSubsequentAuth(p_isSubsequentAuth: Any): Unit = js.native
}
