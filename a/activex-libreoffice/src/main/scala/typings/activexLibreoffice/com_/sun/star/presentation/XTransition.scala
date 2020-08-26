package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.rendering.XBitmap
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transition interface to render custom transitions over time.
  * @since OOo 2.4
  */
@js.native
trait XTransition extends XInterface {
  /**
    * Update transition on screen to given time state.
    * @param t Time on the transition timeline to display. Must be in the [0,1] range.
    */
  def update(t: Double): Unit = js.native
  def viewChanged(view: XSlideShowView, leavingBitmap: XBitmap, enteringBitmap: XBitmap): Unit = js.native
}

object XTransition {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    update: Double => Unit,
    viewChanged: (XSlideShowView, XBitmap, XBitmap) => Unit
  ): XTransition = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), update = js.Any.fromFunction1(update), viewChanged = js.Any.fromFunction3(viewChanged))
    __obj.asInstanceOf[XTransition]
  }
  @scala.inline
  implicit class XTransitionOps[Self <: XTransition] (val x: Self) extends AnyVal {
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
    def setUpdate(value: Double => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setViewChanged(value: (XSlideShowView, XBitmap, XBitmap) => Unit): Self = this.set("viewChanged", js.Any.fromFunction3(value))
  }
  
}

