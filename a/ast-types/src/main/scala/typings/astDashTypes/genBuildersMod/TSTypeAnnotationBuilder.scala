package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocTypeAnnotationArray
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAnnotationBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeAnnotationKind): TSTypeAnnotation = js.native
  def apply(typeAnnotation: TSTypeKind): TSTypeAnnotation = js.native
  def from(params: Anon_CommentsLocTypeAnnotationArray): TSTypeAnnotation = js.native
}

