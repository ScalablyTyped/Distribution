package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the states of a property value in the process of obtaining the value (asynchronously).
  * @see PropertyValueInfo
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait PropertyValueState extends js.Object

object PropertyValueState {
  /** The given property name/handle is invalid. */
  @scala.inline
  def INVALID_NAME: `2` = this.cast(2)
  /** The given property type is invalid. */
  @scala.inline
  def INVALID_TYPE: `3` = this.cast(3)
  /** The value was obtained. <p>The value is stored in PropertyValueInfo::Value. */
  @scala.inline
  def PROCESSED: `1` = this.cast(1)
  /** The property value was not obtained yet. */
  @scala.inline
  def UNPROCESSED: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

