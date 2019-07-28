package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumeration specifies the type of a drawing layer. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
*/
trait LayerType extends js.Object

object LayerType {
  /** This is the layer for the controls. */
  @scala.inline
  def CONTROLSA: `1` = this.cast(1)
  /** This is the layer for all measure shapes. */
  @scala.inline
  def DIMENSIONIANG_LINES: `2` = this.cast(2)
  /** This is the layer for all standard shapes. */
  @scala.inline
  def LAYOUT: `0` = this.cast(0)
  /** There can be zero or more layers of this type. */
  @scala.inline
  def USER_DEFINED: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

