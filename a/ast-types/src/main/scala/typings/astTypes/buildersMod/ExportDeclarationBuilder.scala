package typings.astTypes.buildersMod

import typings.astTypes.anon.Specifiers
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.ExportBatchSpecifierKind
import typings.astTypes.kindsMod.ExportSpecifierKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDeclarationBuilder extends StObject {
  
  def apply(defaultParam: Boolean): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): ExportDeclaration = js.native
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
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): ExportDeclaration = js.native
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
    specifiers: js.UndefOr[scala.Nothing],
    source: LiteralKind
  ): ExportDeclaration = js.native
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
  
  def from(params: Specifiers): ExportDeclaration = js.native
}
