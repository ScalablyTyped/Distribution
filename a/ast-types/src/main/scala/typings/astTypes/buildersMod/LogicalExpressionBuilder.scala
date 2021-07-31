package typings.astTypes.buildersMod

import typings.astTypes.anon.LeftLoc
import typings.astTypes.astTypesStrings.AmpersandAmpersand
import typings.astTypes.astTypesStrings.QuestionmarkQuestionmark
import typings.astTypes.astTypesStrings.VerticallineVerticalline
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.LogicalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogicalExpressionBuilder extends StObject {
  
  def apply(operator: AmpersandAmpersand, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: QuestionmarkQuestionmark, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: VerticallineVerticalline, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  
  def from(params: LeftLoc): LogicalExpression = js.native
}
