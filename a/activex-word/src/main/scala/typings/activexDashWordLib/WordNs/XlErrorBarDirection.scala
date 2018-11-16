package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarDirection extends js.Object

@JSGlobal("Word.XlErrorBarDirection")
@js.native
object XlErrorBarDirection extends js.Object {
  @js.native
  sealed trait xlChartX
    extends activexDashWordLib.WordNs.XlErrorBarDirection
  
  @js.native
  sealed trait xlChartY
    extends activexDashWordLib.WordNs.XlErrorBarDirection
  
  /* -4168 */ val xlChartX: xlChartX with scala.Double = js.native
  /* 1 */ val xlChartY: xlChartY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlErrorBarDirection with scala.Double] = js.native
}

