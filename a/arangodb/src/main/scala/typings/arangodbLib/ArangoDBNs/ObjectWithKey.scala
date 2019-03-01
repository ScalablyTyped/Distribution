package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectWithKey
  extends DocumentLike
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var _key: java.lang.String
}

object ObjectWithKey {
  @scala.inline
  def apply(
    _key: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ObjectWithKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_key")(_key)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ObjectWithKey]
  }
}

