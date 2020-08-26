package typings.antDesignReactNative.activityIndicatorStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityIndicatorStyle extends js.Object {
  var container: ViewStyle = js.native
  var innerContainer: ViewStyle = js.native
  var spinner: ViewStyle = js.native
  var tip: TextStyle = js.native
  var toast: TextStyle = js.native
  var wrapper: ViewStyle = js.native
}

object ActivityIndicatorStyle {
  @scala.inline
  def apply(
    container: ViewStyle,
    innerContainer: ViewStyle,
    spinner: ViewStyle,
    tip: TextStyle,
    toast: TextStyle,
    wrapper: ViewStyle
  ): ActivityIndicatorStyle = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityIndicatorStyle]
  }
  @scala.inline
  implicit class ActivityIndicatorStyleOps[Self <: ActivityIndicatorStyle] (val x: Self) extends AnyVal {
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
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerContainer(value: ViewStyle): Self = this.set("innerContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpinner(value: ViewStyle): Self = this.set("spinner", value.asInstanceOf[js.Any])
    @scala.inline
    def setTip(value: TextStyle): Self = this.set("tip", value.asInstanceOf[js.Any])
    @scala.inline
    def setToast(value: TextStyle): Self = this.set("toast", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: ViewStyle): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

