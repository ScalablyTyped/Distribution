package typings.astTypes.buildersMod

import typings.astTypes.anon.Cases
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.SwitchCaseKind
import typings.astTypes.namedTypesMod.namedTypes.SwitchStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchStatementBuilder extends StObject {
  
  def apply(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind]): SwitchStatement = js.native
  def apply(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind], lexical: Boolean): SwitchStatement = js.native
  
  def from(params: Cases): SwitchStatement = js.native
}
