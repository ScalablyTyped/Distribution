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
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSQualifiedName = js.native
  def apply(
    left: astDashTypesLib.genKindsMod.IdentifierKind,
    right: astDashTypesLib.genKindsMod.TSQualifiedNameKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSQualifiedName = js.native
  def apply(
    left: astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    right: astDashTypesLib.genKindsMod.IdentifierKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSQualifiedName = js.native
  def apply(
    left: astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    right: astDashTypesLib.genKindsMod.TSQualifiedNameKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSQualifiedName = js.native
  def from(params: astDashTypesLib.Anon_CommentsLeftLocRightArray): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSQualifiedName = js.native
}

