package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseWheelBehaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.MouseWheelBehavior.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait SCROLL_ALWAYS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseWheelBehaviorNs.Constants
  
  @js.native
  sealed trait SCROLL_DISABLED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseWheelBehaviorNs.Constants
  
  @js.native
  sealed trait SCROLL_FOCUS_ONLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseWheelBehaviorNs.Constants
  
  /* 2 */ val SCROLL_ALWAYS: SCROLL_ALWAYS with scala.Double = js.native
  /* 0 */ val SCROLL_DISABLED: SCROLL_DISABLED with scala.Double = js.native
  /* 1 */ val SCROLL_FOCUS_ONLY: SCROLL_FOCUS_ONLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseWheelBehaviorNs.Constants with scala.Double
  ] = js.native
}

