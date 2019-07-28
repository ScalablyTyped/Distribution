package typings.apolloDashServerDashCore.distRequestPipelineMod

import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.`apq:`
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/requestPipeline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val APQ_CACHE_PREFIX: `apq:` = js.native
  def processGraphQLRequest[TContext](
    config: GraphQLRequestPipelineConfig[TContext],
    requestContext: Mutable[GraphQLRequestContext[TContext]]
  ): js.Promise[GraphQLResponse] = js.native
}

