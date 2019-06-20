package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ConnectorType specifies the appearance of a connector. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait ConnectorType extends js.Object

object ConnectorType {
  /** the {@link ConnectorShape} is drawn as a curve */
  @scala.inline
  def CURVE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * the {@link ConnectorShape} is drawn as a straight line
    *
    * This is the PolygonKind for a {@link LineShape} .
    */
  @scala.inline
  def LINE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** the connector is drawn with three lines */
  @scala.inline
  def LINES: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * the graphic is rendered in the default color style of the output device,
    *
    * the connector is drawn with three lines, with the middle line perpendicular to the other two
    *
    * use the length measurement.
    */
  @scala.inline
  def STANDARD: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

