package typings
package atApollographqlApolloDashToolsLib.libSchemaResolveObjectMod.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectType extends js.Object {
  var resolveObject: js.UndefOr[
    atApollographqlApolloDashToolsLib.libSchemaResolveObjectMod.GraphQLObjectResolver[_, _]
  ] = js.undefined
}

object GraphQLObjectType {
  @scala.inline
  def apply(
    resolveObject: atApollographqlApolloDashToolsLib.libSchemaResolveObjectMod.GraphQLObjectResolver[_, _] = null
  ): GraphQLObjectType = {
    val __obj = js.Dynamic.literal()
    if (resolveObject != null) __obj.updateDynamic("resolveObject")(resolveObject)
    __obj.asInstanceOf[GraphQLObjectType]
  }
}

