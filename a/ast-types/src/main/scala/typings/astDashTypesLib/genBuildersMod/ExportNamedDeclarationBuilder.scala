package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportNamedDeclarationBuilder extends js.Object {
  def apply(): astDashTypesLib.genNodesMod.ExportNamedDeclaration = js.native
  def apply(declaration: astDashTypesLib.genKindsMod.DeclarationKind): astDashTypesLib.genNodesMod.ExportNamedDeclaration = js.native
  def apply(
    declaration: astDashTypesLib.genKindsMod.DeclarationKind,
    specifiers: js.Array[astDashTypesLib.genKindsMod.ExportSpecifierKind]
  ): astDashTypesLib.genNodesMod.ExportNamedDeclaration = js.native
  def apply(
    declaration: astDashTypesLib.genKindsMod.DeclarationKind,
    specifiers: js.Array[astDashTypesLib.genKindsMod.ExportSpecifierKind],
    source: astDashTypesLib.genKindsMod.LiteralKind
  ): astDashTypesLib.genNodesMod.ExportNamedDeclaration = js.native
  def apply(declaration: scala.Null, specifiers: js.Array[astDashTypesLib.genKindsMod.ExportSpecifierKind]): astDashTypesLib.genNodesMod.ExportNamedDeclaration = js.native
  def apply(
    declaration: scala.Null,
    specifiers: js.Array[astDashTypesLib.genKindsMod.ExportSpecifierKind],
    source: astDashTypesLib.genKindsMod.LiteralKind
  ): astDashTypesLib.genNodesMod.ExportNamedDeclaration = js.native
  def from(params: astDashTypesLib.Anon_CommentsDeclarationLocSource): astDashTypesLib.genNodesMod.ExportNamedDeclaration = js.native
}

