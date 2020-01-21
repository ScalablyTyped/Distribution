package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocTypesArray
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSUnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSUnionTypeBuilder extends js.Object {
  def apply(types: js.Array[TSTypeKind]): TSUnionType = js.native
  def from(params: AnonCommentsLocTypesArray): TSUnionType = js.native
}

