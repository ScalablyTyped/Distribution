package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait M3u8Settings extends js.Object {
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[__integerMin0] = js.undefined
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
    */
  var AudioPids: js.UndefOr[__string] = js.undefined
  /**
    * This parameter is unused and deprecated.
    */
  var EcmPid: js.UndefOr[__string] = js.undefined
  /**
    * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\" writes out the PMT once per segment file.
    */
  var PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
  /**
    * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M3u8PcrControl] = js.undefined
  /**
    * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
    */
  var PcrPeriod: js.UndefOr[__integerMin0Max500] = js.undefined
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.
    */
  var PcrPid: js.UndefOr[__string] = js.undefined
  /**
    * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\" writes out the PMT once per segment file.
    */
  var PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var PmtPid: js.UndefOr[__string] = js.undefined
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNum: js.UndefOr[__integerMin0Max65535] = js.undefined
  /**
    * If set to passthrough, passes any SCTE-35 signals from the input source to this output.
    */
  var Scte35Behavior: js.UndefOr[M3u8Scte35Behavior] = js.undefined
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var Scte35Pid: js.UndefOr[__string] = js.undefined
  /**
    * When set to passthrough, timed metadata is passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[M3u8TimedMetadataBehavior] = js.undefined
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var TimedMetadataPid: js.UndefOr[__string] = js.undefined
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var VideoPid: js.UndefOr[__string] = js.undefined
}

object M3u8Settings {
  @scala.inline
  def apply(
    AudioFramesPerPes: Int | Double = null,
    AudioPids: __string = null,
    EcmPid: __string = null,
    PatInterval: Int | Double = null,
    PcrControl: M3u8PcrControl = null,
    PcrPeriod: Int | Double = null,
    PcrPid: __string = null,
    PmtInterval: Int | Double = null,
    PmtPid: __string = null,
    ProgramNum: Int | Double = null,
    Scte35Behavior: M3u8Scte35Behavior = null,
    Scte35Pid: __string = null,
    TimedMetadataBehavior: M3u8TimedMetadataBehavior = null,
    TimedMetadataPid: __string = null,
    TransportStreamId: Int | Double = null,
    VideoPid: __string = null
  ): M3u8Settings = {
    val __obj = js.Dynamic.literal()
    if (AudioFramesPerPes != null) __obj.updateDynamic("AudioFramesPerPes")(AudioFramesPerPes.asInstanceOf[js.Any])
    if (AudioPids != null) __obj.updateDynamic("AudioPids")(AudioPids)
    if (EcmPid != null) __obj.updateDynamic("EcmPid")(EcmPid)
    if (PatInterval != null) __obj.updateDynamic("PatInterval")(PatInterval.asInstanceOf[js.Any])
    if (PcrControl != null) __obj.updateDynamic("PcrControl")(PcrControl.asInstanceOf[js.Any])
    if (PcrPeriod != null) __obj.updateDynamic("PcrPeriod")(PcrPeriod.asInstanceOf[js.Any])
    if (PcrPid != null) __obj.updateDynamic("PcrPid")(PcrPid)
    if (PmtInterval != null) __obj.updateDynamic("PmtInterval")(PmtInterval.asInstanceOf[js.Any])
    if (PmtPid != null) __obj.updateDynamic("PmtPid")(PmtPid)
    if (ProgramNum != null) __obj.updateDynamic("ProgramNum")(ProgramNum.asInstanceOf[js.Any])
    if (Scte35Behavior != null) __obj.updateDynamic("Scte35Behavior")(Scte35Behavior.asInstanceOf[js.Any])
    if (Scte35Pid != null) __obj.updateDynamic("Scte35Pid")(Scte35Pid)
    if (TimedMetadataBehavior != null) __obj.updateDynamic("TimedMetadataBehavior")(TimedMetadataBehavior.asInstanceOf[js.Any])
    if (TimedMetadataPid != null) __obj.updateDynamic("TimedMetadataPid")(TimedMetadataPid)
    if (TransportStreamId != null) __obj.updateDynamic("TransportStreamId")(TransportStreamId.asInstanceOf[js.Any])
    if (VideoPid != null) __obj.updateDynamic("VideoPid")(VideoPid)
    __obj.asInstanceOf[M3u8Settings]
  }
}

