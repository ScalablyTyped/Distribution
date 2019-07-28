package typings.atApollographqlApolloDashTools

import typings.atApollographqlApolloDashTools.libBuildServiceDefinitionMod.GraphQLSchemaModule
import typings.atApollographqlApolloDashTools.libBuildServiceDefinitionMod.GraphQLServiceDefinition
import typings.graphql.languageAstMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollographql/apollo-tools", JSImport.Namespace)
@js.native
object atApollographqlApolloDashToolsMod extends js.Object {
  def buildServiceDefinition(modules: js.Array[GraphQLSchemaModule]): GraphQLServiceDefinition = js.native
  def invariant(condition: js.Any, message: String): Unit = js.native
  def isDocumentNode(node: ASTNode): /* is graphql.graphql/language/ast.DocumentNode */ Boolean = js.native
  def isNode(maybeNode: js.Any): /* is graphql.graphql/language/ast.ASTNode */ Boolean = js.native
  def isNotNullOrUndefined[T](): /* is T */ Boolean = js.native
  def isNotNullOrUndefined[T](value: T): /* is T */ Boolean = js.native
  @JSName("graphql/language/predicates")
  @js.native
  object graphqlLanguagePredicatesNs extends js.Object {
    def isTypeDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeDefinitionNode */ Boolean = js.native
    def isTypeExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeExtensionNode */ Boolean = js.native
  }
  
}

