package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMailMergeComparison extends js.Object

@JSGlobal("Word.WdMailMergeComparison")
@js.native
object WdMailMergeComparison extends js.Object {
  @js.native
  sealed trait wdMergeIfEqual
    extends activexDashWordLib.WordNs.WdMailMergeComparison
  
  @js.native
  sealed trait wdMergeIfGreaterThan
    extends activexDashWordLib.WordNs.WdMailMergeComparison
  
  @js.native
  sealed trait wdMergeIfGreaterThanOrEqual
    extends activexDashWordLib.WordNs.WdMailMergeComparison
  
  @js.native
  sealed trait wdMergeIfIsBlank
    extends activexDashWordLib.WordNs.WdMailMergeComparison
  
  @js.native
  sealed trait wdMergeIfIsNotBlank
    extends activexDashWordLib.WordNs.WdMailMergeComparison
  
  @js.native
  sealed trait wdMergeIfLessThan
    extends activexDashWordLib.WordNs.WdMailMergeComparison
  
  @js.native
  sealed trait wdMergeIfLessThanOrEqual
    extends activexDashWordLib.WordNs.WdMailMergeComparison
  
  @js.native
  sealed trait wdMergeIfNotEqual
    extends activexDashWordLib.WordNs.WdMailMergeComparison
  
  /* 0 */ val wdMergeIfEqual: wdMergeIfEqual with scala.Double = js.native
  /* 3 */ val wdMergeIfGreaterThan: wdMergeIfGreaterThan with scala.Double = js.native
  /* 5 */ val wdMergeIfGreaterThanOrEqual: wdMergeIfGreaterThanOrEqual with scala.Double = js.native
  /* 6 */ val wdMergeIfIsBlank: wdMergeIfIsBlank with scala.Double = js.native
  /* 7 */ val wdMergeIfIsNotBlank: wdMergeIfIsNotBlank with scala.Double = js.native
  /* 2 */ val wdMergeIfLessThan: wdMergeIfLessThan with scala.Double = js.native
  /* 4 */ val wdMergeIfLessThanOrEqual: wdMergeIfLessThanOrEqual with scala.Double = js.native
  /* 1 */ val wdMergeIfNotEqual: wdMergeIfNotEqual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMailMergeComparison with scala.Double] = js.native
}

