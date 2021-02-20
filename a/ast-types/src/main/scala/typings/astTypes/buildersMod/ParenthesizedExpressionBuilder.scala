package typings.astTypes.buildersMod

import typings.astTypes.anon.Expression
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParenthesizedExpressionBuilder extends StObject {
  
  def apply(expression: ExpressionKind): ParenthesizedExpression = js.native
  
  def from(params: Expression): ParenthesizedExpression = js.native
}
