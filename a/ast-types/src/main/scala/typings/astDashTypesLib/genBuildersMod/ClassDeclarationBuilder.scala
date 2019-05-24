package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassDeclarationBuilder extends js.Object {
  def apply(id: astDashTypesLib.genKindsMod.IdentifierKind, body: astDashTypesLib.genKindsMod.ClassBodyKind): astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassDeclaration = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    body: astDashTypesLib.genKindsMod.ClassBodyKind,
    superClass: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassDeclaration = js.native
  def apply(id: scala.Null, body: astDashTypesLib.genKindsMod.ClassBodyKind): astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassDeclaration = js.native
  def apply(
    id: scala.Null,
    body: astDashTypesLib.genKindsMod.ClassBodyKind,
    superClass: astDashTypesLib.genKindsMod.ExpressionKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassDeclaration = js.native
  def from(params: astDashTypesLib.Anon_BodyCommentsId): astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassDeclaration = js.native
}

