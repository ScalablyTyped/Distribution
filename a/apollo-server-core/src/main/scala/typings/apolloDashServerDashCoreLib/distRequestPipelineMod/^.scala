package typings
package apolloDashServerDashCoreLib.distRequestPipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/requestPipeline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def processGraphQLRequest[TContext](
    config: apolloDashServerDashCoreLib.distRequestPipelineMod.GraphQLRequestPipelineConfig[TContext],
    requestContext: apolloDashServerDashCoreLib.distRequestPipelineMod.Mutable[
      apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLRequestContext[TContext]
    ]
  ): js.Promise[apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLResponse] = js.native
}

