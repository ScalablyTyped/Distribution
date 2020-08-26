package typings.androiduix.android.view

import typings.androiduix.android.view.ViewGroup.LayoutParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowManager_ extends js.Object {
  var mActiveWindow: Window = js.native
  var mWindowsLayout: js.Any = js.native
  def addWindow(window: Window): Unit = js.native
  def getWindowsLayout(): ViewGroup = js.native
  def removeWindow(window: Window): Unit = js.native
  def updateWindowLayout(window: Window, params: LayoutParams): Unit = js.native
}

object WindowManager_ {
  @scala.inline
  def apply(
    addWindow: Window => Unit,
    getWindowsLayout: () => ViewGroup,
    mActiveWindow: Window,
    mWindowsLayout: js.Any,
    removeWindow: Window => Unit,
    updateWindowLayout: (Window, LayoutParams) => Unit
  ): WindowManager_ = {
    val __obj = js.Dynamic.literal(addWindow = js.Any.fromFunction1(addWindow), getWindowsLayout = js.Any.fromFunction0(getWindowsLayout), mActiveWindow = mActiveWindow.asInstanceOf[js.Any], mWindowsLayout = mWindowsLayout.asInstanceOf[js.Any], removeWindow = js.Any.fromFunction1(removeWindow), updateWindowLayout = js.Any.fromFunction2(updateWindowLayout))
    __obj.asInstanceOf[WindowManager_]
  }
  @scala.inline
  implicit class WindowManager_Ops[Self <: WindowManager_] (val x: Self) extends AnyVal {
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
    def setAddWindow(value: Window => Unit): Self = this.set("addWindow", js.Any.fromFunction1(value))
    @scala.inline
    def setGetWindowsLayout(value: () => ViewGroup): Self = this.set("getWindowsLayout", js.Any.fromFunction0(value))
    @scala.inline
    def setMActiveWindow(value: Window): Self = this.set("mActiveWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setMWindowsLayout(value: js.Any): Self = this.set("mWindowsLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveWindow(value: Window => Unit): Self = this.set("removeWindow", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateWindowLayout(value: (Window, LayoutParams) => Unit): Self = this.set("updateWindowLayout", js.Any.fromFunction2(value))
  }
  
}

