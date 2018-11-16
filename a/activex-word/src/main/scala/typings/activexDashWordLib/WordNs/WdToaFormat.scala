package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdToaFormat extends js.Object

@JSGlobal("Word.WdToaFormat")
@js.native
object WdToaFormat extends js.Object {
  @js.native
  sealed trait wdTOAClassic
    extends activexDashWordLib.WordNs.WdToaFormat
  
  @js.native
  sealed trait wdTOADistinctive
    extends activexDashWordLib.WordNs.WdToaFormat
  
  @js.native
  sealed trait wdTOAFormal
    extends activexDashWordLib.WordNs.WdToaFormat
  
  @js.native
  sealed trait wdTOASimple
    extends activexDashWordLib.WordNs.WdToaFormat
  
  @js.native
  sealed trait wdTOATemplate
    extends activexDashWordLib.WordNs.WdToaFormat
  
  /* 1 */ val wdTOAClassic: wdTOAClassic with scala.Double = js.native
  /* 2 */ val wdTOADistinctive: wdTOADistinctive with scala.Double = js.native
  /* 3 */ val wdTOAFormal: wdTOAFormal with scala.Double = js.native
  /* 4 */ val wdTOASimple: wdTOASimple with scala.Double = js.native
  /* 0 */ val wdTOATemplate: wdTOATemplate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdToaFormat with scala.Double] = js.native
}

