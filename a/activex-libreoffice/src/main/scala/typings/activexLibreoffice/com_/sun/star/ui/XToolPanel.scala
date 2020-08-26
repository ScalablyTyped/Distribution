package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the basic interface to be implemented by a tool panel */
@js.native
trait XToolPanel extends js.Object {
  /**
    * provides access to the tool panel's main window.
    *
    * It is allowed for an implementation to return `NULL` here, but in this case some functionality, for instance automatic positioning of the tool panel,
    * might not be available, and must be implemented by the tool panel itself.
    */
  var Window: XWindow = js.native
  /**
    * creates the root of the Accessibility object tree for the tool panel
    * @param ParentAccessible the parent object in the Accessibility object tree
    */
  def createAccessible(ParentAccessible: XAccessible): XAccessible = js.native
}

object XToolPanel {
  @scala.inline
  def apply(Window: XWindow, createAccessible: XAccessible => XAccessible): XToolPanel = {
    val __obj = js.Dynamic.literal(Window = Window.asInstanceOf[js.Any], createAccessible = js.Any.fromFunction1(createAccessible))
    __obj.asInstanceOf[XToolPanel]
  }
  @scala.inline
  implicit class XToolPanelOps[Self <: XToolPanel] (val x: Self) extends AnyVal {
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
    def setWindow(value: XWindow): Self = this.set("Window", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateAccessible(value: XAccessible => XAccessible): Self = this.set("createAccessible", js.Any.fromFunction1(value))
  }
  
}

