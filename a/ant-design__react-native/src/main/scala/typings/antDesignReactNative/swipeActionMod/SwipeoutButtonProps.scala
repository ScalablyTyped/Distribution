package typings.antDesignReactNative.swipeActionMod

import typings.antDesignReactNative.anon.BackgroundColor
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativeSwipeout.mod.SwipeoutButtonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeoutButtonProps extends SwipeoutButtonProperties {
  var style: js.UndefOr[StyleProp[TextStyle] with BackgroundColor] = js.native
}

object SwipeoutButtonProps {
  @scala.inline
  def apply(): SwipeoutButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeoutButtonProps]
  }
  @scala.inline
  implicit class SwipeoutButtonPropsOps[Self <: SwipeoutButtonProps] (val x: Self) extends AnyVal {
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
    def setStyle(value: StyleProp[TextStyle] with BackgroundColor): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

