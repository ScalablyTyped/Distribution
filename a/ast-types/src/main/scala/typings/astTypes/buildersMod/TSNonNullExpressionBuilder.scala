package typings.astTypes.buildersMod

import typings.astTypes.anon.Expression
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNonNullExpressionBuilder extends js.Object {
  
  def apply(expression: ExpressionKind): TSNonNullExpression = js.native
  
  def from(params: Expression): TSNonNullExpression = js.native
}
