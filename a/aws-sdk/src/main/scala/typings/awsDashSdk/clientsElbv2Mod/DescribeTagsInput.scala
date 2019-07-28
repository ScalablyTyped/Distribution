package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsInput extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var ResourceArns: typings.awsDashSdk.clientsElbv2Mod.ResourceArns
}

object DescribeTagsInput {
  @scala.inline
  def apply(ResourceArns: ResourceArns): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns)
  
    __obj.asInstanceOf[DescribeTagsInput]
  }
}

