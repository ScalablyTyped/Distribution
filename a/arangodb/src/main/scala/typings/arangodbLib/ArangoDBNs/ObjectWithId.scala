package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Document
trait ObjectWithId
  extends DocumentLike
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var _id: java.lang.String
}

object ObjectWithId {
  @scala.inline
  def apply(
    _id: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ObjectWithId = {
    val __obj = js.Dynamic.literal(_id = _id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ObjectWithId]
  }
}

