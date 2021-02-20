package typings.agentBase

import typings.agentBase.mod.AgentCallbackCallback
import typings.agentBase.mod.AgentCallbackPromise
import typings.agentBase.mod.ClientRequest
import typings.agentBase.mod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisifyMod {
  
  @JSImport("agent-base/dist/src/promisify", JSImport.Default)
  @js.native
  def default(fn: LegacyCallback): AgentCallbackPromise = js.native
  
  type LegacyCallback = js.Function3[
    /* req */ ClientRequest, 
    /* opts */ RequestOptions, 
    /* fn */ AgentCallbackCallback, 
    Unit
  ]
}
