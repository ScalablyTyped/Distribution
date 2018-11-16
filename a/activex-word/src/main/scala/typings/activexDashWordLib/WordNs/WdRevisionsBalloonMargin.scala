package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRevisionsBalloonMargin extends js.Object

@JSGlobal("Word.WdRevisionsBalloonMargin")
@js.native
object WdRevisionsBalloonMargin extends js.Object {
  @js.native
  sealed trait wdLeftMargin
    extends activexDashWordLib.WordNs.WdRevisionsBalloonMargin
  
  @js.native
  sealed trait wdRightMargin
    extends activexDashWordLib.WordNs.WdRevisionsBalloonMargin
  
  /* 0 */ val wdLeftMargin: wdLeftMargin with scala.Double = js.native
  /* 1 */ val wdRightMargin: wdRightMargin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRevisionsBalloonMargin with scala.Double] = js.native
}

