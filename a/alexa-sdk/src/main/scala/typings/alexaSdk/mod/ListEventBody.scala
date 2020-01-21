package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventBody extends js.Object {
  var listId: String
  var listItemIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ListEventBody {
  @scala.inline
  def apply(listId: String, listItemIds: js.Array[String] = null): ListEventBody = {
    val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any])
    if (listItemIds != null) __obj.updateDynamic("listItemIds")(listItemIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventBody]
  }
}

