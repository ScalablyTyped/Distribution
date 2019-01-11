package typings
package atApollographqlApolloDashToolsLib.atApollographqlApolloDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollographql/apollo-tools", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def buildServiceDefinition(
    modules: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[
      atApollographqlApolloDashToolsLib.libBuildServiceDefinitionMod.GraphQLSchemaModule
    ]
  ): atApollographqlApolloDashToolsLib.libBuildServiceDefinitionMod.GraphQLServiceDefinition = js.native
  def invariant(condition: js.Any, message: java.lang.String): scala.Unit = js.native
  def isDocumentNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.DocumentNode */ scala.Boolean = js.native
  def isNode(maybeNode: js.Any): /* is graphql.graphql/language/ast.ASTNode */ scala.Boolean = js.native
  def isNotNullOrUndefined[T](): /* is T */ scala.Boolean = js.native
  def isNotNullOrUndefined[T](value: T): /* is T */ scala.Boolean = js.native
}

