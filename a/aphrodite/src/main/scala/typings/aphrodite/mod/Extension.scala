package typings.aphrodite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  var selectorHandler: js.UndefOr[SelectorHandler] = js.native
}

object Extension {
  @scala.inline
  def apply(): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
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
    def setSelectorHandler(
      value: (/* selector */ String, /* baseSelector */ String, /* callback */ js.Function1[/* selector */ String, String]) => String | Null
    ): Self = this.set("selectorHandler", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSelectorHandler: Self = this.set("selectorHandler", js.undefined)
  }
  
}

