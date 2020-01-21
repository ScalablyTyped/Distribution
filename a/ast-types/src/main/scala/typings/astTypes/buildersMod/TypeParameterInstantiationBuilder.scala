package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocParamsArrayCommentKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterInstantiationBuilder extends js.Object {
  def apply(params: js.Array[FlowTypeKind]): TypeParameterInstantiation = js.native
  def from(params: AnonCommentsLocParamsArrayCommentKind): TypeParameterInstantiation = js.native
}

