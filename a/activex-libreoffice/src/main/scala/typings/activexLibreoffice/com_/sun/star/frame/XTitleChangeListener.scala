package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to receive notifications when the frame title changes */
trait XTitleChangeListener extends XEventListener {
  /** The frame title has changed */
  def titleChanged(aEvent: TitleChangedEvent): Unit
}

object XTitleChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    titleChanged: TitleChangedEvent => Unit
  ): XTitleChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), titleChanged = js.Any.fromFunction1(titleChanged))
    __obj.asInstanceOf[XTitleChangeListener]
  }
}

