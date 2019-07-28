package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A specification of how long to remember some authentication data. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait RememberAuthentication extends js.Object

object RememberAuthentication {
  /** Do not remember the authentication data (use it once and immediately forget about it). */
  @scala.inline
  def NO: `0` = this.cast(0)
  /** Remember the authentication data "forever". */
  @scala.inline
  def PERSISTENT: `2` = this.cast(2)
  /** Remember the authentication data, but only until the end of the current session. */
  @scala.inline
  def SESSION: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

