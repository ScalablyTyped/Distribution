package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.pruneMod.PruneSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "pruneSchema")
@js.native
object pruneSchema extends js.Object {
  def apply(schema: GraphQLSchema): GraphQLSchema = js.native
  def apply(schema: GraphQLSchema, options: PruneSchemaOptions): GraphQLSchema = js.native
}

