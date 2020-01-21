package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsElementType
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayTypeAnnotationBuilder extends js.Object {
  def apply(elementType: FlowTypeKind): ArrayTypeAnnotation = js.native
  def from(params: AnonCommentsElementType): ArrayTypeAnnotation = js.native
}

