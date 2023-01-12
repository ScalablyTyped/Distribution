package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelReplayRequest extends StObject {
  
  /**
    * The name of the replay to cancel.
    */
  var ReplayName: typings.awsSdk.clientsEventbridgeMod.ReplayName
}
object CancelReplayRequest {
  
  inline def apply(ReplayName: ReplayName): CancelReplayRequest = {
    val __obj = js.Dynamic.literal(ReplayName = ReplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReplayRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelReplayRequest] (val x: Self) extends AnyVal {
    
    inline def setReplayName(value: ReplayName): Self = StObject.set(x, "ReplayName", value.asInstanceOf[js.Any])
  }
}
