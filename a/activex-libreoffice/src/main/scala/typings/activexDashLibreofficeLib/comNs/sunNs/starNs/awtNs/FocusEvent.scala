package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a keyboard focus event.
  *
  * There are two levels of focus change events: permanent and temporary. Permanent focus change events occur when focus is directly moved from one
  * component to another, such as through calls to requestFocus() or as the user uses the Tab key to traverse components. Temporary focus change events
  * occur when focus is gained or lost for a component as the indirect result of another operation, such as window deactivation or a scrollbar drag. In
  * this case, the original focus state will automatically be restored once that operation is finished, or for the case of window deactivation, when the
  * window is reactivated. Both permanent and temporary focus events are delivered using the FOCUS_GAINED and FOCUS_LOST event ids; the levels may be
  * distinguished in the event using the isTemporary() method.
  */
trait FocusEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * specifies the reason for the focus change as an arithmetic-or combination of {@link FocusChangeReason} .
    * @see FocusChangeReason
    */
  var FocusFlags: scala.Double
  /** contains the window which gets the focus on a lose focus event. */
  var NextFocus: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** specifies if this focus change event is a temporary change. */
  var Temporary: scala.Boolean
}

