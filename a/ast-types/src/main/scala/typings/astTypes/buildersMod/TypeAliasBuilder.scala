package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdLocRight
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.TypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAliasBuilder extends js.Object {
  def apply(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): TypeAlias = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): TypeAlias = js.native
  def from(params: AnonCommentsIdLocRight): TypeAlias = js.native
}

