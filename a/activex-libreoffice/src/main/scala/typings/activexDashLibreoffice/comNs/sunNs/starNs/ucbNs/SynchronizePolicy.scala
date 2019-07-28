package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These are the possible values for the property "SynchronizePolicy".
  * @see XCommandProcessor
  * @see Content
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait SynchronizePolicy extends js.Object

object SynchronizePolicy {
  /** Client is master. */
  @scala.inline
  def CLIENT_IS_MASTER: `1` = this.cast(1)
  /** None is master. */
  @scala.inline
  def NONE_IS_MASTER: `2` = this.cast(2)
  /** Server is master. */
  @scala.inline
  def SERVER_IS_MASTER: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

