package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS RoboMaker resource you are tagging.
    */
  var resourceArn: Arn
  /**
    * A map that contains tag keys and tag values that are attached to the resource.
    */
  var tags: TagMap
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: Arn, tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

