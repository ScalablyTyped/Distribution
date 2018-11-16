package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcPrintDuplex extends js.Object

@JSGlobal("Access.AcPrintDuplex")
@js.native
object AcPrintDuplex extends js.Object {
  @js.native
  sealed trait acPRDPHorizontal
    extends activexDashAccessLib.AccessNs.AcPrintDuplex
  
  @js.native
  sealed trait acPRDPSimplex
    extends activexDashAccessLib.AccessNs.AcPrintDuplex
  
  @js.native
  sealed trait acPRDPVertical
    extends activexDashAccessLib.AccessNs.AcPrintDuplex
  
  /* 2 */ val acPRDPHorizontal: acPRDPHorizontal with scala.Double = js.native
  /* 1 */ val acPRDPSimplex: acPRDPSimplex with scala.Double = js.native
  /* 3 */ val acPRDPVertical: acPRDPVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcPrintDuplex with scala.Double] = js.native
}

