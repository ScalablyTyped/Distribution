package typings.apolloEngineReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object agentMod {
  type GenerateClientInfo[TContext] = js.Function1[
    /* requestContext */ typings.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
    typings.apolloEngineReporting.agentMod.ClientInfo
  ]
  type ReportTimingOptions[TContext] = (js.Function1[
    /* request */ typings.apolloServerTypes.mod.GraphQLRequestContextDidResolveOperation[TContext] | typings.apolloServerTypes.mod.GraphQLRequestContextDidEncounterErrors[TContext], 
    js.Promise[scala.Boolean]
  ]) | scala.Boolean
}
