package typings.awsDashSdk.clientsCodeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProfilingGroupRequest extends js.Object {
  var profilingGroupName: ProfilingGroupName = js.native
}

object DeleteProfilingGroupRequest {
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): DeleteProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteProfilingGroupRequest]
  }
}

