package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTofFormat extends js.Object

@JSGlobal("Word.WdTofFormat")
@js.native
object WdTofFormat extends js.Object {
  @js.native
  sealed trait wdTOFCentered
    extends activexDashWordLib.WordNs.WdTofFormat
  
  @js.native
  sealed trait wdTOFClassic
    extends activexDashWordLib.WordNs.WdTofFormat
  
  @js.native
  sealed trait wdTOFDistinctive
    extends activexDashWordLib.WordNs.WdTofFormat
  
  @js.native
  sealed trait wdTOFFormal
    extends activexDashWordLib.WordNs.WdTofFormat
  
  @js.native
  sealed trait wdTOFSimple
    extends activexDashWordLib.WordNs.WdTofFormat
  
  @js.native
  sealed trait wdTOFTemplate
    extends activexDashWordLib.WordNs.WdTofFormat
  
  /* 3 */ val wdTOFCentered: wdTOFCentered with scala.Double = js.native
  /* 1 */ val wdTOFClassic: wdTOFClassic with scala.Double = js.native
  /* 2 */ val wdTOFDistinctive: wdTOFDistinctive with scala.Double = js.native
  /* 4 */ val wdTOFFormal: wdTOFFormal with scala.Double = js.native
  /* 5 */ val wdTOFSimple: wdTOFSimple with scala.Double = js.native
  /* 0 */ val wdTOFTemplate: wdTOFTemplate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTofFormat with scala.Double] = js.native
}

