package typings
package awsDashSdkLib.clientsMediaconvertMod

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
    * Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
    */
  var Scte35Source: js.UndefOr[M3u8Scte35Source] = js.undefined
  /**
    * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
    */
  var TimedMetadata: js.UndefOr[TimedMetadata] = js.undefined
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
    AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    AudioPids: __listOf__integerMin32Max8182 = null,
    NielsenId3: M3u8NielsenId3 = null,
    PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
    PcrControl: M3u8PcrControl = null,
    PcrPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
    PmtPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    PrivateMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    ProgramNumber: js.UndefOr[__integerMin0Max65535] = js.undefined,
    Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    Scte35Source: M3u8Scte35Source = null,
    TimedMetadata: TimedMetadata = null,
    TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
    TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined,
    VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  ): M3u8Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AudioFramesPerPes)) __obj.updateDynamic("AudioFramesPerPes")(AudioFramesPerPes)
    if (AudioPids != null) __obj.updateDynamic("AudioPids")(AudioPids)
    if (NielsenId3 != null) __obj.updateDynamic("NielsenId3")(NielsenId3.asInstanceOf[js.Any])
    if (!js.isUndefined(PatInterval)) __obj.updateDynamic("PatInterval")(PatInterval)
    if (PcrControl != null) __obj.updateDynamic("PcrControl")(PcrControl.asInstanceOf[js.Any])
    if (!js.isUndefined(PcrPid)) __obj.updateDynamic("PcrPid")(PcrPid)
    if (!js.isUndefined(PmtInterval)) __obj.updateDynamic("PmtInterval")(PmtInterval)
    if (!js.isUndefined(PmtPid)) __obj.updateDynamic("PmtPid")(PmtPid)
    if (!js.isUndefined(PrivateMetadataPid)) __obj.updateDynamic("PrivateMetadataPid")(PrivateMetadataPid)
    if (!js.isUndefined(ProgramNumber)) __obj.updateDynamic("ProgramNumber")(ProgramNumber)
    if (!js.isUndefined(Scte35Pid)) __obj.updateDynamic("Scte35Pid")(Scte35Pid)
    if (Scte35Source != null) __obj.updateDynamic("Scte35Source")(Scte35Source.asInstanceOf[js.Any])
    if (TimedMetadata != null) __obj.updateDynamic("TimedMetadata")(TimedMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(TimedMetadataPid)) __obj.updateDynamic("TimedMetadataPid")(TimedMetadataPid)
    if (!js.isUndefined(TransportStreamId)) __obj.updateDynamic("TransportStreamId")(TransportStreamId)
    if (!js.isUndefined(VideoPid)) __obj.updateDynamic("VideoPid")(VideoPid)
    __obj.asInstanceOf[M3u8Settings]
  }
}

