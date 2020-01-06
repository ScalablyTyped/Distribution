package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChannelRequest extends js.Object {
  /**
    * The ID of a Channel.
    */
  var Id: __string = js.native
}

object DescribeChannelRequest {
  @scala.inline
  def apply(Id: __string): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeChannelRequest]
  }
}

