package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetTransactionListForCustomerRequest")
@js.native
open class GetTransactionListForCustomerRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customerPaymentProfileId: Any = js.native
  
  var customerProfileId: Any = js.native
  
  def getCustomerPaymentProfileId(): Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.GetTransactionListForCustomerRequest = js.native
  
  def getPaging(): Any = js.native
  
  def getSorting(): Any = js.native
  
  var paging: Any = js.native
  
  def setCustomerPaymentProfileId(p_customerPaymentProfileId: Any): Unit = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setPaging(p_paging: Any): Unit = js.native
  
  def setSorting(p_sorting: Any): Unit = js.native
  
  var sorting: Any = js.native
}
