package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventBody extends js.Object {
  var listId: java.lang.String
  var listItemIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ListEventBody {
  @scala.inline
  def apply(listId: java.lang.String, listItemIds: js.Array[java.lang.String] = null): ListEventBody = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listId")(listId)
    if (listItemIds != null) __obj.updateDynamic("listItemIds")(listItemIds)
    __obj.asInstanceOf[ListEventBody]
  }
}

