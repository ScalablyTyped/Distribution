package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQualifiedNameBuilder extends js.Object {
  def apply(
    left: astDashTypesLib.genKindsMod.IdentifierKind,
    right: astDashTypesLib.genKindsMod.IdentifierKind
  ): astDashTypesLib.genNodesMod.TSQualifiedName = js.native
  def apply(
    left: astDashTypesLib.genKindsMod.IdentifierKind,
    right: astDashTypesLib.genKindsMod.TSQualifiedNameKind
  ): astDashTypesLib.genNodesMod.TSQualifiedName = js.native
  def apply(
    left: astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    right: astDashTypesLib.genKindsMod.IdentifierKind
  ): astDashTypesLib.genNodesMod.TSQualifiedName = js.native
  def apply(
    left: astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    right: astDashTypesLib.genKindsMod.TSQualifiedNameKind
  ): astDashTypesLib.genNodesMod.TSQualifiedName = js.native
  def from(params: astDashTypesLib.Anon_CommentsLeftLocRightArray): astDashTypesLib.genNodesMod.TSQualifiedName = js.native
}

