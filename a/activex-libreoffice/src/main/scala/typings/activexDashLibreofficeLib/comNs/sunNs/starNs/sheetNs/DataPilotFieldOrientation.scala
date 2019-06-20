package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify where a field in a data pilot table is laid out. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait DataPilotFieldOrientation extends js.Object

object DataPilotFieldOrientation {
  /**
    * the field is used as a column field.
    *
    * is applied to the columns. <p>In this mode, the column contains values and the row
    *
    * contains formulas.</p>
    */
  @scala.inline
  def COLUMN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** the field is used as a data field. */
  @scala.inline
  def DATA: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** the field is not used in the table. */
  @scala.inline
  def HIDDEN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** the field is used as a page field. */
  @scala.inline
  def PAGE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * the field is used as a row field.
    *
    * is applied to the rows. <p>In this mode, the row contains values and the column
    *
    * contains formulas.</p>
    */
  @scala.inline
  def ROW: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

