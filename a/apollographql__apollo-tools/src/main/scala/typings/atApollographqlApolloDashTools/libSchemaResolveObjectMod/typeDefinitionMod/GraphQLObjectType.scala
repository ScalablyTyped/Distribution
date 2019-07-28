package typings.atApollographqlApolloDashTools.libSchemaResolveObjectMod.typeDefinitionMod

import typings.atApollographqlApolloDashTools.libSchemaResolveObjectMod.GraphQLObjectResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectType extends js.Object {
  var resolveObject: js.UndefOr[GraphQLObjectResolver[_, _]] = js.undefined
}

object GraphQLObjectType {
  @scala.inline
  def apply(resolveObject: GraphQLObjectResolver[_, _] = null): GraphQLObjectType = {
    val __obj = js.Dynamic.literal()
    if (resolveObject != null) __obj.updateDynamic("resolveObject")(resolveObject)
    __obj.asInstanceOf[GraphQLObjectType]
  }
}

