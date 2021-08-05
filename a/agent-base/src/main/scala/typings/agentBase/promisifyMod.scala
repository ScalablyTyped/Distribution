package typings.agentBase

import typings.agentBase.mod.AgentCallbackCallback
import typings.agentBase.mod.AgentCallbackPromise
import typings.agentBase.mod.ClientRequest
import typings.agentBase.mod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisifyMod {
  
  @JSImport("agent-base/dist/src/promisify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: LegacyCallback): AgentCallbackPromise = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[AgentCallbackPromise]
  
  type LegacyCallback = js.Function3[
    /* req */ ClientRequest, 
    /* opts */ RequestOptions, 
    /* fn */ AgentCallbackCallback, 
    Unit
  ]
}
