package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to control an active data source.
  *
  * This interface should be supported by objects which implement {@link XActiveDataSource} or {@link XActiveDataSink} .
  */
@js.native
trait XActiveDataControl extends XInterface {
  /**
    * registers an object to receive events from this data source.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addListener(aListener: XStreamListener): Unit = js.native
  /**
    * unregisters an object to receive events from this data source.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeListener(aListener: XStreamListener): Unit = js.native
  /**
    * starts I/O.
    *
    * Either XActiveDataControl::setInputStream() or XActiveDataControl::setOutputStream() must be called beforehand.
    *
    * This method does not block the thread, so reading is generally not finished when the method returns.
    */
  def start(): Unit = js.native
  /**
    * does a weak abort.
    *
    * It closes all connected resources and calls XInputStream::close() or XOutputStream::close() and fires the {@link XStreamListener.terminated()} -event.
    */
  def terminate(): Unit = js.native
}

object XActiveDataControl {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addListener: XStreamListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeListener: XStreamListener => Unit,
    start: () => Unit,
    terminate: () => Unit
  ): XActiveDataControl = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[XActiveDataControl]
  }
  @scala.inline
  implicit class XActiveDataControlOps[Self <: XActiveDataControl] (val x: Self) extends AnyVal {
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
    def setAddListener(value: XStreamListener => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveListener(value: XStreamListener => Unit): Self = this.set("removeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setTerminate(value: () => Unit): Self = this.set("terminate", js.Any.fromFunction0(value))
  }
  
}

