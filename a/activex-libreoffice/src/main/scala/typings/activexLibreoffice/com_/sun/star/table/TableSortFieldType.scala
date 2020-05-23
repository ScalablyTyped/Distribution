package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enumeration used to specify the type of contents in a sort field (row/column) of a table.
  * @since OOo 1.1.2
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait TableSortFieldType extends js.Object

object TableSortFieldType {
  /** sort field contains text data. */
  @scala.inline
  def ALPHANUMERIC: `2` = 2.asInstanceOf[`2`]
  /** type is determined automatically. */
  @scala.inline
  def AUTOMATIC: `0` = 0.asInstanceOf[`0`]
  /** sort field contains numerical data. */
  @scala.inline
  def NUMERIC: `1` = 1.asInstanceOf[`1`]
}

