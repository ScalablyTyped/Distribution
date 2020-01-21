package typings.apolloGraphql.buildSchemaFromSDLMod

import typings.apolloGraphql.resolverMapMod.GraphQLResolverMap
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLSchemaModule extends js.Object {
  var resolvers: js.UndefOr[GraphQLResolverMap[_]] = js.undefined
  var typeDefs: DocumentNode
}

object GraphQLSchemaModule {
  @scala.inline
  def apply(typeDefs: DocumentNode, resolvers: GraphQLResolverMap[_] = null): GraphQLSchemaModule = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaModule]
  }
}

