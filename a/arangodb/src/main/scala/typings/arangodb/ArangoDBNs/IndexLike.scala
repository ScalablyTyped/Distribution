package typings.arangodb.ArangoDBNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Indexes
trait IndexLike
  extends /* key */ StringDictionary[js.Any] {
  var id: String
}

object IndexLike {
  @scala.inline
  def apply(id: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): IndexLike = {
    val __obj = js.Dynamic.literal(id = id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IndexLike]
  }
}

