package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId
  extends /* key */ StringDictionary[js.Any] {
  var _id: String
}

object AnonId {
  @scala.inline
  def apply(_id: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonId = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonId]
  }
}

