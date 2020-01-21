package typings.apolloGraphql.resolveObjectMod.graphqlTypeDefinitionAugmentingMod

import typings.apolloGraphql.resolveObjectMod.GraphQLObjectResolver
import typings.graphql.astMod.FieldNode
import typings.graphql.definitionMod.GraphQLResolveInfo
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

