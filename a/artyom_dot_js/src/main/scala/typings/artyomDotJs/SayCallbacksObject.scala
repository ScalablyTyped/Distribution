package typings.artyomDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SayCallbacksObject extends js.Object {
  var lang: js.UndefOr[String] = js.undefined
  var onEnd: js.UndefOr[js.Function] = js.undefined
  var onStart: js.UndefOr[js.Function] = js.undefined
}

object SayCallbacksObject {
  @scala.inline
  def apply(lang: String = null, onEnd: js.Function = null, onStart: js.Function = null): SayCallbacksObject = {
    val __obj = js.Dynamic.literal()
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    __obj.asInstanceOf[SayCallbacksObject]
  }
}

