package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSConstructSignatureDeclarationBuilder extends js.Object {
  def apply(
    parameters: js.Array[
      astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ObjectPatternKind
    ]
  ): astDashTypesLib.genNodesMod.TSConstructSignatureDeclaration = js.native
  def apply(
    parameters: js.Array[
      astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ObjectPatternKind
    ],
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TSConstructSignatureDeclaration = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocParameters): astDashTypesLib.genNodesMod.TSConstructSignatureDeclaration = js.native
}

