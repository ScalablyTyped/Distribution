package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Codes for content creation errors. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait ContentCreationError extends js.Object

object ContentCreationError {
  /** Provider was unable to create the content instance. */
  @scala.inline
  def CONTENT_CREATION_FAILED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** Creation of content identifier failed. */
  @scala.inline
  def IDENTIFIER_CREATION_FAILED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** @deprecated Deprecated */
  @scala.inline
  def NO_CONTENT_BROKER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** No {@link Content} Provider for given content identifier available. */
  @scala.inline
  def NO_CONTENT_PROVIDER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** @deprecated Deprecated */
  @scala.inline
  def NO_IDENTIFIER_FACTORY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * Unknown.
    *
    * An unknown I/O error has occurred.
    */
  @scala.inline
  def UNKNOWN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

