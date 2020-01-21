package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocTypes
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TupleTypeAnnotationBuilder extends js.Object {
  def apply(types: js.Array[FlowTypeKind]): TupleTypeAnnotation = js.native
  def from(params: AnonCommentsLocTypes): TupleTypeAnnotation = js.native
}

