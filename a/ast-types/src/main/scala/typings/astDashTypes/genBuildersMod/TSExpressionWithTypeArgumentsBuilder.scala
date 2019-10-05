package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsExpressionLoc
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genKindsMod.TSTypeParameterInstantiationKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSExpressionWithTypeArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSExpressionWithTypeArgumentsBuilder extends js.Object {
  def apply(expression: IdentifierKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSQualifiedNameKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def from(params: Anon_CommentsExpressionLoc): TSExpressionWithTypeArguments = js.native
}

