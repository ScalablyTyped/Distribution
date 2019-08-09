package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeResourceRequest extends js.Object {
  /**
    * The resource ARN.
    */
  var ResourceArn: ResourceArnString
}

object DescribeResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArnString): DescribeResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[DescribeResourceRequest]
  }
}

