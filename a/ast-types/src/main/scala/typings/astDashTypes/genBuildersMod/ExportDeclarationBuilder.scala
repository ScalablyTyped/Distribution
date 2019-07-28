package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsDeclarationDefault
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExportBatchSpecifierKind
import typings.astDashTypes.genKindsMod.ExportSpecifierKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDeclarationBuilder extends js.Object {
  def apply(defaultParam: Boolean): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: DeclarationKind): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: ExpressionKind): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def from(params: Anon_CommentsDeclarationDefault): ExportDeclaration = js.native
}

