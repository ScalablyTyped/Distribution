package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdLocMethod
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeInternalSlotBuilder extends js.Object {
  def apply(id: IdentifierKind, value: FlowTypeKind, optional: Boolean, staticParam: Boolean, method: Boolean): ObjectTypeInternalSlot = js.native
  def from(params: AnonCommentsIdLocMethod): ObjectTypeInternalSlot = js.native
}

