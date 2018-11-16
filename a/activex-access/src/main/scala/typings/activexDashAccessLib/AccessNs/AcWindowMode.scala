package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcWindowMode extends js.Object

@JSGlobal("Access.AcWindowMode")
@js.native
object AcWindowMode extends js.Object {
  @js.native
  sealed trait acDialog
    extends activexDashAccessLib.AccessNs.AcWindowMode
  
  @js.native
  sealed trait acHidden
    extends activexDashAccessLib.AccessNs.AcWindowMode
  
  @js.native
  sealed trait acIcon
    extends activexDashAccessLib.AccessNs.AcWindowMode
  
  @js.native
  sealed trait acWindowNormal
    extends activexDashAccessLib.AccessNs.AcWindowMode
  
  /* 3 */ val acDialog: acDialog with scala.Double = js.native
  /* 1 */ val acHidden: acHidden with scala.Double = js.native
  /* 2 */ val acIcon: acIcon with scala.Double = js.native
  /* 0 */ val acWindowNormal: acWindowNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcWindowMode with scala.Double] = js.native
}

