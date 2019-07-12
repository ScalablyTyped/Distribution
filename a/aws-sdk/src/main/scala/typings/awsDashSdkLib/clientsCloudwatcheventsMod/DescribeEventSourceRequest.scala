package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventSourceRequest extends js.Object {
  /**
    * The name of the partner event source to display the details of.
    */
  var Name: EventSourceName
}

object DescribeEventSourceRequest {
  @scala.inline
  def apply(Name: EventSourceName): DescribeEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DescribeEventSourceRequest]
  }
}

