package typings
package apolloDashGraphqlLib.libSchemaBuildSchemaFromSDLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema/buildSchemaFromSDL", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addResolversToSchema(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    resolvers: apolloDashGraphqlLib.libSchemaResolverMapMod.GraphQLResolverMap[_]
  ): scala.Unit = js.native
  def buildSchemaFromSDL(modulesOrSDL: graphqlLib.languageAstMod.DocumentNode): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def buildSchemaFromSDL(
    modulesOrSDL: graphqlLib.languageAstMod.DocumentNode,
    schemaToExtend: graphqlLib.graphqlMod.GraphQLSchema
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def buildSchemaFromSDL(modulesOrSDL: js.Array[GraphQLSchemaModule | graphqlLib.languageAstMod.DocumentNode]): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def buildSchemaFromSDL(
    modulesOrSDL: js.Array[GraphQLSchemaModule | graphqlLib.languageAstMod.DocumentNode],
    schemaToExtend: graphqlLib.graphqlMod.GraphQLSchema
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def modulesFromSDL(modulesOrSDL: graphqlLib.languageAstMod.DocumentNode): js.Array[GraphQLSchemaModule] = js.native
  def modulesFromSDL(modulesOrSDL: js.Array[GraphQLSchemaModule | graphqlLib.languageAstMod.DocumentNode]): js.Array[GraphQLSchemaModule] = js.native
}

