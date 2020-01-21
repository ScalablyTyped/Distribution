package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdKey
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeIndexerBuilder extends js.Object {
  def apply(id: IdentifierKind, key: FlowTypeKind, value: FlowTypeKind): ObjectTypeIndexer = js.native
  def from(params: AnonCommentsIdKey): ObjectTypeIndexer = js.native
}

