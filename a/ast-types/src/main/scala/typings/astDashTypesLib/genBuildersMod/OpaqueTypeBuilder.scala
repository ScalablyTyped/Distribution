package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpaqueTypeBuilder extends js.Object {
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind,
    impltype: astDashTypesLib.genKindsMod.FlowTypeKind,
    supertype: astDashTypesLib.genKindsMod.FlowTypeKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.OpaqueType = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    typeParameters: scala.Null,
    impltype: astDashTypesLib.genKindsMod.FlowTypeKind,
    supertype: astDashTypesLib.genKindsMod.FlowTypeKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.OpaqueType = js.native
  def from(params: astDashTypesLib.Anon_CommentsIdImpltype): astDashTypesLib.genNamedTypesMod.namedTypesNs.OpaqueType = js.native
}

