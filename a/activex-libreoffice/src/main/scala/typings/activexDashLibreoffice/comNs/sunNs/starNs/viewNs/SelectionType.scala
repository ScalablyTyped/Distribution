package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a selection type for a view that supports a selection model. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait SelectionType extends js.Object

object SelectionType {
  /** The selection can contain zero or more objects. */
  @scala.inline
  def MULTI: `2` = this.cast(2)
  /**
    * No selection is possible.
    *
    * The selection is always empty.
    */
  @scala.inline
  def NONE: `0` = this.cast(0)
  /**
    * The selection can contain zero or more objects.
    *
    * all selected objects must be part of a continues range
    */
  @scala.inline
  def RANGE: `3` = this.cast(3)
  /** The selection can only contain one or zero objects. */
  @scala.inline
  def SINGLE: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

