package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsRequest extends js.Object {
  /**
    * The Amazon Resource Names (ARNs) of the resources.
    */
  var resourceArns: ResourceArnList
}

object DescribeTagsRequest {
  @scala.inline
  def apply(resourceArns: ResourceArnList): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal(resourceArns = resourceArns)
  
    __obj.asInstanceOf[DescribeTagsRequest]
  }
}

