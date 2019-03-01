package typings
package arangodbLib.atArangodbFoxxGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var formatError: js.UndefOr[GraphQLFormatErrorFunction] = js.undefined
  var graphiql: js.UndefOr[scala.Boolean] = js.undefined
  var graphql: js.UndefOr[GraphQLModule] = js.undefined
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  var rootValue: js.UndefOr[js.Object] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var validationRules: js.UndefOr[js.Array[_]] = js.undefined
}

object GraphQLOptions {
  @scala.inline
  def apply(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    context: js.Any = null,
    formatError: GraphQLFormatErrorFunction = null,
    graphiql: js.UndefOr[scala.Boolean] = js.undefined,
    graphql: GraphQLModule = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    rootValue: js.Object = null,
    validationRules: js.Array[_] = null
  ): GraphQLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("schema")(schema)
    if (context != null) __obj.updateDynamic("context")(context)
    if (formatError != null) __obj.updateDynamic("formatError")(formatError)
    if (!js.isUndefined(graphiql)) __obj.updateDynamic("graphiql")(graphiql)
    if (graphql != null) __obj.updateDynamic("graphql")(graphql)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    __obj.asInstanceOf[GraphQLOptions]
  }
}

