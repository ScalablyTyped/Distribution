package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the kind of data source used to fill the list data of a listbox or a combobox control.
  * @see com.sun.star.form.component.ListBox
  * @see com.sun.star.form.component.ComboBox
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait ListSourceType extends js.Object

object ListSourceType {
  /** The control should be filled with the results of a database query. */
  @scala.inline
  def QUERY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** The control should be filled with the results of a database statement. */
  @scala.inline
  def SQL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** The control should be filled with the results of a database statement, which is not evaluated by the database engine. */
  @scala.inline
  def SQLPASSTHROUGH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** The control should be filled with the data of a table. */
  @scala.inline
  def TABLE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** The control should be filled with the field names of a database table. */
  @scala.inline
  def TABLEFIELDS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** The control should be filled with a list of string values. */
  @scala.inline
  def VALUELIST: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

