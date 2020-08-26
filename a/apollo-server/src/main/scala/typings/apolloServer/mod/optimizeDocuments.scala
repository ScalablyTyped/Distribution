package typings.apolloServer.mod

import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsRelayOperationOptimizer.mod.OptimizeDocumentsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "optimizeDocuments")
@js.native
object optimizeDocuments extends js.Object {
  def apply(schema: GraphQLSchema, documents: js.Array[DocumentNode]): js.Array[DocumentNode] = js.native
  def apply(schema: GraphQLSchema, documents: js.Array[DocumentNode], options: OptimizeDocumentsOptions): js.Array[DocumentNode] = js.native
}

