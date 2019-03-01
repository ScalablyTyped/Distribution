package typings
package alexaDashSdkLib.alexaDashSdkMod

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
  var listId: java.lang.String
  /**
    * list name (String)
    */
  var name: java.lang.String
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
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Urls to active and completed items
    * href is lint to the items having certain status.
    * The status can be "active" or "completed".
    */
  var statusMap: alexaDashSdkLib.Anon_Href
  /**
    * list version (Positive integer)
    */
  var version: js.UndefOr[scala.Double] = js.undefined
}

object ListObject {
  @scala.inline
  def apply(
    items: js.Array[ListItemObject],
    listId: java.lang.String,
    name: java.lang.String,
    statusMap: alexaDashSdkLib.Anon_Href,
    next: ListLinks = null,
    state: ListObjectState = null,
    status: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): ListObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("listId")(listId)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("statusMap")(statusMap)
    if (next != null) __obj.updateDynamic("next")(next)
    if (state != null) __obj.updateDynamic("state")(state)
    if (status != null) __obj.updateDynamic("status")(status)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObject]
  }
}

