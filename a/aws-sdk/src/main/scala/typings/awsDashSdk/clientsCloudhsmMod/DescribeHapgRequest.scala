package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHapgRequest extends js.Object {
  /**
    * The ARN of the high-availability partition group to describe.
    */
  var HapgArn: typings.awsDashSdk.clientsCloudhsmMod.HapgArn = js.native
}

object DescribeHapgRequest {
  @scala.inline
  def apply(HapgArn: HapgArn): DescribeHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeHapgRequest]
  }
}

