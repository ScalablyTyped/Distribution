package typings.apolloServerCore.anon

import typings.apolloServerCore.pluginTestHarnessMod.IPluginTestHarnessExecutionDidStart
import typings.apolloServerCore.pluginTestHarnessMod.IPluginTestHarnessGraphqlRequest
import typings.apolloServerPluginBase.mod.ApolloServerPlugin
import typings.apolloServerTypes.mod.GraphQLResponse
import typings.apolloServerTypes.mod.Logger
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.graphql.typeMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executor[TContext] extends js.Object {
  var context: js.UndefOr[TContext] = js.undefined
  var graphqlRequest: IPluginTestHarnessGraphqlRequest
  var logger: js.UndefOr[Logger] = js.undefined
  var overallCachePolicy: js.UndefOr[RequiredCacheHint] = js.undefined
  var pluginInstance: ApolloServerPlugin[TContext]
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
  def executor(requestContext: IPluginTestHarnessExecutionDidStart[TContext]): ValueOrPromise[GraphQLResponse]
}

object Executor {
  @scala.inline
  def apply[TContext](
    executor: IPluginTestHarnessExecutionDidStart[TContext] => ValueOrPromise[GraphQLResponse],
    graphqlRequest: IPluginTestHarnessGraphqlRequest,
    pluginInstance: ApolloServerPlugin[TContext],
    context: TContext = null,
    logger: Logger = null,
    overallCachePolicy: RequiredCacheHint = null,
    schema: GraphQLSchema = null
  ): Executor[TContext] = {
    val __obj = js.Dynamic.literal(executor = js.Any.fromFunction1(executor), graphqlRequest = graphqlRequest.asInstanceOf[js.Any], pluginInstance = pluginInstance.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (overallCachePolicy != null) __obj.updateDynamic("overallCachePolicy")(overallCachePolicy.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executor[TContext]]
  }
}

