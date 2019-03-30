package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSMethodSignatureBuilder extends js.Object {
  def apply(
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    parameters: js.Array[
      astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
    ]
  ): astDashTypesLib.genNodesMod.TSMethodSignature = js.native
  def apply(
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    parameters: js.Array[
      astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
    ],
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TSMethodSignature = js.native
  def from(params: astDashTypesLib.Anon_CommentsComputedKeyLoc): astDashTypesLib.genNodesMod.TSMethodSignature = js.native
}

