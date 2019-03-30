package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSCallSignatureDeclarationBuilder extends js.Object {
  def apply(
    parameters: js.Array[
      astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
    ]
  ): astDashTypesLib.genNodesMod.TSCallSignatureDeclaration = js.native
  def apply(
    parameters: js.Array[
      astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
    ],
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TSCallSignatureDeclaration = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocParameters): astDashTypesLib.genNodesMod.TSCallSignatureDeclaration = js.native
}

