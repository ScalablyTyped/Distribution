package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHapgRequest extends js.Object {
  /**
    * The ARN of the high-availability partition group to describe.
    */
  var HapgArn: typings.awsDashSdk.clientsCloudhsmMod.HapgArn
}

object DescribeHapgRequest {
  @scala.inline
  def apply(HapgArn: HapgArn): DescribeHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn)
  
    __obj.asInstanceOf[DescribeHapgRequest]
  }
}

