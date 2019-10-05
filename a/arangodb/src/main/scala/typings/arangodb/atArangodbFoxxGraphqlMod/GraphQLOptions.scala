package typings.arangodb.atArangodbFoxxGraphqlMod

import typings.graphql.errorFormatErrorMod.GraphQLFormattedError
import typings.graphql.errorGraphQLErrorMod.GraphQLError
import typings.graphql.graphqlMod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var formatError: js.UndefOr[GraphQLFormatErrorFunction] = js.undefined
  var graphiql: js.UndefOr[Boolean] = js.undefined
  var graphql: js.UndefOr[GraphQLModule] = js.undefined
  var pretty: js.UndefOr[Boolean] = js.undefined
  var rootValue: js.UndefOr[js.Object] = js.undefined
  var schema: GraphQLSchema
  var validationRules: js.UndefOr[js.Array[_]] = js.undefined
}

object GraphQLOptions {
  @scala.inline
  def apply(
    schema: GraphQLSchema,
    context: js.Any = null,
    formatError: /* error */ GraphQLError => GraphQLFormattedError[Record[String, js.Any]] = null,
    graphiql: js.UndefOr[Boolean] = js.undefined,
    graphql: GraphQLModule = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    rootValue: js.Object = null,
    validationRules: js.Array[_] = null
  ): GraphQLOptions = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (context != null) __obj.updateDynamic("context")(context)
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (!js.isUndefined(graphiql)) __obj.updateDynamic("graphiql")(graphiql)
    if (graphql != null) __obj.updateDynamic("graphql")(graphql)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    __obj.asInstanceOf[GraphQLOptions]
  }
}

