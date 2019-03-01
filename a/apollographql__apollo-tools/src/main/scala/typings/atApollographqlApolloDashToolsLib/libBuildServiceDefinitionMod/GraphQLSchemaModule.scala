package typings
package atApollographqlApolloDashToolsLib.libBuildServiceDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLSchemaModule extends js.Object {
  var resolvers: js.UndefOr[atApollographqlApolloDashToolsLib.libSchemaResolverMapMod.GraphQLResolverMap[_]] = js.undefined
  var typeDefs: graphqlLib.languageAstMod.DocumentNode
}

object GraphQLSchemaModule {
  @scala.inline
  def apply(
    typeDefs: graphqlLib.languageAstMod.DocumentNode,
    resolvers: atApollographqlApolloDashToolsLib.libSchemaResolverMapMod.GraphQLResolverMap[_] = null
  ): GraphQLSchemaModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("typeDefs")(typeDefs)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers)
    __obj.asInstanceOf[GraphQLSchemaModule]
  }
}

