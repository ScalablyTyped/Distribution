package typings.amazonProductApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrowseNodeLookupOptions extends js.Object {
  var browseNodeId: js.UndefOr[String] = js.undefined
  var responseGroup: js.UndefOr[String] = js.undefined
}

object IBrowseNodeLookupOptions {
  @scala.inline
  def apply(browseNodeId: String = null, responseGroup: String = null): IBrowseNodeLookupOptions = {
    val __obj = js.Dynamic.literal()
    if (browseNodeId != null) __obj.updateDynamic("browseNodeId")(browseNodeId.asInstanceOf[js.Any])
    if (responseGroup != null) __obj.updateDynamic("responseGroup")(responseGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowseNodeLookupOptions]
  }
}

