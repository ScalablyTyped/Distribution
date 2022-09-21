package typings.authorizenet.mod.APIContracts

import typings.authorizenet.anon.MerchantAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.MerchantContactType")
@js.native
open class MerchantContactType () extends StObject {
  def this(obj: MerchantAddress) = this()
  
  def getMerchantAddress(): String = js.native
  
  def getMerchantCity(): String = js.native
  
  def getMerchantName(): String = js.native
  
  def getMerchantPhone(): String = js.native
  
  def getMerchantState(): String = js.native
  
  def getMerchantZip(): String = js.native
  
  var merchantAddress: String = js.native
  
  var merchantCity: String = js.native
  
  var merchantName: String = js.native
  
  var merchantPhone: String = js.native
  
  var merchantState: String = js.native
  
  var merchantZip: String = js.native
  
  def setMerchantAddress(p_merchantAddress: String): Unit = js.native
  
  def setMerchantCity(p_merchantCity: String): Unit = js.native
  
  def setMerchantName(p_merchantName: String): Unit = js.native
  
  def setMerchantPhone(p_merchantPhone: String): Unit = js.native
  
  def setMerchantState(p_merchantState: String): Unit = js.native
  
  def setMerchantZip(p_merchantZip: String): Unit = js.native
}
