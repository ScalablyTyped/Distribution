package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.GetCustomerProfileRequest")
@js.native
open class GetCustomerProfileRequest protected () extends ANetApiRequest {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var customerProfileId: Any = js.native
  
  var email: Any = js.native
  
  def getCustomerProfileId(): Any = js.native
  
  def getEmail(): Any = js.native
  
  def getIncludeIssuerInfo(): Any = js.native
  
  def getJSON(): typings.authorizenet.anon.GetCustomerProfileRequest = js.native
  
  def getMerchantCustomerId(): Any = js.native
  
  def getUnmaskExpirationDate(): Any = js.native
  
  var includeIssuerInfo: Any = js.native
  
  var merchantCustomerId: Any = js.native
  
  def setCustomerProfileId(p_customerProfileId: Any): Unit = js.native
  
  def setEmail(p_email: Any): Unit = js.native
  
  def setIncludeIssuerInfo(p_includeIssuerInfo: Any): Unit = js.native
  
  def setMerchantCustomerId(p_merchantCustomerId: Any): Unit = js.native
  
  def setUnmaskExpirationDate(p_unmaskExpirationDate: Any): Unit = js.native
  
  var unmaskExpirationDate: Any = js.native
}
