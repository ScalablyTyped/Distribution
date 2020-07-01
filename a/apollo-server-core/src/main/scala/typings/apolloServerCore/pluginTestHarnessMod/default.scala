package typings.apolloServerCore.pluginTestHarnessMod

import typings.apolloServerCore.anon.Executor
import typings.apolloServerTypes.mod.GraphQLRequestContextWillSendResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/utils/pluginTestHarness", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[TContext](hasPluginInstanceSchemaLoggerGraphqlRequestOverallCachePolicyExecutorContext: Executor[TContext]): js.Promise[GraphQLRequestContextWillSendResponse[TContext]] = js.native
}

