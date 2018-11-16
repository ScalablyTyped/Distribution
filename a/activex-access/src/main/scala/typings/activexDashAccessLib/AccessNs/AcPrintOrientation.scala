package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcPrintOrientation extends js.Object

@JSGlobal("Access.AcPrintOrientation")
@js.native
object AcPrintOrientation extends js.Object {
  @js.native
  sealed trait acPRORLandscape
    extends activexDashAccessLib.AccessNs.AcPrintOrientation
  
  @js.native
  sealed trait acPRORPortrait
    extends activexDashAccessLib.AccessNs.AcPrintOrientation
  
  /* 2 */ val acPRORLandscape: acPRORLandscape with scala.Double = js.native
  /* 1 */ val acPRORPortrait: acPRORPortrait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcPrintOrientation with scala.Double] = js.native
}

