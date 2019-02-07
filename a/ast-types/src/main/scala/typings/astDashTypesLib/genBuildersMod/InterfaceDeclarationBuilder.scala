package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceDeclarationBuilder extends js.Object {
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind,
    extendsParam: js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind]
  ): astDashTypesLib.genNodesMod.InterfaceDeclaration = js.native
  def from(params: astDashTypesLib.Anon_BodyCommentsExtendsId): astDashTypesLib.genNodesMod.InterfaceDeclaration = js.native
}

