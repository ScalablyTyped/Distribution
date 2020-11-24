package typings.astTypes.buildersMod

import typings.astTypes.anon.Object
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStatementBuilder extends js.Object {
  
  def apply(`object`: ExpressionKind, body: StatementKind): WithStatement = js.native
  
  def from(params: Object): WithStatement = js.native
}
