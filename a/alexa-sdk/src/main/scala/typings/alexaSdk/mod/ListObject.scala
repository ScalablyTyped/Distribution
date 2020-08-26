package typings.alexaSdk.mod

import typings.alexaSdk.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObject extends js.Object {
  /**
    * Items that belong to this list.
    */
  var items: js.Array[ListItemObject] = js.native
  /**
    * list id (String)
    */
  var listId: String = js.native
  /**
    * list name (String)
    */
  var name: String = js.native
  var next: js.UndefOr[ListLinks] = js.native
  /**
    * state
    * "active" or "archived" (Enum)
    */
  var state: js.UndefOr[ListObjectState] = js.native
  /**
    * Possibly status of the list (or state?)
    * Fetched from commit eebba0d at https://github.com/alexa/alexa-skills-kit-sdk-for-nodejs/
    * File path: alexa-skills-kit-sdk-for-nodejs/lib/services/listManagementService.js
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Urls to active and completed items
    * href is lint to the items having certain status.
    * The status can be "active" or "completed".
    */
  var statusMap: Href = js.native
  /**
    * list version (Positive integer)
    */
  var version: js.UndefOr[Double] = js.native
}

object ListObject {
  @scala.inline
  def apply(items: js.Array[ListItemObject], listId: String, name: String, statusMap: Href): ListObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusMap = statusMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObject]
  }
  @scala.inline
  implicit class ListObjectOps[Self <: ListObject] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: ListItemObject*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ListItemObject]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusMap(value: Href): Self = this.set("statusMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: ListLinks): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setState(value: ListObjectState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

