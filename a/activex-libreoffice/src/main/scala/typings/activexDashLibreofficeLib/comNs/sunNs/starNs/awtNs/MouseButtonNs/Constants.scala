package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.MouseButton.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseButtonNs.Constants
  
  @js.native
  sealed trait MIDDLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseButtonNs.Constants
  
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseButtonNs.Constants
  
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  /* 4 */ val MIDDLE: MIDDLE with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseButtonNs.Constants with scala.Double
  ] = js.native
}

