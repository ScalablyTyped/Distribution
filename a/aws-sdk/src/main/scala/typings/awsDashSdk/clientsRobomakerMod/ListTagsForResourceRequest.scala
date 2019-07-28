package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The AWS RoboMaker Amazon Resource Name (ARN) with tags to be listed.
    */
  var resourceArn: Arn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(resourceArn: Arn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

