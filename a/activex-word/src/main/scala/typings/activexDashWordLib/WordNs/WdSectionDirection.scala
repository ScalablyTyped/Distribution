package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSectionDirection extends js.Object

@JSGlobal("Word.WdSectionDirection")
@js.native
object WdSectionDirection extends js.Object {
  @js.native
  sealed trait wdSectionDirectionLtr
    extends activexDashWordLib.WordNs.WdSectionDirection
  
  @js.native
  sealed trait wdSectionDirectionRtl
    extends activexDashWordLib.WordNs.WdSectionDirection
  
  /* 1 */ val wdSectionDirectionLtr: wdSectionDirectionLtr with scala.Double = js.native
  /* 0 */ val wdSectionDirectionRtl: wdSectionDirectionRtl with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSectionDirection with scala.Double] = js.native
}

