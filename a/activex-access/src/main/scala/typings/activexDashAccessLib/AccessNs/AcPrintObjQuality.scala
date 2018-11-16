package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcPrintObjQuality extends js.Object

@JSGlobal("Access.AcPrintObjQuality")
@js.native
object AcPrintObjQuality extends js.Object {
  @js.native
  sealed trait acPRPQDraft
    extends activexDashAccessLib.AccessNs.AcPrintObjQuality
  
  @js.native
  sealed trait acPRPQHigh
    extends activexDashAccessLib.AccessNs.AcPrintObjQuality
  
  @js.native
  sealed trait acPRPQLow
    extends activexDashAccessLib.AccessNs.AcPrintObjQuality
  
  @js.native
  sealed trait acPRPQMedium
    extends activexDashAccessLib.AccessNs.AcPrintObjQuality
  
  /* -1 */ val acPRPQDraft: acPRPQDraft with scala.Double = js.native
  /* -4 */ val acPRPQHigh: acPRPQHigh with scala.Double = js.native
  /* -2 */ val acPRPQLow: acPRPQLow with scala.Double = js.native
  /* -3 */ val acPRPQMedium: acPRPQMedium with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcPrintObjQuality with scala.Double] = js.native
}

