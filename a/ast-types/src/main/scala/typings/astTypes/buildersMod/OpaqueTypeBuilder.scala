package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdImpltype
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.OpaqueType
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
  def from(params: AnonCommentsIdImpltype): OpaqueType = js.native
}

