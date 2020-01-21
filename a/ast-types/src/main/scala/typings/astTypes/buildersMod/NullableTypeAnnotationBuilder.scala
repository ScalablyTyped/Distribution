package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocTypeAnnotation
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NullableTypeAnnotationBuilder extends js.Object {
  def apply(typeAnnotation: FlowTypeKind): NullableTypeAnnotation = js.native
  def from(params: AnonCommentsLocTypeAnnotation): NullableTypeAnnotation = js.native
}

