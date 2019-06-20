package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes possible results of an interactive selection of a property value in an object inspector
  * @see XPropertyHandler.onInteractivePropertySelection
  * @since OOo 2.0.3
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait InteractiveSelectionResult extends js.Object

object InteractiveSelectionResult {
  /** The interactive selection of a property value was canceled. */
  @scala.inline
  def Cancelled: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * The interactive selection of a property value succeeded, a new property value has been obtained, but not yet set at the inspected component.
    *
    * In this case, the obtained value is passed to the caller of {@link XPropertyHandler.onInteractivePropertySelection()} , which is responsible for
    * forwarding this value to the inspected component.
    */
  @scala.inline
  def ObtainedValue: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** The interactive selection of a property value is still pending. <p>This is usually used when this selection involves non-modal user interface.</p> */
  @scala.inline
  def Pending: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * The interactive selection of a property value succeeded, and the new property value chosen by the user has already been set at the inspected
    * component.
    */
  @scala.inline
  def Success: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

