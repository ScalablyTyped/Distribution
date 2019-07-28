package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLeftLoc
import typings.astDashTypes.astDashTypesStrings.`&&`
import typings.astDashTypes.astDashTypesStrings.`??`
import typings.astDashTypes.astDashTypesStrings.`||`
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.LogicalExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalExpressionBuilder extends js.Object {
  def apply(operator: `&&`, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: `??`, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: `||`, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def from(params: Anon_CommentsLeftLoc): LogicalExpression = js.native
}

