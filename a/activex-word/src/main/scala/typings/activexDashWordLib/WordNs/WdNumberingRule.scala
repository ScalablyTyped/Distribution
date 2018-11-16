package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdNumberingRule extends js.Object

@JSGlobal("Word.WdNumberingRule")
@js.native
object WdNumberingRule extends js.Object {
  @js.native
  sealed trait wdRestartContinuous
    extends activexDashWordLib.WordNs.WdNumberingRule
  
  @js.native
  sealed trait wdRestartPage
    extends activexDashWordLib.WordNs.WdNumberingRule
  
  @js.native
  sealed trait wdRestartSection
    extends activexDashWordLib.WordNs.WdNumberingRule
  
  /* 0 */ val wdRestartContinuous: wdRestartContinuous with scala.Double = js.native
  /* 2 */ val wdRestartPage: wdRestartPage with scala.Double = js.native
  /* 1 */ val wdRestartSection: wdRestartSection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdNumberingRule with scala.Double] = js.native
}

