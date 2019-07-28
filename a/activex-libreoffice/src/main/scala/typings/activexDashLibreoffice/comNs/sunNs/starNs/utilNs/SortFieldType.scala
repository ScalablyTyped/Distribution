package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enumeration used to specify the type of contents in a sort field.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait SortFieldType extends js.Object

object SortFieldType {
  /** sort field contains text data. */
  @scala.inline
  def ALPHANUMERIC: `2` = this.cast(2)
  /** type is determined automatically. */
  @scala.inline
  def AUTOMATIC: `0` = this.cast(0)
  /** sort field contains numerical data. */
  @scala.inline
  def NUMERIC: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

