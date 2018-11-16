package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdViewTypeOld extends js.Object

@JSGlobal("Word.WdViewTypeOld")
@js.native
object WdViewTypeOld extends js.Object {
  @js.native
  sealed trait wdOnlineView
    extends activexDashWordLib.WordNs.WdViewTypeOld
  
  @js.native
  sealed trait wdPageView
    extends activexDashWordLib.WordNs.WdViewTypeOld
  
  /* 6 */ val wdOnlineView: wdOnlineView with scala.Double = js.native
  /* 3 */ val wdPageView: wdPageView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdViewTypeOld with scala.Double] = js.native
}

