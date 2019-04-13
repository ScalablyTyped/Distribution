package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeChannelRequest extends js.Object {
  /**
    * The ID of a Channel.
    */
  var Id: __string
}

object DescribeChannelRequest {
  @scala.inline
  def apply(Id: __string): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DescribeChannelRequest]
  }
}

