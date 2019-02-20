package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MeasureTextHorzPos extends js.Object

/** This enumeration defines the relative horizontal placement of the text inside a measure shape. */
@JSGlobal("com.sun.star.drawing.MeasureTextHorzPos")
@js.native
object MeasureTextHorzPos extends js.Object {
  /**
    * the connection point is chosen automatically,
    *
    * Set this to have the application select the best horizontal position for the text.
    */
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextHorzPos
  
  @js.native
  sealed trait INSIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextHorzPos
  
  @js.native
  sealed trait LEFTOUTSIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextHorzPos
  
  @js.native
  sealed trait RIGHTOUTSIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextHorzPos
  
  /* 0 */ val AUTO: AUTO with scala.Double = js.native
  /* 2 */ val INSIDE: INSIDE with scala.Double = js.native
  /* 1 */ val LEFTOUTSIDE: LEFTOUTSIDE with scala.Double = js.native
  /* 3 */ val RIGHTOUTSIDE: RIGHTOUTSIDE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextHorzPos with scala.Double
  ] = js.native
}

