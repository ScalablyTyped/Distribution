package typings.awsDashSdk.clientsCodeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProfilingGroupsResponse extends js.Object {
  var nextToken: js.UndefOr[PaginationToken] = js.native
  var profilingGroupNames: ProfilingGroupNames = js.native
  var profilingGroups: js.UndefOr[ProfilingGroupDescriptions] = js.native
}

object ListProfilingGroupsResponse {
  @scala.inline
  def apply(
    profilingGroupNames: ProfilingGroupNames,
    nextToken: PaginationToken = null,
    profilingGroups: ProfilingGroupDescriptions = null
  ): ListProfilingGroupsResponse = {
    val __obj = js.Dynamic.literal(profilingGroupNames = profilingGroupNames.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (profilingGroups != null) __obj.updateDynamic("profilingGroups")(profilingGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfilingGroupsResponse]
  }
}

