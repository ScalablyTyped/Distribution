package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GradientStyle extends js.Object

/** specify the style of color dispersion. */
@JSGlobal("com.sun.star.awt.GradientStyle")
@js.native
object GradientStyle extends js.Object {
  /** specifies an axial gradient. */
  @js.native
  sealed trait AXIAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.GradientStyle
  
  /** specifies an elliptical gradient. */
  @js.native
  sealed trait ELLIPTICAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.GradientStyle
  
  /** specifies a linear gradient. */
  @js.native
  sealed trait LINEAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.GradientStyle
  
  /** specifies a radial gradient. */
  @js.native
  sealed trait RADIAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.GradientStyle
  
  /** specifies a gradient in the shape of a rectangle. */
  @js.native
  sealed trait RECT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.GradientStyle
  
  /** specifies a gradient in the shape of a square. */
  @js.native
  sealed trait SQUARE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.GradientStyle
  
  /* 1 */ val AXIAL: AXIAL with scala.Double = js.native
  /* 3 */ val ELLIPTICAL: ELLIPTICAL with scala.Double = js.native
  /* 0 */ val LINEAR: LINEAR with scala.Double = js.native
  /* 2 */ val RADIAL: RADIAL with scala.Double = js.native
  /* 5 */ val RECT: RECT with scala.Double = js.native
  /* 4 */ val SQUARE: SQUARE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.GradientStyle with scala.Double
  ] = js.native
}

