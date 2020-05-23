package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.MouseEvent
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Listener interface to receive shape-specific events.
  * @since OOo 2.4
  */
trait XShapeEventListener extends XEventListener {
  /**
    * Notify a clicked shape.
    *
    * This method notifies the listener that a shape was clicked.
    * @param xShape The shape that was clicked upon.
    * @param aOriginalEvent The original mouse click event that generated this notification.
    */
  def click(xShape: XShape, aOriginalEvent: MouseEvent): Unit
}

object XShapeEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    click: (XShape, MouseEvent) => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XShapeEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), click = js.Any.fromFunction2(click), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XShapeEventListener]
  }
}

