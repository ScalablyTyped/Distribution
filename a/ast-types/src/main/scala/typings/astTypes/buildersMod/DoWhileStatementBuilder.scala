package typings.astTypes.buildersMod

import typings.astTypes.anon.Test
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoWhileStatementBuilder extends StObject {
  
  def apply(body: StatementKind, test: ExpressionKind): DoWhileStatement = js.native
  
  def from(params: Test): DoWhileStatement = js.native
}
