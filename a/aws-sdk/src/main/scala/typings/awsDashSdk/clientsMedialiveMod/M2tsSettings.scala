package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait M2tsSettings extends js.Object {
  /**
    * When set to drop, output audio streams will be removed from the program if the selected input audio stream is removed from the input. This allows the output audio configuration to dynamically change based on input configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when not connected to an active input stream.
    */
  var AbsentInputAudioBehavior: js.UndefOr[M2tsAbsentInputAudioBehavior] = js.native
  /**
    * When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
    */
  var Arib: js.UndefOr[M2tsArib] = js.native
  /**
    * Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var AribCaptionsPid: js.UndefOr[__string] = js.native
  /**
    * If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids.  If set to useConfigured, ARIB Captions will be on the configured pid number.
    */
  var AribCaptionsPidControl: js.UndefOr[M2tsAribCaptionsPidControl] = js.native
  /**
    * When set to dvb, uses DVB buffer model for Dolby Digital audio.  When set to atsc, the ATSC model is used.
    */
  var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.native
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[__integerMin0] = js.native
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var AudioPids: js.UndefOr[__string] = js.native
  /**
    * When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses stream type = 0x06.
    */
  var AudioStreamType: js.UndefOr[M2tsAudioStreamType] = js.native
  /**
    * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically determine the appropriate bitrate.
    */
  var Bitrate: js.UndefOr[__integerMin0] = js.native
  /**
    * If set to multiplex, use multiplex buffer model for accurate interleaving.  Setting to bufferModel to none can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
    */
  var BufferModel: js.UndefOr[M2tsBufferModel] = js.native
  /**
    * When set to enabled, generates captionServiceDescriptor in PMT.
    */
  var CcDescriptor: js.UndefOr[M2tsCcDescriptor] = js.native
  /**
    * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
    */
  var DvbNitSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.DvbNitSettings] = js.native
  /**
    * Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
    */
  var DvbSdtSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.DvbSdtSettings] = js.native
  /**
    * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var DvbSubPids: js.UndefOr[__string] = js.native
  /**
    * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
    */
  var DvbTdtSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.DvbTdtSettings] = js.native
  /**
    * Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var DvbTeletextPid: js.UndefOr[__string] = js.native
  /**
    * If set to passthrough, passes any EBIF data from the input source to this output.
    */
  var Ebif: js.UndefOr[M2tsEbifControl] = js.native
  /**
    * When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. Only available when EBP Cablelabs segmentation markers are selected.  Partitions 1 and 2 will always follow the video interval.
    */
  var EbpAudioInterval: js.UndefOr[M2tsAudioInterval] = js.native
  /**
    * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by looking ahead at input video. If another EBP is going to come in within the specified time interval, the current EBP is not emitted, and the segment is "stretched" to the next marker.  The lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead accurate.
    */
  var EbpLookaheadMs: js.UndefOr[__integerMin0Max10000] = js.native
  /**
    * Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the video PID and all audio PIDs.  If set to videoPid, EBP markers will be placed on only the video PID.
    */
  var EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.native
  /**
    * This field is unused and deprecated.
    */
  var EcmPid: js.UndefOr[__string] = js.native
  /**
    * Include or exclude the ES Rate field in the PES header.
    */
  var EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.native
  /**
    * Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var EtvPlatformPid: js.UndefOr[__string] = js.native
  /**
    * Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var EtvSignalPid: js.UndefOr[__string] = js.native
  /**
    * The length in seconds of each fragment. Only used with EBP markers.
    */
  var FragmentTime: js.UndefOr[__doubleMin0] = js.native
  /**
    * If set to passthrough, passes any KLV data from the input source to this output.
    */
  var Klv: js.UndefOr[M2tsKlv] = js.native
  /**
    * Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var KlvDataPids: js.UndefOr[__string] = js.native
  /**
    * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3Behavior: js.UndefOr[M2tsNielsenId3Behavior] = js.native
  /**
    * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a downstream encryption system requires periodic null packets.
    */
  var NullPacketBitrate: js.UndefOr[__doubleMin0] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.  Valid values are 0, 10..1000.
    */
  var PatInterval: js.UndefOr[__integerMin0Max1000] = js.native
  /**
    * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M2tsPcrControl] = js.native
  /**
    * Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
    */
  var PcrPeriod: js.UndefOr[__integerMin0Max500] = js.native
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var PcrPid: js.UndefOr[__string] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0, 10..1000.
    */
  var PmtInterval: js.UndefOr[__integerMin0Max1000] = js.native
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var PmtPid: js.UndefOr[__string] = js.native
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNum: js.UndefOr[__integerMin0Max65535] = js.native
  /**
    * When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate setting acts as the maximum bitrate when vbr is set.
    */
  var RateMode: js.UndefOr[M2tsRateMode] = js.native
  /**
    * Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var Scte27Pids: js.UndefOr[__string] = js.native
  /**
    * Optionally pass SCTE-35 signals from the input source to this output.
    */
  var Scte35Control: js.UndefOr[M2tsScte35Control] = js.native
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var Scte35Pid: js.UndefOr[__string] = js.native
  /**
    * Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator bit in the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data bytes. psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
    */
  var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.native
  /**
    * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted.
  When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of $segmentationTime seconds.
  When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of $segmentationTime seconds. Note that EBP lookahead is a slight exception to this rule.
    */
  var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.native
  /**
    * The length in seconds of each segment. Required unless markers is set to None_.
    */
  var SegmentationTime: js.UndefOr[__doubleMin1] = js.native
  /**
    * When set to passthrough, timed metadata will be passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[M2tsTimedMetadataBehavior] = js.native
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var TimedMetadataPid: js.UndefOr[__string] = js.native
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.native
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var VideoPid: js.UndefOr[__string] = js.native
}

object M2tsSettings {
  @scala.inline
  def apply(
    AbsentInputAudioBehavior: M2tsAbsentInputAudioBehavior = null,
    Arib: M2tsArib = null,
    AribCaptionsPid: __string = null,
    AribCaptionsPidControl: M2tsAribCaptionsPidControl = null,
    AudioBufferModel: M2tsAudioBufferModel = null,
    AudioFramesPerPes: Int | Double = null,
    AudioPids: __string = null,
    AudioStreamType: M2tsAudioStreamType = null,
    Bitrate: Int | Double = null,
    BufferModel: M2tsBufferModel = null,
    CcDescriptor: M2tsCcDescriptor = null,
    DvbNitSettings: DvbNitSettings = null,
    DvbSdtSettings: DvbSdtSettings = null,
    DvbSubPids: __string = null,
    DvbTdtSettings: DvbTdtSettings = null,
    DvbTeletextPid: __string = null,
    Ebif: M2tsEbifControl = null,
    EbpAudioInterval: M2tsAudioInterval = null,
    EbpLookaheadMs: Int | Double = null,
    EbpPlacement: M2tsEbpPlacement = null,
    EcmPid: __string = null,
    EsRateInPes: M2tsEsRateInPes = null,
    EtvPlatformPid: __string = null,
    EtvSignalPid: __string = null,
    FragmentTime: Int | Double = null,
    Klv: M2tsKlv = null,
    KlvDataPids: __string = null,
    NielsenId3Behavior: M2tsNielsenId3Behavior = null,
    NullPacketBitrate: Int | Double = null,
    PatInterval: Int | Double = null,
    PcrControl: M2tsPcrControl = null,
    PcrPeriod: Int | Double = null,
    PcrPid: __string = null,
    PmtInterval: Int | Double = null,
    PmtPid: __string = null,
    ProgramNum: Int | Double = null,
    RateMode: M2tsRateMode = null,
    Scte27Pids: __string = null,
    Scte35Control: M2tsScte35Control = null,
    Scte35Pid: __string = null,
    SegmentationMarkers: M2tsSegmentationMarkers = null,
    SegmentationStyle: M2tsSegmentationStyle = null,
    SegmentationTime: Int | Double = null,
    TimedMetadataBehavior: M2tsTimedMetadataBehavior = null,
    TimedMetadataPid: __string = null,
    TransportStreamId: Int | Double = null,
    VideoPid: __string = null
  ): M2tsSettings = {
    val __obj = js.Dynamic.literal()
    if (AbsentInputAudioBehavior != null) __obj.updateDynamic("AbsentInputAudioBehavior")(AbsentInputAudioBehavior.asInstanceOf[js.Any])
    if (Arib != null) __obj.updateDynamic("Arib")(Arib.asInstanceOf[js.Any])
    if (AribCaptionsPid != null) __obj.updateDynamic("AribCaptionsPid")(AribCaptionsPid.asInstanceOf[js.Any])
    if (AribCaptionsPidControl != null) __obj.updateDynamic("AribCaptionsPidControl")(AribCaptionsPidControl.asInstanceOf[js.Any])
    if (AudioBufferModel != null) __obj.updateDynamic("AudioBufferModel")(AudioBufferModel.asInstanceOf[js.Any])
    if (AudioFramesPerPes != null) __obj.updateDynamic("AudioFramesPerPes")(AudioFramesPerPes.asInstanceOf[js.Any])
    if (AudioPids != null) __obj.updateDynamic("AudioPids")(AudioPids.asInstanceOf[js.Any])
    if (AudioStreamType != null) __obj.updateDynamic("AudioStreamType")(AudioStreamType.asInstanceOf[js.Any])
    if (Bitrate != null) __obj.updateDynamic("Bitrate")(Bitrate.asInstanceOf[js.Any])
    if (BufferModel != null) __obj.updateDynamic("BufferModel")(BufferModel.asInstanceOf[js.Any])
    if (CcDescriptor != null) __obj.updateDynamic("CcDescriptor")(CcDescriptor.asInstanceOf[js.Any])
    if (DvbNitSettings != null) __obj.updateDynamic("DvbNitSettings")(DvbNitSettings.asInstanceOf[js.Any])
    if (DvbSdtSettings != null) __obj.updateDynamic("DvbSdtSettings")(DvbSdtSettings.asInstanceOf[js.Any])
    if (DvbSubPids != null) __obj.updateDynamic("DvbSubPids")(DvbSubPids.asInstanceOf[js.Any])
    if (DvbTdtSettings != null) __obj.updateDynamic("DvbTdtSettings")(DvbTdtSettings.asInstanceOf[js.Any])
    if (DvbTeletextPid != null) __obj.updateDynamic("DvbTeletextPid")(DvbTeletextPid.asInstanceOf[js.Any])
    if (Ebif != null) __obj.updateDynamic("Ebif")(Ebif.asInstanceOf[js.Any])
    if (EbpAudioInterval != null) __obj.updateDynamic("EbpAudioInterval")(EbpAudioInterval.asInstanceOf[js.Any])
    if (EbpLookaheadMs != null) __obj.updateDynamic("EbpLookaheadMs")(EbpLookaheadMs.asInstanceOf[js.Any])
    if (EbpPlacement != null) __obj.updateDynamic("EbpPlacement")(EbpPlacement.asInstanceOf[js.Any])
    if (EcmPid != null) __obj.updateDynamic("EcmPid")(EcmPid.asInstanceOf[js.Any])
    if (EsRateInPes != null) __obj.updateDynamic("EsRateInPes")(EsRateInPes.asInstanceOf[js.Any])
    if (EtvPlatformPid != null) __obj.updateDynamic("EtvPlatformPid")(EtvPlatformPid.asInstanceOf[js.Any])
    if (EtvSignalPid != null) __obj.updateDynamic("EtvSignalPid")(EtvSignalPid.asInstanceOf[js.Any])
    if (FragmentTime != null) __obj.updateDynamic("FragmentTime")(FragmentTime.asInstanceOf[js.Any])
    if (Klv != null) __obj.updateDynamic("Klv")(Klv.asInstanceOf[js.Any])
    if (KlvDataPids != null) __obj.updateDynamic("KlvDataPids")(KlvDataPids.asInstanceOf[js.Any])
    if (NielsenId3Behavior != null) __obj.updateDynamic("NielsenId3Behavior")(NielsenId3Behavior.asInstanceOf[js.Any])
    if (NullPacketBitrate != null) __obj.updateDynamic("NullPacketBitrate")(NullPacketBitrate.asInstanceOf[js.Any])
    if (PatInterval != null) __obj.updateDynamic("PatInterval")(PatInterval.asInstanceOf[js.Any])
    if (PcrControl != null) __obj.updateDynamic("PcrControl")(PcrControl.asInstanceOf[js.Any])
    if (PcrPeriod != null) __obj.updateDynamic("PcrPeriod")(PcrPeriod.asInstanceOf[js.Any])
    if (PcrPid != null) __obj.updateDynamic("PcrPid")(PcrPid.asInstanceOf[js.Any])
    if (PmtInterval != null) __obj.updateDynamic("PmtInterval")(PmtInterval.asInstanceOf[js.Any])
    if (PmtPid != null) __obj.updateDynamic("PmtPid")(PmtPid.asInstanceOf[js.Any])
    if (ProgramNum != null) __obj.updateDynamic("ProgramNum")(ProgramNum.asInstanceOf[js.Any])
    if (RateMode != null) __obj.updateDynamic("RateMode")(RateMode.asInstanceOf[js.Any])
    if (Scte27Pids != null) __obj.updateDynamic("Scte27Pids")(Scte27Pids.asInstanceOf[js.Any])
    if (Scte35Control != null) __obj.updateDynamic("Scte35Control")(Scte35Control.asInstanceOf[js.Any])
    if (Scte35Pid != null) __obj.updateDynamic("Scte35Pid")(Scte35Pid.asInstanceOf[js.Any])
    if (SegmentationMarkers != null) __obj.updateDynamic("SegmentationMarkers")(SegmentationMarkers.asInstanceOf[js.Any])
    if (SegmentationStyle != null) __obj.updateDynamic("SegmentationStyle")(SegmentationStyle.asInstanceOf[js.Any])
    if (SegmentationTime != null) __obj.updateDynamic("SegmentationTime")(SegmentationTime.asInstanceOf[js.Any])
    if (TimedMetadataBehavior != null) __obj.updateDynamic("TimedMetadataBehavior")(TimedMetadataBehavior.asInstanceOf[js.Any])
    if (TimedMetadataPid != null) __obj.updateDynamic("TimedMetadataPid")(TimedMetadataPid.asInstanceOf[js.Any])
    if (TransportStreamId != null) __obj.updateDynamic("TransportStreamId")(TransportStreamId.asInstanceOf[js.Any])
    if (VideoPid != null) __obj.updateDynamic("VideoPid")(VideoPid.asInstanceOf[js.Any])
    __obj.asInstanceOf[M2tsSettings]
  }
}

