package typings.astTypes.buildersMod

import typings.astTypes.anon.Init
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.VariableDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.ForStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForStatementBuilder extends StObject {
  
  def apply(init: Null, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: Null, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def apply(init: Null, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: Null, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def apply(init: ExpressionKind, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: ExpressionKind, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def apply(init: ExpressionKind, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: ExpressionKind, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def apply(init: VariableDeclarationKind, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: VariableDeclarationKind, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def apply(init: VariableDeclarationKind, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def apply(init: VariableDeclarationKind, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  
  def from(params: Init): ForStatement = js.native
}
