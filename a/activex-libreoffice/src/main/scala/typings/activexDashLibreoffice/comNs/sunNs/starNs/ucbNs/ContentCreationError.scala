package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Codes for content creation errors. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait ContentCreationError extends js.Object

object ContentCreationError {
  /** Provider was unable to create the content instance. */
  @scala.inline
  def CONTENT_CREATION_FAILED: `5` = this.cast(5)
  /** Creation of content identifier failed. */
  @scala.inline
  def IDENTIFIER_CREATION_FAILED: `3` = this.cast(3)
  /** @deprecated Deprecated */
  @scala.inline
  def NO_CONTENT_BROKER: `1` = this.cast(1)
  /** No {@link Content} Provider for given content identifier available. */
  @scala.inline
  def NO_CONTENT_PROVIDER: `4` = this.cast(4)
  /** @deprecated Deprecated */
  @scala.inline
  def NO_IDENTIFIER_FACTORY: `2` = this.cast(2)
  /**
    * Unknown.
    *
    * An unknown I/O error has occurred.
    */
  @scala.inline
  def UNKNOWN: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

