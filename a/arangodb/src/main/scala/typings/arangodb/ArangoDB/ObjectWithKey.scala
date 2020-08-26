package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectWithKey
  extends /* key */ StringDictionary[js.Any]
     with DocumentLike {
  var _key: String = js.native
}

object ObjectWithKey {
  @scala.inline
  def apply(_key: String): ObjectWithKey = {
    val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithKey]
  }
  @scala.inline
  implicit class ObjectWithKeyOps[Self <: ObjectWithKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_key(value: String): Self = this.set("_key", value.asInstanceOf[js.Any])
  }
  
}

