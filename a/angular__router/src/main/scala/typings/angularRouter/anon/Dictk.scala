package typings.angularRouter.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictk
  extends /* k */ StringDictionary[js.Any] {
  var navigationId: Double
}

object Dictk {
  @scala.inline
  def apply(navigationId: Double, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictk = {
    val __obj = js.Dynamic.literal(navigationId = navigationId.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictk]
  }
}

