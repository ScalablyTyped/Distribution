package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsDeclarationLoc
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDefaultDeclarationBuilder extends js.Object {
  def apply(declaration: DeclarationKind): ExportDefaultDeclaration = js.native
  def apply(declaration: ExpressionKind): ExportDefaultDeclaration = js.native
  def from(params: AnonCommentsDeclarationLoc): ExportDefaultDeclaration = js.native
}

