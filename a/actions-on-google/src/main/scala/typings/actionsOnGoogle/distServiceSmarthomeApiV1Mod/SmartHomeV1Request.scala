package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsOnGoogle.anon.Intent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncRequest
  - typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryRequest
  - typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteRequest
  - typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1DisconnectRequest
*/
trait SmartHomeV1Request extends StObject
object SmartHomeV1Request {
  
  inline def SmartHomeV1DisconnectRequest(inputs: js.Array[Intent], requestId: String): typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1DisconnectRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1DisconnectRequest]
  }
  
  inline def SmartHomeV1ExecuteRequest(inputs: js.Array[SmartHomeV1ExecuteRequestInputs], requestId: String): typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1ExecuteRequest]
  }
  
  inline def SmartHomeV1QueryRequest(inputs: js.Array[SmartHomeV1QueryRequestInputs], requestId: String): typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1QueryRequest]
  }
  
  inline def SmartHomeV1SyncRequest(inputs: js.Array[SmartHomeV1SyncRequestInputs], requestId: String): typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1SyncRequest]
  }
}
