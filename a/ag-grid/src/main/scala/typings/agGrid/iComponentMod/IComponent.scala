package typings.agGrid.iComponentMod

import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponent[T] extends js.Object {
  /** A hook to perform any necessary operation just after the gui for this component has been renderer
    in the screen.
    If the filter popup is closed and reopened, this method is called each time the filter is shown.
    This is useful for any
    logic that requires attachment before executing, such as putting focus on a particular DOM
    element. The params has one callback method 'hidePopup', which you can call at any later
    point to hide the popup - good if you have an 'Apply' button and you want to hide the popup
    after it is pressed. */
  var afterGuiAttached: js.UndefOr[js.Function1[/* params */ js.UndefOr[IAfterGuiAttachedParams], Unit]] = js.native
  /** Gets called once by grid after editing is finished - if your editor needs to do any cleanup, do it here */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** The init(params) method is called on the filter once. See below for details on the parameters. */
  var init: js.UndefOr[js.Function1[/* params */ T, Promise[Unit] | Unit]] = js.native
  /** Return the DOM element of your editor, this is what the grid puts into the DOM */
  def getGui(): HTMLElement = js.native
}

object IComponent {
  @scala.inline
  def apply[T](getGui: () => HTMLElement): IComponent[T] = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
    __obj.asInstanceOf[IComponent[T]]
  }
  @scala.inline
  implicit class IComponentOps[Self <: IComponent[_], T] (val x: Self with IComponent[T]) extends AnyVal {
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
    def setGetGui(value: () => HTMLElement): Self = this.set("getGui", js.Any.fromFunction0(value))
    @scala.inline
    def setAfterGuiAttached(value: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit): Self = this.set("afterGuiAttached", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterGuiAttached: Self = this.set("afterGuiAttached", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setInit(value: /* params */ T => Promise[Unit] | Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
  }
  
}

