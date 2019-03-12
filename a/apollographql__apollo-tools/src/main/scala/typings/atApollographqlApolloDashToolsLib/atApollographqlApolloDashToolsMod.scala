package typings
package atApollographqlApolloDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollographql/apollo-tools", JSImport.Namespace)
@js.native
object atApollographqlApolloDashToolsMod extends js.Object {
  def buildServiceDefinition(
    modules: js.Array[
      atApollographqlApolloDashToolsLib.libBuildServiceDefinitionMod.GraphQLSchemaModule
    ]
  ): atApollographqlApolloDashToolsLib.libBuildServiceDefinitionMod.GraphQLServiceDefinition = js.native
  def invariant(condition: js.Any, message: java.lang.String): scala.Unit = js.native
  def isDocumentNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.DocumentNode */ scala.Boolean = js.native
  def isNode(maybeNode: js.Any): /* is graphql.graphql/language/ast.ASTNode */ scala.Boolean = js.native
  def isNotNullOrUndefined[T](): /* is T */ scala.Boolean = js.native
  def isNotNullOrUndefined[T](value: T): /* is T */ scala.Boolean = js.native
  @JSName("graphql/language/predicates")
  @js.native
  object graphqlLanguagePredicatesNs extends js.Object {
    def isTypeDefinitionNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.TypeDefinitionNode */ scala.Boolean = js.native
    def isTypeExtensionNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.TypeExtensionNode */ scala.Boolean = js.native
  }
  
}

