package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Document
trait ObjectWithId
  extends /* key */ StringDictionary[js.Any]
     with DocumentLike {
  var _id: String
}

object ObjectWithId {
  @scala.inline
  def apply(_id: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): ObjectWithId = {
    val __obj = js.Dynamic.literal(_id = _id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ObjectWithId]
  }
}

