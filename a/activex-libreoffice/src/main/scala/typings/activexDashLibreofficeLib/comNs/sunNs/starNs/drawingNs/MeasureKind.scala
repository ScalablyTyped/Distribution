package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MeasureKind extends js.Object

/**
  * determines whether a measured shape is a standard measure or a radius measure.
  * @deprecated Deprecated
  */
@JSGlobal("com.sun.star.drawing.MeasureKind")
@js.native
object MeasureKind extends js.Object {
  /** use the radius measurement. This option cannot be used from the GUI Interface. */
  @js.native
  sealed trait RADIUS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureKind
  
  /**
    * the graphic is rendered in the default color style of the output device,
    *
    * the connector is drawn with three lines, with the middle line perpendicular to the other two
    *
    * use the length measurement.
    */
  @js.native
  sealed trait STANDARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureKind
  
  /* 1 */ val RADIUS: RADIUS with scala.Double = js.native
  /* 0 */ val STANDARD: STANDARD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MeasureKind with scala.Double
  ] = js.native
}

