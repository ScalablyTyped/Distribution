package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsExpression
import typings.astTypes.kindsMod.ChainElementKind
import typings.astTypes.namedTypesMod.namedTypes.ChainExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainExpressionBuilder extends js.Object {
  
  def apply(expression: ChainElementKind): ChainExpression = js.native
  
  def from(params: CommentsExpression): ChainExpression = js.native
}
