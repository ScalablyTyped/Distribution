package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocNameOptional
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeParamBuilder extends js.Object {
  def apply(name: IdentifierKind, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam = js.native
  def from(params: AnonCommentsLocNameOptional): FunctionTypeParam = js.native
}

