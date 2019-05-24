package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInterfaceDeclarationBuilder extends js.Object {
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    body: astDashTypesLib.genKindsMod.TSInterfaceBodyKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInterfaceDeclaration = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    body: astDashTypesLib.genKindsMod.TSInterfaceBodyKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInterfaceDeclaration = js.native
  def from(params: astDashTypesLib.Anon_BodyCommentsDeclareExtends): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInterfaceDeclaration = js.native
}

