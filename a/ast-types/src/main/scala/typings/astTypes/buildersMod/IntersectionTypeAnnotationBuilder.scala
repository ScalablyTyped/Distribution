package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocTypes
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionTypeAnnotationBuilder extends js.Object {
  def apply(types: js.Array[FlowTypeKind]): IntersectionTypeAnnotation = js.native
  def from(params: AnonCommentsLocTypes): IntersectionTypeAnnotation = js.native
}

