package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetCustomerPaymentProfileListResponse")
@js.native
open class GetCustomerPaymentProfileListResponse protected () extends ANetApiResponse {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getPaymentProfiles(): Any = js.native
  
  def getTotalNumInResultSet(): Any = js.native
  
  var paymentProfiles: Any = js.native
  
  def setPaymentProfiles(p_paymentProfiles: Any): Unit = js.native
  
  def setTotalNumInResultSet(p_totalNumInResultSet: Any): Unit = js.native
  
  var totalNumInResultSet: Any = js.native
}
