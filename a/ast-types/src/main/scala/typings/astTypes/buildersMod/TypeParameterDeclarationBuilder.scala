package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocParams
import typings.astTypes.kindsMod.TypeParameterKind
import typings.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterDeclarationBuilder extends js.Object {
  def apply(params: js.Array[TypeParameterKind]): TypeParameterDeclaration = js.native
  def from(params: AnonCommentsLocParams): TypeParameterDeclaration = js.native
}

