package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcPrintQuality extends js.Object

@JSGlobal("Access.AcPrintQuality")
@js.native
object AcPrintQuality extends js.Object {
  @js.native
  sealed trait acDraft
    extends activexDashAccessLib.AccessNs.AcPrintQuality
  
  @js.native
  sealed trait acHigh
    extends activexDashAccessLib.AccessNs.AcPrintQuality
  
  @js.native
  sealed trait acLow
    extends activexDashAccessLib.AccessNs.AcPrintQuality
  
  @js.native
  sealed trait acMedium
    extends activexDashAccessLib.AccessNs.AcPrintQuality
  
  /* 3 */ val acDraft: acDraft with scala.Double = js.native
  /* 0 */ val acHigh: acHigh with scala.Double = js.native
  /* 2 */ val acLow: acLow with scala.Double = js.native
  /* 1 */ val acMedium: acMedium with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcPrintQuality with scala.Double] = js.native
}

