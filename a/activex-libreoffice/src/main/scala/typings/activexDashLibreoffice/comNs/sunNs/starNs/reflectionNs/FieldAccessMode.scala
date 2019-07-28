package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Denotes the access possibilities via {@link XIdlField2} to an interface attribute, enum or compound type (struct/exception). */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait FieldAccessMode extends js.Object

object FieldAccessMode {
  /**
    * Deprecated. Not used anymore.
    * @deprecated Deprecated
    */
  @scala.inline
  def CONST: `3` = this.cast(3)
  /** readable only */
  @scala.inline
  def READONLY: `1` = this.cast(1)
  /** readable and writeable */
  @scala.inline
  def READWRITE: `0` = this.cast(0)
  /** writeable only */
  @scala.inline
  def WRITEONLY: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

