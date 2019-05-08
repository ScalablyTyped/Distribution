package typings
package apolloDashGraphqlLib.libSchemaResolveObjectMod.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectTypeConfig[TSource, TContext] extends js.Object {
  var resolveObject: js.UndefOr[
    apolloDashGraphqlLib.libSchemaResolveObjectMod.GraphQLObjectResolver[TSource, TContext]
  ] = js.undefined
}

object GraphQLObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    resolveObject: apolloDashGraphqlLib.libSchemaResolveObjectMod.GraphQLObjectResolver[TSource, TContext] = null
  ): GraphQLObjectTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    if (resolveObject != null) __obj.updateDynamic("resolveObject")(resolveObject)
    __obj.asInstanceOf[GraphQLObjectTypeConfig[TSource, TContext]]
  }
}

