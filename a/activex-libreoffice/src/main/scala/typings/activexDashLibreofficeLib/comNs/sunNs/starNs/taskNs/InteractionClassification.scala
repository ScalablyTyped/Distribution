package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A classification of interaction requests.
  * @see com.sun.star.task.ClassifiedInteractionRequest This is the base of classified interaction requests.
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait InteractionClassification extends js.Object

object InteractionClassification {
  /** An error. */
  @scala.inline
  def ERROR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** Some information for the client/user (which will typically lead to the selection of an {@link com.sun.star.task.XInteractionApprove} continuation). */
  @scala.inline
  def INFO: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * A query for the client/user (which will typically lead to the selection of an {@link com.sun.star.task.XInteractionApprove} or {@link
    * com.sun.star.task.XInteractionDisapprove} continuation).
    */
  @scala.inline
  def QUERY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** A warning, less severe than an error. */
  @scala.inline
  def WARNING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

