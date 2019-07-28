package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the type of datasource used for a form.
  *
  * Please do **not** use anymore, this enum is deprecated.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait DataSelectionType extends js.Object

object DataSelectionType {
  /** The control should be filled with the results of a database query. */
  @scala.inline
  def QUERY: `1` = this.cast(1)
  /** The control should be filled with the results of a database statement. */
  @scala.inline
  def SQL: `2` = this.cast(2)
  /** The control should be filled with the results of a database statement, which is not evaluated by the database engine. */
  @scala.inline
  def SQLPASSTHROUGH: `3` = this.cast(3)
  /** The control should be filled with the data of a table. */
  @scala.inline
  def TABLE: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

