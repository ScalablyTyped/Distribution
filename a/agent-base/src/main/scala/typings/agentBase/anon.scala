package typings.agentBase

import typings.agentBase.mod.ClientRequest
import typings.agentBase.mod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<agent-base.agent-base.Agent, 'addRequest'> */
  trait PickAgentaddRequest extends StObject {
    
    def addRequest(req: ClientRequest, _opts: RequestOptions): Unit
    @JSName("addRequest")
    var addRequest_Original: js.Function2[/* req */ ClientRequest, /* _opts */ RequestOptions, Unit]
  }
  object PickAgentaddRequest {
    
    inline def apply(addRequest: (/* req */ ClientRequest, /* _opts */ RequestOptions) => Unit): PickAgentaddRequest = {
      val __obj = js.Dynamic.literal(addRequest = js.Any.fromFunction2(addRequest))
      __obj.asInstanceOf[PickAgentaddRequest]
    }
    
    extension [Self <: PickAgentaddRequest](x: Self) {
      
      inline def setAddRequest(value: (/* req */ ClientRequest, /* _opts */ RequestOptions) => Unit): Self = StObject.set(x, "addRequest", js.Any.fromFunction2(value))
    }
  }
}
