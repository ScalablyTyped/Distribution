package typings.astTypes.buildersMod

import typings.astTypes.anon.BodyCommentsLoc
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.DoExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoExpressionBuilder extends js.Object {
  
  def apply(body: js.Array[StatementKind]): DoExpression = js.native
  
  def from(params: BodyCommentsLoc): DoExpression = js.native
}
