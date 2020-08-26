package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon extends js.Object {
  var icon: Element = js.native
  var mode: String = js.native
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
  def onClick(): Unit = js.native
}

object Icon {
  @scala.inline
  def apply(icon: Element, mode: String, onClick: () => Unit, styles: StringDictionary[RegisteredStyle[_]]): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
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
    def setIcon(value: Element): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[_]]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}

