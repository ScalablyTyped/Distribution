package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the operations for a hatch window.
  *
  * A hatch window is a kind of window that is adopted to contain an embedded object window to represent the contained window border and to handle
  * resizing/moving in a specific way: after user have selected the new size/placement the hatching window sends request to owner for resizing/moving.
  * Thus the window can not resize/move itself.
  */
@js.native
trait XHatchWindow extends XComponent {
  var HatchBorderSize: Size = js.native
  /** sets the object that will control resizing/moving, if the object is not set the window can not be resized/moved. */
  def setController(xController: XHatchWindowController): Unit = js.native
}

object XHatchWindow {
  @scala.inline
  def apply(
    HatchBorderSize: Size,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setController: XHatchWindowController => Unit
  ): XHatchWindow = {
    val __obj = js.Dynamic.literal(HatchBorderSize = HatchBorderSize.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setController = js.Any.fromFunction1(setController))
    __obj.asInstanceOf[XHatchWindow]
  }
  @scala.inline
  implicit class XHatchWindowOps[Self <: XHatchWindow] (val x: Self) extends AnyVal {
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
    def setHatchBorderSize(value: Size): Self = this.set("HatchBorderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetController(value: XHatchWindowController => Unit): Self = this.set("setController", js.Any.fromFunction1(value))
  }
  
}

