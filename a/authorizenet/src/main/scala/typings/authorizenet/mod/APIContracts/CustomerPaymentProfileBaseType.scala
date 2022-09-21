package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CustomerPaymentProfileBaseType")
@js.native
open class CustomerPaymentProfileBaseType protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var billTo: Any = js.native
  
  var customerType: Any = js.native
  
  def getBillTo(): Any = js.native
  
  def getCustomerType(): Any = js.native
  
  def setBillTo(p_billTo: Any): Unit = js.native
  
  def setCustomerType(p_customerType: Any): Unit = js.native
}
