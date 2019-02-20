package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SnapObjectType extends js.Object

/** @deprecated Deprecated */
@JSGlobal("com.sun.star.drawing.SnapObjectType")
@js.native
object SnapObjectType extends js.Object {
  /** mirror to the horizontal axis */
  @js.native
  sealed trait HORIZONTAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.SnapObjectType
  
  @js.native
  sealed trait POINT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.SnapObjectType
  
  /** mirror to the vertical axis */
  @js.native
  sealed trait VERTICAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.SnapObjectType
  
  /* 2 */ val HORIZONTAL: HORIZONTAL with scala.Double = js.native
  /* 0 */ val POINT: POINT with scala.Double = js.native
  /* 1 */ val VERTICAL: VERTICAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.SnapObjectType with scala.Double
  ] = js.native
}

