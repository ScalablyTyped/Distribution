package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XPropertySetOption extends XInterface {
  /** Turn on or off notifying change listeners on property value change. This option is turned on by default. */
  def enableChangeListenerNotification(bEnable: Boolean): Unit = js.native
}

object XPropertySetOption {
  @scala.inline
  def apply(
    acquire: () => Unit,
    enableChangeListenerNotification: Boolean => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertySetOption = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), enableChangeListenerNotification = js.Any.fromFunction1(enableChangeListenerNotification), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertySetOption]
  }
  @scala.inline
  implicit class XPropertySetOptionOps[Self <: XPropertySetOption] (val x: Self) extends AnyVal {
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
    def setEnableChangeListenerNotification(value: Boolean => Unit): Self = this.set("enableChangeListenerNotification", js.Any.fromFunction1(value))
  }
  
}

