package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XFrame} instead of this
  * @deprecated Deprecated
  */
@js.native
trait XDesktopTask extends XComponent {
  /**
    * use {@link com.sun.star.util.XCloseable} or {@link com.sun.star.lang.XComponent.dispose()} instead.
    * @deprecated Deprecated
    */
  def close(): Boolean = js.native
  /**
    * use {@link com.sun.star.lang.XInitialization} instead.
    * @deprecated Deprecated
    */
  def initialize(TaskWindow: XWindow): Unit = js.native
}

object XDesktopTask {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    close: () => Boolean,
    dispose: () => Unit,
    initialize: XWindow => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XDesktopTask = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XDesktopTask]
  }
  @scala.inline
  implicit class XDesktopTaskOps[Self <: XDesktopTask] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Boolean): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialize(value: XWindow => Unit): Self = this.set("initialize", js.Any.fromFunction1(value))
  }
  
}

