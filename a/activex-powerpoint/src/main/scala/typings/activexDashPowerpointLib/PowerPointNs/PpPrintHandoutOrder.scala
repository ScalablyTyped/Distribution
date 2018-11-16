package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpPrintHandoutOrder extends js.Object

@JSGlobal("PowerPoint.PpPrintHandoutOrder")
@js.native
object PpPrintHandoutOrder extends js.Object {
  @js.native
  sealed trait ppPrintHandoutHorizontalFirst
    extends activexDashPowerpointLib.PowerPointNs.PpPrintHandoutOrder
  
  @js.native
  sealed trait ppPrintHandoutVerticalFirst
    extends activexDashPowerpointLib.PowerPointNs.PpPrintHandoutOrder
  
  /* 2 */ val ppPrintHandoutHorizontalFirst: ppPrintHandoutHorizontalFirst with scala.Double = js.native
  /* 1 */ val ppPrintHandoutVerticalFirst: ppPrintHandoutVerticalFirst with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpPrintHandoutOrder with scala.Double] = js.native
}

