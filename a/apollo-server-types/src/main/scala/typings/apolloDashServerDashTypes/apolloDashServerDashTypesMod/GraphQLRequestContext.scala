package typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod

import typings.apolloDashServerDashCaching.distKeyValueCacheMod.KeyValueCache
import typings.graphql.graphqlMod.GraphQLError
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestContext[TContext] extends js.Object {
  val cache: KeyValueCache[String]
  val context: TContext
  var debug: js.UndefOr[Boolean] = js.undefined
  val document: js.UndefOr[DocumentNode] = js.undefined
  val errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  val metrics: js.UndefOr[GraphQLRequestMetrics] = js.undefined
  val operation: js.UndefOr[OperationDefinitionNode] = js.undefined
  val operationName: js.UndefOr[String | Null] = js.undefined
  val queryHash: js.UndefOr[String] = js.undefined
  val request: GraphQLRequest
  val response: js.UndefOr[GraphQLResponse] = js.undefined
  val source: js.UndefOr[String] = js.undefined
}

object GraphQLRequestContext {
  @scala.inline
  def apply[TContext](
    cache: KeyValueCache[String],
    context: TContext,
    request: GraphQLRequest,
    debug: js.UndefOr[Boolean] = js.undefined,
    document: DocumentNode = null,
    errors: js.Array[GraphQLError] = null,
    metrics: GraphQLRequestMetrics = null,
    operation: OperationDefinitionNode = null,
    operationName: String = null,
    queryHash: String = null,
    response: GraphQLResponse = null,
    source: String = null
  ): GraphQLRequestContext[TContext] = {
    val __obj = js.Dynamic.literal(cache = cache, context = context.asInstanceOf[js.Any], request = request)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (document != null) __obj.updateDynamic("document")(document)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (queryHash != null) __obj.updateDynamic("queryHash")(queryHash)
    if (response != null) __obj.updateDynamic("response")(response)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[GraphQLRequestContext[TContext]]
  }
}

