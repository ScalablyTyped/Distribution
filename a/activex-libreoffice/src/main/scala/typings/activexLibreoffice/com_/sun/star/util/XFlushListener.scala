package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive **flushed** events. */
@js.native
trait XFlushListener extends XEventListener {
  /** is called when the object data is flushed. */
  def flushed(rEvent: EventObject): Unit = js.native
}

object XFlushListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    flushed: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFlushListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), flushed = js.Any.fromFunction1(flushed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFlushListener]
  }
  @scala.inline
  implicit class XFlushListenerOps[Self <: XFlushListener] (val x: Self) extends AnyVal {
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
    def setFlushed(value: EventObject => Unit): Self = this.set("flushed", js.Any.fromFunction1(value))
  }
  
}

