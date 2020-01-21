package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocTypeAnnotationArray
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAnnotationBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeAnnotationKind): TSTypeAnnotation = js.native
  def apply(typeAnnotation: TSTypeKind): TSTypeAnnotation = js.native
  def from(params: AnonCommentsLocTypeAnnotationArray): TSTypeAnnotation = js.native
}

