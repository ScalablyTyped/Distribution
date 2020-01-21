package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExpressionExtra
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAssertionBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeKind, expression: ExpressionKind): TSTypeAssertion = js.native
  def from(params: AnonCommentsExpressionExtra): TSTypeAssertion = js.native
}

