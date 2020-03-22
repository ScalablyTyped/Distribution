package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictk
  extends /* k */ StringDictionary[js.Any] {
  def instance(name: String): js.Any
}

object AnonDictk {
  @scala.inline
  def apply(instance: String => js.Any, StringDictionary: /* k */ StringDictionary[js.Any] = null): AnonDictk = {
    val __obj = js.Dynamic.literal(instance = js.Any.fromFunction1(instance))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictk]
  }
}

