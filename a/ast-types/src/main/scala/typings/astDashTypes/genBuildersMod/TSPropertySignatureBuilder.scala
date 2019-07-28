package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsComputedInitializer
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSPropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSPropertySignatureBuilder extends js.Object {
  def apply(key: ExpressionKind): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: Null, optional: Boolean): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): TSPropertySignature = js.native
  def apply(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind, optional: Boolean): TSPropertySignature = js.native
  def from(params: Anon_CommentsComputedInitializer): TSPropertySignature = js.native
}

