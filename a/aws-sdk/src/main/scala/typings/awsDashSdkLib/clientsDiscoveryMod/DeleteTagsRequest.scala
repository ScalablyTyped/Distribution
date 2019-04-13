package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagsRequest extends js.Object {
  /**
    * A list of configuration items with tags that you want to delete.
    */
  var configurationIds: ConfigurationIdList
  /**
    * Tags that you want to delete from one or more configuration items. Specify the tags that you want to delete in a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
    */
  var tags: js.UndefOr[TagSet] = js.undefined
}

object DeleteTagsRequest {
  @scala.inline
  def apply(configurationIds: ConfigurationIdList, tags: TagSet = null): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[DeleteTagsRequest]
  }
}

