package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait M3u8Settings extends js.Object {
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation.
    */
  var AudioPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined
  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3: js.UndefOr[M3u8NielsenId3] = js.undefined
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
  /**
    * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M3u8PcrControl] = js.undefined
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID.
    */
  var PcrPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
    */
  var PmtPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * Packet Identifier (PID) of the private metadata stream in the transport stream.
    */
  var PrivateMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNumber: js.UndefOr[__integerMin0Max65535] = js.undefined
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
    */
  var Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE) if you don't want manifest conditioning. Choose Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest conditioning. In both cases, also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml).
    */
  var Scte35Source: js.UndefOr[M3u8Scte35Source] = js.undefined
  /**
    * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
    */
  var TimedMetadata: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.TimedMetadata] = js.undefined
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream.
    */
  var TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream.
    */
  var VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined
}

object M3u8Settings {
  @scala.inline
  def apply(
    AudioFramesPerPes: Int | Double = null,
    AudioPids: __listOf__integerMin32Max8182 = null,
    NielsenId3: M3u8NielsenId3 = null,
    PatInterval: Int | Double = null,
    PcrControl: M3u8PcrControl = null,
    PcrPid: Int | Double = null,
    PmtInterval: Int | Double = null,
    PmtPid: Int | Double = null,
    PrivateMetadataPid: Int | Double = null,
    ProgramNumber: Int | Double = null,
    Scte35Pid: Int | Double = null,
    Scte35Source: M3u8Scte35Source = null,
    TimedMetadata: TimedMetadata = null,
    TimedMetadataPid: Int | Double = null,
    TransportStreamId: Int | Double = null,
    VideoPid: Int | Double = null
  ): M3u8Settings = {
    val __obj = js.Dynamic.literal()
    if (AudioFramesPerPes != null) __obj.updateDynamic("AudioFramesPerPes")(AudioFramesPerPes.asInstanceOf[js.Any])
    if (AudioPids != null) __obj.updateDynamic("AudioPids")(AudioPids)
    if (NielsenId3 != null) __obj.updateDynamic("NielsenId3")(NielsenId3.asInstanceOf[js.Any])
    if (PatInterval != null) __obj.updateDynamic("PatInterval")(PatInterval.asInstanceOf[js.Any])
    if (PcrControl != null) __obj.updateDynamic("PcrControl")(PcrControl.asInstanceOf[js.Any])
    if (PcrPid != null) __obj.updateDynamic("PcrPid")(PcrPid.asInstanceOf[js.Any])
    if (PmtInterval != null) __obj.updateDynamic("PmtInterval")(PmtInterval.asInstanceOf[js.Any])
    if (PmtPid != null) __obj.updateDynamic("PmtPid")(PmtPid.asInstanceOf[js.Any])
    if (PrivateMetadataPid != null) __obj.updateDynamic("PrivateMetadataPid")(PrivateMetadataPid.asInstanceOf[js.Any])
    if (ProgramNumber != null) __obj.updateDynamic("ProgramNumber")(ProgramNumber.asInstanceOf[js.Any])
    if (Scte35Pid != null) __obj.updateDynamic("Scte35Pid")(Scte35Pid.asInstanceOf[js.Any])
    if (Scte35Source != null) __obj.updateDynamic("Scte35Source")(Scte35Source.asInstanceOf[js.Any])
    if (TimedMetadata != null) __obj.updateDynamic("TimedMetadata")(TimedMetadata.asInstanceOf[js.Any])
    if (TimedMetadataPid != null) __obj.updateDynamic("TimedMetadataPid")(TimedMetadataPid.asInstanceOf[js.Any])
    if (TransportStreamId != null) __obj.updateDynamic("TransportStreamId")(TransportStreamId.asInstanceOf[js.Any])
    if (VideoPid != null) __obj.updateDynamic("VideoPid")(VideoPid.asInstanceOf[js.Any])
    __obj.asInstanceOf[M3u8Settings]
  }
}

