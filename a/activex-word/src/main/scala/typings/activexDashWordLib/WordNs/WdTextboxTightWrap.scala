package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTextboxTightWrap extends js.Object

@JSGlobal("Word.WdTextboxTightWrap")
@js.native
object WdTextboxTightWrap extends js.Object {
  @js.native
  sealed trait wdTightAll
    extends activexDashWordLib.WordNs.WdTextboxTightWrap
  
  @js.native
  sealed trait wdTightFirstAndLastLines
    extends activexDashWordLib.WordNs.WdTextboxTightWrap
  
  @js.native
  sealed trait wdTightFirstLineOnly
    extends activexDashWordLib.WordNs.WdTextboxTightWrap
  
  @js.native
  sealed trait wdTightLastLineOnly
    extends activexDashWordLib.WordNs.WdTextboxTightWrap
  
  @js.native
  sealed trait wdTightNone
    extends activexDashWordLib.WordNs.WdTextboxTightWrap
  
  /* 1 */ val wdTightAll: wdTightAll with scala.Double = js.native
  /* 2 */ val wdTightFirstAndLastLines: wdTightFirstAndLastLines with scala.Double = js.native
  /* 3 */ val wdTightFirstLineOnly: wdTightFirstLineOnly with scala.Double = js.native
  /* 4 */ val wdTightLastLineOnly: wdTightLastLineOnly with scala.Double = js.native
  /* 0 */ val wdTightNone: wdTightNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTextboxTightWrap with scala.Double] = js.native
}

