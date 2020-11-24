package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsDeclaration
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDefaultDeclarationBuilder extends js.Object {
  
  def apply(declaration: DeclarationKind): ExportDefaultDeclaration = js.native
  def apply(declaration: ExpressionKind): ExportDefaultDeclaration = js.native
  
  def from(params: CommentsDeclaration): ExportDefaultDeclaration = js.native
}
