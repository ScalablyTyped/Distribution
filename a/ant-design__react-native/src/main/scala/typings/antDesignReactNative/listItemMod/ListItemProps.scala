package typings.antDesignReactNative.listItemMod

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.listPropsTypeMod.ListItemPropsType
import typings.antDesignReactNative.listStyleMod.ListStyle
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps
  extends ListItemPropsType
     with WithThemeStyles[ListStyle] {
  var delayLongPress: js.UndefOr[Double] = js.native
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object ListItemProps {
  @scala.inline
  def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProps]
  }
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
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
    def setDelayLongPress(value: Double): Self = this.set("delayLongPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayLongPress: Self = this.set("delayLongPress", js.undefined)
    @scala.inline
    def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPressIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    @scala.inline
    def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPressOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

