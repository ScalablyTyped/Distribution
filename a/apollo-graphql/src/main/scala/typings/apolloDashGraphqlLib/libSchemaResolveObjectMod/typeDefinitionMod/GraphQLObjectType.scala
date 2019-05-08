package typings
package apolloDashGraphqlLib.libSchemaResolveObjectMod.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectType extends js.Object {
  var resolveObject: js.UndefOr[apolloDashGraphqlLib.libSchemaResolveObjectMod.GraphQLObjectResolver[_, _]] = js.undefined
}

object GraphQLObjectType {
  @scala.inline
  def apply(resolveObject: apolloDashGraphqlLib.libSchemaResolveObjectMod.GraphQLObjectResolver[_, _] = null): GraphQLObjectType = {
    val __obj = js.Dynamic.literal()
    if (resolveObject != null) __obj.updateDynamic("resolveObject")(resolveObject)
    __obj.asInstanceOf[GraphQLObjectType]
  }
}

