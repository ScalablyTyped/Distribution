package typings.astTypes.buildersMod

import typings.astTypes.anon.Prefix
import typings.astTypes.astTypesStrings.PlussignPlussign
import typings.astTypes.astTypesStrings.`--`
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.UpdateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateExpressionBuilder extends StObject {
  
  def apply(operator: PlussignPlussign, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def apply(operator: `--`, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  
  def from(params: Prefix): UpdateExpression = js.native
}
