package typings.angularRouter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonK
  extends /* k */ StringDictionary[js.Any] {
  var navigationId: Double
}

object AnonK {
  @scala.inline
  def apply(navigationId: Double, StringDictionary: /* k */ StringDictionary[js.Any] = null): AnonK = {
    val __obj = js.Dynamic.literal(navigationId = navigationId.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonK]
  }
}

