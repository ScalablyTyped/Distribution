package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsElementTypes
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSTupleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTupleTypeBuilder extends js.Object {
  def apply(elementTypes: js.Array[TSTypeKind]): TSTupleType = js.native
  def from(params: AnonCommentsElementTypes): TSTupleType = js.native
}

