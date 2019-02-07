package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSExpressionWithTypeArgumentsBuilder extends js.Object {
  def apply(expression: astDashTypesLib.genKindsMod.IdentifierKind): astDashTypesLib.genNodesMod.TSExpressionWithTypeArguments = js.native
  def apply(
    expression: astDashTypesLib.genKindsMod.IdentifierKind,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind
  ): astDashTypesLib.genNodesMod.TSExpressionWithTypeArguments = js.native
  def apply(expression: astDashTypesLib.genKindsMod.TSQualifiedNameKind): astDashTypesLib.genNodesMod.TSExpressionWithTypeArguments = js.native
  def apply(
    expression: astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind
  ): astDashTypesLib.genNodesMod.TSExpressionWithTypeArguments = js.native
  def from(params: astDashTypesLib.Anon_CommentsExpressionLoc): astDashTypesLib.genNodesMod.TSExpressionWithTypeArguments = js.native
}

