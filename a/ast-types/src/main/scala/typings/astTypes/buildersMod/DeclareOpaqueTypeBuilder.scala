package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdLocRight
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareOpaqueTypeBuilder extends js.Object {
  def apply(id: IdentifierKind): DeclareOpaqueType = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind): DeclareOpaqueType = js.native
  def from(params: AnonCommentsIdLocRight): DeclareOpaqueType = js.native
}

