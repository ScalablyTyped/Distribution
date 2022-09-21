package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIContracts.ArbTransaction")
@js.native
open class ArbTransaction protected () extends StObject {
  def this(obj: Any, args: Any*) = this()
  def this(obj: Unit, args: Any*) = this()
  
  var attemptNum: Any = js.native
  
  def getAttemptNum(): Any = js.native
  
  def getPayNum(): Any = js.native
  
  def getResponse(): Any = js.native
  
  def getSubmitTimeUTC(): Any = js.native
  
  def getTransId(): Any = js.native
  
  var payNum: Any = js.native
  
  var response: Any = js.native
  
  def setAttemptNum(p_attemptNum: Any): Unit = js.native
  
  def setPayNum(p_payNum: Any): Unit = js.native
  
  def setResponse(p_response: Any): Unit = js.native
  
  def setSubmitTimeUTC(p_submitTimeUTC: Any): Unit = js.native
  
  def setTransId(p_transId: Any): Unit = js.native
  
  var submitTimeUTC: Any = js.native
  
  var transId: Any = js.native
}
