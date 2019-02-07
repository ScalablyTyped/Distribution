package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualifiedTypeIdentifierBuilder extends js.Object {
  def apply(
    qualification: astDashTypesLib.genKindsMod.IdentifierKind,
    id: astDashTypesLib.genKindsMod.IdentifierKind
  ): astDashTypesLib.genNodesMod.QualifiedTypeIdentifier = js.native
  def apply(
    qualification: astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind,
    id: astDashTypesLib.genKindsMod.IdentifierKind
  ): astDashTypesLib.genNodesMod.QualifiedTypeIdentifier = js.native
  def from(params: astDashTypesLib.Anon_CommentsIdLocQualification): astDashTypesLib.genNodesMod.QualifiedTypeIdentifier = js.native
}

