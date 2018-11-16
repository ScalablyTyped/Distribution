package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOMathSpacingRule extends js.Object

@JSGlobal("Word.WdOMathSpacingRule")
@js.native
object WdOMathSpacingRule extends js.Object {
  @js.native
  sealed trait wdOMathSpacing1pt5
    extends activexDashWordLib.WordNs.WdOMathSpacingRule
  
  @js.native
  sealed trait wdOMathSpacingDouble
    extends activexDashWordLib.WordNs.WdOMathSpacingRule
  
  @js.native
  sealed trait wdOMathSpacingExactly
    extends activexDashWordLib.WordNs.WdOMathSpacingRule
  
  @js.native
  sealed trait wdOMathSpacingMultiple
    extends activexDashWordLib.WordNs.WdOMathSpacingRule
  
  @js.native
  sealed trait wdOMathSpacingSingle
    extends activexDashWordLib.WordNs.WdOMathSpacingRule
  
  /* 1 */ val wdOMathSpacing1pt5: wdOMathSpacing1pt5 with scala.Double = js.native
  /* 2 */ val wdOMathSpacingDouble: wdOMathSpacingDouble with scala.Double = js.native
  /* 3 */ val wdOMathSpacingExactly: wdOMathSpacingExactly with scala.Double = js.native
  /* 4 */ val wdOMathSpacingMultiple: wdOMathSpacingMultiple with scala.Double = js.native
  /* 0 */ val wdOMathSpacingSingle: wdOMathSpacingSingle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOMathSpacingRule with scala.Double] = js.native
}

