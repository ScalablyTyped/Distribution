package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsDeclaration
import typings.astDashTypes.genKindsMod.DeclareClassKind
import typings.astDashTypes.genKindsMod.DeclareFunctionKind
import typings.astDashTypes.genKindsMod.DeclareVariableKind
import typings.astDashTypes.genKindsMod.ExportBatchSpecifierKind
import typings.astDashTypes.genKindsMod.ExportSpecifierKind
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.DeclareExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareExportDeclarationBuilder extends js.Object {
  def apply(defaultParam: Boolean): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: DeclareClassKind): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: DeclareFunctionKind): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: DeclareVariableKind): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: FlowTypeKind): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def from(params: Anon_CommentsDeclaration): DeclareExportDeclaration = js.native
}

