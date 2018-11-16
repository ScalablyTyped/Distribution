package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdConfirmButtons extends js.Object

@JSGlobal("InfoPath.XdConfirmButtons")
@js.native
object XdConfirmButtons extends js.Object {
  @js.native
  sealed trait xdOKCancel
    extends activexDashInfopathLib.InfoPathNs.XdConfirmButtons
  
  @js.native
  sealed trait xdYesNo
    extends activexDashInfopathLib.InfoPathNs.XdConfirmButtons
  
  @js.native
  sealed trait xdYesNoCancel
    extends activexDashInfopathLib.InfoPathNs.XdConfirmButtons
  
  /* 1 */ val xdOKCancel: xdOKCancel with scala.Double = js.native
  /* 4 */ val xdYesNo: xdYesNo with scala.Double = js.native
  /* 3 */ val xdYesNoCancel: xdYesNoCancel with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdConfirmButtons with scala.Double] = js.native
}

