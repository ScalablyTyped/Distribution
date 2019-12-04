package typings.apolloDashGraphql

import typings.graphql.languageAstMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/utilities/graphql", JSImport.Namespace)
@js.native
object libUtilitiesGraphqlMod extends js.Object {
  def isDocumentNode(node: ASTNode): /* is graphql.graphql/language/ast.DocumentNode */ Boolean = js.native
  def isNode(maybeNode: js.Any): /* is graphql.graphql/language/ast.ASTNode */ Boolean = js.native
}

