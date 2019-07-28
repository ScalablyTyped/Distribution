package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOfferingRequest extends js.Object {
  /**
    * Unique offering ID, e.g. '87654321'
    */
  var OfferingId: __string
}

object DescribeOfferingRequest {
  @scala.inline
  def apply(OfferingId: __string): DescribeOfferingRequest = {
    val __obj = js.Dynamic.literal(OfferingId = OfferingId)
  
    __obj.asInstanceOf[DescribeOfferingRequest]
  }
}

