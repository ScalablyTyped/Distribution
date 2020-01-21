package typings.apolloEngineReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object agentMod {
  type GenerateClientInfo[TContext] = js.Function1[
    /* requestContext */ typings.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
    typings.apolloEngineReporting.agentMod.ClientInfo
  ]
}
