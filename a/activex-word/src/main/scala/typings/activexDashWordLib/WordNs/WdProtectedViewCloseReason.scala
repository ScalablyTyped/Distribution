package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdProtectedViewCloseReason extends js.Object

@JSGlobal("Word.WdProtectedViewCloseReason")
@js.native
object WdProtectedViewCloseReason extends js.Object {
  @js.native
  sealed trait wdProtectedViewCloseEdit
    extends activexDashWordLib.WordNs.WdProtectedViewCloseReason
  
  @js.native
  sealed trait wdProtectedViewCloseForced
    extends activexDashWordLib.WordNs.WdProtectedViewCloseReason
  
  @js.native
  sealed trait wdProtectedViewCloseNormal
    extends activexDashWordLib.WordNs.WdProtectedViewCloseReason
  
  /* 1 */ val wdProtectedViewCloseEdit: wdProtectedViewCloseEdit with scala.Double = js.native
  /* 2 */ val wdProtectedViewCloseForced: wdProtectedViewCloseForced with scala.Double = js.native
  /* 0 */ val wdProtectedViewCloseNormal: wdProtectedViewCloseNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdProtectedViewCloseReason with scala.Double] = js.native
}

