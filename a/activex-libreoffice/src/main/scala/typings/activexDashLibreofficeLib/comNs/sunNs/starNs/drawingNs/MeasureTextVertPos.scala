package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MeasureTextVertPos extends js.Object

/** This enumeration defines the relative vertical placement of the text inside a measure shape. */
@JSGlobal("com.sun.star.drawing.MeasureTextVertPos")
@js.native
object MeasureTextVertPos extends js.Object {
  /**
    * the connection point is chosen automatically,
    *
    * Set this to have the application select the best horizontal position for the text.
    */
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextVertPos
  
  @js.native
  sealed trait BREAKEDLINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextVertPos
  
  /**
    * The text is positioned at the center.
    *
    * The text is positioned over the main line.
    */
  @js.native
  sealed trait CENTERED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextVertPos
  
  @js.native
  sealed trait EAST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextVertPos
  
  @js.native
  sealed trait WEST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextVertPos
  
  /* 0 */ val AUTO: AUTO with scala.Double = js.native
  /* 2 */ val BREAKEDLINE: BREAKEDLINE with scala.Double = js.native
  /* 4 */ val CENTERED: CENTERED with scala.Double = js.native
  /* 1 */ val EAST: EAST with scala.Double = js.native
  /* 3 */ val WEST: WEST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureTextVertPos with scala.Double
  ] = js.native
}

