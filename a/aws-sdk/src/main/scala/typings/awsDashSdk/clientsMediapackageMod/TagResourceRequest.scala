package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  var ResourceArn: __string
  var Tags: __mapOf__string
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, Tags: __mapOf__string): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

