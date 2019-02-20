package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InteractiveSelectionResult extends js.Object

/**
  * describes possible results of an interactive selection of a property value in an object inspector
  * @see XPropertyHandler.onInteractivePropertySelection
  * @since OOo 2.0.3
  */
@JSGlobal("com.sun.star.inspection.InteractiveSelectionResult")
@js.native
object InteractiveSelectionResult extends js.Object {
  /** The interactive selection of a property value was canceled. */
  @js.native
  sealed trait Cancelled
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.InteractiveSelectionResult
  
  /**
    * The interactive selection of a property value succeeded, a new property value has been obtained, but not yet set at the inspected component.
    *
    * In this case, the obtained value is passed to the caller of {@link XPropertyHandler.onInteractivePropertySelection()} , which is responsible for
    * forwarding this value to the inspected component.
    */
  @js.native
  sealed trait ObtainedValue
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.InteractiveSelectionResult
  
  /** The interactive selection of a property value is still pending. <p>This is usually used when this selection involves non-modal user interface.</p> */
  @js.native
  sealed trait Pending
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.InteractiveSelectionResult
  
  /**
    * The interactive selection of a property value succeeded, and the new property value chosen by the user has already been set at the inspected
    * component.
    */
  @js.native
  sealed trait Success
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.InteractiveSelectionResult
  
  /* 0 */ val Cancelled: Cancelled with scala.Double = js.native
  /* 2 */ val ObtainedValue: ObtainedValue with scala.Double = js.native
  /* 3 */ val Pending: Pending with scala.Double = js.native
  /* 1 */ val Success: Success with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.InteractiveSelectionResult with scala.Double
  ] = js.native
}

