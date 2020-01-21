package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocParamsArray
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterDeclarationBuilder extends js.Object {
  def apply(params: js.Array[TSTypeParameterKind]): TSTypeParameterDeclaration = js.native
  def from(params: AnonCommentsLocParamsArray): TSTypeParameterDeclaration = js.native
}

