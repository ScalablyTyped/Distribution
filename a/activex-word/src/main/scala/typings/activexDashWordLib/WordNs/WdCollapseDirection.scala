package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCollapseDirection extends js.Object

@JSGlobal("Word.WdCollapseDirection")
@js.native
object WdCollapseDirection extends js.Object {
  @js.native
  sealed trait wdCollapseEnd
    extends activexDashWordLib.WordNs.WdCollapseDirection
  
  @js.native
  sealed trait wdCollapseStart
    extends activexDashWordLib.WordNs.WdCollapseDirection
  
  /* 0 */ val wdCollapseEnd: wdCollapseEnd with scala.Double = js.native
  /* 1 */ val wdCollapseStart: wdCollapseStart with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCollapseDirection with scala.Double] = js.native
}

