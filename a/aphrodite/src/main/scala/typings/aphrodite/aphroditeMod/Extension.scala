package typings.aphrodite.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var selectorHandler: js.UndefOr[SelectorHandler] = js.undefined
}

object Extension {
  @scala.inline
  def apply(
    selectorHandler: (/* selector */ String, /* baseSelector */ String, /* callback */ js.Function1[/* selector */ String, String]) => String | Null = null
  ): Extension = {
    val __obj = js.Dynamic.literal()
    if (selectorHandler != null) __obj.updateDynamic("selectorHandler")(js.Any.fromFunction3(selectorHandler))
    __obj.asInstanceOf[Extension]
  }
}

