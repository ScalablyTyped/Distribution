package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeServerLifeCycleStateSourceServerLifecycle extends StObject {
  
  /**
    * The request to change the source server migration lifecycle state.
    */
  var state: ChangeServerLifeCycleStateSourceServerLifecycleState
}
object ChangeServerLifeCycleStateSourceServerLifecycle {
  
  inline def apply(state: ChangeServerLifeCycleStateSourceServerLifecycleState): ChangeServerLifeCycleStateSourceServerLifecycle = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeServerLifeCycleStateSourceServerLifecycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeServerLifeCycleStateSourceServerLifecycle] (val x: Self) extends AnyVal {
    
    inline def setState(value: ChangeServerLifeCycleStateSourceServerLifecycleState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
