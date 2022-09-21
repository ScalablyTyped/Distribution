package typings.authorizenet.mod.APIContracts

import typings.authorizenet.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.SubscriptionPaymentType")
@js.native
open class SubscriptionPaymentType () extends StObject {
  def this(obj: Id) = this()
  
  def getId(): String = js.native
  
  def getPayNum(): String = js.native
  
  var id: String = js.native
  
  var payNum: String = js.native
  
  def setId(p_id: String): Unit = js.native
  
  def setPayNum(p_payNum: String): Unit = js.native
}
