package typings.astTypes.buildersMod

import typings.astTypes.anon.ExpressionLoc
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.JSXEmptyExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXExpressionContainerBuilder extends js.Object {
  
  def apply(expression: ExpressionKind): JSXExpressionContainer = js.native
  def apply(expression: JSXEmptyExpressionKind): JSXExpressionContainer = js.native
  
  def from(params: ExpressionLoc): JSXExpressionContainer = js.native
}
