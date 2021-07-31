package typings.astTypes.buildersMod

import typings.astTypes.anon.Test
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhileStatementBuilder extends StObject {
  
  def apply(test: ExpressionKind, body: StatementKind): WhileStatement = js.native
  
  def from(params: Test): WhileStatement = js.native
}
