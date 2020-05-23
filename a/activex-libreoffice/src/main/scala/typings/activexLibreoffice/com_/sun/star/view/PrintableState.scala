package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
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
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait PrintableState extends js.Object

object PrintableState {
  /** printing was aborted (e.g., by the user) while either printing or spooling. */
  @scala.inline
  def JOB_ABORTED: `3` = 3.asInstanceOf[`3`]
  /** printing (rendering the document) has finished, spooling has begun */
  @scala.inline
  def JOB_COMPLETED: `1` = 1.asInstanceOf[`1`]
  /** printing ran into an error. */
  @scala.inline
  def JOB_FAILED: `4` = 4.asInstanceOf[`4`]
  /** spooling has finished successfully. This is the only state that can be considered as "success" for a print job. */
  @scala.inline
  def JOB_SPOOLED: `2` = 2.asInstanceOf[`2`]
  /** the document could be printed but not spooled. */
  @scala.inline
  def JOB_SPOOLING_FAILED: `5` = 5.asInstanceOf[`5`]
  /** printing (rendering the document) has begun */
  @scala.inline
  def JOB_STARTED: `0` = 0.asInstanceOf[`0`]
}

