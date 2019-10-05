package typings.apolloDashGraphql.apolloDashGraphqlMod

import typings.apolloDashGraphql.libSchemaBuildSchemaFromSDLMod.GraphQLSchemaModule
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql", "buildSchemaFromSDL")
@js.native
object buildSchemaFromSDL extends js.Object {
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): GraphQLSchema = js.native
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode], schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
  def apply(modulesOrSDL: DocumentNode): GraphQLSchema = js.native
  def apply(modulesOrSDL: DocumentNode, schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
}

