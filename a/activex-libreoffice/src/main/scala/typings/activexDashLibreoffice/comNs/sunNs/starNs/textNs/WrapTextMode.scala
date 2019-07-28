package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enumeration values specify the text wrap around objects in a text. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait WrapTextMode extends js.Object

object WrapTextMode {
  /** text flow depends on the situation. The text formatting decides the best way. */
  @scala.inline
  def DYNAMIC: `3` = this.cast(3)
  /**
    * the object is left adjusted.
    *
    * adjusted to the left.
    *
    * text flows to the left side of the object.
    */
  @scala.inline
  def LEFT: `4` = this.cast(4)
  /** text does not flow around the object. */
  @scala.inline
  def NONE: `0` = this.cast(0)
  /** text flows to the left and right of the object. */
  @scala.inline
  def PARALLEL: `2` = this.cast(2)
  /**
    * the object is right adjusted.
    *
    * adjusted to the right.
    *
    * text flows to the right side of the object.
    */
  @scala.inline
  def RIGHT: `5` = this.cast(5)
  /** text flow ignores the object. */
  @scala.inline
  def THROUGHT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

