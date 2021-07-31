package typings.astTypes.buildersMod

import typings.astTypes.anon.Guard
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.CatchClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatchClauseBuilder extends StObject {
  
  def apply(param: Null, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def apply(param: Null, guard: Unit, body: BlockStatementKind): CatchClause = js.native
  def apply(param: Null, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def apply(param: Unit, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def apply(param: Unit, guard: Unit, body: BlockStatementKind): CatchClause = js.native
  def apply(param: Unit, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def apply(param: PatternKind, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def apply(param: PatternKind, guard: Unit, body: BlockStatementKind): CatchClause = js.native
  def apply(param: PatternKind, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  
  def from(params: Guard): CatchClause = js.native
}
