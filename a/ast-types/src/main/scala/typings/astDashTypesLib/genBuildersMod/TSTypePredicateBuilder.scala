package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypePredicateBuilder extends js.Object {
  def apply(
    parameterName: astDashTypesLib.genKindsMod.IdentifierKind,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TSTypePredicate = js.native
  def apply(
    parameterName: astDashTypesLib.genKindsMod.TSThisTypeKind,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TSTypePredicate = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocParameterName): astDashTypesLib.genNodesMod.TSTypePredicate = js.native
}

