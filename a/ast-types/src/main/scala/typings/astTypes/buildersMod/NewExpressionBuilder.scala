package typings.astTypes.buildersMod

import typings.astTypes.anon.Arguments
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.namedTypesMod.namedTypes.NewExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewExpressionBuilder extends StObject {
  
  def apply(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): NewExpression = js.native
  
  def from(params: Arguments): NewExpression = js.native
}
