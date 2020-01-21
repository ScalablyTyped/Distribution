package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsElementTypeLoc
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSArrayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSArrayTypeBuilder extends js.Object {
  def apply(elementType: TSTypeKind): TSArrayType = js.native
  def from(params: AnonCommentsElementTypeLoc): TSArrayType = js.native
}

