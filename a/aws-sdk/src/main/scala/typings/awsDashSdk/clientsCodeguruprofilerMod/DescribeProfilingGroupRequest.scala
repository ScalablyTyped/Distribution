package typings.awsDashSdk.clientsCodeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProfilingGroupRequest extends js.Object {
  var profilingGroupName: ProfilingGroupName = js.native
}

object DescribeProfilingGroupRequest {
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): DescribeProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeProfilingGroupRequest]
  }
}

