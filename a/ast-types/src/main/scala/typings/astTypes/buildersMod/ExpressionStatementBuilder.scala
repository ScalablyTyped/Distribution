package typings.astTypes.buildersMod

import typings.astTypes.anon.Expression
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressionStatementBuilder extends js.Object {
  
  def apply(expression: ExpressionKind): ExpressionStatement = js.native
  
  def from(params: Expression): ExpressionStatement = js.native
}
