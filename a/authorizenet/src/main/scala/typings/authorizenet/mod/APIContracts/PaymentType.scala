package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.PaymentType")
@js.native
open class PaymentType protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var bankAccount: Any = js.native
  
  var creditCard: Any = js.native
  
  var dataSource: Any = js.native
  
  var emv: Any = js.native
  
  var encryptedTrackData: Any = js.native
  
  def getBankAccount(): Any = js.native
  
  def getCreditCard(): Any = js.native
  
  def getDataSource(): Any = js.native
  
  def getEmv(): Any = js.native
  
  def getEncryptedTrackData(): Any = js.native
  
  def getOpaqueData(): Any = js.native
  
  def getPayPal(): Any = js.native
  
  def getTrackData(): Any = js.native
  
  var opaqueData: Any = js.native
  
  var payPal: Any = js.native
  
  def setBankAccount(p_bankAccount: Any): Unit = js.native
  
  def setCreditCard(p_creditCard: Any): Unit = js.native
  
  def setDataSource(p_dataSource: Any): Unit = js.native
  
  def setEmv(p_emv: Any): Unit = js.native
  
  def setEncryptedTrackData(p_encryptedTrackData: Any): Unit = js.native
  
  def setOpaqueData(p_opaqueData: Any): Unit = js.native
  
  def setPayPal(p_payPal: Any): Unit = js.native
  
  def setTrackData(p_trackData: Any): Unit = js.native
  
  var trackData: Any = js.native
}
