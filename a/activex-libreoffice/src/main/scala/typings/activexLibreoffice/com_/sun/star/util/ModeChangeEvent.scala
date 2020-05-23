package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to veto changes in an object's internal mode.
  * @see XModeChangeBroadcaster
  * @see XModeChangeListener
  * @since OOo 1.1.2
  */
trait ModeChangeEvent extends EventObject {
  /**
    * denotes the new internal mode of a component
    *
    * The semantics of the mode string is to be defined by the component broadcasting this event.
    */
  var NewMode: String
}

object ModeChangeEvent {
  @scala.inline
  def apply(NewMode: String, Source: XInterface): ModeChangeEvent = {
    val __obj = js.Dynamic.literal(NewMode = NewMode.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeChangeEvent]
  }
}

