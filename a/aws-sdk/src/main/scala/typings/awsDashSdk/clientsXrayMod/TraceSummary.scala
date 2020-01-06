package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceSummary extends js.Object {
  /**
    * Annotations from the trace's segment documents.
    */
  var Annotations: js.UndefOr[typings.awsDashSdk.clientsXrayMod.Annotations] = js.native
  /**
    * A list of availability zones for any zone corresponding to the trace segments.
    */
  var AvailabilityZones: js.UndefOr[TraceAvailabilityZones] = js.native
  /**
    * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
    */
  var Duration: js.UndefOr[NullableDouble] = js.native
  /**
    * The root of a trace.
    */
  var EntryPoint: js.UndefOr[ServiceId] = js.native
  /**
    * A collection of ErrorRootCause structures corresponding to the trace segments.
    */
  var ErrorRootCauses: js.UndefOr[typings.awsDashSdk.clientsXrayMod.ErrorRootCauses] = js.native
  /**
    * A collection of FaultRootCause structures corresponding to the the trace segments.
    */
  var FaultRootCauses: js.UndefOr[typings.awsDashSdk.clientsXrayMod.FaultRootCauses] = js.native
  /**
    * One or more of the segment documents has a 400 series error.
    */
  var HasError: js.UndefOr[NullableBoolean] = js.native
  /**
    * One or more of the segment documents has a 500 series error.
    */
  var HasFault: js.UndefOr[NullableBoolean] = js.native
  /**
    * One or more of the segment documents has a 429 throttling error.
    */
  var HasThrottle: js.UndefOr[NullableBoolean] = js.native
  /**
    * Information about the HTTP request served by the trace.
    */
  var Http: js.UndefOr[typings.awsDashSdk.clientsXrayMod.Http] = js.native
  /**
    * The unique identifier for the request that generated the trace's segments and subsegments.
    */
  var Id: js.UndefOr[TraceId] = js.native
  /**
    * A list of EC2 instance IDs for any instance corresponding to the trace segments.
    */
  var InstanceIds: js.UndefOr[TraceInstanceIds] = js.native
  /**
    * One or more of the segment documents is in progress.
    */
  var IsPartial: js.UndefOr[NullableBoolean] = js.native
  /**
    * The matched time stamp of a defined event.
    */
  var MatchedEventTime: js.UndefOr[Timestamp] = js.native
  /**
    * A list of resource ARNs for any resource corresponding to the trace segments.
    */
  var ResourceARNs: js.UndefOr[TraceResourceARNs] = js.native
  /**
    * The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.
    */
  var ResponseTime: js.UndefOr[NullableDouble] = js.native
  /**
    * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
    */
  var ResponseTimeRootCauses: js.UndefOr[typings.awsDashSdk.clientsXrayMod.ResponseTimeRootCauses] = js.native
  /**
    * The revision number of a trace.
    */
  var Revision: js.UndefOr[Integer] = js.native
  /**
    * Service IDs from the trace's segment documents.
    */
  var ServiceIds: js.UndefOr[typings.awsDashSdk.clientsXrayMod.ServiceIds] = js.native
  /**
    * Users from the trace's segment documents.
    */
  var Users: js.UndefOr[TraceUsers] = js.native
}

object TraceSummary {
  @scala.inline
  def apply(
    Annotations: Annotations = null,
    AvailabilityZones: TraceAvailabilityZones = null,
    Duration: Int | scala.Double = null,
    EntryPoint: ServiceId = null,
    ErrorRootCauses: ErrorRootCauses = null,
    FaultRootCauses: FaultRootCauses = null,
    HasError: js.UndefOr[scala.Boolean] = js.undefined,
    HasFault: js.UndefOr[scala.Boolean] = js.undefined,
    HasThrottle: js.UndefOr[scala.Boolean] = js.undefined,
    Http: Http = null,
    Id: TraceId = null,
    InstanceIds: TraceInstanceIds = null,
    IsPartial: js.UndefOr[scala.Boolean] = js.undefined,
    MatchedEventTime: Timestamp = null,
    ResourceARNs: TraceResourceARNs = null,
    ResponseTime: Int | scala.Double = null,
    ResponseTimeRootCauses: ResponseTimeRootCauses = null,
    Revision: Int | scala.Double = null,
    ServiceIds: ServiceIds = null,
    Users: TraceUsers = null
  ): TraceSummary = {
    val __obj = js.Dynamic.literal()
    if (Annotations != null) __obj.updateDynamic("Annotations")(Annotations.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (EntryPoint != null) __obj.updateDynamic("EntryPoint")(EntryPoint.asInstanceOf[js.Any])
    if (ErrorRootCauses != null) __obj.updateDynamic("ErrorRootCauses")(ErrorRootCauses.asInstanceOf[js.Any])
    if (FaultRootCauses != null) __obj.updateDynamic("FaultRootCauses")(FaultRootCauses.asInstanceOf[js.Any])
    if (!js.isUndefined(HasError)) __obj.updateDynamic("HasError")(HasError.asInstanceOf[js.Any])
    if (!js.isUndefined(HasFault)) __obj.updateDynamic("HasFault")(HasFault.asInstanceOf[js.Any])
    if (!js.isUndefined(HasThrottle)) __obj.updateDynamic("HasThrottle")(HasThrottle.asInstanceOf[js.Any])
    if (Http != null) __obj.updateDynamic("Http")(Http.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds.asInstanceOf[js.Any])
    if (!js.isUndefined(IsPartial)) __obj.updateDynamic("IsPartial")(IsPartial.asInstanceOf[js.Any])
    if (MatchedEventTime != null) __obj.updateDynamic("MatchedEventTime")(MatchedEventTime.asInstanceOf[js.Any])
    if (ResourceARNs != null) __obj.updateDynamic("ResourceARNs")(ResourceARNs.asInstanceOf[js.Any])
    if (ResponseTime != null) __obj.updateDynamic("ResponseTime")(ResponseTime.asInstanceOf[js.Any])
    if (ResponseTimeRootCauses != null) __obj.updateDynamic("ResponseTimeRootCauses")(ResponseTimeRootCauses.asInstanceOf[js.Any])
    if (Revision != null) __obj.updateDynamic("Revision")(Revision.asInstanceOf[js.Any])
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceSummary]
  }
}

