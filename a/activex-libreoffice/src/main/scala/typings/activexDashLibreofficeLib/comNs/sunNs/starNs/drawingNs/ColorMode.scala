package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorMode extends js.Object

/** The ColorMode defines the output style of colors for a graphic. */
@JSGlobal("com.sun.star.drawing.ColorMode")
@js.native
object ColorMode extends js.Object {
  /** the graphic is rendered in grayscale on the output device, */
  @js.native
  sealed trait GREYS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ColorMode
  
  /** the graphic is rendered in black and white only, */
  @js.native
  sealed trait MONO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ColorMode
  
  /**
    * the graphic is rendered in the default color style of the output device,
    *
    * the connector is drawn with three lines, with the middle line perpendicular to the other two
    *
    * use the length measurement.
    */
  @js.native
  sealed trait STANDARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ColorMode
  
  /** the graphic is rendered in a watermark like style, */
  @js.native
  sealed trait WATERMARK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ColorMode
  
  /* 1 */ val GREYS: GREYS with scala.Double = js.native
  /* 2 */ val MONO: MONO with scala.Double = js.native
  /* 0 */ val STANDARD: STANDARD with scala.Double = js.native
  /* 3 */ val WATERMARK: WATERMARK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ColorMode with scala.Double
  ] = js.native
}

