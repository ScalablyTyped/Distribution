package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsRequest extends js.Object {
  /**
    *  Specify the ARN for which you want to add the tags.
    */
  var ARN: awsDashSdkLib.clientsEsMod.ARN
  /**
    *  List of Tag that need to be added for the Elasticsearch domain. 
    */
  var TagList: awsDashSdkLib.clientsEsMod.TagList
}

object AddTagsRequest {
  @scala.inline
  def apply(ARN: ARN, TagList: TagList): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN, TagList = TagList)
  
    __obj.asInstanceOf[AddTagsRequest]
  }
}

