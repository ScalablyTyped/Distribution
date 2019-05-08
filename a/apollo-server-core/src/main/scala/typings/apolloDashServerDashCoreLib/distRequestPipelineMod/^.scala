package typings
package apolloDashServerDashCoreLib.distRequestPipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/requestPipeline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val APQ_CACHE_PREFIX: apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.`apq:` = js.native
  def processGraphQLRequest[TContext](
    config: GraphQLRequestPipelineConfig[TContext],
    requestContext: Mutable[
      apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLRequestContext[TContext]
    ]
  ): js.Promise[apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLResponse] = js.native
}

