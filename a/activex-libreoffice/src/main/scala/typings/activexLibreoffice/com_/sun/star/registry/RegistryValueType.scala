package typings.activexLibreoffice.com_.sun.star.registry

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

/**
  * represents all possible types of a key value.
  *
  * An ASCII value and a string value will both be handled with type string. But interns will be handled differently. Normally the idl string represents a
  * unicode string.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
*/
trait RegistryValueType extends js.Object

object RegistryValueType {
  /** the type of the key is ASCII. */
  @scala.inline
  def ASCII: `2` = 2.asInstanceOf[`2`]
  /** the type of the key is a ASCIILIST. */
  @scala.inline
  def ASCIILIST: `6` = 6.asInstanceOf[`6`]
  /** the type of the key is binary. */
  @scala.inline
  def BINARY: `4` = 4.asInstanceOf[`4`]
  /** the type of the key is long. */
  @scala.inline
  def LONG: `1` = 1.asInstanceOf[`1`]
  /** the type of the key is LONGLIST. */
  @scala.inline
  def LONGLIST: `5` = 5.asInstanceOf[`5`]
  /** the type of the key is not defined. */
  @scala.inline
  def NOT_DEFINED: `0` = 0.asInstanceOf[`0`]
  /** the type of the key is a string. */
  @scala.inline
  def STRING: `3` = 3.asInstanceOf[`3`]
  /** the type of the key is a STRINGLIST. */
  @scala.inline
  def STRINGLIST: `7` = 7.asInstanceOf[`7`]
}

