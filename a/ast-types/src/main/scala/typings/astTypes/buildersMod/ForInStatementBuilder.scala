package typings.astTypes.buildersMod

import typings.astTypes.anon.Left
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.VariableDeclarationKind
import typings.astTypes.namedTypesMod.namedTypes.ForInStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForInStatementBuilder extends js.Object {
  
  def apply(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  def apply(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  
  def from(params: Left): ForInStatement = js.native
}
