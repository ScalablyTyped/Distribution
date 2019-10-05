package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocParameterName
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSThisTypeKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypePredicateBuilder extends js.Object {
  def apply(parameterName: IdentifierKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def apply(parameterName: TSThisTypeKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def from(params: Anon_CommentsLocParameterName): TSTypePredicate = js.native
}

