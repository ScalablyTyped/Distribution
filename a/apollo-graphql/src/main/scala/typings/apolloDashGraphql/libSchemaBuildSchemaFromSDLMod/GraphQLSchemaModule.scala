package typings.apolloDashGraphql.libSchemaBuildSchemaFromSDLMod

import typings.apolloDashGraphql.libSchemaResolverMapMod.GraphQLResolverMap
import typings.graphql.languageAstMod.DocumentNode
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
    val __obj = js.Dynamic.literal(typeDefs = typeDefs)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers)
    __obj.asInstanceOf[GraphQLSchemaModule]
  }
}

