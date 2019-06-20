package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the print progress of an {@link XPrintable} .
  *
  * Printing consists of two abstract phases: rendering the document for the printer and then sending it to the printer (spooling). PrintableState
  * describes which phase is currently progressing or has failed.
  * @see PrintableStateEvent
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait PrintableState extends js.Object

object PrintableState {
  /** printing was aborted (e.g., by the user) while either printing or spooling. */
  @scala.inline
  def JOB_ABORTED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** printing (rendering the document) has finished, spooling has begun */
  @scala.inline
  def JOB_COMPLETED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** printing ran into an error. */
  @scala.inline
  def JOB_FAILED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** spooling has finished successfully. This is the only state that can be considered as "success" for a print job. */
  @scala.inline
  def JOB_SPOOLED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** the document could be printed but not spooled. */
  @scala.inline
  def JOB_SPOOLING_FAILED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** printing (rendering the document) has begun */
  @scala.inline
  def JOB_STARTED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

