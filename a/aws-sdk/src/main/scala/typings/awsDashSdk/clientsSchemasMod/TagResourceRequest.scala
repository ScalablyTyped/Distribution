package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  var ResourceArn: __string = js.native
  var Tags: typings.awsDashSdk.clientsSchemasMod.Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

