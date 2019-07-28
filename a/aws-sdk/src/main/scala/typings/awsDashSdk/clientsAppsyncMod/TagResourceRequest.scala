package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The GraphqlApi ARN.
    */
  var resourceArn: ResourceArn
  /**
    * A TagMap object.
    */
  var tags: TagMap
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: ResourceArn, tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

