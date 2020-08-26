package typings.apolloServer.exportsMod

import typings.graphql.astMod.DefinitionNode
import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.Source
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "mergeGraphQLTypes")
@js.native
object mergeGraphQLTypes extends js.Object {
  def apply(types: js.Array[String | Source | DocumentNode | GraphQLSchema], config: Config): js.Array[DefinitionNode] = js.native
}

