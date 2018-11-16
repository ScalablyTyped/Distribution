package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcPrintItemLayout extends js.Object

@JSGlobal("Access.AcPrintItemLayout")
@js.native
object AcPrintItemLayout extends js.Object {
  @js.native
  sealed trait acPRHorizontalColumnLayout
    extends activexDashAccessLib.AccessNs.AcPrintItemLayout
  
  @js.native
  sealed trait acPRVerticalColumnLayout
    extends activexDashAccessLib.AccessNs.AcPrintItemLayout
  
  /* 1953 */ val acPRHorizontalColumnLayout: acPRHorizontalColumnLayout with scala.Double = js.native
  /* 1954 */ val acPRVerticalColumnLayout: acPRVerticalColumnLayout with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcPrintItemLayout with scala.Double] = js.native
}

