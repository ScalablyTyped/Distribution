package typings.apolloDashGraphql.libSchemaResolveObjectMod.typeDefinitionMod

import typings.apolloDashGraphql.libSchemaResolveObjectMod.GraphQLObjectResolver
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectType extends js.Object {
  var resolveObject: js.UndefOr[GraphQLObjectResolver[_, _]] = js.undefined
}

object GraphQLObjectType {
  @scala.inline
  def apply(
    resolveObject: (_, /* fields */ Record[String, js.Array[FieldNode]], _, /* info */ GraphQLResolveInfo) => js.Any = null
  ): GraphQLObjectType = {
    val __obj = js.Dynamic.literal()
    if (resolveObject != null) __obj.updateDynamic("resolveObject")(js.Any.fromFunction4(resolveObject))
    __obj.asInstanceOf[GraphQLObjectType]
  }
}

