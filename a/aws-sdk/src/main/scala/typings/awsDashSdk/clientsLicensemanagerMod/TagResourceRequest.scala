package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * Resource of the ARN to be tagged.
    */
  var ResourceArn: String
  /**
    * Names of the tags to attach to the resource.
    */
  var Tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: String, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

