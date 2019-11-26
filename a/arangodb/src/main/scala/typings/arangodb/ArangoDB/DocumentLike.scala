package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.ArangoDB.ObjectWithId
  - typings.arangodb.ArangoDB.ObjectWithKey
*/
trait DocumentLike extends js.Object

object DocumentLike {
  @scala.inline
  def ObjectWithId(_id: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): DocumentLike = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DocumentLike]
  }
  @scala.inline
  def ObjectWithKey(_key: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): DocumentLike = {
    val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DocumentLike]
  }
}

