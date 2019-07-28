package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsRequest extends js.Object {
  /**
    *  Specify the ARN for the Elasticsearch domain to which the tags are attached that you want to view.
    */
  var ARN: typings.awsDashSdk.clientsEsMod.ARN
}

object ListTagsRequest {
  @scala.inline
  def apply(ARN: ARN): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN)
  
    __obj.asInstanceOf[ListTagsRequest]
  }
}

