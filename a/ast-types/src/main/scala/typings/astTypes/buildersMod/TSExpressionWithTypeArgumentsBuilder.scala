package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExpressionLoc
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSExpressionWithTypeArgumentsBuilder extends js.Object {
  def apply(expression: IdentifierKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSQualifiedNameKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def from(params: AnonCommentsExpressionLoc): TSExpressionWithTypeArguments = js.native
}

