package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMailMergeDefaultRecord extends js.Object

@JSGlobal("Word.WdMailMergeDefaultRecord")
@js.native
object WdMailMergeDefaultRecord extends js.Object {
  @js.native
  sealed trait wdDefaultFirstRecord
    extends activexDashWordLib.WordNs.WdMailMergeDefaultRecord
  
  @js.native
  sealed trait wdDefaultLastRecord
    extends activexDashWordLib.WordNs.WdMailMergeDefaultRecord
  
  /* 1 */ val wdDefaultFirstRecord: wdDefaultFirstRecord with scala.Double = js.native
  /* -16 */ val wdDefaultLastRecord: wdDefaultLastRecord with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMailMergeDefaultRecord with scala.Double] = js.native
}

