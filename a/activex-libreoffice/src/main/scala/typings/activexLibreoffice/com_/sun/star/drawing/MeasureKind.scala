package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * determines whether a measured shape is a standard measure or a radius measure.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait MeasureKind extends js.Object

object MeasureKind {
  /** use the radius measurement. This option cannot be used from the GUI Interface. */
  @scala.inline
  def RADIUS: `1` = 1.asInstanceOf[`1`]
  /**
    * the graphic is rendered in the default color style of the output device,
    *
    * the connector is drawn with three lines, with the middle line perpendicular to the other two
    *
    * use the length measurement.
    */
  @scala.inline
  def STANDARD: `0` = 0.asInstanceOf[`0`]
}

