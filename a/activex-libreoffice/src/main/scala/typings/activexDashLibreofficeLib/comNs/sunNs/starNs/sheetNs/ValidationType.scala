package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify which cell contents are treated as valid. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait ValidationType extends js.Object

object ValidationType {
  /** any cell content is valid; no conditions are used. */
  @scala.inline
  def ANY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** The specified formula determines which contents are valid. */
  @scala.inline
  def CUSTOM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /**
    * specifies an arithmetic series for date values. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by a specified number of days</p>
    * @@see com::sun::star::sheet::FillDateMode  any date value matching the specified condition is valid.
    */
  @scala.inline
  def DATE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** any number matching the specified condition is valid. */
  @scala.inline
  def DECIMAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** Only strings from a specified list are valid. */
  @scala.inline
  def LIST: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /** string is valid if its length matches the specified condition. */
  @scala.inline
  def TEXT_LEN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** any time value matching the specified condition is valid. */
  @scala.inline
  def TIME: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** any whole number matching the specified condition is valid. */
  @scala.inline
  def WHOLE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

