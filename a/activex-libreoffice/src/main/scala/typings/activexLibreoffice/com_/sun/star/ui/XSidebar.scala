package typings.activexLibreoffice.com_.sun.star.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface of the sidebar that allows its elements like panels to eg request layouts. */
@js.native
trait XSidebar extends js.Object {
  /**
    * Request layout of the sidebar. Call this method when one of the panels wants to change its size due to late initilization or different content after a
    * context change.
    */
  def requestLayout(): Unit = js.native
}

object XSidebar {
  @scala.inline
  def apply(requestLayout: () => Unit): XSidebar = {
    val __obj = js.Dynamic.literal(requestLayout = js.Any.fromFunction0(requestLayout))
    __obj.asInstanceOf[XSidebar]
  }
  @scala.inline
  implicit class XSidebarOps[Self <: XSidebar] (val x: Self) extends AnyVal {
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
    def setRequestLayout(value: () => Unit): Self = this.set("requestLayout", js.Any.fromFunction0(value))
  }
  
}

