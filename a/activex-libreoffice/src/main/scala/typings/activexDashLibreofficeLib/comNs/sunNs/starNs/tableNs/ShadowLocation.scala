package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShadowLocation extends js.Object

/** specifies the location of the shadow in a {@link ShadowFormat} . */
@JSGlobal("com.sun.star.table.ShadowLocation")
@js.native
object ShadowLocation extends js.Object {
  /** shadow is located along the lower and left sides. */
  @js.native
  sealed trait BOTTOM_LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowLocation
  
  /** shadow is located along the lower and right sides. */
  @js.native
  sealed trait BOTTOM_RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowLocation
  
  /** no shadow. */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowLocation
  
  /** shadow is located along the upper and left sides. */
  @js.native
  sealed trait TOP_LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowLocation
  
  /** shadow is located along the upper and right sides. */
  @js.native
  sealed trait TOP_RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowLocation
  
  /* 3 */ val BOTTOM_LEFT: BOTTOM_LEFT with scala.Double = js.native
  /* 4 */ val BOTTOM_RIGHT: BOTTOM_RIGHT with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val TOP_LEFT: TOP_LEFT with scala.Double = js.native
  /* 2 */ val TOP_RIGHT: TOP_RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowLocation with scala.Double
  ] = js.native
}

