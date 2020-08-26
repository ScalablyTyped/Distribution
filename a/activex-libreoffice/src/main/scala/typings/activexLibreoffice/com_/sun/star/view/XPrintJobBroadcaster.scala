package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows for getting information about a print job.
  *
  * {@link XPrintJobBroadcaster} can be implemented by classes which implement {@link XPrintable} . It allows a {@link XPrintJobListener} to be
  * registered, thus a client object will learn about the print progress.
  * @see XPrintJobListener
  * @since OOo 1.1.2
  */
@js.native
trait XPrintJobBroadcaster extends XInterface {
  /** adds an {@link XPrintJobListener} to be notified about print progress. */
  def addPrintJobListener(xListener: XPrintJobListener): Unit = js.native
  /** removes an {@link XPrintJobListener} . */
  def removePrintJobListener(xListener: XPrintJobListener): Unit = js.native
}

object XPrintJobBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addPrintJobListener: XPrintJobListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePrintJobListener: XPrintJobListener => Unit
  ): XPrintJobBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPrintJobListener = js.Any.fromFunction1(addPrintJobListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePrintJobListener = js.Any.fromFunction1(removePrintJobListener))
    __obj.asInstanceOf[XPrintJobBroadcaster]
  }
  @scala.inline
  implicit class XPrintJobBroadcasterOps[Self <: XPrintJobBroadcaster] (val x: Self) extends AnyVal {
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
    def setAddPrintJobListener(value: XPrintJobListener => Unit): Self = this.set("addPrintJobListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemovePrintJobListener(value: XPrintJobListener => Unit): Self = this.set("removePrintJobListener", js.Any.fromFunction1(value))
  }
  
}

