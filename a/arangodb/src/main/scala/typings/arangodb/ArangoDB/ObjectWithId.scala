package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Document
@js.native
trait ObjectWithId
  extends /* key */ StringDictionary[js.Any]
     with DocumentLike {
  var _id: String = js.native
}

object ObjectWithId {
  @scala.inline
  def apply(_id: String): ObjectWithId = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithId]
  }
  @scala.inline
  implicit class ObjectWithIdOps[Self <: ObjectWithId] (val x: Self) extends AnyVal {
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
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
  }
  
}

