package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdApplyQuickStyleSets extends js.Object

@JSGlobal("Word.WdApplyQuickStyleSets")
@js.native
object WdApplyQuickStyleSets extends js.Object {
  @js.native
  sealed trait wdSessionStartSet
    extends activexDashWordLib.WordNs.WdApplyQuickStyleSets
  
  @js.native
  sealed trait wdTemplateSet
    extends activexDashWordLib.WordNs.WdApplyQuickStyleSets
  
  /* 1 */ val wdSessionStartSet: wdSessionStartSet with scala.Double = js.native
  /* 2 */ val wdTemplateSet: wdTemplateSet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdApplyQuickStyleSets with scala.Double] = js.native
}

