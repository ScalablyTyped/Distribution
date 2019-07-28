package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsExpressionExtra
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSTypeAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAssertionBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeKind, expression: ExpressionKind): TSTypeAssertion = js.native
  def from(params: Anon_CommentsExpressionExtra): TSTypeAssertion = js.native
}

