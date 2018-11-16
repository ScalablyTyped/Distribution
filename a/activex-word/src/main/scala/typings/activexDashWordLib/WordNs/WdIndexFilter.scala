package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdIndexFilter extends js.Object

@JSGlobal("Word.WdIndexFilter")
@js.native
object WdIndexFilter extends js.Object {
  @js.native
  sealed trait wdIndexFilterAiueo
    extends activexDashWordLib.WordNs.WdIndexFilter
  
  @js.native
  sealed trait wdIndexFilterAkasatana
    extends activexDashWordLib.WordNs.WdIndexFilter
  
  @js.native
  sealed trait wdIndexFilterChosung
    extends activexDashWordLib.WordNs.WdIndexFilter
  
  @js.native
  sealed trait wdIndexFilterFull
    extends activexDashWordLib.WordNs.WdIndexFilter
  
  @js.native
  sealed trait wdIndexFilterLow
    extends activexDashWordLib.WordNs.WdIndexFilter
  
  @js.native
  sealed trait wdIndexFilterMedium
    extends activexDashWordLib.WordNs.WdIndexFilter
  
  @js.native
  sealed trait wdIndexFilterNone
    extends activexDashWordLib.WordNs.WdIndexFilter
  
  /* 1 */ val wdIndexFilterAiueo: wdIndexFilterAiueo with scala.Double = js.native
  /* 2 */ val wdIndexFilterAkasatana: wdIndexFilterAkasatana with scala.Double = js.native
  /* 3 */ val wdIndexFilterChosung: wdIndexFilterChosung with scala.Double = js.native
  /* 6 */ val wdIndexFilterFull: wdIndexFilterFull with scala.Double = js.native
  /* 4 */ val wdIndexFilterLow: wdIndexFilterLow with scala.Double = js.native
  /* 5 */ val wdIndexFilterMedium: wdIndexFilterMedium with scala.Double = js.native
  /* 0 */ val wdIndexFilterNone: wdIndexFilterNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdIndexFilter with scala.Double] = js.native
}

