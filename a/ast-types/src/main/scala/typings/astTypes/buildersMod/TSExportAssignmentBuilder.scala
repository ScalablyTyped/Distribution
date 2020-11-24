package typings.astTypes.buildersMod

import typings.astTypes.anon.Expression
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.TSExportAssignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSExportAssignmentBuilder extends js.Object {
  
  def apply(expression: ExpressionKind): TSExportAssignment = js.native
  
  def from(params: Expression): TSExportAssignment = js.native
}
