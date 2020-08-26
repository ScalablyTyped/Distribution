package typings.apolloServerExpress.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.SchemaMapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "mapSchema")
@js.native
object mapSchema extends js.Object {
  def apply(schema: GraphQLSchema): GraphQLSchema = js.native
  def apply(schema: GraphQLSchema, schemaMapper: SchemaMapper): GraphQLSchema = js.native
}

