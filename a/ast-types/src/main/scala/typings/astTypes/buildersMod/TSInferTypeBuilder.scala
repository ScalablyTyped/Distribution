package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocTypeParameter
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.namedTypesMod.namedTypes.TSInferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInferTypeBuilder extends js.Object {
  def apply(typeParameter: TSTypeParameterKind): TSInferType = js.native
  def from(params: AnonCommentsLocTypeParameter): TSInferType = js.native
}

