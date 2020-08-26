package typings.agentBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AgentCallbackCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* socket */ js.UndefOr[typings.agentBase.mod.AgentCallbackReturn], 
    scala.Unit
  ]
  type AgentCallbackPromise = js.Function2[
    /* req */ typings.agentBase.mod.ClientRequest, 
    /* opts */ typings.agentBase.mod.RequestOptions, 
    typings.agentBase.mod.AgentCallbackReturn | js.Promise[typings.agentBase.mod.AgentCallbackReturn]
  ]
  type AgentCallbackReturn = typings.node.streamMod.Duplex | typings.agentBase.mod.AgentLike
  type AgentLike = typings.agentBase.anon.PickAgentaddRequest | typings.node.httpMod.Agent
}
