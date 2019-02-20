package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapMode extends js.Object

/** The BitmapMode selects an algorithm for filling an area with a bitmap. */
@JSGlobal("com.sun.star.drawing.BitmapMode")
@js.native
object BitmapMode extends js.Object {
  /** the bitmap is painted in its original or selected size. */
  @js.native
  sealed trait NO_REPEAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.BitmapMode
  
  /** the bitmap is repeated over the fill area. */
  @js.native
  sealed trait REPEAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.BitmapMode
  
  /**
    * the bitmap is stretched to fill the area.
    *
    * The text is stretched so that the longest line goes from the left to the right edge of the shape.
    */
  @js.native
  sealed trait STRETCH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.BitmapMode
  
  /* 2 */ val NO_REPEAT: NO_REPEAT with scala.Double = js.native
  /* 0 */ val REPEAT: REPEAT with scala.Double = js.native
  /* 1 */ val STRETCH: STRETCH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.BitmapMode with scala.Double
  ] = js.native
}

