package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Indexes
trait IndexLike
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var id: java.lang.String
}

object IndexLike {
  @scala.inline
  def apply(
    id: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IndexLike = {
    val __obj = js.Dynamic.literal(id = id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IndexLike]
  }
}

