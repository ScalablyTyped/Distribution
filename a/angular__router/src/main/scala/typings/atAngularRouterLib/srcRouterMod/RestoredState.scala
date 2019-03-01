package typings
package atAngularRouterLib.srcRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoredState
  extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var navigationId: scala.Double
}

object RestoredState {
  @scala.inline
  def apply(
    navigationId: scala.Double,
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): RestoredState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("navigationId")(navigationId)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RestoredState]
  }
}

