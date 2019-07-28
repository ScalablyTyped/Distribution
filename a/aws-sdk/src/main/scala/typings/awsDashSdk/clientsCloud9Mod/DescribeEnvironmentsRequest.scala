package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentsRequest extends js.Object {
  /**
    * The IDs of individual environments to get information about.
    */
  var environmentIds: BoundedEnvironmentIdList
}

object DescribeEnvironmentsRequest {
  @scala.inline
  def apply(environmentIds: BoundedEnvironmentIdList): DescribeEnvironmentsRequest = {
    val __obj = js.Dynamic.literal(environmentIds = environmentIds)
  
    __obj.asInstanceOf[DescribeEnvironmentsRequest]
  }
}

