package typings.activexDashLibreoffice.comNs.sunNs.starNs.registryNs

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

/**
  * represents all possible types of a key value.
  *
  * An ASCII value and a string value will both be handled with type string. But interns will be handled differently. Normally the idl string represents a
  * unicode string.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
*/
trait RegistryValueType extends js.Object

object RegistryValueType {
  /** the type of the key is ASCII. */
  @scala.inline
  def ASCII: `2` = this.cast(2)
  /** the type of the key is a ASCIILIST. */
  @scala.inline
  def ASCIILIST: `6` = this.cast(6)
  /** the type of the key is binary. */
  @scala.inline
  def BINARY: `4` = this.cast(4)
  /** the type of the key is long. */
  @scala.inline
  def LONG: `1` = this.cast(1)
  /** the type of the key is LONGLIST. */
  @scala.inline
  def LONGLIST: `5` = this.cast(5)
  /** the type of the key is not defined. */
  @scala.inline
  def NOT_DEFINED: `0` = this.cast(0)
  /** the type of the key is a string. */
  @scala.inline
  def STRING: `3` = this.cast(3)
  /** the type of the key is a STRINGLIST. */
  @scala.inline
  def STRINGLIST: `7` = this.cast(7)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

