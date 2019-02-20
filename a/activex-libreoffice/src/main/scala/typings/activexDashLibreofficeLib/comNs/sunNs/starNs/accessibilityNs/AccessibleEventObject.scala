package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this struct describes an accessible event, that is broadcasted from the {@link XAccessibleEventBroadcaster} and notified to {@link
  * XAccessibleEventListener} .
  *
  * It is usually implemented by {@link AccessibleContext} .
  * @since OOo 1.1.2
  */
trait AccessibleEventObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * specifies the type of this event.
    *
    * For a list of possible events see {@link AccessibleEventId} .
    */
  var EventId: scala.Double
  /**
    * for events that specifies a value change, this is the new value.
    *
    * Depending on the {@link EventId} , this can be void.
    */
  var NewValue: js.Any
  /**
    * for events that specifies a value change, this is the old value.
    *
    * Depending on the {@link EventId} , this can be void.
    */
  var OldValue: js.Any
}

