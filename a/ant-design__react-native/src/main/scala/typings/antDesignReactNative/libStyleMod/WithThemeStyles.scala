package typings.antDesignReactNative.libStyleMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithThemeStyles[T] extends js.Object {
  var styles: js.UndefOr[Partial[T]] = js.native
}

object WithThemeStyles {
  @scala.inline
  def apply[T](): WithThemeStyles[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithThemeStyles[T]]
  }
  @scala.inline
  implicit class WithThemeStylesOps[Self <: WithThemeStyles[_], T] (val x: Self with WithThemeStyles[T]) extends AnyVal {
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
    def setStyles(value: Partial[T]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

