package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ANetApiRequest")
@js.native
open class ANetApiRequest protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var clientId: Any = js.native
  
  def getClientId(): Any = js.native
  
  def getMerchantAuthentication(): Any = js.native
  
  def getRefId(): Any = js.native
  
  var merchantAuthentication: Any = js.native
  
  var refId: Any = js.native
  
  def setClientId(p_clientId: Any): Unit = js.native
  
  def setMerchantAuthentication(p_merchantAuthentication: Any): Unit = js.native
  
  def setRefId(p_refId: Any): Unit = js.native
}
