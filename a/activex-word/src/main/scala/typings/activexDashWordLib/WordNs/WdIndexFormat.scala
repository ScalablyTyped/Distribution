package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdIndexFormat extends js.Object

@JSGlobal("Word.WdIndexFormat")
@js.native
object WdIndexFormat extends js.Object {
  @js.native
  sealed trait wdIndexBulleted
    extends activexDashWordLib.WordNs.WdIndexFormat
  
  @js.native
  sealed trait wdIndexClassic
    extends activexDashWordLib.WordNs.WdIndexFormat
  
  @js.native
  sealed trait wdIndexFancy
    extends activexDashWordLib.WordNs.WdIndexFormat
  
  @js.native
  sealed trait wdIndexFormal
    extends activexDashWordLib.WordNs.WdIndexFormat
  
  @js.native
  sealed trait wdIndexModern
    extends activexDashWordLib.WordNs.WdIndexFormat
  
  @js.native
  sealed trait wdIndexSimple
    extends activexDashWordLib.WordNs.WdIndexFormat
  
  @js.native
  sealed trait wdIndexTemplate
    extends activexDashWordLib.WordNs.WdIndexFormat
  
  /* 4 */ val wdIndexBulleted: wdIndexBulleted with scala.Double = js.native
  /* 1 */ val wdIndexClassic: wdIndexClassic with scala.Double = js.native
  /* 2 */ val wdIndexFancy: wdIndexFancy with scala.Double = js.native
  /* 5 */ val wdIndexFormal: wdIndexFormal with scala.Double = js.native
  /* 3 */ val wdIndexModern: wdIndexModern with scala.Double = js.native
  /* 6 */ val wdIndexSimple: wdIndexSimple with scala.Double = js.native
  /* 0 */ val wdIndexTemplate: wdIndexTemplate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdIndexFormat with scala.Double] = js.native
}

