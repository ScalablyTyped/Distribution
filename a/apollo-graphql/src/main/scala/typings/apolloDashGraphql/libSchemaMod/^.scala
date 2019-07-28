package typings.apolloDashGraphql.libSchemaMod

import typings.apolloDashGraphql.libSchemaBuildSchemaFromSDLMod.GraphQLSchemaModule
import typings.apolloDashGraphql.libSchemaResolverMapMod.GraphQLResolverMap
import typings.apolloDashGraphql.libSchemaTransformSchemaMod.TypeTransformer
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addResolversToSchema(schema: GraphQLSchema, resolvers: GraphQLResolverMap[_]): Unit = js.native
  def buildSchemaFromSDL(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): GraphQLSchema = js.native
  def buildSchemaFromSDL(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode], schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
  def buildSchemaFromSDL(modulesOrSDL: DocumentNode): GraphQLSchema = js.native
  def buildSchemaFromSDL(modulesOrSDL: DocumentNode, schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
  def modulesFromSDL(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): js.Array[GraphQLSchemaModule] = js.native
  def modulesFromSDL(modulesOrSDL: DocumentNode): js.Array[GraphQLSchemaModule] = js.native
  def transformSchema(schema: GraphQLSchema, transformType: TypeTransformer): GraphQLSchema = js.native
}

