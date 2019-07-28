package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsSmoothGroupSettings extends js.Object {
  /**
    * The value of the "Acquisition Point Identity" element used in each message placed in the sparse track.  Only enabled if sparseTrackType is not "none".
    */
  var AcquisitionPointId: js.UndefOr[__string] = js.undefined
  /**
    * If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the current timecode. This option does not write timecodes to the audio elementary stream.
    */
  var AudioOnlyTimecodeControl: js.UndefOr[SmoothGroupAudioOnlyTimecodeControl] = js.undefined
  /**
    * If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA).  This will cause https outputs to self-signed certificates to fail.
    */
  var CertificateMode: js.UndefOr[SmoothGroupCertificateMode] = js.undefined
  /**
    * Number of seconds to wait before retrying connection to the IIS server if the connection is lost. Content will be cached during this time and the cache will be be delivered to the IIS server once the connection is re-established.
    */
  var ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined
  /**
    * Smooth Streaming publish point on an IIS server. Elemental Live acts as a "Push" encoder to IIS.
    */
  var Destination: OutputLocationRef
  /**
    * MS Smooth event ID to be sent to the IIS server.
  Should only be specified if eventIdMode is set to useConfigured.
    */
  var EventId: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live Event is used without changing the publishing point, clients might see cached video from the previous run.
  Options:
  - "useConfigured" - use the value provided in eventId
  - "useTimestamp" - generate and send an event ID based on the current timestamp
  - "noEventId" - do not send an event ID to the IIS server.
    */
  var EventIdMode: js.UndefOr[SmoothGroupEventIdMode] = js.undefined
  /**
    * When set to sendEos, send EOS signal to IIS server when stopping the event
    */
  var EventStopBehavior: js.UndefOr[SmoothGroupEventStopBehavior] = js.undefined
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[__integerMin0] = js.undefined
  /**
    * Length of mp4 fragments to generate (in seconds). Fragment length must be compatible with GOP size and framerate.
    */
  var FragmentLength: js.UndefOr[__integerMin1] = js.undefined
  /**
    * Parameter that control output group behavior on input loss.
    */
  var InputLossAction: js.UndefOr[InputLossActionForMsSmoothOut] = js.undefined
  /**
    * Number of retry attempts.
    */
  var NumRetries: js.UndefOr[__integerMin0] = js.undefined
  /**
    * Number of seconds before initiating a restart due to output failure, due to exhausting the numRetries on one segment, or exceeding filecacheDuration.
    */
  var RestartDelay: js.UndefOr[__integerMin0] = js.undefined
  /**
    * useInputSegmentation has been deprecated. The configured segment size is always used.
    */
  var SegmentationMode: js.UndefOr[SmoothGroupSegmentationMode] = js.undefined
  /**
    * Number of milliseconds to delay the output from the second pipeline.
    */
  var SendDelayMs: js.UndefOr[__integerMin0Max10000] = js.undefined
  /**
    * If set to scte35, use incoming SCTE-35 messages to generate a sparse track in this group of MS-Smooth outputs.
    */
  var SparseTrackType: js.UndefOr[SmoothGroupSparseTrackType] = js.undefined
  /**
    * When set to send, send stream manifest so publishing point doesn't start until all streams start.
    */
  var StreamManifestBehavior: js.UndefOr[SmoothGroupStreamManifestBehavior] = js.undefined
  /**
    * Timestamp offset for the event.  Only used if timestampOffsetMode is set to useConfiguredOffset.
    */
  var TimestampOffset: js.UndefOr[__string] = js.undefined
  /**
    * Type of timestamp date offset to use.
  - useEventStartDate: Use the date the event was started as the offset
  - useConfiguredOffset: Use an explicitly configured date as the offset
    */
  var TimestampOffsetMode: js.UndefOr[SmoothGroupTimestampOffsetMode] = js.undefined
}

object MsSmoothGroupSettings {
  @scala.inline
  def apply(
    Destination: OutputLocationRef,
    AcquisitionPointId: __string = null,
    AudioOnlyTimecodeControl: SmoothGroupAudioOnlyTimecodeControl = null,
    CertificateMode: SmoothGroupCertificateMode = null,
    ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined,
    EventId: __string = null,
    EventIdMode: SmoothGroupEventIdMode = null,
    EventStopBehavior: SmoothGroupEventStopBehavior = null,
    FilecacheDuration: js.UndefOr[__integerMin0] = js.undefined,
    FragmentLength: js.UndefOr[__integerMin1] = js.undefined,
    InputLossAction: InputLossActionForMsSmoothOut = null,
    NumRetries: js.UndefOr[__integerMin0] = js.undefined,
    RestartDelay: js.UndefOr[__integerMin0] = js.undefined,
    SegmentationMode: SmoothGroupSegmentationMode = null,
    SendDelayMs: js.UndefOr[__integerMin0Max10000] = js.undefined,
    SparseTrackType: SmoothGroupSparseTrackType = null,
    StreamManifestBehavior: SmoothGroupStreamManifestBehavior = null,
    TimestampOffset: __string = null,
    TimestampOffsetMode: SmoothGroupTimestampOffsetMode = null
  ): MsSmoothGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination)
    if (AcquisitionPointId != null) __obj.updateDynamic("AcquisitionPointId")(AcquisitionPointId)
    if (AudioOnlyTimecodeControl != null) __obj.updateDynamic("AudioOnlyTimecodeControl")(AudioOnlyTimecodeControl.asInstanceOf[js.Any])
    if (CertificateMode != null) __obj.updateDynamic("CertificateMode")(CertificateMode.asInstanceOf[js.Any])
    if (!js.isUndefined(ConnectionRetryInterval)) __obj.updateDynamic("ConnectionRetryInterval")(ConnectionRetryInterval)
    if (EventId != null) __obj.updateDynamic("EventId")(EventId)
    if (EventIdMode != null) __obj.updateDynamic("EventIdMode")(EventIdMode.asInstanceOf[js.Any])
    if (EventStopBehavior != null) __obj.updateDynamic("EventStopBehavior")(EventStopBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(FilecacheDuration)) __obj.updateDynamic("FilecacheDuration")(FilecacheDuration)
    if (!js.isUndefined(FragmentLength)) __obj.updateDynamic("FragmentLength")(FragmentLength)
    if (InputLossAction != null) __obj.updateDynamic("InputLossAction")(InputLossAction.asInstanceOf[js.Any])
    if (!js.isUndefined(NumRetries)) __obj.updateDynamic("NumRetries")(NumRetries)
    if (!js.isUndefined(RestartDelay)) __obj.updateDynamic("RestartDelay")(RestartDelay)
    if (SegmentationMode != null) __obj.updateDynamic("SegmentationMode")(SegmentationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(SendDelayMs)) __obj.updateDynamic("SendDelayMs")(SendDelayMs)
    if (SparseTrackType != null) __obj.updateDynamic("SparseTrackType")(SparseTrackType.asInstanceOf[js.Any])
    if (StreamManifestBehavior != null) __obj.updateDynamic("StreamManifestBehavior")(StreamManifestBehavior.asInstanceOf[js.Any])
    if (TimestampOffset != null) __obj.updateDynamic("TimestampOffset")(TimestampOffset)
    if (TimestampOffsetMode != null) __obj.updateDynamic("TimestampOffsetMode")(TimestampOffsetMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSmoothGroupSettings]
  }
}

