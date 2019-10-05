package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceSummary extends js.Object {
  /**
    * Annotations from the trace's segment documents.
    */
  var Annotations: js.UndefOr[typings.awsDashSdk.clientsXrayMod.Annotations] = js.undefined
  /**
    * A list of availability zones for any zone corresponding to the trace segments.
    */
  var AvailabilityZones: js.UndefOr[TraceAvailabilityZones] = js.undefined
  /**
    * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
    */
  var Duration: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The root of a trace.
    */
  var EntryPoint: js.UndefOr[ServiceId] = js.undefined
  /**
    * A collection of ErrorRootCause structures corresponding to the trace segments.
    */
  var ErrorRootCauses: js.UndefOr[typings.awsDashSdk.clientsXrayMod.ErrorRootCauses] = js.undefined
  /**
    * A collection of FaultRootCause structures corresponding to the the trace segments.
    */
  var FaultRootCauses: js.UndefOr[typings.awsDashSdk.clientsXrayMod.FaultRootCauses] = js.undefined
  /**
    * One or more of the segment documents has a 400 series error.
    */
  var HasError: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * One or more of the segment documents has a 500 series error.
    */
  var HasFault: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * One or more of the segment documents has a 429 throttling error.
    */
  var HasThrottle: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Information about the HTTP request served by the trace.
    */
  var Http: js.UndefOr[typings.awsDashSdk.clientsXrayMod.Http] = js.undefined
  /**
    * The unique identifier for the request that generated the trace's segments and subsegments.
    */
  var Id: js.UndefOr[TraceId] = js.undefined
  /**
    * A list of EC2 instance IDs for any instance corresponding to the trace segments.
    */
  var InstanceIds: js.UndefOr[TraceInstanceIds] = js.undefined
  /**
    * One or more of the segment documents is in progress.
    */
  var IsPartial: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * The matched time stamp of a defined event.
    */
  var MatchedEventTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * A list of resource ARNs for any resource corresponding to the trace segments.
    */
  var ResourceARNs: js.UndefOr[TraceResourceARNs] = js.undefined
  /**
    * The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.
    */
  var ResponseTime: js.UndefOr[NullableDouble] = js.undefined
  /**
    * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
    */
  var ResponseTimeRootCauses: js.UndefOr[typings.awsDashSdk.clientsXrayMod.ResponseTimeRootCauses] = js.undefined
  /**
    * The revision number of a trace.
    */
  var Revision: js.UndefOr[Integer] = js.undefined
  /**
    * Service IDs from the trace's segment documents.
    */
  var ServiceIds: js.UndefOr[typings.awsDashSdk.clientsXrayMod.ServiceIds] = js.undefined
  /**
    * Users from the trace's segment documents.
    */
  var Users: js.UndefOr[TraceUsers] = js.undefined
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
    if (Annotations != null) __obj.updateDynamic("Annotations")(Annotations)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (EntryPoint != null) __obj.updateDynamic("EntryPoint")(EntryPoint)
    if (ErrorRootCauses != null) __obj.updateDynamic("ErrorRootCauses")(ErrorRootCauses)
    if (FaultRootCauses != null) __obj.updateDynamic("FaultRootCauses")(FaultRootCauses)
    if (!js.isUndefined(HasError)) __obj.updateDynamic("HasError")(HasError)
    if (!js.isUndefined(HasFault)) __obj.updateDynamic("HasFault")(HasFault)
    if (!js.isUndefined(HasThrottle)) __obj.updateDynamic("HasThrottle")(HasThrottle)
    if (Http != null) __obj.updateDynamic("Http")(Http)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    if (!js.isUndefined(IsPartial)) __obj.updateDynamic("IsPartial")(IsPartial)
    if (MatchedEventTime != null) __obj.updateDynamic("MatchedEventTime")(MatchedEventTime)
    if (ResourceARNs != null) __obj.updateDynamic("ResourceARNs")(ResourceARNs)
    if (ResponseTime != null) __obj.updateDynamic("ResponseTime")(ResponseTime.asInstanceOf[js.Any])
    if (ResponseTimeRootCauses != null) __obj.updateDynamic("ResponseTimeRootCauses")(ResponseTimeRootCauses)
    if (Revision != null) __obj.updateDynamic("Revision")(Revision.asInstanceOf[js.Any])
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[TraceSummary]
  }
}

