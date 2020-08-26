package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventBody extends js.Object {
  var listId: String = js.native
  var listItemIds: js.UndefOr[js.Array[String]] = js.native
}

object ListEventBody {
  @scala.inline
  def apply(listId: String): ListEventBody = {
    val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventBody]
  }
  @scala.inline
  implicit class ListEventBodyOps[Self <: ListEventBody] (val x: Self) extends AnyVal {
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
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    @scala.inline
    def setListItemIdsVarargs(value: String*): Self = this.set("listItemIds", js.Array(value :_*))
    @scala.inline
    def setListItemIds(value: js.Array[String]): Self = this.set("listItemIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItemIds: Self = this.set("listItemIds", js.undefined)
  }
  
}

