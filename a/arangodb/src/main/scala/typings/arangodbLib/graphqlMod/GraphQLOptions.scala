package typings
package arangodbLib.graphqlMod

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

