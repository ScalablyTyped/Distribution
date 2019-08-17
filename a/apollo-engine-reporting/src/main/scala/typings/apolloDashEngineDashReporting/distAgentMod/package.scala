package typings.apolloDashEngineDashReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distAgentMod {
  import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext

  type GenerateClientInfo[TContext] = js.Function1[/* requestContext */ GraphQLRequestContext[TContext], ClientInfo]
}
