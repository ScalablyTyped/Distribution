package typings.apolloEngineReporting.anon

import typings.apolloEngineReporting.apolloEngineReportingStrings.metrics
import typings.apolloEngineReporting.apolloEngineReportingStrings.queryHash
import typings.apolloServerEnv.mod.Request
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.apolloServerTypes.mod.WithRequired
import typings.graphql.astMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[TContext] extends js.Object {
  var context: TContext
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var parsedQuery: js.UndefOr[DocumentNode] = js.undefined
  var queryString: js.UndefOr[String] = js.undefined
  var request: Request
  var requestContext: WithRequired[GraphQLRequestContext[TContext], metrics | queryHash]
  var variables: js.UndefOr[Record[String, _]] = js.undefined
}

object Context {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: Request,
    requestContext: WithRequired[GraphQLRequestContext[TContext], metrics | queryHash],
    extensions: Record[String, _] = null,
    parsedQuery: DocumentNode = null,
    queryString: String = null,
    variables: Record[String, _] = null
  ): Context[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TContext]]
  }
}

