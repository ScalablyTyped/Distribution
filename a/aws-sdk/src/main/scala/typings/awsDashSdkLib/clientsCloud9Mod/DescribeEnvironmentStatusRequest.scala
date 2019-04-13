package typings
package awsDashSdkLib.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentStatusRequest extends js.Object {
  /**
    * The ID of the environment to get status information about.
    */
  var environmentId: EnvironmentId
}

object DescribeEnvironmentStatusRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId): DescribeEnvironmentStatusRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId)
  
    __obj.asInstanceOf[DescribeEnvironmentStatusRequest]
  }
}

