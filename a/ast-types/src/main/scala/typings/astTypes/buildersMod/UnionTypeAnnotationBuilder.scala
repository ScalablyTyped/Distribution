package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocTypes
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionTypeAnnotationBuilder extends js.Object {
  def apply(types: js.Array[FlowTypeKind]): UnionTypeAnnotation = js.native
  def from(params: AnonCommentsLocTypes): UnionTypeAnnotation = js.native
}

