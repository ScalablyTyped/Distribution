package typings.apolloServer.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.SchemaVisitorMap
import typings.graphqlToolsUtils.interfacesMod.VisitorSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "visitSchema")
@js.native
object visitSchema extends js.Object {
  def apply(
    schema: GraphQLSchema,
    visitorOrVisitorSelector: js.Array[typings.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor | SchemaVisitorMap]
  ): GraphQLSchema = js.native
  def apply(schema: GraphQLSchema, visitorOrVisitorSelector: SchemaVisitorMap): GraphQLSchema = js.native
  def apply(schema: GraphQLSchema, visitorOrVisitorSelector: VisitorSelector): GraphQLSchema = js.native
  def apply(
    schema: GraphQLSchema,
    visitorOrVisitorSelector: typings.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor
  ): GraphQLSchema = js.native
}

