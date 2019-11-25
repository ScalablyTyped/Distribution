package typings.atApollographqlApolloDashTools.libBuildServiceDefinitionMod

import typings.graphql.graphqlMod.GraphQLError
import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServiceDefinition extends js.Object {
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
}

object GraphQLServiceDefinition {
  @scala.inline
  def apply(errors: js.Array[GraphQLError] = null, schema: GraphQLSchema = null): GraphQLServiceDefinition = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLServiceDefinition]
  }
}

