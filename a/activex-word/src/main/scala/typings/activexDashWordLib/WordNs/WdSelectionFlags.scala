package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSelectionFlags extends js.Object

@JSGlobal("Word.WdSelectionFlags")
@js.native
object WdSelectionFlags extends js.Object {
  @js.native
  sealed trait wdSelActive
    extends activexDashWordLib.WordNs.WdSelectionFlags
  
  @js.native
  sealed trait wdSelAtEOL
    extends activexDashWordLib.WordNs.WdSelectionFlags
  
  @js.native
  sealed trait wdSelOvertype
    extends activexDashWordLib.WordNs.WdSelectionFlags
  
  @js.native
  sealed trait wdSelReplace
    extends activexDashWordLib.WordNs.WdSelectionFlags
  
  @js.native
  sealed trait wdSelStartActive
    extends activexDashWordLib.WordNs.WdSelectionFlags
  
  /* 8 */ val wdSelActive: wdSelActive with scala.Double = js.native
  /* 2 */ val wdSelAtEOL: wdSelAtEOL with scala.Double = js.native
  /* 4 */ val wdSelOvertype: wdSelOvertype with scala.Double = js.native
  /* 16 */ val wdSelReplace: wdSelReplace with scala.Double = js.native
  /* 1 */ val wdSelStartActive: wdSelStartActive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSelectionFlags with scala.Double] = js.native
}

