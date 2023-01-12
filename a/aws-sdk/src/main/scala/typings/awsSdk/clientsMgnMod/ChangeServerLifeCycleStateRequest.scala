package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeServerLifeCycleStateRequest extends StObject {
  
  /**
    * The request to change the source server migration lifecycle state.
    */
  var lifeCycle: ChangeServerLifeCycleStateSourceServerLifecycle
  
  /**
    * The request to change the source server migration lifecycle state by source server ID.
    */
  var sourceServerID: SourceServerID
}
object ChangeServerLifeCycleStateRequest {
  
  inline def apply(lifeCycle: ChangeServerLifeCycleStateSourceServerLifecycle, sourceServerID: SourceServerID): ChangeServerLifeCycleStateRequest = {
    val __obj = js.Dynamic.literal(lifeCycle = lifeCycle.asInstanceOf[js.Any], sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeServerLifeCycleStateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeServerLifeCycleStateRequest] (val x: Self) extends AnyVal {
    
    inline def setLifeCycle(value: ChangeServerLifeCycleStateSourceServerLifecycle): Self = StObject.set(x, "lifeCycle", value.asInstanceOf[js.Any])
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
