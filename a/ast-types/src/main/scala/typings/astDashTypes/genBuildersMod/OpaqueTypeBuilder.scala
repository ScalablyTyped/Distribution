package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsIdImpltype
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.OpaqueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpaqueTypeBuilder extends js.Object {
  def apply(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind, supertype: FlowTypeKind): OpaqueType = js.native
  def apply(
    id: IdentifierKind,
    typeParameters: TypeParameterDeclarationKind,
    impltype: FlowTypeKind,
    supertype: FlowTypeKind
  ): OpaqueType = js.native
  def from(params: Anon_CommentsIdImpltype): OpaqueType = js.native
}

