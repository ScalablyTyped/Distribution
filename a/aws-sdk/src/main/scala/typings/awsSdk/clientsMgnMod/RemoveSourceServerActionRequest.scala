package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveSourceServerActionRequest extends StObject {
  
  /**
    * Source server post migration custom action ID to remove.
    */
  var actionID: ActionID
  
  /**
    * Source server ID of the post migration custom action to remove.
    */
  var sourceServerID: SourceServerID
}
object RemoveSourceServerActionRequest {
  
  inline def apply(actionID: ActionID, sourceServerID: SourceServerID): RemoveSourceServerActionRequest = {
    val __obj = js.Dynamic.literal(actionID = actionID.asInstanceOf[js.Any], sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSourceServerActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveSourceServerActionRequest] (val x: Self) extends AnyVal {
    
    inline def setActionID(value: ActionID): Self = StObject.set(x, "actionID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
