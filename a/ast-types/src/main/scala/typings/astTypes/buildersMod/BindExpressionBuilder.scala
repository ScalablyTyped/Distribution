package typings.astTypes.buildersMod

import typings.astTypes.anon.CalleeComments
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.BindExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindExpressionBuilder extends StObject {
  
  def apply(`object`: Null, callee: ExpressionKind): BindExpression = js.native
  def apply(`object`: ExpressionKind, callee: ExpressionKind): BindExpression = js.native
  
  def from(params: CalleeComments): BindExpression = js.native
}
