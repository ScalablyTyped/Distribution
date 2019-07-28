package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A classification of interaction requests.
  * @see com.sun.star.task.ClassifiedInteractionRequest This is the base of classified interaction requests.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait InteractionClassification extends js.Object

object InteractionClassification {
  /** An error. */
  @scala.inline
  def ERROR: `0` = this.cast(0)
  /** Some information for the client/user (which will typically lead to the selection of an {@link com.sun.star.task.XInteractionApprove} continuation). */
  @scala.inline
  def INFO: `2` = this.cast(2)
  /**
    * A query for the client/user (which will typically lead to the selection of an {@link com.sun.star.task.XInteractionApprove} or {@link
    * com.sun.star.task.XInteractionDisapprove} continuation).
    */
  @scala.inline
  def QUERY: `3` = this.cast(3)
  /** A warning, less severe than an error. */
  @scala.inline
  def WARNING: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

