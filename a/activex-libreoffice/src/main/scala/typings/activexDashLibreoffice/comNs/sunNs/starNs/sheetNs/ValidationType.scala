package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify which cell contents are treated as valid. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait ValidationType extends js.Object

object ValidationType {
  /** any cell content is valid; no conditions are used. */
  @scala.inline
  def ANY: `0` = this.cast(0)
  /** The specified formula determines which contents are valid. */
  @scala.inline
  def CUSTOM: `7` = this.cast(7)
  /**
    * specifies an arithmetic series for date values. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by a specified number of days</p>
    * @@see com::sun::star::sheet::FillDateMode  any date value matching the specified condition is valid.
    */
  @scala.inline
  def DATE: `3` = this.cast(3)
  /** any number matching the specified condition is valid. */
  @scala.inline
  def DECIMAL: `2` = this.cast(2)
  /** Only strings from a specified list are valid. */
  @scala.inline
  def LIST: `6` = this.cast(6)
  /** string is valid if its length matches the specified condition. */
  @scala.inline
  def TEXT_LEN: `5` = this.cast(5)
  /** any time value matching the specified condition is valid. */
  @scala.inline
  def TIME: `4` = this.cast(4)
  /** any whole number matching the specified condition is valid. */
  @scala.inline
  def WHOLE: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

