package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocTypeAnnotation
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAnnotationBuilder extends js.Object {
  def apply(typeAnnotation: FlowTypeKind): TypeAnnotation = js.native
  def from(params: AnonCommentsLocTypeAnnotation): TypeAnnotation = js.native
}

