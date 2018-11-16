package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTocFormat extends js.Object

@JSGlobal("Word.WdTocFormat")
@js.native
object WdTocFormat extends js.Object {
  @js.native
  sealed trait wdTOCClassic
    extends activexDashWordLib.WordNs.WdTocFormat
  
  @js.native
  sealed trait wdTOCDistinctive
    extends activexDashWordLib.WordNs.WdTocFormat
  
  @js.native
  sealed trait wdTOCFancy
    extends activexDashWordLib.WordNs.WdTocFormat
  
  @js.native
  sealed trait wdTOCFormal
    extends activexDashWordLib.WordNs.WdTocFormat
  
  @js.native
  sealed trait wdTOCModern
    extends activexDashWordLib.WordNs.WdTocFormat
  
  @js.native
  sealed trait wdTOCSimple
    extends activexDashWordLib.WordNs.WdTocFormat
  
  @js.native
  sealed trait wdTOCTemplate
    extends activexDashWordLib.WordNs.WdTocFormat
  
  /* 1 */ val wdTOCClassic: wdTOCClassic with scala.Double = js.native
  /* 2 */ val wdTOCDistinctive: wdTOCDistinctive with scala.Double = js.native
  /* 3 */ val wdTOCFancy: wdTOCFancy with scala.Double = js.native
  /* 5 */ val wdTOCFormal: wdTOCFormal with scala.Double = js.native
  /* 4 */ val wdTOCModern: wdTOCModern with scala.Double = js.native
  /* 6 */ val wdTOCSimple: wdTOCSimple with scala.Double = js.native
  /* 0 */ val wdTOCTemplate: wdTOCTemplate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTocFormat with scala.Double] = js.native
}

