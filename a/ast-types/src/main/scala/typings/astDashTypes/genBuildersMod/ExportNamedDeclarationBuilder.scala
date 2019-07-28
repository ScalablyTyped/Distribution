package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsDeclarationLocSource
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExportSpecifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ExportNamedDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportNamedDeclarationBuilder extends js.Object {
  def apply(): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def from(params: Anon_CommentsDeclarationLocSource): ExportNamedDeclaration = js.native
}

