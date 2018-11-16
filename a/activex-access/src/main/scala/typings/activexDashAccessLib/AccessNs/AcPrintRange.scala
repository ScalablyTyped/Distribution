package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcPrintRange extends js.Object

@JSGlobal("Access.AcPrintRange")
@js.native
object AcPrintRange extends js.Object {
  @js.native
  sealed trait acPages
    extends activexDashAccessLib.AccessNs.AcPrintRange
  
  @js.native
  sealed trait acPrintAll
    extends activexDashAccessLib.AccessNs.AcPrintRange
  
  @js.native
  sealed trait acSelection
    extends activexDashAccessLib.AccessNs.AcPrintRange
  
  /* 2 */ val acPages: acPages with scala.Double = js.native
  /* 0 */ val acPrintAll: acPrintAll with scala.Double = js.native
  /* 1 */ val acSelection: acSelection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcPrintRange with scala.Double] = js.native
}

