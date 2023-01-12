package typings.agentBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<agent-base.agent-base.Agent, 'addRequest'> */
  trait PickAgentaddRequest extends StObject {
    
    var addRequest: js.UndefOr[Any] = js.undefined
  }
  object PickAgentaddRequest {
    
    inline def apply(): PickAgentaddRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickAgentaddRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickAgentaddRequest] (val x: Self) extends AnyVal {
      
      inline def setAddRequest(value: Any): Self = StObject.set(x, "addRequest", value.asInstanceOf[js.Any])
      
      inline def setAddRequestUndefined: Self = StObject.set(x, "addRequest", js.undefined)
    }
  }
}
