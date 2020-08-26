package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  var __typename: String = js.native
  var id: String | Double = js.native
}

object Id {
  @scala.inline
  def apply(__typename: String, id: String | Double): Id = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
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
    def set__typename(value: String): Self = this.set("__typename", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

