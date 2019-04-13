package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait M2tsSettings extends js.Object {
  /**
    * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
    */
  var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.undefined
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Specify the packet identifiers (PIDs) for any elementary audio streams you include in this output. Specify multiple PIDs as a JSON array. Default is the range 482-492.
    */
  var AudioPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined
  /**
    * Specify the output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
    */
  var Bitrate: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex  buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
    */
  var BufferModel: js.UndefOr[M2tsBufferModel] = js.undefined
  /**
    * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
    */
  var DvbNitSettings: js.UndefOr[DvbNitSettings] = js.undefined
  /**
    * Inserts DVB Service Description Table (NIT) at the specified table repetition interval.
    */
  var DvbSdtSettings: js.UndefOr[DvbSdtSettings] = js.undefined
  /**
    * Specify the packet identifiers (PIDs) for DVB subtitle data included in this output. Specify multiple PIDs as a JSON array. Default is the range 460-479.
    */
  var DvbSubPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined
  /**
    * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
    */
  var DvbTdtSettings: js.UndefOr[DvbTdtSettings] = js.undefined
  /**
    * Specify the packet identifier (PID) for DVB teletext data you include in this output. Default is 499.
    */
  var DvbTeletextPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  var EbpAudioInterval: js.UndefOr[M2tsEbpAudioInterval] = js.undefined
  /**
    * Selects which PIDs to place EBP markers on. They can either be placed only on the video PID, or on both the video PID and all audio PIDs. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  var EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.undefined
  /**
    * Controls whether to include the ES Rate field in the PES header.
    */
  var EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.undefined
  /**
    * Keep the default value (DEFAULT) unless you know that your audio EBP markers are incorrectly appearing before your video EBP markers. To correct this problem, set this value to Force (FORCE).
    */
  var ForceTsVideoEbpOrder: js.UndefOr[M2tsForceTsVideoEbpOrder] = js.undefined
  /**
    * The length, in seconds, of each fragment. Only used with EBP markers.
    */
  var FragmentTime: js.UndefOr[__doubleMin0] = js.undefined
  /**
    * Specify the maximum time, in milliseconds, between Program Clock References (PCRs) inserted into the transport stream.
    */
  var MaxPcrInterval: js.UndefOr[__integerMin0Max500] = js.undefined
  /**
    * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by looking ahead at input video. If another EBP is going to come in within the specified time interval, the current EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead accurate.
    */
  var MinEbpInterval: js.UndefOr[__integerMin0Max10000] = js.undefined
  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3: js.UndefOr[M2tsNielsenId3] = js.undefined
  /**
    * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a downstream encryption system requires periodic null packets.
    */
  var NullPacketBitrate: js.UndefOr[__doubleMin0] = js.undefined
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
  /**
    * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M2tsPcrControl] = js.undefined
  /**
    * Specify the packet identifier (PID) for the program clock reference (PCR) in this output. If you do not specify a value, the service will use the value for Video PID (VideoPid).
    */
  var PcrPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * Specify the number of milliseconds between instances of the program map table (PMT) in the output transport stream.
    */
  var PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
  /**
    * Specify the packet identifier (PID) for the program map table (PMT) itself. Default is 480.
    */
  var PmtPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * Specify the packet identifier (PID) of the private metadata stream. Default is 503.
    */
  var PrivateMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * Use Program number (programNumber) to specify the program number used in the program map table (PMT) for this output. Default is 1. Program numbers and program map tables are parts of MPEG-2 transport stream containers, used for organizing data.
    */
  var ProgramNumber: js.UndefOr[__integerMin0Max65535] = js.undefined
  /**
    * When set to CBR, inserts null packets into transport stream to fill specified bitrate. When set to VBR, the bitrate setting acts as the maximum bitrate, but the output will not be padded up to that bitrate.
    */
  var RateMode: js.UndefOr[M2tsRateMode] = js.undefined
  /**
    * Include this in your job settings to put SCTE-35 markers in your HLS and transport stream outputs at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  var Scte35Esam: js.UndefOr[M2tsScte35Esam] = js.undefined
  /**
    * Specify the packet identifier (PID) of the SCTE-35 stream in the transport stream.
    */
  var Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
    */
  var Scte35Source: js.UndefOr[M2tsScte35Source] = js.undefined
  /**
    * Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
    */
  var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.undefined
  /**
    * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted. When a segmentation style of "reset_cadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of of $segmentation_time seconds. When a segmentation style of "maintain_cadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of $segmentation_time seconds. Note that EBP lookahead is a slight exception to this rule.
    */
  var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.undefined
  /**
    * Specify the length, in seconds, of each segment. Required unless markers is set to _none_.
    */
  var SegmentationTime: js.UndefOr[__doubleMin0] = js.undefined
  /**
    * Specify the packet identifier (PID) for timed metadata in this output. Default is 502.
    */
  var TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * Specify the ID for the transport stream itself in the program map table for this output. Transport stream IDs and program map tables are parts of MPEG-2 transport stream containers, used for organizing data.
    */
  var TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined
  /**
    * Specify the packet identifier (PID) of the elementary video stream in the transport stream.
    */
  var VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined
}

object M2tsSettings {
  @scala.inline
  def apply(
    AudioBufferModel: M2tsAudioBufferModel = null,
    AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    AudioPids: __listOf__integerMin32Max8182 = null,
    Bitrate: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    BufferModel: M2tsBufferModel = null,
    DvbNitSettings: DvbNitSettings = null,
    DvbSdtSettings: DvbSdtSettings = null,
    DvbSubPids: __listOf__integerMin32Max8182 = null,
    DvbTdtSettings: DvbTdtSettings = null,
    DvbTeletextPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    EbpAudioInterval: M2tsEbpAudioInterval = null,
    EbpPlacement: M2tsEbpPlacement = null,
    EsRateInPes: M2tsEsRateInPes = null,
    ForceTsVideoEbpOrder: M2tsForceTsVideoEbpOrder = null,
    FragmentTime: js.UndefOr[__doubleMin0] = js.undefined,
    MaxPcrInterval: js.UndefOr[__integerMin0Max500] = js.undefined,
    MinEbpInterval: js.UndefOr[__integerMin0Max10000] = js.undefined,
    NielsenId3: M2tsNielsenId3 = null,
    NullPacketBitrate: js.UndefOr[__doubleMin0] = js.undefined,
    PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
    PcrControl: M2tsPcrControl = null,
    PcrPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
    PmtPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    PrivateMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    ProgramNumber: js.UndefOr[__integerMin0Max65535] = js.undefined,
    RateMode: M2tsRateMode = null,
    Scte35Esam: M2tsScte35Esam = null,
    Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    Scte35Source: M2tsScte35Source = null,
    SegmentationMarkers: M2tsSegmentationMarkers = null,
    SegmentationStyle: M2tsSegmentationStyle = null,
    SegmentationTime: js.UndefOr[__doubleMin0] = js.undefined,
    TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined,
    VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  ): M2tsSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioBufferModel != null) __obj.updateDynamic("AudioBufferModel")(AudioBufferModel.asInstanceOf[js.Any])
    if (!js.isUndefined(AudioFramesPerPes)) __obj.updateDynamic("AudioFramesPerPes")(AudioFramesPerPes)
    if (AudioPids != null) __obj.updateDynamic("AudioPids")(AudioPids)
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate)
    if (BufferModel != null) __obj.updateDynamic("BufferModel")(BufferModel.asInstanceOf[js.Any])
    if (DvbNitSettings != null) __obj.updateDynamic("DvbNitSettings")(DvbNitSettings)
    if (DvbSdtSettings != null) __obj.updateDynamic("DvbSdtSettings")(DvbSdtSettings)
    if (DvbSubPids != null) __obj.updateDynamic("DvbSubPids")(DvbSubPids)
    if (DvbTdtSettings != null) __obj.updateDynamic("DvbTdtSettings")(DvbTdtSettings)
    if (!js.isUndefined(DvbTeletextPid)) __obj.updateDynamic("DvbTeletextPid")(DvbTeletextPid)
    if (EbpAudioInterval != null) __obj.updateDynamic("EbpAudioInterval")(EbpAudioInterval.asInstanceOf[js.Any])
    if (EbpPlacement != null) __obj.updateDynamic("EbpPlacement")(EbpPlacement.asInstanceOf[js.Any])
    if (EsRateInPes != null) __obj.updateDynamic("EsRateInPes")(EsRateInPes.asInstanceOf[js.Any])
    if (ForceTsVideoEbpOrder != null) __obj.updateDynamic("ForceTsVideoEbpOrder")(ForceTsVideoEbpOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(FragmentTime)) __obj.updateDynamic("FragmentTime")(FragmentTime)
    if (!js.isUndefined(MaxPcrInterval)) __obj.updateDynamic("MaxPcrInterval")(MaxPcrInterval)
    if (!js.isUndefined(MinEbpInterval)) __obj.updateDynamic("MinEbpInterval")(MinEbpInterval)
    if (NielsenId3 != null) __obj.updateDynamic("NielsenId3")(NielsenId3.asInstanceOf[js.Any])
    if (!js.isUndefined(NullPacketBitrate)) __obj.updateDynamic("NullPacketBitrate")(NullPacketBitrate)
    if (!js.isUndefined(PatInterval)) __obj.updateDynamic("PatInterval")(PatInterval)
    if (PcrControl != null) __obj.updateDynamic("PcrControl")(PcrControl.asInstanceOf[js.Any])
    if (!js.isUndefined(PcrPid)) __obj.updateDynamic("PcrPid")(PcrPid)
    if (!js.isUndefined(PmtInterval)) __obj.updateDynamic("PmtInterval")(PmtInterval)
    if (!js.isUndefined(PmtPid)) __obj.updateDynamic("PmtPid")(PmtPid)
    if (!js.isUndefined(PrivateMetadataPid)) __obj.updateDynamic("PrivateMetadataPid")(PrivateMetadataPid)
    if (!js.isUndefined(ProgramNumber)) __obj.updateDynamic("ProgramNumber")(ProgramNumber)
    if (RateMode != null) __obj.updateDynamic("RateMode")(RateMode.asInstanceOf[js.Any])
    if (Scte35Esam != null) __obj.updateDynamic("Scte35Esam")(Scte35Esam)
    if (!js.isUndefined(Scte35Pid)) __obj.updateDynamic("Scte35Pid")(Scte35Pid)
    if (Scte35Source != null) __obj.updateDynamic("Scte35Source")(Scte35Source.asInstanceOf[js.Any])
    if (SegmentationMarkers != null) __obj.updateDynamic("SegmentationMarkers")(SegmentationMarkers.asInstanceOf[js.Any])
    if (SegmentationStyle != null) __obj.updateDynamic("SegmentationStyle")(SegmentationStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentationTime)) __obj.updateDynamic("SegmentationTime")(SegmentationTime)
    if (!js.isUndefined(TimedMetadataPid)) __obj.updateDynamic("TimedMetadataPid")(TimedMetadataPid)
    if (!js.isUndefined(TransportStreamId)) __obj.updateDynamic("TransportStreamId")(TransportStreamId)
    if (!js.isUndefined(VideoPid)) __obj.updateDynamic("VideoPid")(VideoPid)
    __obj.asInstanceOf[M2tsSettings]
  }
}

