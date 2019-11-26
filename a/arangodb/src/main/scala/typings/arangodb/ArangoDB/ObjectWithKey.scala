package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectWithKey
  extends /* key */ StringDictionary[js.Any]
     with DocumentLike {
  var _key: String
}

object ObjectWithKey {
  @scala.inline
  def apply(_key: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): ObjectWithKey = {
    val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ObjectWithKey]
  }
}

