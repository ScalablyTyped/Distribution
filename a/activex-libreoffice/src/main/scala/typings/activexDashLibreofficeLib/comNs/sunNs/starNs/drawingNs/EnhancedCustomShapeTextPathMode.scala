package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnhancedCustomShapeTextPathMode extends js.Object

@JSGlobal("com.sun.star.drawing.EnhancedCustomShapeTextPathMode")
@js.native
object EnhancedCustomShapeTextPathMode extends js.Object {
  /**
    * the text is drawn along the path without scaling.
    *
    * the point is normal, from the curve discussion view.
    */
  @js.native
  sealed trait NORMAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeTextPathMode
  
  /** the text is fit to the path. */
  @js.native
  sealed trait PATH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeTextPathMode
  
  /** the text is fit to the bounding box of the shape. */
  @js.native
  sealed trait SHAPE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeTextPathMode
  
  /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
  /* 1 */ val PATH: PATH with scala.Double = js.native
  /* 2 */ val SHAPE: SHAPE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EnhancedCustomShapeTextPathMode with scala.Double
  ] = js.native
}

