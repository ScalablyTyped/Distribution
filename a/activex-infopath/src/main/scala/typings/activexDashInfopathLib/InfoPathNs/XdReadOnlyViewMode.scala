package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdReadOnlyViewMode extends js.Object

@JSGlobal("InfoPath.XdReadOnlyViewMode")
@js.native
object XdReadOnlyViewMode extends js.Object {
  @js.native
  sealed trait xdDefault
    extends activexDashInfopathLib.InfoPathNs.XdReadOnlyViewMode
  
  @js.native
  sealed trait xdFrozen
    extends activexDashInfopathLib.InfoPathNs.XdReadOnlyViewMode
  
  @js.native
  sealed trait xdNonEditable
    extends activexDashInfopathLib.InfoPathNs.XdReadOnlyViewMode
  
  /* 0 */ val xdDefault: xdDefault with scala.Double = js.native
  /* 2 */ val xdFrozen: xdFrozen with scala.Double = js.native
  /* 1 */ val xdNonEditable: xdNonEditable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdReadOnlyViewMode with scala.Double] = js.native
}

