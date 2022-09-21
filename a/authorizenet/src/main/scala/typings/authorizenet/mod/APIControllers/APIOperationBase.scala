package typings.authorizenet.mod.APIControllers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authorizenet", "APIControllers.APIOperationBase")
@js.native
open class APIOperationBase protected () extends StObject {
  def this(apiRequest: Any) = this()
  
  var _endpoint: String = js.native
  
  var _request: Any = js.native
  
  var _response: Any = js.native
  
  def beforeExecute(): Unit = js.native
  
  def execute(callback: Any): Unit = js.native
  
  def getMessagetype(): Any = js.native
  
  def getResponse(): Any = js.native
  
  def getResultcode(): Any = js.native
  
  def setClientId(): Unit = js.native
  
  def setEnvironment(env: Any): Unit = js.native
  
  def validate(): Unit = js.native
  
  def validateRequest(): Unit = js.native
}
