package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Denotes the access possibilities via {@link XIdlField2} to an interface attribute, enum or compound type (struct/exception). */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait FieldAccessMode extends js.Object

object FieldAccessMode {
  /**
    * Deprecated. Not used anymore.
    * @deprecated Deprecated
    */
  @scala.inline
  def CONST: `3` = 3.asInstanceOf[`3`]
  /** readable only */
  @scala.inline
  def READONLY: `1` = 1.asInstanceOf[`1`]
  /** readable and writeable */
  @scala.inline
  def READWRITE: `0` = 0.asInstanceOf[`0`]
  /** writeable only */
  @scala.inline
  def WRITEONLY: `2` = 2.asInstanceOf[`2`]
}

