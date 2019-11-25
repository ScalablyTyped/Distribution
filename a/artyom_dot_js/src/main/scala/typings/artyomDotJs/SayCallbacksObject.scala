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
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd.asInstanceOf[js.Any])
    if (onStart != null) __obj.updateDynamic("onStart")(onStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SayCallbacksObject]
  }
}

