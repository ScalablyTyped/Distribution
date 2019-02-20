package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShadeMode extends js.Object

/** The ShadeMode determines the quality of displaying the object. */
@JSGlobal("com.sun.star.drawing.ShadeMode")
@js.native
object ShadeMode extends js.Object {
  /** DRAFT is a special mode which uses a BSP tree and triangle subdivision for displaying. */
  @js.native
  sealed trait DRAFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ShadeMode
  
  /**
    * forces one normal per flat part.
    *
    * With FLAT shading, the faces of the object are rendered in a solid color.
    */
  @js.native
  sealed trait FLAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ShadeMode
  
  /** With PHONG shading, the normal itself is interpolated to get more realistic colors and light reflections. */
  @js.native
  sealed trait PHONG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ShadeMode
  
  /**
    * the point is smooth, the first derivation from the curve discussion view.
    *
    * With SMOOTH shading, the colors of the lit vertices is interpolated.
    */
  @js.native
  sealed trait SMOOTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ShadeMode
  
  /* 3 */ val DRAFT: DRAFT with scala.Double = js.native
  /* 0 */ val FLAT: FLAT with scala.Double = js.native
  /* 1 */ val PHONG: PHONG with scala.Double = js.native
  /* 2 */ val SMOOTH: SMOOTH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ShadeMode with scala.Double
  ] = js.native
}

