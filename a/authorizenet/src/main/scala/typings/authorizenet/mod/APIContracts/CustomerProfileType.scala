package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CustomerProfileType")
@js.native
open class CustomerProfileType protected () extends CustomerProfileBaseType {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getPaymentProfiles(): Any = js.native
  
  def getProfileType(): Any = js.native
  
  def getShipToList(): Any = js.native
  
  var paymentProfiles: Any = js.native
  
  var profileType: Any = js.native
  
  def setPaymentProfiles(p_paymentProfiles: Any): Unit = js.native
  
  def setProfileType(p_profileType: Any): Unit = js.native
  
  def setShipToList(p_shipToList: Any): Unit = js.native
  
  var shipToList: Any = js.native
}
