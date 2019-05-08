package typings
package apolloDashGraphqlLib.libSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema", JSImport.Namespace)
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
  def buildSchemaFromSDL(
    modulesOrSDL: js.Array[
      apolloDashGraphqlLib.libSchemaBuildSchemaFromSDLMod.GraphQLSchemaModule | graphqlLib.languageAstMod.DocumentNode
    ]
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def buildSchemaFromSDL(
    modulesOrSDL: js.Array[
      apolloDashGraphqlLib.libSchemaBuildSchemaFromSDLMod.GraphQLSchemaModule | graphqlLib.languageAstMod.DocumentNode
    ],
    schemaToExtend: graphqlLib.graphqlMod.GraphQLSchema
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def modulesFromSDL(modulesOrSDL: graphqlLib.languageAstMod.DocumentNode): js.Array[apolloDashGraphqlLib.libSchemaBuildSchemaFromSDLMod.GraphQLSchemaModule] = js.native
  def modulesFromSDL(
    modulesOrSDL: js.Array[
      apolloDashGraphqlLib.libSchemaBuildSchemaFromSDLMod.GraphQLSchemaModule | graphqlLib.languageAstMod.DocumentNode
    ]
  ): js.Array[apolloDashGraphqlLib.libSchemaBuildSchemaFromSDLMod.GraphQLSchemaModule] = js.native
  def transformSchema(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    transformType: apolloDashGraphqlLib.libSchemaTransformSchemaMod.TypeTransformer
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
}

