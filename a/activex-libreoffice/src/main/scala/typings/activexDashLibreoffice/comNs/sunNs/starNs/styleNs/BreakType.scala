package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These enumeration values are used to specify if and how a page or column break is applied. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
*/
trait BreakType extends js.Object

object BreakType {
  /**
    * A column break is applied after the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the last
    *
    * in its column.</p>
    */
  @scala.inline
  def COLUMN_AFTER: `2` = this.cast(2)
  /**
    * A column break is applied before the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the
    *
    * first in its column.</p>
    */
  @scala.inline
  def COLUMN_BEFORE: `1` = this.cast(1)
  /**
    * A column break is applied before and after the object to which it belongs.
    *
    * <p>This implies that this object is the only one in its column.</p>
    */
  @scala.inline
  def COLUMN_BOTH: `3` = this.cast(3)
  /**
    * No column or page break is applied.
    *
    * This value specifies that a location is not yet assigned.
    */
  @scala.inline
  def NONE: `0` = this.cast(0)
  /**
    * A page break is applied after the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the last
    *
    * on its page.</p>
    */
  @scala.inline
  def PAGE_AFTER: `5` = this.cast(5)
  /**
    * A page break is applied before the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the
    *
    * first on its page.      </p>
    */
  @scala.inline
  def PAGE_BEFORE: `4` = this.cast(4)
  /**
    * A page break is applied before and after the object to which it belongs.
    *
    * <p>This implies that this object is the only one on its page.</p>
    */
  @scala.inline
  def PAGE_BOTH: `6` = this.cast(6)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

