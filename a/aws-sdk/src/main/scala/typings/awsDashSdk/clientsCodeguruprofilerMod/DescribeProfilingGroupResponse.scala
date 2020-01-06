package typings.awsDashSdk.clientsCodeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProfilingGroupResponse extends js.Object {
  var profilingGroup: ProfilingGroupDescription = js.native
}

object DescribeProfilingGroupResponse {
  @scala.inline
  def apply(profilingGroup: ProfilingGroupDescription): DescribeProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeProfilingGroupResponse]
  }
}

