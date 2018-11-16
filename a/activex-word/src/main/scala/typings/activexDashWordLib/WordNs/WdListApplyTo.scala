package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdListApplyTo extends js.Object

@JSGlobal("Word.WdListApplyTo")
@js.native
object WdListApplyTo extends js.Object {
  @js.native
  sealed trait wdListApplyToSelection
    extends activexDashWordLib.WordNs.WdListApplyTo
  
  @js.native
  sealed trait wdListApplyToThisPointForward
    extends activexDashWordLib.WordNs.WdListApplyTo
  
  @js.native
  sealed trait wdListApplyToWholeList
    extends activexDashWordLib.WordNs.WdListApplyTo
  
  /* 2 */ val wdListApplyToSelection: wdListApplyToSelection with scala.Double = js.native
  /* 1 */ val wdListApplyToThisPointForward: wdListApplyToThisPointForward with scala.Double = js.native
  /* 0 */ val wdListApplyToWholeList: wdListApplyToWholeList with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdListApplyTo with scala.Double] = js.native
}

