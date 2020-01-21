package typings.apolloGraphql.resolveObjectMod.graphqlTypeDefinitionAugmentingMod

import typings.apolloGraphql.resolveObjectMod.GraphQLObjectResolver
import typings.graphql.astMod.FieldNode
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectTypeConfig[TSource, TContext] extends js.Object {
  var resolveObject: js.UndefOr[GraphQLObjectResolver[TSource, TContext]] = js.undefined
}

object GraphQLObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    resolveObject: (TSource, /* fields */ Record[String, js.Array[FieldNode]], TContext, /* info */ GraphQLResolveInfo) => js.Any = null
  ): GraphQLObjectTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    if (resolveObject != null) __obj.updateDynamic("resolveObject")(js.Any.fromFunction4(resolveObject))
    __obj.asInstanceOf[GraphQLObjectTypeConfig[TSource, TContext]]
  }
}

