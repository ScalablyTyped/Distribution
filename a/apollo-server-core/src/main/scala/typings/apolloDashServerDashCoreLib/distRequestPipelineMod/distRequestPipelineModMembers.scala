package typings
package apolloDashServerDashCoreLib.distRequestPipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/requestPipeline", JSImport.Namespace)
@js.native
object distRequestPipelineModMembers extends js.Object {
  def processGraphQLRequest[TContext](
    config: GraphQLRequestPipelineConfig[TContext],
    requestContext: Mutable[
      apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLRequestContext[TContext]
    ]
  ): stdLib.Promise[apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLResponse] = js.native
}

