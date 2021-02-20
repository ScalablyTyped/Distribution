package typings.astTypes.buildersMod

import typings.astTypes.anon.Delegate
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.YieldExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YieldExpressionBuilder extends StObject {
  
  def apply(): YieldExpression = js.native
  def apply(argument: Null, delegate: Boolean): YieldExpression = js.native
  def apply(argument: ExpressionKind): YieldExpression = js.native
  def apply(argument: ExpressionKind, delegate: Boolean): YieldExpression = js.native
  
  def from(params: Delegate): YieldExpression = js.native
}
