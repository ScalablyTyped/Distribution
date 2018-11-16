package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdWindowState extends js.Object

@JSGlobal("InfoPath.XdWindowState")
@js.native
object XdWindowState extends js.Object {
  @js.native
  sealed trait xdWindowStateMaximize
    extends activexDashInfopathLib.InfoPathNs.XdWindowState
  
  @js.native
  sealed trait xdWindowStateMinimize
    extends activexDashInfopathLib.InfoPathNs.XdWindowState
  
  @js.native
  sealed trait xdWindowStateNormal
    extends activexDashInfopathLib.InfoPathNs.XdWindowState
  
  /* 1 */ val xdWindowStateMaximize: xdWindowStateMaximize with scala.Double = js.native
  /* 3 */ val xdWindowStateMinimize: xdWindowStateMinimize with scala.Double = js.native
  /* 2 */ val xdWindowStateNormal: xdWindowStateNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdWindowState with scala.Double] = js.native
}

