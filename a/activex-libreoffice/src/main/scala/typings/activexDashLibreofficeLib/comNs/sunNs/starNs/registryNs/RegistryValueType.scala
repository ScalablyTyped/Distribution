package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs

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
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
*/
trait RegistryValueType extends js.Object

object RegistryValueType {
  /** the type of the key is ASCII. */
  @scala.inline
  def ASCII: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** the type of the key is a ASCIILIST. */
  @scala.inline
  def ASCIILIST: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /** the type of the key is binary. */
  @scala.inline
  def BINARY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** the type of the key is long. */
  @scala.inline
  def LONG: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** the type of the key is LONGLIST. */
  @scala.inline
  def LONGLIST: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** the type of the key is not defined. */
  @scala.inline
  def NOT_DEFINED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** the type of the key is a string. */
  @scala.inline
  def STRING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** the type of the key is a STRINGLIST. */
  @scala.inline
  def STRINGLIST: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

