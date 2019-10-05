package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocParameters
import typings.astDashTypes.genKindsMod.ArrayPatternKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.ObjectPatternKind
import typings.astDashTypes.genKindsMod.RestElementKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSCallSignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSCallSignatureDeclarationBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSCallSignatureDeclaration = js.native
  def apply(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSCallSignatureDeclaration = js.native
  def from(params: Anon_CommentsLocParameters): TSCallSignatureDeclaration = js.native
}

