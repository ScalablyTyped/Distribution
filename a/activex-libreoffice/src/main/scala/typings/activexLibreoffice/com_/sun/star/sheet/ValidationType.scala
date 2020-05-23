package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify which cell contents are treated as valid. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait ValidationType extends js.Object

object ValidationType {
  /** any cell content is valid; no conditions are used. */
  @scala.inline
  def ANY: `0` = 0.asInstanceOf[`0`]
  /** The specified formula determines which contents are valid. */
  @scala.inline
  def CUSTOM: `7` = 7.asInstanceOf[`7`]
  /**
    * specifies an arithmetic series for date values. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by a specified number of days</p>
    * @@see com::sun::star::sheet::FillDateMode  any date value matching the specified condition is valid.
    */
  @scala.inline
  def DATE: `3` = 3.asInstanceOf[`3`]
  /** any number matching the specified condition is valid. */
  @scala.inline
  def DECIMAL: `2` = 2.asInstanceOf[`2`]
  /** Only strings from a specified list are valid. */
  @scala.inline
  def LIST: `6` = 6.asInstanceOf[`6`]
  /** string is valid if its length matches the specified condition. */
  @scala.inline
  def TEXT_LEN: `5` = 5.asInstanceOf[`5`]
  /** any time value matching the specified condition is valid. */
  @scala.inline
  def TIME: `4` = 4.asInstanceOf[`4`]
  /** any whole number matching the specified condition is valid. */
  @scala.inline
  def WHOLE: `1` = 1.asInstanceOf[`1`]
}

