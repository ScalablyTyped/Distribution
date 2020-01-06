package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventSourceRequest extends js.Object {
  /**
    * The name of the partner event source to display the details of.
    */
  var Name: EventSourceName = js.native
}

object DescribeEventSourceRequest {
  @scala.inline
  def apply(Name: EventSourceName): DescribeEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeEventSourceRequest]
  }
}

