package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.TextAlignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.TextAlign.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.TextAlignNs.Constants
  
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.TextAlignNs.Constants
  
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.TextAlignNs.Constants
  
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.TextAlignNs.Constants with scala.Double
  ] = js.native
}

