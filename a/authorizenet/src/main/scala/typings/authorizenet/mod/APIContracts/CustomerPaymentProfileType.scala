package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.CustomerPaymentProfileType")
@js.native
open class CustomerPaymentProfileType protected () extends CustomerPaymentProfileBaseType {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var defaultPaymentProfile: Any = js.native
  
  var driversLicense: Any = js.native
  
  def getDefaultPaymentProfile(): Any = js.native
  
  def getDriversLicense(): Any = js.native
  
  def getPayment(): Any = js.native
  
  def getSubsequentAuthInformation(): Any = js.native
  
  def getTaxId(): Any = js.native
  
  var payment: Any = js.native
  
  def setDefaultPaymentProfile(p_defaultPaymentProfile: Any): Unit = js.native
  
  def setDriversLicense(p_driversLicense: Any): Unit = js.native
  
  def setPayment(p_payment: Any): Unit = js.native
  
  def setSubsequentAuthInformation(p_subsequentAuthInformation: Any): Unit = js.native
  
  def setTaxId(p_taxId: Any): Unit = js.native
  
  var subsequentAuthInformation: Any = js.native
  
  var taxId: Any = js.native
}
