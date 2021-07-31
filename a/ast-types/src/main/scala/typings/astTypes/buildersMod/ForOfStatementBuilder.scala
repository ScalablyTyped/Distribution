package typings.astTypes.buildersMod

import typings.astTypes.anon.Await
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.VariableDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.ForOfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForOfStatementBuilder extends StObject {
  
  def apply(left: PatternKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def apply(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  
  def from(params: Await): ForOfStatement = js.native
}
