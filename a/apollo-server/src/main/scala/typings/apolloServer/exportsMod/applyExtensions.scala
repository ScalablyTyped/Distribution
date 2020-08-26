package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsMerge.extensionsMod.SchemaExtensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "applyExtensions")
@js.native
object applyExtensions extends js.Object {
  def apply(schema: GraphQLSchema, extensions: SchemaExtensions): GraphQLSchema = js.native
}

