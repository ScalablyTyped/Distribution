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

