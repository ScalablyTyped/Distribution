package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePartnerEventSourceRequest extends js.Object {
  /**
    * The name of the event source to display.
    */
  var Name: EventSourceName
}

object DescribePartnerEventSourceRequest {
  @scala.inline
  def apply(Name: EventSourceName): DescribePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DescribePartnerEventSourceRequest]
  }
}

