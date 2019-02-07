package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSPropertySignatureBuilder extends js.Object {
  def apply(key: astDashTypesLib.genKindsMod.ExpressionKind): astDashTypesLib.genNodesMod.TSPropertySignature = js.native
  def apply(
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TSPropertySignature = js.native
  def apply(
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind,
    optional: scala.Boolean
  ): astDashTypesLib.genNodesMod.TSPropertySignature = js.native
  def apply(
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    typeAnnotation: scala.Null,
    optional: scala.Boolean
  ): astDashTypesLib.genNodesMod.TSPropertySignature = js.native
  def from(params: astDashTypesLib.Anon_CommentsComputedInitializer): astDashTypesLib.genNodesMod.TSPropertySignature = js.native
}

