package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMailMergeMailFormat extends js.Object

@JSGlobal("Word.WdMailMergeMailFormat")
@js.native
object WdMailMergeMailFormat extends js.Object {
  @js.native
  sealed trait wdMailFormatHTML
    extends activexDashWordLib.WordNs.WdMailMergeMailFormat
  
  @js.native
  sealed trait wdMailFormatPlainText
    extends activexDashWordLib.WordNs.WdMailMergeMailFormat
  
  /* 1 */ val wdMailFormatHTML: wdMailFormatHTML with scala.Double = js.native
  /* 0 */ val wdMailFormatPlainText: wdMailFormatPlainText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMailMergeMailFormat with scala.Double] = js.native
}

