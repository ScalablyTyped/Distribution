package typings.arangodb.graphqlMod

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
    formatError: /* error */ js.Any => js.Any = null,
    graphiql: js.UndefOr[Boolean] = js.undefined,
    graphql: GraphQLModule = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    rootValue: js.Object = null,
    validationRules: js.Array[_] = null
  ): GraphQLOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (!js.isUndefined(graphiql)) __obj.updateDynamic("graphiql")(graphiql.asInstanceOf[js.Any])
    if (graphql != null) __obj.updateDynamic("graphql")(graphql.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLOptions]
  }
}

