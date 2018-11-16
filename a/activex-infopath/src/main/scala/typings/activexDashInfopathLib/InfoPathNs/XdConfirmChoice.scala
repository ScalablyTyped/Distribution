package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdConfirmChoice extends js.Object

@JSGlobal("InfoPath.XdConfirmChoice")
@js.native
object XdConfirmChoice extends js.Object {
  @js.native
  sealed trait xdCancel
    extends activexDashInfopathLib.InfoPathNs.XdConfirmChoice
  
  @js.native
  sealed trait xdNo
    extends activexDashInfopathLib.InfoPathNs.XdConfirmChoice
  
  @js.native
  sealed trait xdOK
    extends activexDashInfopathLib.InfoPathNs.XdConfirmChoice
  
  @js.native
  sealed trait xdYes
    extends activexDashInfopathLib.InfoPathNs.XdConfirmChoice
  
  /* 2 */ val xdCancel: xdCancel with scala.Double = js.native
  /* 7 */ val xdNo: xdNo with scala.Double = js.native
  /* 1 */ val xdOK: xdOK with scala.Double = js.native
  /* 6 */ val xdYes: xdYes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdConfirmChoice with scala.Double] = js.native
}

