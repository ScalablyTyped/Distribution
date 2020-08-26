package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a notifier for changes of XPropertySetInfos.
  * @see PropertySetInfoChangeEvent
  * @see XPropertySetInfoChangeListener
  */
@js.native
trait XPropertySetInfoChangeNotifier extends XInterface {
  /**
    * registers a listener for PropertySetInfoChangeEvents.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addPropertySetInfoChangeListener(Listener: XPropertySetInfoChangeListener): Unit = js.native
  /**
    * removes a listener for PropertySetInfoChangeEvents.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removePropertySetInfoChangeListener(Listener: XPropertySetInfoChangeListener): Unit = js.native
}

object XPropertySetInfoChangeNotifier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addPropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit
  ): XPropertySetInfoChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPropertySetInfoChangeListener = js.Any.fromFunction1(addPropertySetInfoChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertySetInfoChangeListener = js.Any.fromFunction1(removePropertySetInfoChangeListener))
    __obj.asInstanceOf[XPropertySetInfoChangeNotifier]
  }
  @scala.inline
  implicit class XPropertySetInfoChangeNotifierOps[Self <: XPropertySetInfoChangeNotifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddPropertySetInfoChangeListener(value: XPropertySetInfoChangeListener => Unit): Self = this.set("addPropertySetInfoChangeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemovePropertySetInfoChangeListener(value: XPropertySetInfoChangeListener => Unit): Self = this.set("removePropertySetInfoChangeListener", js.Any.fromFunction1(value))
  }
  
}

