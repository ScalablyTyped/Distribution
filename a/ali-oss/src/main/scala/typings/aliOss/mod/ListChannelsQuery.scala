package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsQuery extends js.Object {
   // the channel id prefix (returns channels with this prefix)
  var marker: String
   // the channel id marker (returns channels after this id)
  var `max-keys `: Double
  var prefix: String
}

object ListChannelsQuery {
  @scala.inline
  def apply(marker: String, `max-keys `: Double, prefix: String): ListChannelsQuery = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("max-keys ")(`max-keys `.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsQuery]
  }
}

