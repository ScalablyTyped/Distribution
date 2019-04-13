package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsQuery extends js.Object {
   // the channel id prefix (returns channels with this prefix)
  var marker: java.lang.String
   // the channel id marker (returns channels after this id)
  var `max-keys `: scala.Double
  var prefix: java.lang.String
}

object ListChannelsQuery {
  @scala.inline
  def apply(marker: java.lang.String, `max-keys `: scala.Double, prefix: java.lang.String): ListChannelsQuery = {
    val __obj = js.Dynamic.literal(marker = marker, prefix = prefix)
    __obj.updateDynamic("max-keys ")(`max-keys `)
    __obj.asInstanceOf[ListChannelsQuery]
  }
}

