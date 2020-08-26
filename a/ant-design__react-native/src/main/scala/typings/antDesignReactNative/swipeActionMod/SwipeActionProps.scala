package typings.antDesignReactNative.swipeActionMod

import typings.reactNativeSwipeout.mod.SwipeoutProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeActionProps extends SwipeoutProperties {
  @JSName("left")
  var left_SwipeActionProps: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.native
  @JSName("right")
  var right_SwipeActionProps: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.native
}

object SwipeActionProps {
  @scala.inline
  def apply(): SwipeActionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeActionProps]
  }
  @scala.inline
  implicit class SwipeActionPropsOps[Self <: SwipeActionProps] (val x: Self) extends AnyVal {
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
    def setLeftVarargs(value: SwipeoutButtonProps*): Self = this.set("left", js.Array(value :_*))
    @scala.inline
    def setLeft(value: js.Array[SwipeoutButtonProps]): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRightVarargs(value: SwipeoutButtonProps*): Self = this.set("right", js.Array(value :_*))
    @scala.inline
    def setRight(value: js.Array[SwipeoutButtonProps]): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
  }
  
}

