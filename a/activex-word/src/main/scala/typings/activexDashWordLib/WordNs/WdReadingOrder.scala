package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdReadingOrder extends js.Object

@JSGlobal("Word.WdReadingOrder")
@js.native
object WdReadingOrder extends js.Object {
  @js.native
  sealed trait wdReadingOrderLtr
    extends activexDashWordLib.WordNs.WdReadingOrder
  
  @js.native
  sealed trait wdReadingOrderRtl
    extends activexDashWordLib.WordNs.WdReadingOrder
  
  /* 1 */ val wdReadingOrderLtr: wdReadingOrderLtr with scala.Double = js.native
  /* 0 */ val wdReadingOrderRtl: wdReadingOrderRtl with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdReadingOrder with scala.Double] = js.native
}

