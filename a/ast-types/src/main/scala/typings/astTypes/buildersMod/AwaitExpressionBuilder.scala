package typings.astTypes.buildersMod

import typings.astTypes.anon.All
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.AwaitExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwaitExpressionBuilder extends StObject {
  
  def apply(): AwaitExpression = js.native
  def apply(argument: Null, all: Boolean): AwaitExpression = js.native
  def apply(argument: ExpressionKind): AwaitExpression = js.native
  def apply(argument: ExpressionKind, all: Boolean): AwaitExpression = js.native
  
  def from(params: All): AwaitExpression = js.native
}
