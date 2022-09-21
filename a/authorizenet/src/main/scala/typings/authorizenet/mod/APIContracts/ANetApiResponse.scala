package typings.authorizenet.mod.APIContracts

import typings.authorizenet.anon.ErrorResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ANetApiResponse")
@js.native
open class ANetApiResponse protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  def getJSON(): ErrorResponse = js.native
  
  def getMessages(): Any = js.native
  
  def getRefId(): Any = js.native
  
  def getSessionToken(): Any = js.native
  
  var messages: Any = js.native
  
  var refId: Any = js.native
  
  var sessionToken: Any = js.native
  
  def setMessages(p_messages: Any): Unit = js.native
  
  def setRefId(p_refId: Any): Unit = js.native
  
  def setSessionToken(p_sessionToken: Any): Unit = js.native
}
