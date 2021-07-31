package typings.astTypes.buildersMod

import typings.astTypes.anon.Alternate
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.IfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfStatementBuilder extends StObject {
  
  def apply(test: ExpressionKind, consequent: StatementKind): IfStatement = js.native
  def apply(test: ExpressionKind, consequent: StatementKind, alternate: StatementKind): IfStatement = js.native
  
  def from(params: Alternate): IfStatement = js.native
}
