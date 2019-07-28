package typings.apolloDashEngineDashReporting

import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distAgentMod {
  type GenerateClientInfo[TContext] = js.Function1[/* requestContext */ GraphQLRequestContext[TContext], ClientInfo]
}
