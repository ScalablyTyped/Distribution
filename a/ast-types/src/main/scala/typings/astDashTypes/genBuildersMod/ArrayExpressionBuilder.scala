package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsElements
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.RestElementKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.ArrayExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayExpressionBuilder extends js.Object {
  def apply(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): ArrayExpression = js.native
  def from(params: Anon_CommentsElements): ArrayExpression = js.native
}

