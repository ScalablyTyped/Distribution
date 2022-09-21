package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.FraudInformationType")
@js.native
open class FraudInformationType protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var fraudAction: Any = js.native
  
  var fraudFilterList: Any = js.native
  
  def getFraudAction(): Any = js.native
  
  def getFraudFilterList(): Any = js.native
  
  def setFraudAction(p_fraudAction: Any): Unit = js.native
  
  def setFraudFilterList(p_fraudFilterList: Any): Unit = js.native
}
