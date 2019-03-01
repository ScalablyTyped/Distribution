package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSpecifierBuilder extends js.Object {
  def apply(
    local: astDashTypesLib.genKindsMod.IdentifierKind,
    exported: astDashTypesLib.genKindsMod.IdentifierKind
  ): astDashTypesLib.genNodesMod.ExportSpecifier = js.native
  def apply(local: js.UndefOr[scala.Nothing], exported: astDashTypesLib.genKindsMod.IdentifierKind): astDashTypesLib.genNodesMod.ExportSpecifier = js.native
  def apply(local: scala.Null, exported: astDashTypesLib.genKindsMod.IdentifierKind): astDashTypesLib.genNodesMod.ExportSpecifier = js.native
  def from(params: astDashTypesLib.Anon_CommentsExported): astDashTypesLib.genNodesMod.ExportSpecifier = js.native
}

