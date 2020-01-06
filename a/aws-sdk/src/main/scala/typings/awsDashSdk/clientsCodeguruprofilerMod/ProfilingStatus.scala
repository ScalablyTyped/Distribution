package typings.awsDashSdk.clientsCodeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilingStatus extends js.Object {
  /**
    * Timestamp of when the last interaction of the agent with configureAgent API for orchestration.
    */
  var latestAgentOrchestratedAt: js.UndefOr[Timestamp] = js.native
  /**
    * Timestamp of when the latest agent profile was successfully reported.
    */
  var latestAgentProfileReportedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The time range of latest aggregated profile available.
    */
  var latestAggregatedProfile: js.UndefOr[AggregatedProfileTime] = js.native
}

object ProfilingStatus {
  @scala.inline
  def apply(
    latestAgentOrchestratedAt: Timestamp = null,
    latestAgentProfileReportedAt: Timestamp = null,
    latestAggregatedProfile: AggregatedProfileTime = null
  ): ProfilingStatus = {
    val __obj = js.Dynamic.literal()
    if (latestAgentOrchestratedAt != null) __obj.updateDynamic("latestAgentOrchestratedAt")(latestAgentOrchestratedAt.asInstanceOf[js.Any])
    if (latestAgentProfileReportedAt != null) __obj.updateDynamic("latestAgentProfileReportedAt")(latestAgentProfileReportedAt.asInstanceOf[js.Any])
    if (latestAggregatedProfile != null) __obj.updateDynamic("latestAggregatedProfile")(latestAggregatedProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingStatus]
  }
}

