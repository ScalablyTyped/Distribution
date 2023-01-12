package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait M2tsSettings extends StObject {
  
  /**
    * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
    */
  var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.undefined
  
  /**
    * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
    */
  var AudioDuration: js.UndefOr[M2tsAudioDuration] = js.undefined
  
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Specify the packet identifiers (PIDs) for any elementary audio streams you include in this output. Specify multiple PIDs as a JSON array. Default is the range 482-492.
    */
  var AudioPids: js.UndefOr[listOfIntegerMin32Max8182] = js.undefined
  
  /**
    * Specify the output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
    */
  var Bitrate: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex  buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
    */
  var BufferModel: js.UndefOr[M2tsBufferModel] = js.undefined
  
  /**
    * If you select ALIGN_TO_VIDEO, MediaConvert writes captions and data packets with Presentation Timestamp (PTS) values greater than or equal to the first video packet PTS (MediaConvert drops captions and data packets with lesser PTS values). Keep the default value (AUTO) to allow all PTS values.
    */
  var DataPTSControl: js.UndefOr[M2tsDataPtsControl] = js.undefined
  
  /**
    * Use these settings to insert a DVB Network Information Table (NIT) in the transport stream of this output. When you work directly in your JSON job specification, include this object only when your job has a transport stream output and the container settings contain the object M2tsSettings.
    */
  var DvbNitSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.DvbNitSettings] = js.undefined
  
  /**
    * Use these settings to insert a DVB Service Description Table (SDT) in the transport stream of this output. When you work directly in your JSON job specification, include this object only when your job has a transport stream output and the container settings contain the object M2tsSettings.
    */
  var DvbSdtSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.DvbSdtSettings] = js.undefined
  
  /**
    * Specify the packet identifiers (PIDs) for DVB subtitle data included in this output. Specify multiple PIDs as a JSON array. Default is the range 460-479.
    */
  var DvbSubPids: js.UndefOr[listOfIntegerMin32Max8182] = js.undefined
  
  /**
    * Use these settings to insert a DVB Time and Date Table (TDT) in the transport stream of this output. When you work directly in your JSON job specification, include this object only when your job has a transport stream output and the container settings contain the object M2tsSettings.
    */
  var DvbTdtSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.DvbTdtSettings] = js.undefined
  
  /**
    * Specify the packet identifier (PID) for DVB teletext data you include in this output. Default is 499.
    */
  var DvbTeletextPid: js.UndefOr[integerMin32Max8182] = js.undefined
  
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
  var FragmentTime: js.UndefOr[doubleMin0] = js.undefined
  
  /**
    * To include key-length-value metadata in this output: Set KLV metadata insertion to Passthrough. MediaConvert reads KLV metadata present in your input and passes it through to the output transport stream. To exclude this KLV metadata: Set KLV metadata insertion to None or leave blank.
    */
  var KlvMetadata: js.UndefOr[M2tsKlvMetadata] = js.undefined
  
  /**
    * Specify the maximum time, in milliseconds, between Program Clock References (PCRs) inserted into the transport stream.
    */
  var MaxPcrInterval: js.UndefOr[integerMin0Max500] = js.undefined
  
  /**
    * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by looking ahead at input video. If another EBP is going to come in within the specified time interval, the current EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead accurate.
    */
  var MinEbpInterval: js.UndefOr[integerMin0Max10000] = js.undefined
  
  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3: js.UndefOr[M2tsNielsenId3] = js.undefined
  
  /**
    * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a downstream encryption system requires periodic null packets.
    */
  var NullPacketBitrate: js.UndefOr[doubleMin0] = js.undefined
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.undefined
  
  /**
    * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M2tsPcrControl] = js.undefined
  
  /**
    * Specify the packet identifier (PID) for the program clock reference (PCR) in this output. If you do not specify a value, the service will use the value for Video PID (VideoPid).
    */
  var PcrPid: js.UndefOr[integerMin32Max8182] = js.undefined
  
  /**
    * Specify the number of milliseconds between instances of the program map table (PMT) in the output transport stream.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.undefined
  
  /**
    * Specify the packet identifier (PID) for the program map table (PMT) itself. Default is 480.
    */
  var PmtPid: js.UndefOr[integerMin32Max8182] = js.undefined
  
  /**
    * Specify the packet identifier (PID) of the private metadata stream. Default is 503.
    */
  var PrivateMetadataPid: js.UndefOr[integerMin32Max8182] = js.undefined
  
  /**
    * Use Program number (programNumber) to specify the program number used in the program map table (PMT) for this output. Default is 1. Program numbers and program map tables are parts of MPEG-2 transport stream containers, used for organizing data.
    */
  var ProgramNumber: js.UndefOr[integerMin0Max65535] = js.undefined
  
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
  var Scte35Pid: js.UndefOr[integerMin32Max8182] = js.undefined
  
  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE). Also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml). Also enable ESAM SCTE-35 (include the property scte35Esam).
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
  var SegmentationTime: js.UndefOr[doubleMin0] = js.undefined
  
  /**
    * Packet Identifier (PID) of the ID3 metadata stream in the transport stream.
    */
  var TimedMetadataPid: js.UndefOr[integerMin32Max8182] = js.undefined
  
  /**
    * Specify the ID for the transport stream itself in the program map table for this output. Transport stream IDs and program map tables are parts of MPEG-2 transport stream containers, used for organizing data.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * Specify the packet identifier (PID) of the elementary video stream in the transport stream.
    */
  var VideoPid: js.UndefOr[integerMin32Max8182] = js.undefined
}
object M2tsSettings {
  
  inline def apply(): M2tsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[M2tsSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: M2tsSettings] (val x: Self) extends AnyVal {
    
    inline def setAudioBufferModel(value: M2tsAudioBufferModel): Self = StObject.set(x, "AudioBufferModel", value.asInstanceOf[js.Any])
    
    inline def setAudioBufferModelUndefined: Self = StObject.set(x, "AudioBufferModel", js.undefined)
    
    inline def setAudioDuration(value: M2tsAudioDuration): Self = StObject.set(x, "AudioDuration", value.asInstanceOf[js.Any])
    
    inline def setAudioDurationUndefined: Self = StObject.set(x, "AudioDuration", js.undefined)
    
    inline def setAudioFramesPerPes(value: integerMin0Max2147483647): Self = StObject.set(x, "AudioFramesPerPes", value.asInstanceOf[js.Any])
    
    inline def setAudioFramesPerPesUndefined: Self = StObject.set(x, "AudioFramesPerPes", js.undefined)
    
    inline def setAudioPids(value: listOfIntegerMin32Max8182): Self = StObject.set(x, "AudioPids", value.asInstanceOf[js.Any])
    
    inline def setAudioPidsUndefined: Self = StObject.set(x, "AudioPids", js.undefined)
    
    inline def setAudioPidsVarargs(value: integerMin32Max8182*): Self = StObject.set(x, "AudioPids", js.Array(value*))
    
    inline def setBitrate(value: integerMin0Max2147483647): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setBufferModel(value: M2tsBufferModel): Self = StObject.set(x, "BufferModel", value.asInstanceOf[js.Any])
    
    inline def setBufferModelUndefined: Self = StObject.set(x, "BufferModel", js.undefined)
    
    inline def setDataPTSControl(value: M2tsDataPtsControl): Self = StObject.set(x, "DataPTSControl", value.asInstanceOf[js.Any])
    
    inline def setDataPTSControlUndefined: Self = StObject.set(x, "DataPTSControl", js.undefined)
    
    inline def setDvbNitSettings(value: DvbNitSettings): Self = StObject.set(x, "DvbNitSettings", value.asInstanceOf[js.Any])
    
    inline def setDvbNitSettingsUndefined: Self = StObject.set(x, "DvbNitSettings", js.undefined)
    
    inline def setDvbSdtSettings(value: DvbSdtSettings): Self = StObject.set(x, "DvbSdtSettings", value.asInstanceOf[js.Any])
    
    inline def setDvbSdtSettingsUndefined: Self = StObject.set(x, "DvbSdtSettings", js.undefined)
    
    inline def setDvbSubPids(value: listOfIntegerMin32Max8182): Self = StObject.set(x, "DvbSubPids", value.asInstanceOf[js.Any])
    
    inline def setDvbSubPidsUndefined: Self = StObject.set(x, "DvbSubPids", js.undefined)
    
    inline def setDvbSubPidsVarargs(value: integerMin32Max8182*): Self = StObject.set(x, "DvbSubPids", js.Array(value*))
    
    inline def setDvbTdtSettings(value: DvbTdtSettings): Self = StObject.set(x, "DvbTdtSettings", value.asInstanceOf[js.Any])
    
    inline def setDvbTdtSettingsUndefined: Self = StObject.set(x, "DvbTdtSettings", js.undefined)
    
    inline def setDvbTeletextPid(value: integerMin32Max8182): Self = StObject.set(x, "DvbTeletextPid", value.asInstanceOf[js.Any])
    
    inline def setDvbTeletextPidUndefined: Self = StObject.set(x, "DvbTeletextPid", js.undefined)
    
    inline def setEbpAudioInterval(value: M2tsEbpAudioInterval): Self = StObject.set(x, "EbpAudioInterval", value.asInstanceOf[js.Any])
    
    inline def setEbpAudioIntervalUndefined: Self = StObject.set(x, "EbpAudioInterval", js.undefined)
    
    inline def setEbpPlacement(value: M2tsEbpPlacement): Self = StObject.set(x, "EbpPlacement", value.asInstanceOf[js.Any])
    
    inline def setEbpPlacementUndefined: Self = StObject.set(x, "EbpPlacement", js.undefined)
    
    inline def setEsRateInPes(value: M2tsEsRateInPes): Self = StObject.set(x, "EsRateInPes", value.asInstanceOf[js.Any])
    
    inline def setEsRateInPesUndefined: Self = StObject.set(x, "EsRateInPes", js.undefined)
    
    inline def setForceTsVideoEbpOrder(value: M2tsForceTsVideoEbpOrder): Self = StObject.set(x, "ForceTsVideoEbpOrder", value.asInstanceOf[js.Any])
    
    inline def setForceTsVideoEbpOrderUndefined: Self = StObject.set(x, "ForceTsVideoEbpOrder", js.undefined)
    
    inline def setFragmentTime(value: doubleMin0): Self = StObject.set(x, "FragmentTime", value.asInstanceOf[js.Any])
    
    inline def setFragmentTimeUndefined: Self = StObject.set(x, "FragmentTime", js.undefined)
    
    inline def setKlvMetadata(value: M2tsKlvMetadata): Self = StObject.set(x, "KlvMetadata", value.asInstanceOf[js.Any])
    
    inline def setKlvMetadataUndefined: Self = StObject.set(x, "KlvMetadata", js.undefined)
    
    inline def setMaxPcrInterval(value: integerMin0Max500): Self = StObject.set(x, "MaxPcrInterval", value.asInstanceOf[js.Any])
    
    inline def setMaxPcrIntervalUndefined: Self = StObject.set(x, "MaxPcrInterval", js.undefined)
    
    inline def setMinEbpInterval(value: integerMin0Max10000): Self = StObject.set(x, "MinEbpInterval", value.asInstanceOf[js.Any])
    
    inline def setMinEbpIntervalUndefined: Self = StObject.set(x, "MinEbpInterval", js.undefined)
    
    inline def setNielsenId3(value: M2tsNielsenId3): Self = StObject.set(x, "NielsenId3", value.asInstanceOf[js.Any])
    
    inline def setNielsenId3Undefined: Self = StObject.set(x, "NielsenId3", js.undefined)
    
    inline def setNullPacketBitrate(value: doubleMin0): Self = StObject.set(x, "NullPacketBitrate", value.asInstanceOf[js.Any])
    
    inline def setNullPacketBitrateUndefined: Self = StObject.set(x, "NullPacketBitrate", js.undefined)
    
    inline def setPatInterval(value: integerMin0Max1000): Self = StObject.set(x, "PatInterval", value.asInstanceOf[js.Any])
    
    inline def setPatIntervalUndefined: Self = StObject.set(x, "PatInterval", js.undefined)
    
    inline def setPcrControl(value: M2tsPcrControl): Self = StObject.set(x, "PcrControl", value.asInstanceOf[js.Any])
    
    inline def setPcrControlUndefined: Self = StObject.set(x, "PcrControl", js.undefined)
    
    inline def setPcrPid(value: integerMin32Max8182): Self = StObject.set(x, "PcrPid", value.asInstanceOf[js.Any])
    
    inline def setPcrPidUndefined: Self = StObject.set(x, "PcrPid", js.undefined)
    
    inline def setPmtInterval(value: integerMin0Max1000): Self = StObject.set(x, "PmtInterval", value.asInstanceOf[js.Any])
    
    inline def setPmtIntervalUndefined: Self = StObject.set(x, "PmtInterval", js.undefined)
    
    inline def setPmtPid(value: integerMin32Max8182): Self = StObject.set(x, "PmtPid", value.asInstanceOf[js.Any])
    
    inline def setPmtPidUndefined: Self = StObject.set(x, "PmtPid", js.undefined)
    
    inline def setPrivateMetadataPid(value: integerMin32Max8182): Self = StObject.set(x, "PrivateMetadataPid", value.asInstanceOf[js.Any])
    
    inline def setPrivateMetadataPidUndefined: Self = StObject.set(x, "PrivateMetadataPid", js.undefined)
    
    inline def setProgramNumber(value: integerMin0Max65535): Self = StObject.set(x, "ProgramNumber", value.asInstanceOf[js.Any])
    
    inline def setProgramNumberUndefined: Self = StObject.set(x, "ProgramNumber", js.undefined)
    
    inline def setRateMode(value: M2tsRateMode): Self = StObject.set(x, "RateMode", value.asInstanceOf[js.Any])
    
    inline def setRateModeUndefined: Self = StObject.set(x, "RateMode", js.undefined)
    
    inline def setScte35Esam(value: M2tsScte35Esam): Self = StObject.set(x, "Scte35Esam", value.asInstanceOf[js.Any])
    
    inline def setScte35EsamUndefined: Self = StObject.set(x, "Scte35Esam", js.undefined)
    
    inline def setScte35Pid(value: integerMin32Max8182): Self = StObject.set(x, "Scte35Pid", value.asInstanceOf[js.Any])
    
    inline def setScte35PidUndefined: Self = StObject.set(x, "Scte35Pid", js.undefined)
    
    inline def setScte35Source(value: M2tsScte35Source): Self = StObject.set(x, "Scte35Source", value.asInstanceOf[js.Any])
    
    inline def setScte35SourceUndefined: Self = StObject.set(x, "Scte35Source", js.undefined)
    
    inline def setSegmentationMarkers(value: M2tsSegmentationMarkers): Self = StObject.set(x, "SegmentationMarkers", value.asInstanceOf[js.Any])
    
    inline def setSegmentationMarkersUndefined: Self = StObject.set(x, "SegmentationMarkers", js.undefined)
    
    inline def setSegmentationStyle(value: M2tsSegmentationStyle): Self = StObject.set(x, "SegmentationStyle", value.asInstanceOf[js.Any])
    
    inline def setSegmentationStyleUndefined: Self = StObject.set(x, "SegmentationStyle", js.undefined)
    
    inline def setSegmentationTime(value: doubleMin0): Self = StObject.set(x, "SegmentationTime", value.asInstanceOf[js.Any])
    
    inline def setSegmentationTimeUndefined: Self = StObject.set(x, "SegmentationTime", js.undefined)
    
    inline def setTimedMetadataPid(value: integerMin32Max8182): Self = StObject.set(x, "TimedMetadataPid", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataPidUndefined: Self = StObject.set(x, "TimedMetadataPid", js.undefined)
    
    inline def setTransportStreamId(value: integerMin0Max65535): Self = StObject.set(x, "TransportStreamId", value.asInstanceOf[js.Any])
    
    inline def setTransportStreamIdUndefined: Self = StObject.set(x, "TransportStreamId", js.undefined)
    
    inline def setVideoPid(value: integerMin32Max8182): Self = StObject.set(x, "VideoPid", value.asInstanceOf[js.Any])
    
    inline def setVideoPidUndefined: Self = StObject.set(x, "VideoPid", js.undefined)
  }
}
