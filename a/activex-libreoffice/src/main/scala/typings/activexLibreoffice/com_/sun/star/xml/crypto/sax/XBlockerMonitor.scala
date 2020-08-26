package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Blocker Monitor.
  *
  * This interface is used to manipulate a blocker.
  */
@js.native
trait XBlockerMonitor extends XInterface {
  /**
    * Configures the blocker's id.
    * @param id the keeper id of the blocker
    */
  def setBlockerId(id: Double): Unit = js.native
}

object XBlockerMonitor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setBlockerId: Double => Unit
  ): XBlockerMonitor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setBlockerId = js.Any.fromFunction1(setBlockerId))
    __obj.asInstanceOf[XBlockerMonitor]
  }
  @scala.inline
  implicit class XBlockerMonitorOps[Self <: XBlockerMonitor] (val x: Self) extends AnyVal {
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
    def setSetBlockerId(value: Double => Unit): Self = this.set("setBlockerId", js.Any.fromFunction1(value))
  }
  
}

