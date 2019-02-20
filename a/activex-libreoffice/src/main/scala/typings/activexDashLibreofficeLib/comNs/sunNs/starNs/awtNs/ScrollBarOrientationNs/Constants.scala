package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ScrollBarOrientationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.ScrollBarOrientation.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait HORIZONTAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ScrollBarOrientationNs.Constants
  
  @js.native
  sealed trait VERTICAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ScrollBarOrientationNs.Constants
  
  /* 0 */ val HORIZONTAL: HORIZONTAL with scala.Double = js.native
  /* 1 */ val VERTICAL: VERTICAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.ScrollBarOrientationNs.Constants with scala.Double
  ] = js.native
}

