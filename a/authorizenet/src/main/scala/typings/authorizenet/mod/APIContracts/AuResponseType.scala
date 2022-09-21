package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.AuResponseType")
@js.native
open class AuResponseType protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var auReasonCode: Any = js.native
  
  def getAuReasonCode(): Any = js.native
  
  def getProfileCount(): Any = js.native
  
  def getReasonDescription(): Any = js.native
  
  var profileCount: Any = js.native
  
  var reasonDescription: Any = js.native
  
  def setAuReasonCode(p_auReasonCode: Any): Unit = js.native
  
  def setProfileCount(p_profileCount: Any): Unit = js.native
  
  def setReasonDescription(p_reasonDescription: Any): Unit = js.native
}
