package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ImpersonationAuthenticationType")
@js.native
open class ImpersonationAuthenticationType protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getPartnerLoginId(): Any = js.native
  
  def getPartnerTransactionKey(): Any = js.native
  
  var partnerLoginId: Any = js.native
  
  var partnerTransactionKey: Any = js.native
  
  def setPartnerLoginId(p_partnerLoginId: Any): Unit = js.native
  
  def setPartnerTransactionKey(p_partnerTransactionKey: Any): Unit = js.native
}
