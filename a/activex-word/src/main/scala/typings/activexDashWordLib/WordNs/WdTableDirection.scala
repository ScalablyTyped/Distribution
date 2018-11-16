package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTableDirection extends js.Object

@JSGlobal("Word.WdTableDirection")
@js.native
object WdTableDirection extends js.Object {
  @js.native
  sealed trait wdTableDirectionLtr
    extends activexDashWordLib.WordNs.WdTableDirection
  
  @js.native
  sealed trait wdTableDirectionRtl
    extends activexDashWordLib.WordNs.WdTableDirection
  
  /* 1 */ val wdTableDirectionLtr: wdTableDirectionLtr with scala.Double = js.native
  /* 0 */ val wdTableDirectionRtl: wdTableDirectionRtl with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTableDirection with scala.Double] = js.native
}

