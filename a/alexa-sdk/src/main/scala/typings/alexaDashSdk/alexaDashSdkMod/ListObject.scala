package typings.alexaDashSdk.alexaDashSdkMod

import typings.alexaDashSdk.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObject extends js.Object {
  /**
    * Items that belong to this list.
    */
  var items: js.Array[ListItemObject]
  /**
    * list id (String)
    */
  var listId: String
  /**
    * list name (String)
    */
  var name: String
  var next: js.UndefOr[ListLinks] = js.undefined
  /**
    * state
    * "active" or "archived" (Enum)
    */
  var state: js.UndefOr[ListObjectState] = js.undefined
  /**
    * Possibly status of the list (or state?)
    * Fetched from commit eebba0d at https://github.com/alexa/alexa-skills-kit-sdk-for-nodejs/
    * File path: alexa-skills-kit-sdk-for-nodejs/lib/services/listManagementService.js
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * Urls to active and completed items
    * href is lint to the items having certain status.
    * The status can be "active" or "completed".
    */
  var statusMap: Anon_Href
  /**
    * list version (Positive integer)
    */
  var version: js.UndefOr[Double] = js.undefined
}

object ListObject {
  @scala.inline
  def apply(
    items: js.Array[ListItemObject],
    listId: String,
    name: String,
    statusMap: Anon_Href,
    next: ListLinks = null,
    state: ListObjectState = null,
    status: String = null,
    version: Int | Double = null
  ): ListObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusMap = statusMap.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObject]
  }
}

