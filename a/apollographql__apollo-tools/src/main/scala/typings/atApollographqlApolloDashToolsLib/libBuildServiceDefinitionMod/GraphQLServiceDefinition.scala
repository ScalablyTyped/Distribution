package typings
package atApollographqlApolloDashToolsLib.libBuildServiceDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServiceDefinition extends js.Object {
  var errors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var schema: js.UndefOr[graphqlLib.graphqlMod.GraphQLSchema] = js.undefined
}

object GraphQLServiceDefinition {
  @scala.inline
  def apply(
    errors: js.Array[graphqlLib.graphqlMod.GraphQLError] = null,
    schema: graphqlLib.graphqlMod.GraphQLSchema = null
  ): GraphQLServiceDefinition = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[GraphQLServiceDefinition]
  }
}

