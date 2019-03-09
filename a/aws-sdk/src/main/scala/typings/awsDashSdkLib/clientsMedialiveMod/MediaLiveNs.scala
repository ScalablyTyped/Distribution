package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/medialive", "MediaLive")
@js.native
object MediaLiveNs extends js.Object {
  trait AacSettings extends js.Object {
    /**
      * Average bitrate in bits/second. Valid values depend on rate control mode and profile.
      */
    var Bitrate: js.UndefOr[__double] = js.undefined
    /**
      * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The adReceiverMix setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
      */
    var CodingMode: js.UndefOr[AacCodingMode] = js.undefined
    /**
      * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair.  The Audio Type field (audioType) will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when set to broadcasterMixedAd.
    Leave set to "normal" when input does not contain pre-mixed audio + AD.
      */
    var InputType: js.UndefOr[AacInputType] = js.undefined
    /**
      * AAC Profile.
      */
    var Profile: js.UndefOr[AacProfile] = js.undefined
    /**
      * Rate Control Mode.
      */
    var RateControlMode: js.UndefOr[AacRateControlMode] = js.undefined
    /**
      * Sets LATM / LOAS AAC output for raw containers.
      */
    var RawFormat: js.UndefOr[AacRawFormat] = js.undefined
    /**
      * Sample rate in Hz. Valid values depend on rate control mode and profile.
      */
    var SampleRate: js.UndefOr[__double] = js.undefined
    /**
      * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
      */
    var Spec: js.UndefOr[AacSpec] = js.undefined
    /**
      * VBR Quality Level - Only used if rateControlMode is VBR.
      */
    var VbrQuality: js.UndefOr[AacVbrQuality] = js.undefined
  }
  
  trait Ac3Settings extends js.Object {
    /**
      * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
      */
    var Bitrate: js.UndefOr[__double] = js.undefined
    /**
      * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on these values.
      */
    var BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.undefined
    /**
      * Dolby Digital coding mode. Determines number of channels.
      */
    var CodingMode: js.UndefOr[Ac3CodingMode] = js.undefined
    /**
      * Sets the dialnorm for the output. If excluded and input audio is Dolby Digital, dialnorm will be passed through.
      */
    var Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined
    /**
      * If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
      */
    var DrcProfile: js.UndefOr[Ac3DrcProfile] = js.undefined
    /**
      * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in codingMode32Lfe mode.
      */
    var LfeFilter: js.UndefOr[Ac3LfeFilter] = js.undefined
    /**
      * When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
      */
    var MetadataControl: js.UndefOr[Ac3MetadataControl] = js.undefined
  }
  
  trait ArchiveContainerSettings extends js.Object {
    var M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined
  }
  
  trait ArchiveGroupSettings extends js.Object {
    /**
      * A directory and base filename where archive files should be written.
      */
    var Destination: OutputLocationRef
    /**
      * Number of seconds to write to archive file before closing and starting a new one.
      */
    var RolloverInterval: js.UndefOr[__integerMin1] = js.undefined
  }
  
  trait ArchiveOutputSettings extends js.Object {
    /**
      * Settings specific to the container type of the file.
      */
    var ContainerSettings: ArchiveContainerSettings
    /**
      * Output file extension. If excluded, this will be auto-selected from the container type.
      */
    var Extension: js.UndefOr[__string] = js.undefined
    /**
      * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
      */
    var NameModifier: js.UndefOr[__string] = js.undefined
  }
  
  trait AribDestinationSettings extends js.Object
  
  trait AribSourceSettings extends js.Object
  
  trait AudioChannelMapping extends js.Object {
    /**
      * Indices and gain values for each input channel that should be remixed into this output channel.
      */
    var InputChannelLevels: __listOfInputChannelLevel
    /**
      * The index of the output channel being produced.
      */
    var OutputChannel: __integerMin0Max7
  }
  
  trait AudioCodecSettings extends js.Object {
    var AacSettings: js.UndefOr[AacSettings] = js.undefined
    var Ac3Settings: js.UndefOr[Ac3Settings] = js.undefined
    var Eac3Settings: js.UndefOr[Eac3Settings] = js.undefined
    var Mp2Settings: js.UndefOr[Mp2Settings] = js.undefined
    var PassThroughSettings: js.UndefOr[PassThroughSettings] = js.undefined
  }
  
  trait AudioDescription extends js.Object {
    /**
      * Advanced audio normalization settings.
      */
    var AudioNormalizationSettings: js.UndefOr[AudioNormalizationSettings] = js.undefined
    /**
      * The name of the AudioSelector used as the source for this AudioDescription.
      */
    var AudioSelectorName: __string
    /**
      * Applies only if audioTypeControl is useConfigured. The values for audioType are defined in ISO-IEC 13818-1.
      */
    var AudioType: js.UndefOr[AudioType] = js.undefined
    /**
      * Determines how audio type is determined.
      followInput: If the input contains an ISO 639 audioType, then that value is passed through to the output. If the input contains no ISO 639 audioType, the value in Audio Type is included in the output.
      useConfigured: The value in Audio Type is included in the output.
    Note that this field and audioType are both ignored if inputType is broadcasterMixedAd.
      */
    var AudioTypeControl: js.UndefOr[AudioDescriptionAudioTypeControl] = js.undefined
    /**
      * Audio codec settings.
      */
    var CodecSettings: js.UndefOr[AudioCodecSettings] = js.undefined
    /**
      * Indicates the language of the audio output track. Only used if languageControlMode is useConfigured, or there is no ISO 639 language code specified in the input.
      */
    var LanguageCode: js.UndefOr[__stringMin3Max3] = js.undefined
    /**
      * Choosing followInput will cause the ISO 639 language code of the output to follow the ISO 639 language code of the input. The languageCode will be used when useConfigured is set, or when followInput is selected but there is no ISO 639 language code specified by the input.
      */
    var LanguageCodeControl: js.UndefOr[AudioDescriptionLanguageCodeControl] = js.undefined
    /**
      * The name of this AudioDescription. Outputs will use this name to uniquely identify this AudioDescription.  Description names should be unique within this Live Event.
      */
    var Name: __string
    /**
      * Settings that control how input audio channels are remixed into the output audio channels.
      */
    var RemixSettings: js.UndefOr[RemixSettings] = js.undefined
    /**
      * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director Commentary).
      */
    var StreamName: js.UndefOr[__string] = js.undefined
  }
  
  trait AudioLanguageSelection extends js.Object {
    /**
      * Selects a specific three-letter language code from within an audio source.
      */
    var LanguageCode: __string
    /**
      * When set to "strict", the transport stream demux strictly identifies audio streams by their language descriptor. If a PMT update occurs such that an audio stream matching the initially selected language is no longer present then mute will be encoded until the language returns. If "loose", then on a PMT update the demux will choose another audio stream in the program with the same stream type if it can't find one with the same language.
      */
    var LanguageSelectionPolicy: js.UndefOr[AudioLanguageSelectionPolicy] = js.undefined
  }
  
  trait AudioNormalizationSettings extends js.Object {
    /**
      * Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms to the EBU R-128 specification.
      */
    var Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined
    /**
      * When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly, the audio will be measured but not adjusted.
      */
    var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined
    /**
      * Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according to the chosen algorithm.  The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128 specification (1770-2) recommends a target of -23 LKFS.
      */
    var TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined
  }
  
  trait AudioOnlyHlsSettings extends js.Object {
    /**
      * Specifies the group to which the audio Rendition belongs.
      */
    var AudioGroupId: js.UndefOr[__string] = js.undefined
    /**
      * For use with an audio only Stream. Must be a .jpg or .png file. If given, this image will be used as the cover-art for the audio only output. Ideally, it should be formatted for an iPhone screen for two reasons. The iPhone does not resize the image, it crops a centered image on the top/bottom and left/right. Additionally, this image file gets saved bit-for-bit into every 10-second segment file, so will increase bandwidth by {image file size} * {segment count} * {user count.}.
      */
    var AudioOnlyImage: js.UndefOr[InputLocation] = js.undefined
    /**
      * Four types of audio-only tracks are supported:
    Audio-Only Variant Stream
    The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest.
    Alternate Audio, Auto Select, Default
    Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
    Alternate Audio, Auto Select, Not Default
    Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES
    Alternate Audio, not Auto Select
    Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
      */
    var AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType] = js.undefined
  }
  
  trait AudioPidSelection extends js.Object {
    /**
      * Selects a specific PID from within a source.
      */
    var Pid: __integerMin0Max8191
  }
  
  trait AudioSelector extends js.Object {
    /**
      * The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector.  Selector names should be unique per input.
      */
    var Name: __stringMin1
    /**
      * The audio selector settings.
      */
    var SelectorSettings: js.UndefOr[AudioSelectorSettings] = js.undefined
  }
  
  trait AudioSelectorSettings extends js.Object {
    var AudioLanguageSelection: js.UndefOr[AudioLanguageSelection] = js.undefined
    var AudioPidSelection: js.UndefOr[AudioPidSelection] = js.undefined
  }
  
  trait AvailBlanking extends js.Object {
    /**
      * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
      */
    var AvailBlankingImage: js.UndefOr[InputLocation] = js.undefined
    /**
      * When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
      */
    var State: js.UndefOr[AvailBlankingState] = js.undefined
  }
  
  trait AvailConfiguration extends js.Object {
    /**
      * Ad avail settings.
      */
    var AvailSettings: js.UndefOr[AvailSettings] = js.undefined
  }
  
  trait AvailSettings extends js.Object {
    var Scte35SpliceInsert: js.UndefOr[Scte35SpliceInsert] = js.undefined
    var Scte35TimeSignalApos: js.UndefOr[Scte35TimeSignalApos] = js.undefined
  }
  
  trait BatchScheduleActionCreateRequest extends js.Object {
    /**
      * A list of schedule actions to create.
      */
    var ScheduleActions: __listOfScheduleAction
  }
  
  trait BatchScheduleActionCreateResult extends js.Object {
    /**
      * List of actions that have been created in the schedule.
      */
    var ScheduleActions: __listOfScheduleAction
  }
  
  trait BatchScheduleActionDeleteRequest extends js.Object {
    /**
      * A list of schedule actions to delete.
      */
    var ActionNames: __listOf__string
  }
  
  trait BatchScheduleActionDeleteResult extends js.Object {
    /**
      * List of actions that have been deleted from the schedule.
      */
    var ScheduleActions: __listOfScheduleAction
  }
  
  trait BatchUpdateScheduleRequest extends js.Object {
    /**
      * Id of the channel whose schedule is being updated.
      */
    var ChannelId: __string
    /**
      * Schedule actions to create in the schedule.
      */
    var Creates: js.UndefOr[BatchScheduleActionCreateRequest] = js.undefined
    /**
      * Schedule actions to delete from the schedule.
      */
    var Deletes: js.UndefOr[BatchScheduleActionDeleteRequest] = js.undefined
  }
  
  trait BatchUpdateScheduleResponse extends js.Object {
    /**
      * Schedule actions created in the schedule.
      */
    var Creates: js.UndefOr[BatchScheduleActionCreateResult] = js.undefined
    /**
      * Schedule actions deleted from the schedule.
      */
    var Deletes: js.UndefOr[BatchScheduleActionDeleteResult] = js.undefined
  }
  
  trait BlackoutSlate extends js.Object {
    /**
      * Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported.
      */
    var BlackoutSlateImage: js.UndefOr[InputLocation] = js.undefined
    /**
      * Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and Network Start descriptors must contain a network ID that matches the value entered in "Network ID".
      */
    var NetworkEndBlackout: js.UndefOr[BlackoutSlateNetworkEndBlackout] = js.undefined
    /**
      * Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output raster.
      */
    var NetworkEndBlackoutImage: js.UndefOr[InputLocation] = js.undefined
    /**
      * Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
      */
    var NetworkId: js.UndefOr[__stringMin34Max34] = js.undefined
    /**
      * When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
      */
    var State: js.UndefOr[BlackoutSlateState] = js.undefined
  }
  
  trait BurnInDestinationSettings extends js.Object {
    /**
      * If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. Selecting "smart" justification will left-justify live subtitles and center-justify pre-recorded subtitles.  All burn-in and DVB-Sub font settings must match.
      */
    var Alignment: js.UndefOr[BurnInAlignment] = js.undefined
    /**
      * Specifies the color of the rectangle behind the captions.  All burn-in and DVB-Sub font settings must match.
      */
    var BackgroundColor: js.UndefOr[BurnInBackgroundColor] = js.undefined
    /**
      * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter out is equivalent to setting it to 0 (transparent).  All burn-in and DVB-Sub font settings must match.
      */
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * External font file used for caption burn-in. File extension must be 'ttf' or 'tte'.  Although the user can select output fonts for many different types of input captions,  embedded, STL and teletext sources use a strict grid system. Using external fonts with these caption sources could cause unexpected display of proportional fonts.  All burn-in and DVB-Sub font settings must match.
      */
    var Font: js.UndefOr[InputLocation] = js.undefined
    /**
      * Specifies the color of the burned-in captions.  This option is not valid for source captions that are STL, 608/embedded or teletext.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
      */
    var FontColor: js.UndefOr[BurnInFontColor] = js.undefined
    /**
      * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.  All burn-in and DVB-Sub font settings must match.
      */
    var FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * Font resolution in DPI (dots per inch); default is 96 dpi.  All burn-in and DVB-Sub font settings must match.
      */
    var FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined
    /**
      * When set to 'auto' fontSize will scale depending on the size of the output.  Giving a positive integer will specify the exact font size in points.  All burn-in and DVB-Sub font settings must match.
      */
    var FontSize: js.UndefOr[__string] = js.undefined
    /**
      * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
      */
    var OutlineColor: js.UndefOr[BurnInOutlineColor] = js.undefined
    /**
      * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
      */
    var OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined
    /**
      * Specifies the color of the shadow cast by the captions.  All burn-in and DVB-Sub font settings must match.
      */
    var ShadowColor: js.UndefOr[BurnInShadowColor] = js.undefined
    /**
      * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter out is equivalent to setting it to 0 (transparent).  All burn-in and DVB-Sub font settings must match.
      */
    var ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left.  All burn-in and DVB-Sub font settings must match.
      */
    var ShadowXOffset: js.UndefOr[__integer] = js.undefined
    /**
      * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text.  All burn-in and DVB-Sub font settings must match.
      */
    var ShadowYOffset: js.UndefOr[__integer] = js.undefined
    /**
      * Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in outputs.
      */
    var TeletextGridControl: js.UndefOr[BurnInTeletextGridControl] = js.undefined
    /**
      * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit xPosition is provided, the horizontal caption position will be determined by the alignment parameter.  All burn-in and DVB-Sub font settings must match.
      */
    var XPosition: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is provided, the caption will be positioned towards the bottom of the output.  All burn-in and DVB-Sub font settings must match.
      */
    var YPosition: js.UndefOr[__integerMin0] = js.undefined
  }
  
  trait CaptionDescription extends js.Object {
    /**
      * Specifies which input caption selector to use as a caption source when generating output captions. This field should match a captionSelector name.
      */
    var CaptionSelectorName: __string
    /**
      * Additional settings for captions destination that depend on the destination type.
      */
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined
    /**
      * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
      */
    var LanguageCode: js.UndefOr[__string] = js.undefined
    /**
      * Human readable information to indicate captions available for players (eg. English, or Spanish).
      */
    var LanguageDescription: js.UndefOr[__string] = js.undefined
    /**
      * Name of the caption description.  Used to associate a caption description with an output.  Names must be unique within an event.
      */
    var Name: __string
  }
  
  trait CaptionDestinationSettings extends js.Object {
    var AribDestinationSettings: js.UndefOr[AribDestinationSettings] = js.undefined
    var BurnInDestinationSettings: js.UndefOr[BurnInDestinationSettings] = js.undefined
    var DvbSubDestinationSettings: js.UndefOr[DvbSubDestinationSettings] = js.undefined
    var EmbeddedDestinationSettings: js.UndefOr[EmbeddedDestinationSettings] = js.undefined
    var EmbeddedPlusScte20DestinationSettings: js.UndefOr[EmbeddedPlusScte20DestinationSettings] = js.undefined
    var RtmpCaptionInfoDestinationSettings: js.UndefOr[RtmpCaptionInfoDestinationSettings] = js.undefined
    var Scte20PlusEmbeddedDestinationSettings: js.UndefOr[Scte20PlusEmbeddedDestinationSettings] = js.undefined
    var Scte27DestinationSettings: js.UndefOr[Scte27DestinationSettings] = js.undefined
    var SmpteTtDestinationSettings: js.UndefOr[SmpteTtDestinationSettings] = js.undefined
    var TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings] = js.undefined
    var TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings] = js.undefined
    var WebvttDestinationSettings: js.UndefOr[WebvttDestinationSettings] = js.undefined
  }
  
  trait CaptionLanguageMapping extends js.Object {
    /**
      * The closed caption channel being described by this CaptionLanguageMapping.  Each channel mapping must have a unique channel number (maximum of 4)
      */
    var CaptionChannel: __integerMin1Max4
    /**
      * Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2)
      */
    var LanguageCode: __stringMin3Max3
    /**
      * Textual description of language
      */
    var LanguageDescription: __stringMin1
  }
  
  trait CaptionSelector extends js.Object {
    /**
      * When specified this field indicates the three letter language code of the caption track to extract from the source.
      */
    var LanguageCode: js.UndefOr[__string] = js.undefined
    /**
      * Name identifier for a caption selector.  This name is used to associate this caption selector with one or more caption descriptions.  Names must be unique within an event.
      */
    var Name: __stringMin1
    /**
      * Caption selector settings.
      */
    var SelectorSettings: js.UndefOr[CaptionSelectorSettings] = js.undefined
  }
  
  trait CaptionSelectorSettings extends js.Object {
    var AribSourceSettings: js.UndefOr[AribSourceSettings] = js.undefined
    var DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings] = js.undefined
    var EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings] = js.undefined
    var Scte20SourceSettings: js.UndefOr[Scte20SourceSettings] = js.undefined
    var Scte27SourceSettings: js.UndefOr[Scte27SourceSettings] = js.undefined
    var TeletextSourceSettings: js.UndefOr[TeletextSourceSettings] = js.undefined
  }
  
  trait Channel extends js.Object {
    /**
      * The unique arn of the channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A list of destinations of the channel. For UDP outputs, there is one
    destination per output. For other types (HLS, for example), there is
    one destination per packager.
      */
    var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
    /**
      * The endpoints where outgoing connections initiate from
      */
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined
    var EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined
    /**
      * The unique id of the channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * List of input attachments for channel.
      */
    var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined
    var InputSpecification: js.UndefOr[InputSpecification] = js.undefined
    /**
      * The log level being written to CloudWatch Logs.
      */
    var LogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * The name of the channel. (user-mutable)
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The number of currently healthy pipelines.
      */
    var PipelinesRunningCount: js.UndefOr[__integer] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    var State: js.UndefOr[ChannelState] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait ChannelEgressEndpoint extends js.Object {
    /**
      * Public IP of where a channel's output comes from
      */
    var SourceIp: js.UndefOr[__string] = js.undefined
  }
  
  trait ChannelSummary extends js.Object {
    /**
      * The unique arn of the channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A list of destinations of the channel. For UDP outputs, there is one
    destination per output. For other types (HLS, for example), there is
    one destination per packager.
      */
    var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
    /**
      * The endpoints where outgoing connections initiate from
      */
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined
    /**
      * The unique id of the channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * List of input attachments for channel.
      */
    var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined
    var InputSpecification: js.UndefOr[InputSpecification] = js.undefined
    /**
      * The log level being written to CloudWatch Logs.
      */
    var LogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * The name of the channel. (user-mutable)
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The number of currently healthy pipelines.
      */
    var PipelinesRunningCount: js.UndefOr[__integer] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    var State: js.UndefOr[ChannelState] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateChannelRequest extends js.Object {
    var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
    var EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined
    /**
      * List of input attachments for channel.
      */
    var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined
    /**
      * Specification of input for this channel (max. bitrate, resolution, codec, etc.)
      */
    var InputSpecification: js.UndefOr[InputSpecification] = js.undefined
    /**
      * The log level to write to CloudWatch Logs.
      */
    var LogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * Name of channel.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * Unique request ID to be specified. This is needed to prevent retries from
    creating multiple resources.
      */
    var RequestId: js.UndefOr[__string] = js.undefined
    /**
      * Deprecated field that's only usable by whitelisted customers.
      */
    var Reserved: js.UndefOr[__string] = js.undefined
    /**
      * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait CreateChannelResponse extends js.Object {
    var Channel: js.UndefOr[Channel] = js.undefined
  }
  
  trait CreateInputRequest extends js.Object {
    /**
      * Destination settings for PUSH type inputs.
      */
    var Destinations: js.UndefOr[__listOfInputDestinationRequest] = js.undefined
    /**
      * A list of security groups referenced by IDs to attach to the input.
      */
    var InputSecurityGroups: js.UndefOr[__listOf__string] = js.undefined
    /**
      * A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one
    Flow and presently, as many as two. The only requirement is when you have more than one is that each Flow is in a
    separate Availability Zone as this ensures your EML input is redundant to AZ issues.
      */
    var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlowRequest] = js.undefined
    /**
      * Name of the input.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * Unique identifier of the request to ensure the request is handled
    exactly once in case of retries.
      */
    var RequestId: js.UndefOr[__string] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * The source URLs for a PULL-type input. Every PULL type input needs
    exactly two source URLs for redundancy.
    Only specify sources for PULL type Inputs. Leave Destinations empty.
      */
    var Sources: js.UndefOr[__listOfInputSourceRequest] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    var Type: js.UndefOr[InputType] = js.undefined
    var Vpc: js.UndefOr[InputVpcRequest] = js.undefined
  }
  
  trait CreateInputResponse extends js.Object {
    var Input: js.UndefOr[Input] = js.undefined
  }
  
  trait CreateInputSecurityGroupRequest extends js.Object {
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * List of IPv4 CIDR addresses to whitelist
      */
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr] = js.undefined
  }
  
  trait CreateInputSecurityGroupResponse extends js.Object {
    var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
  }
  
  trait CreateTagsRequest extends js.Object {
    var ResourceArn: __string
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait DeleteChannelRequest extends js.Object {
    /**
      * Unique ID of the channel.
      */
    var ChannelId: __string
  }
  
  trait DeleteChannelResponse extends js.Object {
    /**
      * The unique arn of the channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A list of destinations of the channel. For UDP outputs, there is one
    destination per output. For other types (HLS, for example), there is
    one destination per packager.
      */
    var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
    /**
      * The endpoints where outgoing connections initiate from
      */
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined
    var EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined
    /**
      * The unique id of the channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * List of input attachments for channel.
      */
    var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined
    var InputSpecification: js.UndefOr[InputSpecification] = js.undefined
    /**
      * The log level being written to CloudWatch Logs.
      */
    var LogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * The name of the channel. (user-mutable)
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The number of currently healthy pipelines.
      */
    var PipelinesRunningCount: js.UndefOr[__integer] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    var State: js.UndefOr[ChannelState] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait DeleteInputRequest extends js.Object {
    /**
      * Unique ID of the input
      */
    var InputId: __string
  }
  
  trait DeleteInputResponse extends js.Object
  
  trait DeleteInputSecurityGroupRequest extends js.Object {
    /**
      * The Input Security Group to delete
      */
    var InputSecurityGroupId: __string
  }
  
  trait DeleteInputSecurityGroupResponse extends js.Object
  
  trait DeleteReservationRequest extends js.Object {
    /**
      * Unique reservation ID, e.g. '1234567'
      */
    var ReservationId: __string
  }
  
  trait DeleteReservationResponse extends js.Object {
    /**
      * Unique reservation ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * Number of reserved resources
      */
    var Count: js.UndefOr[__integer] = js.undefined
    /**
      * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
      */
    var CurrencyCode: js.UndefOr[__string] = js.undefined
    /**
      * Lease duration, e.g. '12'
      */
    var Duration: js.UndefOr[__integer] = js.undefined
    /**
      * Units for duration, e.g. 'MONTHS'
      */
    var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined
    /**
      * Reservation UTC end date and time in ISO-8601 format, e.g. '2019-03-01T00:00:00'
      */
    var End: js.UndefOr[__string] = js.undefined
    /**
      * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
      */
    var FixedPrice: js.UndefOr[__double] = js.undefined
    /**
      * User specified reservation name
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
      */
    var OfferingDescription: js.UndefOr[__string] = js.undefined
    /**
      * Unique offering ID, e.g. '87654321'
      */
    var OfferingId: js.UndefOr[__string] = js.undefined
    /**
      * Offering type, e.g. 'NO_UPFRONT'
      */
    var OfferingType: js.UndefOr[OfferingType] = js.undefined
    /**
      * AWS region, e.g. 'us-west-2'
      */
    var Region: js.UndefOr[__string] = js.undefined
    /**
      * Unique reservation ID, e.g. '1234567'
      */
    var ReservationId: js.UndefOr[__string] = js.undefined
    /**
      * Resource configuration details
      */
    var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined
    /**
      * Reservation UTC start date and time in ISO-8601 format, e.g. '2018-03-01T00:00:00'
      */
    var Start: js.UndefOr[__string] = js.undefined
    /**
      * Current state of reservation, e.g. 'ACTIVE'
      */
    var State: js.UndefOr[ReservationState] = js.undefined
    /**
      * Recurring usage charge for each reserved resource, e.g. '157.0'
      */
    var UsagePrice: js.UndefOr[__double] = js.undefined
  }
  
  trait DeleteTagsRequest extends js.Object {
    var ResourceArn: __string
    /**
      * An array of tag keys to delete
      */
    var TagKeys: __listOf__string
  }
  
  trait DescribeChannelRequest extends js.Object {
    /**
      * channel ID
      */
    var ChannelId: __string
  }
  
  trait DescribeChannelResponse extends js.Object {
    /**
      * The unique arn of the channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A list of destinations of the channel. For UDP outputs, there is one
    destination per output. For other types (HLS, for example), there is
    one destination per packager.
      */
    var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
    /**
      * The endpoints where outgoing connections initiate from
      */
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined
    var EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined
    /**
      * The unique id of the channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * List of input attachments for channel.
      */
    var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined
    var InputSpecification: js.UndefOr[InputSpecification] = js.undefined
    /**
      * The log level being written to CloudWatch Logs.
      */
    var LogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * The name of the channel. (user-mutable)
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The number of currently healthy pipelines.
      */
    var PipelinesRunningCount: js.UndefOr[__integer] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    var State: js.UndefOr[ChannelState] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait DescribeInputRequest extends js.Object {
    /**
      * Unique ID of the input
      */
    var InputId: __string
  }
  
  trait DescribeInputResponse extends js.Object {
    /**
      * The Unique ARN of the input (generated, immutable).
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
      */
    var AttachedChannels: js.UndefOr[__listOf__string] = js.undefined
    /**
      * A list of the destinations of the input (PUSH-type).
      */
    var Destinations: js.UndefOr[__listOfInputDestination] = js.undefined
    /**
      * The generated ID of the input (unique for user account, immutable).
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * A list of MediaConnect Flows for this input.
      */
    var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlow] = js.undefined
    /**
      * The user-assigned name (This is a mutable value).
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * A list of IDs for all the Input Security Groups attached to the input.
      */
    var SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
    /**
      * A list of the sources of the input (PULL-type).
      */
    var Sources: js.UndefOr[__listOfInputSource] = js.undefined
    var State: js.UndefOr[InputState] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    var Type: js.UndefOr[InputType] = js.undefined
  }
  
  trait DescribeInputSecurityGroupRequest extends js.Object {
    /**
      * The id of the Input Security Group to describe
      */
    var InputSecurityGroupId: __string
  }
  
  trait DescribeInputSecurityGroupResponse extends js.Object {
    /**
      * Unique ARN of Input Security Group
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The Id of the Input Security Group
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The list of inputs currently using this Input Security Group.
      */
    var Inputs: js.UndefOr[__listOf__string] = js.undefined
    /**
      * The current state of the Input Security Group.
      */
    var State: js.UndefOr[InputSecurityGroupState] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * Whitelist rules and their sync status
      */
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRule] = js.undefined
  }
  
  trait DescribeOfferingRequest extends js.Object {
    /**
      * Unique offering ID, e.g. '87654321'
      */
    var OfferingId: __string
  }
  
  trait DescribeOfferingResponse extends js.Object {
    /**
      * Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
      */
    var CurrencyCode: js.UndefOr[__string] = js.undefined
    /**
      * Lease duration, e.g. '12'
      */
    var Duration: js.UndefOr[__integer] = js.undefined
    /**
      * Units for duration, e.g. 'MONTHS'
      */
    var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined
    /**
      * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
      */
    var FixedPrice: js.UndefOr[__double] = js.undefined
    /**
      * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
      */
    var OfferingDescription: js.UndefOr[__string] = js.undefined
    /**
      * Unique offering ID, e.g. '87654321'
      */
    var OfferingId: js.UndefOr[__string] = js.undefined
    /**
      * Offering type, e.g. 'NO_UPFRONT'
      */
    var OfferingType: js.UndefOr[OfferingType] = js.undefined
    /**
      * AWS region, e.g. 'us-west-2'
      */
    var Region: js.UndefOr[__string] = js.undefined
    /**
      * Resource configuration details
      */
    var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined
    /**
      * Recurring usage charge for each reserved resource, e.g. '157.0'
      */
    var UsagePrice: js.UndefOr[__double] = js.undefined
  }
  
  trait DescribeReservationRequest extends js.Object {
    /**
      * Unique reservation ID, e.g. '1234567'
      */
    var ReservationId: __string
  }
  
  trait DescribeReservationResponse extends js.Object {
    /**
      * Unique reservation ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * Number of reserved resources
      */
    var Count: js.UndefOr[__integer] = js.undefined
    /**
      * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
      */
    var CurrencyCode: js.UndefOr[__string] = js.undefined
    /**
      * Lease duration, e.g. '12'
      */
    var Duration: js.UndefOr[__integer] = js.undefined
    /**
      * Units for duration, e.g. 'MONTHS'
      */
    var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined
    /**
      * Reservation UTC end date and time in ISO-8601 format, e.g. '2019-03-01T00:00:00'
      */
    var End: js.UndefOr[__string] = js.undefined
    /**
      * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
      */
    var FixedPrice: js.UndefOr[__double] = js.undefined
    /**
      * User specified reservation name
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
      */
    var OfferingDescription: js.UndefOr[__string] = js.undefined
    /**
      * Unique offering ID, e.g. '87654321'
      */
    var OfferingId: js.UndefOr[__string] = js.undefined
    /**
      * Offering type, e.g. 'NO_UPFRONT'
      */
    var OfferingType: js.UndefOr[OfferingType] = js.undefined
    /**
      * AWS region, e.g. 'us-west-2'
      */
    var Region: js.UndefOr[__string] = js.undefined
    /**
      * Unique reservation ID, e.g. '1234567'
      */
    var ReservationId: js.UndefOr[__string] = js.undefined
    /**
      * Resource configuration details
      */
    var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined
    /**
      * Reservation UTC start date and time in ISO-8601 format, e.g. '2018-03-01T00:00:00'
      */
    var Start: js.UndefOr[__string] = js.undefined
    /**
      * Current state of reservation, e.g. 'ACTIVE'
      */
    var State: js.UndefOr[ReservationState] = js.undefined
    /**
      * Recurring usage charge for each reserved resource, e.g. '157.0'
      */
    var UsagePrice: js.UndefOr[__double] = js.undefined
  }
  
  trait DescribeScheduleRequest extends js.Object {
    /**
      * Id of the channel whose schedule is being updated.
      */
    var ChannelId: __string
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait DescribeScheduleResponse extends js.Object {
    /**
      * The next token; for use in pagination.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * The list of actions in the schedule.
      */
    var ScheduleActions: js.UndefOr[__listOfScheduleAction] = js.undefined
  }
  
  trait DvbNitSettings extends js.Object {
    /**
      * The numeric value placed in the Network Information Table (NIT).
      */
    var NetworkId: __integerMin0Max65536
    /**
      * The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum length is 256 characters.
      */
    var NetworkName: __stringMin1Max256
    /**
      * The number of milliseconds between instances of this table in the output transport stream.
      */
    var RepInterval: js.UndefOr[__integerMin25Max10000] = js.undefined
  }
  
  trait DvbSdtSettings extends js.Object {
    /**
      * Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT information from input stream to output stream. The sdtFollowIfPresent setting copies SDT information from input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. The sdtManual setting means user will enter the SDT information. The sdtNone setting means output stream will not contain SDT information.
      */
    var OutputSdt: js.UndefOr[DvbSdtOutputSdt] = js.undefined
    /**
      * The number of milliseconds between instances of this table in the output transport stream.
      */
    var RepInterval: js.UndefOr[__integerMin25Max2000] = js.undefined
    /**
      * The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256 characters.
      */
    var ServiceName: js.UndefOr[__stringMin1Max256] = js.undefined
    /**
      * The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256 characters.
      */
    var ServiceProviderName: js.UndefOr[__stringMin1Max256] = js.undefined
  }
  
  trait DvbSubDestinationSettings extends js.Object {
    /**
      * If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. Selecting "smart" justification will left-justify live subtitles and center-justify pre-recorded subtitles.  This option is not valid for source captions that are STL or 608/embedded.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
      */
    var Alignment: js.UndefOr[DvbSubDestinationAlignment] = js.undefined
    /**
      * Specifies the color of the rectangle behind the captions.  All burn-in and DVB-Sub font settings must match.
      */
    var BackgroundColor: js.UndefOr[DvbSubDestinationBackgroundColor] = js.undefined
    /**
      * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent).  All burn-in and DVB-Sub font settings must match.
      */
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * External font file used for caption burn-in. File extension must be 'ttf' or 'tte'.  Although the user can select output fonts for many different types of input captions, embedded, STL and teletext sources use a strict grid system. Using external fonts with these caption sources could cause unexpected display of proportional fonts.  All burn-in and DVB-Sub font settings must match.
      */
    var Font: js.UndefOr[InputLocation] = js.undefined
    /**
      * Specifies the color of the burned-in captions.  This option is not valid for source captions that are STL, 608/embedded or teletext.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
      */
    var FontColor: js.UndefOr[DvbSubDestinationFontColor] = js.undefined
    /**
      * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.  All burn-in and DVB-Sub font settings must match.
      */
    var FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * Font resolution in DPI (dots per inch); default is 96 dpi.  All burn-in and DVB-Sub font settings must match.
      */
    var FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined
    /**
      * When set to auto fontSize will scale depending on the size of the output.  Giving a positive integer will specify the exact font size in points.  All burn-in and DVB-Sub font settings must match.
      */
    var FontSize: js.UndefOr[__string] = js.undefined
    /**
      * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
      */
    var OutlineColor: js.UndefOr[DvbSubDestinationOutlineColor] = js.undefined
    /**
      * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
      */
    var OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined
    /**
      * Specifies the color of the shadow cast by the captions.  All burn-in and DVB-Sub font settings must match.
      */
    var ShadowColor: js.UndefOr[DvbSubDestinationShadowColor] = js.undefined
    /**
      * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent).  All burn-in and DVB-Sub font settings must match.
      */
    var ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left.  All burn-in and DVB-Sub font settings must match.
      */
    var ShadowXOffset: js.UndefOr[__integer] = js.undefined
    /**
      * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text.  All burn-in and DVB-Sub font settings must match.
      */
    var ShadowYOffset: js.UndefOr[__integer] = js.undefined
    /**
      * Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in outputs.
      */
    var TeletextGridControl: js.UndefOr[DvbSubDestinationTeletextGridControl] = js.undefined
    /**
      * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit xPosition is provided, the horizontal caption position will be determined by the alignment parameter.  This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
      */
    var XPosition: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is provided, the caption will be positioned towards the bottom of the output.  This option is not valid for source captions that are STL, 608/embedded or teletext.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
      */
    var YPosition: js.UndefOr[__integerMin0] = js.undefined
  }
  
  trait DvbSubSourceSettings extends js.Object {
    /**
      * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed through, regardless of selectors.
      */
    var Pid: js.UndefOr[__integerMin1] = js.undefined
  }
  
  trait DvbTdtSettings extends js.Object {
    /**
      * The number of milliseconds between instances of this table in the output transport stream.
      */
    var RepInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined
  }
  
  trait Eac3Settings extends js.Object {
    /**
      * When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
      */
    var AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.undefined
    /**
      * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
      */
    var Bitrate: js.UndefOr[__double] = js.undefined
    /**
      * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on these values.
      */
    var BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.undefined
    /**
      * Dolby Digital Plus coding mode. Determines number of channels.
      */
    var CodingMode: js.UndefOr[Eac3CodingMode] = js.undefined
    /**
      * When set to enabled, activates a DC highpass filter for all input channels.
      */
    var DcFilter: js.UndefOr[Eac3DcFilter] = js.undefined
    /**
      * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed through.
      */
    var Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined
    /**
      * Sets the Dolby dynamic range compression profile.
      */
    var DrcLine: js.UndefOr[Eac3DrcLine] = js.undefined
    /**
      * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not exceed specified levels.
      */
    var DrcRf: js.UndefOr[Eac3DrcRf] = js.undefined
    /**
      * When encoding 3/2 audio, setting to lfe enables the LFE channel
      */
    var LfeControl: js.UndefOr[Eac3LfeControl] = js.undefined
    /**
      * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with codingMode32 coding mode.
      */
    var LfeFilter: js.UndefOr[Eac3LfeFilter] = js.undefined
    /**
      * Left only/Right only center mix level. Only used for 3/2 coding mode.
      */
    var LoRoCenterMixLevel: js.UndefOr[__double] = js.undefined
    /**
      * Left only/Right only surround mix level. Only used for 3/2 coding mode.
      */
    var LoRoSurroundMixLevel: js.UndefOr[__double] = js.undefined
    /**
      * Left total/Right total center mix level. Only used for 3/2 coding mode.
      */
    var LtRtCenterMixLevel: js.UndefOr[__double] = js.undefined
    /**
      * Left total/Right total surround mix level. Only used for 3/2 coding mode.
      */
    var LtRtSurroundMixLevel: js.UndefOr[__double] = js.undefined
    /**
      * When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
      */
    var MetadataControl: js.UndefOr[Eac3MetadataControl] = js.undefined
    /**
      * When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
      */
    var PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.undefined
    /**
      * When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2 coding mode.
      */
    var PhaseControl: js.UndefOr[Eac3PhaseControl] = js.undefined
    /**
      * Stereo downmix preference. Only used for 3/2 coding mode.
      */
    var StereoDownmix: js.UndefOr[Eac3StereoDownmix] = js.undefined
    /**
      * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
      */
    var SurroundExMode: js.UndefOr[Eac3SurroundExMode] = js.undefined
    /**
      * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
      */
    var SurroundMode: js.UndefOr[Eac3SurroundMode] = js.undefined
  }
  
  trait EmbeddedDestinationSettings extends js.Object
  
  trait EmbeddedPlusScte20DestinationSettings extends js.Object
  
  trait EmbeddedSourceSettings extends js.Object {
    /**
      * If upconvert, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
      */
    var Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.undefined
    /**
      * Set to "auto" to handle streams with intermittent and/or non-aligned SCTE-20 and Embedded captions.
      */
    var Scte20Detection: js.UndefOr[EmbeddedScte20Detection] = js.undefined
    /**
      * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
      */
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
    /**
      * This field is unused and deprecated.
      */
    var Source608TrackNumber: js.UndefOr[__integerMin1Max5] = js.undefined
  }
  
  trait EncoderSettings extends js.Object {
    var AudioDescriptions: __listOfAudioDescription
    /**
      * Settings for ad avail blanking.
      */
    var AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined
    /**
      * Event-wide configuration settings for ad avail insertion.
      */
    var AvailConfiguration: js.UndefOr[AvailConfiguration] = js.undefined
    /**
      * Settings for blackout slate.
      */
    var BlackoutSlate: js.UndefOr[BlackoutSlate] = js.undefined
    /**
      * Settings for caption decriptions
      */
    var CaptionDescriptions: js.UndefOr[__listOfCaptionDescription] = js.undefined
    /**
      * Configuration settings that apply to the event as a whole.
      */
    var GlobalConfiguration: js.UndefOr[GlobalConfiguration] = js.undefined
    var OutputGroups: __listOfOutputGroup
    /**
      * Contains settings used to acquire and adjust timecode information from inputs.
      */
    var TimecodeConfig: TimecodeConfig
    var VideoDescriptions: __listOfVideoDescription
  }
  
  trait FecOutputSettings extends js.Object {
    /**
      * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix.  The number of transport stream packets per column error correction packet. Must be between 4 and 20, inclusive.
      */
    var ColumnDepth: js.UndefOr[__integerMin4Max20] = js.undefined
    /**
      * Enables column only or column and row based FEC
      */
    var IncludeFec: js.UndefOr[FecOutputIncludeFec] = js.undefined
    /**
      * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix.  Must be between 1 and 20, inclusive. If only Column FEC is used, then larger values increase robustness.  If Row FEC is used, then this is the number of transport stream packets per row error correction packet, and the value must be between 4 and 20, inclusive, if includeFec is columnAndRow. If includeFec is column, this value must be 1 to 20, inclusive.
      */
    var RowLength: js.UndefOr[__integerMin1Max20] = js.undefined
  }
  
  trait FixedModeScheduleActionStartSettings extends js.Object {
    /**
      * Start time for the action to start in the channel. (Not the time for the action to be added to the schedule: actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are digits (for example, mm might be 01) except for the two constants "T" for time and "Z" for "UTC format".
      */
    var Time: __string
  }
  
  trait FollowModeScheduleActionStartSettings extends js.Object {
    /**
      * Identifies whether this action starts relative to the start or relative to the end of the reference action.
      */
    var FollowPoint: FollowPoint
    /**
      * The action name of another action that this one refers to.
      */
    var ReferenceActionName: __string
  }
  
  trait FrameCaptureGroupSettings extends js.Object {
    /**
      * The destination for the frame capture files. Either the URI for an Amazon S3 bucket and object, plus a file name prefix (for example, s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a MediaStore container, plus a file name prefix (for example, mediastoressl://sportsDelivery/20180820/curling_). The final file names consist of the prefix from the destination field (for example, "curling_") + name modifier + the counter (5 digits, starting from 00001) + extension (which is always .jpg).  For example, curlingLow.00001.jpg
      */
    var Destination: OutputLocationRef
  }
  
  trait FrameCaptureOutputSettings extends js.Object {
    /**
      * Required if the output group contains more than one output. This modifier forms part of the output file name.
      */
    var NameModifier: js.UndefOr[__string] = js.undefined
  }
  
  trait FrameCaptureSettings extends js.Object {
    /**
      * The frequency, in seconds, for capturing frames for inclusion in the output.  For example, "10" means capture a frame every 10 seconds.
      */
    var CaptureInterval: __integerMin1Max3600
  }
  
  trait GlobalConfiguration extends js.Object {
    /**
      * Value to set the initial audio gain for the Live Event.
      */
    var InitialAudioGain: js.UndefOr[__integerMinNegative60Max60] = js.undefined
    /**
      * Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs is configured the encoder will restart at the beginning of the first input.  When "none" is configured the encoder will transcode either black, a solid color, or a user specified slate images per the "Input Loss Behavior" configuration until the next input switch occurs (which is controlled through the Channel Schedule API).
      */
    var InputEndAction: js.UndefOr[GlobalConfigurationInputEndAction] = js.undefined
    /**
      * Settings for system actions when input is lost.
      */
    var InputLossBehavior: js.UndefOr[InputLossBehavior] = js.undefined
    /**
      * Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock (which optionally may be locked to another source via NTP) or should be locked to the clock of the source that is providing the input stream.
      */
    var OutputTimingSource: js.UndefOr[GlobalConfigurationOutputTimingSource] = js.undefined
    /**
      * Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for music channels with less than one video frame per second.
      */
    var SupportLowFramerateInputs: js.UndefOr[GlobalConfigurationLowFramerateInputs] = js.undefined
  }
  
  trait H264Settings extends js.Object {
    /**
      * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
      */
    var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.undefined
    /**
      * Indicates that AFD values will be written into the output stream.  If afdSignaling is "auto", the system will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value will be the value configured in the fixedAfd parameter.
      */
    var AfdSignaling: js.UndefOr[AfdSignaling] = js.undefined
    /**
      * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest multiple of 1000.
      */
    var Bitrate: js.UndefOr[__integerMin1000] = js.undefined
    /**
      * Percentage of the buffer that should initially be filled (HRD buffer model).
      */
    var BufFillPct: js.UndefOr[__integerMin0Max100] = js.undefined
    /**
      * Size of buffer (HRD buffer model) in bits/second.
      */
    var BufSize: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Includes colorspace metadata in the output.
      */
    var ColorMetadata: js.UndefOr[H264ColorMetadata] = js.undefined
    /**
      * Entropy encoding mode.  Use cabac (must be in Main or High profile) or cavlc.
      */
    var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.undefined
    /**
      * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to 'Fixed'.
      */
    var FixedAfd: js.UndefOr[FixedAfd] = js.undefined
    /**
      * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
      */
    var FlickerAq: js.UndefOr[H264FlickerAq] = js.undefined
    /**
      * This field indicates how the output video frame rate is specified.  If "specified" is selected then the output video frame rate is determined by framerateNumerator and framerateDenominator, else if "initializeFromSource" is selected then the output video frame rate will be set equal to the input video frame rate of the first input.
      */
    var FramerateControl: js.UndefOr[H264FramerateControl] = js.undefined
    /**
      * Framerate denominator.
      */
    var FramerateDenominator: js.UndefOr[__integerMin1] = js.undefined
    /**
      * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
      */
    var FramerateNumerator: js.UndefOr[__integerMin1] = js.undefined
    /**
      * Documentation update needed
      */
    var GopBReference: js.UndefOr[H264GopBReference] = js.undefined
    /**
      * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
      */
    var GopClosedCadence: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Number of B-frames between reference frames.
      */
    var GopNumBFrames: js.UndefOr[__integerMin0Max7] = js.undefined
    /**
      * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. Must be greater than zero.
      */
    var GopSize: js.UndefOr[__doubleMin1] = js.undefined
    /**
      * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a frame count at run time.
      */
    var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.undefined
    /**
      * H.264 Level.
      */
    var Level: js.UndefOr[H264Level] = js.undefined
    /**
      * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality for certain content.
      */
    var LookAheadRateControl: js.UndefOr[H264LookAheadRateControl] = js.undefined
    /**
      * For QVBR: See the tooltip for Quality level 
    For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
      */
    var MaxBitrate: js.UndefOr[__integerMin1000] = js.undefined
    /**
      * Only meaningful if sceneChangeDetect is set to enabled.  Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
      */
    var MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined
    /**
      * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
      */
    var NumRefFrames: js.UndefOr[__integerMin1Max6] = js.undefined
    /**
      * This field indicates how the output pixel aspect ratio is specified.  If "specified" is selected then the output video pixel aspect ratio is determined by parNumerator and parDenominator, else if "initializeFromSource" is selected then the output pixsel aspect ratio will be set equal to the input video pixel aspect ratio of the first input.
      */
    var ParControl: js.UndefOr[H264ParControl] = js.undefined
    /**
      * Pixel Aspect Ratio denominator.
      */
    var ParDenominator: js.UndefOr[__integerMin1] = js.undefined
    /**
      * Pixel Aspect Ratio numerator.
      */
    var ParNumerator: js.UndefOr[__integer] = js.undefined
    /**
      * H.264 Profile.
      */
    var Profile: js.UndefOr[H264Profile] = js.undefined
    /**
      * Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set values for the QVBR quality level field and Max bitrate field that suit your most important viewing devices. Recommended values are:
    - Primary screen: Quality level: 8 to 10. Max bitrate: 4M
    - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M
    - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
      */
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined
    /**
      * Rate control mode. 
    QVBR: Quality will match the specified quality level except when it is constrained by the
    maximum bitrate.  Recommended if you or your viewers pay for bandwidth.
    VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR
    if you want to maintain a specific average bitrate over the duration of the channel.
    CBR: Quality varies, depending on the video complexity. Recommended only if you distribute
    your assets to devices that cannot handle variable bitrates.
      */
    var RateControlMode: js.UndefOr[H264RateControlMode] = js.undefined
    /**
      * Sets the scan type of the output to progressive or top-field-first interlaced.
      */
    var ScanType: js.UndefOr[H264ScanType] = js.undefined
    /**
      * Scene change detection.
    - On: inserts I-frames when scene change is detected.
    - Off: does not force an I-frame when scene change is detected.
      */
    var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.undefined
    /**
      * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
    This field is optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
      */
    var Slices: js.UndefOr[__integerMin1Max32] = js.undefined
    /**
      * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
      */
    var Softness: js.UndefOr[__integerMin0Max128] = js.undefined
    /**
      * If set to enabled, adjust quantization within each frame based on spatial variation of content complexity.
      */
    var SpatialAq: js.UndefOr[H264SpatialAq] = js.undefined
    /**
      * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of B-frames used for each sub-GOP to improve visual quality.
      */
    var SubgopLength: js.UndefOr[H264SubGopLength] = js.undefined
    /**
      * Produces a bitstream compliant with SMPTE RP-2027.
      */
    var Syntax: js.UndefOr[H264Syntax] = js.undefined
    /**
      * If set to enabled, adjust quantization within each frame based on temporal variation of content complexity.
      */
    var TemporalAq: js.UndefOr[H264TemporalAq] = js.undefined
    /**
      * Determines how timecodes should be inserted into the video elementary stream.
    - 'disabled': Do not include timecodes
    - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
      */
    var TimecodeInsertion: js.UndefOr[H264TimecodeInsertionBehavior] = js.undefined
  }
  
  trait HlsAkamaiSettings extends js.Object {
    /**
      * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
      */
    var ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Size in seconds of file cache for streaming outputs.
      */
    var FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined
    /**
      * Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable this feature.
      */
    var HttpTransferMode: js.UndefOr[HlsAkamaiHttpTransferMode] = js.undefined
    /**
      * Number of retry attempts that will be made before the Live Event is put into an error state.
      */
    var NumRetries: js.UndefOr[__integerMin0] = js.undefined
    /**
      * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
      */
    var RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
    /**
      * Salt for authenticated Akamai.
      */
    var Salt: js.UndefOr[__string] = js.undefined
    /**
      * Token parameter for authenticated akamai. If not specified, _gda_ is used.
      */
    var Token: js.UndefOr[__string] = js.undefined
  }
  
  trait HlsBasicPutSettings extends js.Object {
    /**
      * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
      */
    var ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Size in seconds of file cache for streaming outputs.
      */
    var FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined
    /**
      * Number of retry attempts that will be made before the Live Event is put into an error state.
      */
    var NumRetries: js.UndefOr[__integerMin0] = js.undefined
    /**
      * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
      */
    var RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
  }
  
  trait HlsCdnSettings extends js.Object {
    var HlsAkamaiSettings: js.UndefOr[HlsAkamaiSettings] = js.undefined
    var HlsBasicPutSettings: js.UndefOr[HlsBasicPutSettings] = js.undefined
    var HlsMediaStoreSettings: js.UndefOr[HlsMediaStoreSettings] = js.undefined
    var HlsWebdavSettings: js.UndefOr[HlsWebdavSettings] = js.undefined
  }
  
  trait HlsGroupSettings extends js.Object {
    /**
      * Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
      */
    var AdMarkers: js.UndefOr[__listOfHlsAdMarkers] = js.undefined
    /**
      * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
      */
    var BaseUrlContent: js.UndefOr[__string] = js.undefined
    /**
      * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
      */
    var BaseUrlManifest: js.UndefOr[__string] = js.undefined
    /**
      * Mapping of up to 4 caption channels to caption languages.  Is only meaningful if captionLanguageSetting is set to "insert".
      */
    var CaptionLanguageMappings: js.UndefOr[__listOfCaptionLanguageMapping] = js.undefined
    /**
      * Applies only to 608 Embedded output captions.
    insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions.
    none: Include CLOSED-CAPTIONS=NONE line in the manifest.
    omit: Omit any CLOSED-CAPTIONS line from the manifest.
      */
    var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined
    /**
      * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the manifest, which prevents clients from saving media segments for later replay.
      */
    var ClientCache: js.UndefOr[HlsClientCache] = js.undefined
    /**
      * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
      */
    var CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined
    /**
      * For use with encryptionType. This is a 128-bit, 16-byte hex value represented by a 32-character text string. If ivSource is set to "explicit" then this parameter is required and is used as the IV for encryption.
      */
    var ConstantIv: js.UndefOr[__stringMin32Max32] = js.undefined
    /**
      * A directory or HTTP destination for the HLS segments, manifest files, and encryption keys (if enabled).
      */
    var Destination: OutputLocationRef
    /**
      * Place segments in subdirectories.
      */
    var DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.undefined
    /**
      * Encrypts the segments with the given encryption scheme.  Exclude this parameter if no encryption is desired.
      */
    var EncryptionType: js.UndefOr[HlsEncryptionType] = js.undefined
    /**
      * Parameters that control interactions with the CDN.
      */
    var HlsCdnSettings: js.UndefOr[HlsCdnSettings] = js.undefined
    /**
      * DISABLED: Do not create an I-frame-only manifest, but do create the master and media manifests (according to the Output Selection field).
    STANDARD: Create an I-frame-only manifest for each output that contains video, as well as the other manifests (according to the Output Selection field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries identifying the I-frame position. For example, #EXT-X-BYTERANGE:160364@1461888"
      */
    var IFrameOnlyPlaylists: js.UndefOr[IFrameOnlyPlaylistType] = js.undefined
    /**
      * Applies only if Mode field is LIVE. Specifies the maximum number of segments in the media manifest file. After this maximum, older segments are removed from the media manifest. This number must be less than or equal to the Keep Segments field.
      */
    var IndexNSegments: js.UndefOr[__integerMin3] = js.undefined
    /**
      * Parameter that control output group behavior on input loss.
      */
    var InputLossAction: js.UndefOr[InputLossActionForHlsOut] = js.undefined
    /**
      * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key for encrypting blocks. If set to "include", IV is listed in the manifest, otherwise the IV is not in the manifest.
      */
    var IvInManifest: js.UndefOr[HlsIvInManifest] = js.undefined
    /**
      * For use with encryptionType. The IV (Initialization Vector) is a 128-bit number used in conjunction with the key for encrypting blocks. If this setting is "followsSegmentNumber", it will cause the IV to change every segment (to match the segment number). If this is set to "explicit", you must enter a constantIv value.
      */
    var IvSource: js.UndefOr[HlsIvSource] = js.undefined
    /**
      * Applies only if Mode field is LIVE. Specifies the number of media segments (.ts files) to retain in the destination directory.
      */
    var KeepSegments: js.UndefOr[__integerMin1] = js.undefined
    /**
      * The value specifies how the key is represented in the resource identified by the URI.  If parameter is absent, an implicit value of "identity" is used.  A reverse DNS string can also be given.
      */
    var KeyFormat: js.UndefOr[__string] = js.undefined
    /**
      * Either a single positive integer version value or a slash delimited list of version values (1/2/3).
      */
    var KeyFormatVersions: js.UndefOr[__string] = js.undefined
    /**
      * The key provider settings.
      */
    var KeyProviderSettings: js.UndefOr[KeyProviderSettings] = js.undefined
    /**
      * When set to gzip, compresses HLS playlist.
      */
    var ManifestCompression: js.UndefOr[HlsManifestCompression] = js.undefined
    /**
      * Indicates whether the output manifest should use floating point or integer values for segment duration.
      */
    var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.undefined
    /**
      * When set, minimumSegmentLength is enforced by looking ahead and back within the specified range for a nearby avail and extending the segment size if needed.
      */
    var MinSegmentLength: js.UndefOr[__integerMin0] = js.undefined
    /**
      * If "vod", all segments are indexed and kept permanently in the destination and manifest. If "live", only the number segments specified in keepSegments and indexNSegments are kept; newer segments replace older segments, which may prevent players from rewinding all the way to the beginning of the event.
    VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is running, converting it to a "VOD" type manifest on completion of the stream.
      */
    var Mode: js.UndefOr[HlsMode] = js.undefined
    /**
      * MANIFESTSANDSEGMENTS: Generates manifests (master manifest, if applicable, and media manifests) for this output group.
    SEGMENTSONLY: Does not generate any manifests for this output group.
      */
    var OutputSelection: js.UndefOr[HlsOutputSelection] = js.undefined
    /**
      * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestampOffset.
      */
    var ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.undefined
    /**
      * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
      */
    var ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600] = js.undefined
    /**
      * ENABLED: The master manifest (.m3u8 file) for each pipeline includes information about both pipelines: first its own media files, then the media files of the other pipeline. This feature allows playout device that support stale manifest detection to switch from one manifest to the other, when the current manifest seems to be stale. There are still two destinations and two master manifests, but both master manifests reference the media files from both pipelines.
    DISABLED: The master manifest (.m3u8 file) for each pipeline includes information about its own pipeline only.
    For an HLS output group with MediaPackage as the destination, the DISABLED behavior is always followed. MediaPackage regenerates the manifests it serves to players so a redundant manifest from MediaLive is irrelevant.
      */
    var RedundantManifest: js.UndefOr[HlsRedundantManifest] = js.undefined
    /**
      * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer.
      */
    var SegmentLength: js.UndefOr[__integerMin1] = js.undefined
    /**
      * useInputSegmentation has been deprecated. The configured segment size is always used.
      */
    var SegmentationMode: js.UndefOr[HlsSegmentationMode] = js.undefined
    /**
      * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be subdirectoryPerStream for this setting to have an effect.
      */
    var SegmentsPerSubdirectory: js.UndefOr[__integerMin1] = js.undefined
    /**
      * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
      */
    var StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.undefined
    /**
      * Indicates ID3 frame that has the timecode.
      */
    var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.undefined
    /**
      * Timed Metadata interval in seconds.
      */
    var TimedMetadataId3Period: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Provides an extra millisecond delta offset to fine tune the timestamps.
      */
    var TimestampDeltaMilliseconds: js.UndefOr[__integerMin0] = js.undefined
    /**
      * SEGMENTEDFILES: Emit the program as segments - multiple .ts media files.
    SINGLEFILE: Applies only if Mode field is VOD. Emit the program as a single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags to index segments for playback. A typical use for this value is when sending the output to AWS Elemental MediaConvert, which can accept only a single media file. Playback while the channel is running is not guaranteed due to HTTP server caching.
      */
    var TsFileMode: js.UndefOr[HlsTsFileMode] = js.undefined
  }
  
  trait HlsInputSettings extends js.Object {
    /**
      * When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen, otherwise the highest bandwidth stream in the m3u8 will be chosen.  The bitrate is specified in bits per second, as in an HLS manifest.
      */
    var Bandwidth: js.UndefOr[__integerMin0] = js.undefined
    /**
      * When specified, reading of the HLS input will begin this many buffer segments from the end (most recently written segment).  When not specified, the HLS input will begin with the first segment specified in the m3u8.
      */
    var BufferSegments: js.UndefOr[__integerMin0] = js.undefined
    /**
      * The number of consecutive times that attempts to read a manifest or segment must fail before the input is considered unavailable.
      */
    var Retries: js.UndefOr[__integerMin0] = js.undefined
    /**
      * The number of seconds between retries when an attempt to read a manifest or segment fails.
      */
    var RetryInterval: js.UndefOr[__integerMin0] = js.undefined
  }
  
  trait HlsMediaStoreSettings extends js.Object {
    /**
      * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
      */
    var ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Size in seconds of file cache for streaming outputs.
      */
    var FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined
    /**
      * When set to temporal, output files are stored in non-persistent memory for faster reading and writing.
      */
    var MediaStoreStorageClass: js.UndefOr[HlsMediaStoreStorageClass] = js.undefined
    /**
      * Number of retry attempts that will be made before the Live Event is put into an error state.
      */
    var NumRetries: js.UndefOr[__integerMin0] = js.undefined
    /**
      * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
      */
    var RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
  }
  
  trait HlsOutputSettings extends js.Object {
    /**
      * Settings regarding the underlying stream. These settings are different for audio-only outputs.
      */
    var HlsSettings: HlsSettings
    /**
      * String concatenated to the end of the destination filename. Accepts \"Format Identifiers\":#formatIdentifierParameters.
      */
    var NameModifier: js.UndefOr[__stringMin1] = js.undefined
    /**
      * String concatenated to end of segment filenames.
      */
    var SegmentModifier: js.UndefOr[__string] = js.undefined
  }
  
  trait HlsSettings extends js.Object {
    var AudioOnlyHlsSettings: js.UndefOr[AudioOnlyHlsSettings] = js.undefined
    var StandardHlsSettings: js.UndefOr[StandardHlsSettings] = js.undefined
  }
  
  trait HlsTimedMetadataScheduleActionSettings extends js.Object {
    /**
      * Base64 string formatted according to the ID3 specification: http://id3.org/id3v2.4.0-structure
      */
    var Id3: __string
  }
  
  trait HlsWebdavSettings extends js.Object {
    /**
      * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
      */
    var ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Size in seconds of file cache for streaming outputs.
      */
    var FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined
    /**
      * Specify whether or not to use chunked transfer encoding to WebDAV.
      */
    var HttpTransferMode: js.UndefOr[HlsWebdavHttpTransferMode] = js.undefined
    /**
      * Number of retry attempts that will be made before the Live Event is put into an error state.
      */
    var NumRetries: js.UndefOr[__integerMin0] = js.undefined
    /**
      * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
      */
    var RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
  }
  
  trait Input extends js.Object {
    /**
      * The Unique ARN of the input (generated, immutable).
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
      */
    var AttachedChannels: js.UndefOr[__listOf__string] = js.undefined
    /**
      * A list of the destinations of the input (PUSH-type).
      */
    var Destinations: js.UndefOr[__listOfInputDestination] = js.undefined
    /**
      * The generated ID of the input (unique for user account, immutable).
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * A list of MediaConnect Flows for this input.
      */
    var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlow] = js.undefined
    /**
      * The user-assigned name (This is a mutable value).
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * A list of IDs for all the Input Security Groups attached to the input.
      */
    var SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
    /**
      * A list of the sources of the input (PULL-type).
      */
    var Sources: js.UndefOr[__listOfInputSource] = js.undefined
    var State: js.UndefOr[InputState] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    var Type: js.UndefOr[InputType] = js.undefined
  }
  
  trait InputAttachment extends js.Object {
    /**
      * User-specified name for the attachment. This is required if the user wants to use this input in an input switch action.
      */
    var InputAttachmentName: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the input
      */
    var InputId: js.UndefOr[__string] = js.undefined
    /**
      * Settings of an input (caption selector, etc.)
      */
    var InputSettings: js.UndefOr[InputSettings] = js.undefined
  }
  
  trait InputChannelLevel extends js.Object {
    /**
      * Remixing value. Units are in dB and acceptable values are within the range from -60 (mute) and 6 dB.
      */
    var Gain: __integerMinNegative60Max6
    /**
      * The index of the input channel used as a source.
      */
    var InputChannel: __integerMin0Max15
  }
  
  trait InputDestination extends js.Object {
    /**
      * The system-generated static IP address of endpoint.
    It remains fixed for the lifetime of the input.
      */
    var Ip: js.UndefOr[__string] = js.undefined
    /**
      * The port number for the input.
      */
    var Port: js.UndefOr[__string] = js.undefined
    /**
      * This represents the endpoint that the customer stream will be
    pushed to.
      */
    var Url: js.UndefOr[__string] = js.undefined
    var Vpc: js.UndefOr[InputDestinationVpc] = js.undefined
  }
  
  trait InputDestinationRequest extends js.Object {
    /**
      * A unique name for the location the RTMP stream is being pushed
    to.
      */
    var StreamName: js.UndefOr[__string] = js.undefined
  }
  
  trait InputDestinationVpc extends js.Object {
    /**
      * The availability zone of the Input destination.
      */
    var AvailabilityZone: js.UndefOr[__string] = js.undefined
    /**
      * The network interface ID of the Input destination in the VPC.
      */
    var NetworkInterfaceId: js.UndefOr[__string] = js.undefined
  }
  
  trait InputLocation extends js.Object {
    /**
      * key used to extract the password from EC2 Parameter store
      */
    var PasswordParam: js.UndefOr[__string] = js.undefined
    /**
      * Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a http:// URI) depending on the output type. For example, a RTMP destination should have a uri simliar to: "rtmp://fmsserver/live".
      */
    var Uri: __string
    /**
      * Documentation update needed
      */
    var Username: js.UndefOr[__string] = js.undefined
  }
  
  trait InputLossBehavior extends js.Object {
    /**
      * Documentation update needed
      */
    var BlackFrameMsec: js.UndefOr[__integerMin0Max1000000] = js.undefined
    /**
      * When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters representing the values of RGB.
      */
    var InputLossImageColor: js.UndefOr[__stringMin6Max6] = js.undefined
    /**
      * When input loss image type is "slate" these fields specify the parameters for accessing the slate.
      */
    var InputLossImageSlate: js.UndefOr[InputLocation] = js.undefined
    /**
      * Indicates whether to substitute a solid color or a slate into the output after input loss exceeds blackFrameMsec.
      */
    var InputLossImageType: js.UndefOr[InputLossImageType] = js.undefined
    /**
      * Documentation update needed
      */
    var RepeatFrameMsec: js.UndefOr[__integerMin0Max1000000] = js.undefined
  }
  
  trait InputSecurityGroup extends js.Object {
    /**
      * Unique ARN of Input Security Group
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The Id of the Input Security Group
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The list of inputs currently using this Input Security Group.
      */
    var Inputs: js.UndefOr[__listOf__string] = js.undefined
    /**
      * The current state of the Input Security Group.
      */
    var State: js.UndefOr[InputSecurityGroupState] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * Whitelist rules and their sync status
      */
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRule] = js.undefined
  }
  
  trait InputSettings extends js.Object {
    /**
      * Used to select the audio stream to decode for inputs that have multiple available.
      */
    var AudioSelectors: js.UndefOr[__listOfAudioSelector] = js.undefined
    /**
      * Used to select the caption input to use for inputs that have multiple available.
      */
    var CaptionSelectors: js.UndefOr[__listOfCaptionSelector] = js.undefined
    /**
      * Enable or disable the deblock filter when filtering.
      */
    var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined
    /**
      * Enable or disable the denoise filter when filtering.
      */
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined
    /**
      * Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
      */
    var FilterStrength: js.UndefOr[__integerMin1Max5] = js.undefined
    /**
      * Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default.
    1) auto - filtering will be applied depending on input type/quality
    2) disabled - no filtering will be applied to the input
    3) forced - filtering will be applied regardless of input type
      */
    var InputFilter: js.UndefOr[InputFilter] = js.undefined
    /**
      * Input settings.
      */
    var NetworkInputSettings: js.UndefOr[NetworkInputSettings] = js.undefined
    /**
      * Loop input if it is a file. This allows a file input to be streamed indefinitely.
      */
    var SourceEndBehavior: js.UndefOr[InputSourceEndBehavior] = js.undefined
    /**
      * Informs which video elementary stream to decode for input types that have multiple available.
      */
    var VideoSelector: js.UndefOr[VideoSelector] = js.undefined
  }
  
  trait InputSource extends js.Object {
    /**
      * The key used to extract the password from EC2 Parameter store.
      */
    var PasswordParam: js.UndefOr[__string] = js.undefined
    /**
      * This represents the customer's source URL where stream is
    pulled from.
      */
    var Url: js.UndefOr[__string] = js.undefined
    /**
      * The username for the input source.
      */
    var Username: js.UndefOr[__string] = js.undefined
  }
  
  trait InputSourceRequest extends js.Object {
    /**
      * The key used to extract the password from EC2 Parameter store.
      */
    var PasswordParam: js.UndefOr[__string] = js.undefined
    /**
      * This represents the customer's source URL where stream is
    pulled from.
      */
    var Url: js.UndefOr[__string] = js.undefined
    /**
      * The username for the input source.
      */
    var Username: js.UndefOr[__string] = js.undefined
  }
  
  trait InputSpecification extends js.Object {
    /**
      * Input codec
      */
    var Codec: js.UndefOr[InputCodec] = js.undefined
    /**
      * Maximum input bitrate, categorized coarsely
      */
    var MaximumBitrate: js.UndefOr[InputMaximumBitrate] = js.undefined
    /**
      * Input resolution, categorized coarsely
      */
    var Resolution: js.UndefOr[InputResolution] = js.undefined
  }
  
  trait InputSwitchScheduleActionSettings extends js.Object {
    /**
      * The name of the input attachment that should be switched to by this action.
      */
    var InputAttachmentNameReference: __string
  }
  
  trait InputVpcRequest extends js.Object {
    /**
      * A list of up to 5 EC2 VPC security group IDs to attach to the Input VPC network interfaces.
    Requires subnetIds. If none are specified then the VPC default security group will be used.
      */
    var SecurityGroupIds: js.UndefOr[__listOf__string] = js.undefined
    /**
      * A list of 2 VPC subnet IDs from the same VPC.
    Subnet IDs must be mapped to two unique availability zones (AZ).
      */
    var SubnetIds: __listOf__string
  }
  
  trait InputWhitelistRule extends js.Object {
    /**
      * The IPv4 CIDR that's whitelisted.
      */
    var Cidr: js.UndefOr[__string] = js.undefined
  }
  
  trait InputWhitelistRuleCidr extends js.Object {
    /**
      * The IPv4 CIDR to whitelist.
      */
    var Cidr: js.UndefOr[__string] = js.undefined
  }
  
  trait KeyProviderSettings extends js.Object {
    var StaticKeySettings: js.UndefOr[StaticKeySettings] = js.undefined
  }
  
  trait ListChannelsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListChannelsResponse extends js.Object {
    var Channels: js.UndefOr[__listOfChannelSummary] = js.undefined
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListInputSecurityGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListInputSecurityGroupsResponse extends js.Object {
    /**
      * List of input security groups
      */
    var InputSecurityGroups: js.UndefOr[__listOfInputSecurityGroup] = js.undefined
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListInputsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListInputsResponse extends js.Object {
    var Inputs: js.UndefOr[__listOfInput] = js.undefined
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListOfferingsRequest extends js.Object {
    /**
      * Filter to offerings that match the configuration of an existing channel, e.g. '2345678' (a channel ID)
      */
    var ChannelConfiguration: js.UndefOr[__string] = js.undefined
    /**
      * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
      */
    var Codec: js.UndefOr[__string] = js.undefined
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
      */
    var MaximumBitrate: js.UndefOr[__string] = js.undefined
    /**
      * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
      */
    var MaximumFramerate: js.UndefOr[__string] = js.undefined
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Filter by resolution, 'SD', 'HD', or 'UHD'
      */
    var Resolution: js.UndefOr[__string] = js.undefined
    /**
      * Filter by resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
      */
    var ResourceType: js.UndefOr[__string] = js.undefined
    /**
      * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
      */
    var SpecialFeature: js.UndefOr[__string] = js.undefined
    /**
      * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
      */
    var VideoQuality: js.UndefOr[__string] = js.undefined
  }
  
  trait ListOfferingsResponse extends js.Object {
    /**
      * Token to retrieve the next page of results
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * List of offerings
      */
    var Offerings: js.UndefOr[__listOfOffering] = js.undefined
  }
  
  trait ListReservationsRequest extends js.Object {
    /**
      * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
      */
    var Codec: js.UndefOr[__string] = js.undefined
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
      */
    var MaximumBitrate: js.UndefOr[__string] = js.undefined
    /**
      * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
      */
    var MaximumFramerate: js.UndefOr[__string] = js.undefined
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Filter by resolution, 'SD', 'HD', or 'UHD'
      */
    var Resolution: js.UndefOr[__string] = js.undefined
    /**
      * Filter by resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
      */
    var ResourceType: js.UndefOr[__string] = js.undefined
    /**
      * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
      */
    var SpecialFeature: js.UndefOr[__string] = js.undefined
    /**
      * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
      */
    var VideoQuality: js.UndefOr[__string] = js.undefined
  }
  
  trait ListReservationsResponse extends js.Object {
    /**
      * Token to retrieve the next page of results
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * List of reservations
      */
    var Reservations: js.UndefOr[__listOfReservation] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait M2tsSettings extends js.Object {
    /**
      * When set to drop, output audio streams will be removed from the program if the selected input audio stream is removed from the input. This allows the output audio configuration to dynamically change based on input configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when not connected to an active input stream.
      */
    var AbsentInputAudioBehavior: js.UndefOr[M2tsAbsentInputAudioBehavior] = js.undefined
    /**
      * When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
      */
    var Arib: js.UndefOr[M2tsArib] = js.undefined
    /**
      * Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var AribCaptionsPid: js.UndefOr[__string] = js.undefined
    /**
      * If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids.  If set to useConfigured, ARIB Captions will be on the configured pid number.
      */
    var AribCaptionsPidControl: js.UndefOr[M2tsAribCaptionsPidControl] = js.undefined
    /**
      * When set to dvb, uses DVB buffer model for Dolby Digital audio.  When set to atsc, the ATSC model is used.
      */
    var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.undefined
    /**
      * The number of audio frames to insert for each PES packet.
      */
    var AudioFramesPerPes: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var AudioPids: js.UndefOr[__string] = js.undefined
    /**
      * When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses stream type = 0x06.
      */
    var AudioStreamType: js.UndefOr[M2tsAudioStreamType] = js.undefined
    /**
      * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically determine the appropriate bitrate.
      */
    var Bitrate: js.UndefOr[__integerMin0] = js.undefined
    /**
      * If set to multiplex, use multiplex buffer model for accurate interleaving.  Setting to bufferModel to none can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
      */
    var BufferModel: js.UndefOr[M2tsBufferModel] = js.undefined
    /**
      * When set to enabled, generates captionServiceDescriptor in PMT.
      */
    var CcDescriptor: js.UndefOr[M2tsCcDescriptor] = js.undefined
    /**
      * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
      */
    var DvbNitSettings: js.UndefOr[DvbNitSettings] = js.undefined
    /**
      * Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
      */
    var DvbSdtSettings: js.UndefOr[DvbSdtSettings] = js.undefined
    /**
      * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var DvbSubPids: js.UndefOr[__string] = js.undefined
    /**
      * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
      */
    var DvbTdtSettings: js.UndefOr[DvbTdtSettings] = js.undefined
    /**
      * Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var DvbTeletextPid: js.UndefOr[__string] = js.undefined
    /**
      * If set to passthrough, passes any EBIF data from the input source to this output.
      */
    var Ebif: js.UndefOr[M2tsEbifControl] = js.undefined
    /**
      * When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. Only available when EBP Cablelabs segmentation markers are selected.  Partitions 1 and 2 will always follow the video interval.
      */
    var EbpAudioInterval: js.UndefOr[M2tsAudioInterval] = js.undefined
    /**
      * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by looking ahead at input video. If another EBP is going to come in within the specified time interval, the current EBP is not emitted, and the segment is "stretched" to the next marker.  The lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead accurate.
      */
    var EbpLookaheadMs: js.UndefOr[__integerMin0Max10000] = js.undefined
    /**
      * Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the video PID and all audio PIDs.  If set to videoPid, EBP markers will be placed on only the video PID.
      */
    var EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.undefined
    /**
      * This field is unused and deprecated.
      */
    var EcmPid: js.UndefOr[__string] = js.undefined
    /**
      * Include or exclude the ES Rate field in the PES header.
      */
    var EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.undefined
    /**
      * Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var EtvPlatformPid: js.UndefOr[__string] = js.undefined
    /**
      * Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var EtvSignalPid: js.UndefOr[__string] = js.undefined
    /**
      * The length in seconds of each fragment. Only used with EBP markers.
      */
    var FragmentTime: js.UndefOr[__doubleMin0] = js.undefined
    /**
      * If set to passthrough, passes any KLV data from the input source to this output.
      */
    var Klv: js.UndefOr[M2tsKlv] = js.undefined
    /**
      * Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var KlvDataPids: js.UndefOr[__string] = js.undefined
    /**
      * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a downstream encryption system requires periodic null packets.
      */
    var NullPacketBitrate: js.UndefOr[__doubleMin0] = js.undefined
    /**
      * The number of milliseconds between instances of this table in the output transport stream.  Valid values are 0, 10..1000.
      */
    var PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
    /**
      * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
      */
    var PcrControl: js.UndefOr[M2tsPcrControl] = js.undefined
    /**
      * Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
      */
    var PcrPeriod: js.UndefOr[__integerMin0Max500] = js.undefined
    /**
      * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var PcrPid: js.UndefOr[__string] = js.undefined
    /**
      * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0, 10..1000.
      */
    var PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
    /**
      * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var PmtPid: js.UndefOr[__string] = js.undefined
    /**
      * The value of the program number field in the Program Map Table.
      */
    var ProgramNum: js.UndefOr[__integerMin0Max65535] = js.undefined
    /**
      * When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate setting acts as the maximum bitrate when vbr is set.
      */
    var RateMode: js.UndefOr[M2tsRateMode] = js.undefined
    /**
      * Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var Scte27Pids: js.UndefOr[__string] = js.undefined
    /**
      * Optionally pass SCTE-35 signals from the input source to this output.
      */
    var Scte35Control: js.UndefOr[M2tsScte35Control] = js.undefined
    /**
      * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var Scte35Pid: js.UndefOr[__string] = js.undefined
    /**
      * Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator bit in the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data bytes. psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
      */
    var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.undefined
    /**
      * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted.
    When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of $segmentationTime seconds.
    When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of $segmentationTime seconds. Note that EBP lookahead is a slight exception to this rule.
      */
    var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.undefined
    /**
      * The length in seconds of each segment. Required unless markers is set to None_.
      */
    var SegmentationTime: js.UndefOr[__doubleMin1] = js.undefined
    /**
      * When set to passthrough, timed metadata will be passed through from input to output.
      */
    var TimedMetadataBehavior: js.UndefOr[M2tsTimedMetadataBehavior] = js.undefined
    /**
      * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var TimedMetadataPid: js.UndefOr[__string] = js.undefined
    /**
      * The value of the transport stream ID field in the Program Map Table.
      */
    var TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined
    /**
      * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
      */
    var VideoPid: js.UndefOr[__string] = js.undefined
  }
  
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
  
  trait MediaConnectFlow extends js.Object {
    /**
      * The unique ARN of the MediaConnect Flow being used as a source.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
  }
  
  trait MediaConnectFlowRequest extends js.Object {
    /**
      * The ARN of the MediaConnect Flow that you want to use as a source.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
  }
  
  trait MediaPackageGroupSettings extends js.Object {
    /**
      * MediaPackage channel destination.
      */
    var Destination: OutputLocationRef
  }
  
  trait MediaPackageOutputDestinationSettings extends js.Object {
    /**
      * ID of the channel in MediaPackage that is the destination for this output group. You do not need to specify the individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive pipelines to the two MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the same region.
      */
    var ChannelId: js.UndefOr[__stringMin1] = js.undefined
  }
  
  trait MediaPackageOutputSettings extends js.Object
  
  trait Mp2Settings extends js.Object {
    /**
      * Average bitrate in bits/second.
      */
    var Bitrate: js.UndefOr[__double] = js.undefined
    /**
      * The MPEG2 Audio coding mode.  Valid values are codingMode10 (for mono) or codingMode20 (for stereo).
      */
    var CodingMode: js.UndefOr[Mp2CodingMode] = js.undefined
    /**
      * Sample rate in Hz.
      */
    var SampleRate: js.UndefOr[__double] = js.undefined
  }
  
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
  
  trait MsSmoothOutputSettings extends js.Object {
    /**
      * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
      */
    var NameModifier: js.UndefOr[__string] = js.undefined
  }
  
  trait NetworkInputSettings extends js.Object {
    /**
      * Specifies HLS input settings when the uri is for a HLS manifest.
      */
    var HlsInputSettings: js.UndefOr[HlsInputSettings] = js.undefined
    /**
      * Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will be checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket name) do not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the event to error. This setting is ignored for protocols that do not use https.
      */
    var ServerValidation: js.UndefOr[NetworkInputServerValidation] = js.undefined
  }
  
  trait Offering extends js.Object {
    /**
      * Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
      */
    var CurrencyCode: js.UndefOr[__string] = js.undefined
    /**
      * Lease duration, e.g. '12'
      */
    var Duration: js.UndefOr[__integer] = js.undefined
    /**
      * Units for duration, e.g. 'MONTHS'
      */
    var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined
    /**
      * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
      */
    var FixedPrice: js.UndefOr[__double] = js.undefined
    /**
      * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
      */
    var OfferingDescription: js.UndefOr[__string] = js.undefined
    /**
      * Unique offering ID, e.g. '87654321'
      */
    var OfferingId: js.UndefOr[__string] = js.undefined
    /**
      * Offering type, e.g. 'NO_UPFRONT'
      */
    var OfferingType: js.UndefOr[OfferingType] = js.undefined
    /**
      * AWS region, e.g. 'us-west-2'
      */
    var Region: js.UndefOr[__string] = js.undefined
    /**
      * Resource configuration details
      */
    var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined
    /**
      * Recurring usage charge for each reserved resource, e.g. '157.0'
      */
    var UsagePrice: js.UndefOr[__double] = js.undefined
  }
  
  trait Output extends js.Object {
    /**
      * The names of the AudioDescriptions used as audio sources for this output.
      */
    var AudioDescriptionNames: js.UndefOr[__listOf__string] = js.undefined
    /**
      * The names of the CaptionDescriptions used as caption sources for this output.
      */
    var CaptionDescriptionNames: js.UndefOr[__listOf__string] = js.undefined
    /**
      * The name used to identify an output.
      */
    var OutputName: js.UndefOr[__stringMin1Max255] = js.undefined
    /**
      * Output type-specific settings.
      */
    var OutputSettings: OutputSettings
    /**
      * The name of the VideoDescription used as the source for this output.
      */
    var VideoDescriptionName: js.UndefOr[__string] = js.undefined
  }
  
  trait OutputDestination extends js.Object {
    /**
      * User-specified id. This is used in an output group or an output.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Destination settings for a MediaPackage output; one destination for both encoders.
      */
    var MediaPackageSettings: js.UndefOr[__listOfMediaPackageOutputDestinationSettings] = js.undefined
    /**
      * Destination settings for a standard output; one destination for each redundant encoder.
      */
    var Settings: js.UndefOr[__listOfOutputDestinationSettings] = js.undefined
  }
  
  trait OutputDestinationSettings extends js.Object {
    /**
      * key used to extract the password from EC2 Parameter store
      */
    var PasswordParam: js.UndefOr[__string] = js.undefined
    /**
      * Stream name for RTMP destinations (URLs of type rtmp://)
      */
    var StreamName: js.UndefOr[__string] = js.undefined
    /**
      * A URL specifying a destination
      */
    var Url: js.UndefOr[__string] = js.undefined
    /**
      * username for destination
      */
    var Username: js.UndefOr[__string] = js.undefined
  }
  
  trait OutputGroup extends js.Object {
    /**
      * Custom output group name optionally defined by the user.  Only letters, numbers, and the underscore character allowed; only 32 characters allowed.
      */
    var Name: js.UndefOr[__stringMax32] = js.undefined
    /**
      * Settings associated with the output group.
      */
    var OutputGroupSettings: OutputGroupSettings
    var Outputs: __listOfOutput
  }
  
  trait OutputGroupSettings extends js.Object {
    var ArchiveGroupSettings: js.UndefOr[ArchiveGroupSettings] = js.undefined
    var FrameCaptureGroupSettings: js.UndefOr[FrameCaptureGroupSettings] = js.undefined
    var HlsGroupSettings: js.UndefOr[HlsGroupSettings] = js.undefined
    var MediaPackageGroupSettings: js.UndefOr[MediaPackageGroupSettings] = js.undefined
    var MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings] = js.undefined
    var RtmpGroupSettings: js.UndefOr[RtmpGroupSettings] = js.undefined
    var UdpGroupSettings: js.UndefOr[UdpGroupSettings] = js.undefined
  }
  
  trait OutputLocationRef extends js.Object {
    var DestinationRefId: js.UndefOr[__string] = js.undefined
  }
  
  trait OutputSettings extends js.Object {
    var ArchiveOutputSettings: js.UndefOr[ArchiveOutputSettings] = js.undefined
    var FrameCaptureOutputSettings: js.UndefOr[FrameCaptureOutputSettings] = js.undefined
    var HlsOutputSettings: js.UndefOr[HlsOutputSettings] = js.undefined
    var MediaPackageOutputSettings: js.UndefOr[MediaPackageOutputSettings] = js.undefined
    var MsSmoothOutputSettings: js.UndefOr[MsSmoothOutputSettings] = js.undefined
    var RtmpOutputSettings: js.UndefOr[RtmpOutputSettings] = js.undefined
    var UdpOutputSettings: js.UndefOr[UdpOutputSettings] = js.undefined
  }
  
  trait PassThroughSettings extends js.Object
  
  trait PauseStateScheduleActionSettings extends js.Object {
    var Pipelines: js.UndefOr[__listOfPipelinePauseStateSettings] = js.undefined
  }
  
  trait PipelinePauseStateSettings extends js.Object {
    /**
      * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
      */
    var PipelineId: PipelineId
  }
  
  trait PurchaseOfferingRequest extends js.Object {
    /**
      * Number of resources
      */
    var Count: __integerMin1
    /**
      * Name for the new reservation
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * Offering to purchase, e.g. '87654321'
      */
    var OfferingId: __string
    /**
      * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
      */
    var RequestId: js.UndefOr[__string] = js.undefined
    /**
      * Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first day of the current month and one year from now. If no value is given, the default is now.
      */
    var Start: js.UndefOr[__string] = js.undefined
  }
  
  trait PurchaseOfferingResponse extends js.Object {
    var Reservation: js.UndefOr[Reservation] = js.undefined
  }
  
  trait RemixSettings extends js.Object {
    /**
      * Mapping of input channels to output channels, with appropriate gain adjustments.
      */
    var ChannelMappings: __listOfAudioChannelMapping
    /**
      * Number of input channels to be used.
      */
    var ChannelsIn: js.UndefOr[__integerMin1Max16] = js.undefined
    /**
      * Number of output channels to be produced.
    Valid values: 1, 2, 4, 6, 8
      */
    var ChannelsOut: js.UndefOr[__integerMin1Max8] = js.undefined
  }
  
  trait Reservation extends js.Object {
    /**
      * Unique reservation ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * Number of reserved resources
      */
    var Count: js.UndefOr[__integer] = js.undefined
    /**
      * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
      */
    var CurrencyCode: js.UndefOr[__string] = js.undefined
    /**
      * Lease duration, e.g. '12'
      */
    var Duration: js.UndefOr[__integer] = js.undefined
    /**
      * Units for duration, e.g. 'MONTHS'
      */
    var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined
    /**
      * Reservation UTC end date and time in ISO-8601 format, e.g. '2019-03-01T00:00:00'
      */
    var End: js.UndefOr[__string] = js.undefined
    /**
      * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
      */
    var FixedPrice: js.UndefOr[__double] = js.undefined
    /**
      * User specified reservation name
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
      */
    var OfferingDescription: js.UndefOr[__string] = js.undefined
    /**
      * Unique offering ID, e.g. '87654321'
      */
    var OfferingId: js.UndefOr[__string] = js.undefined
    /**
      * Offering type, e.g. 'NO_UPFRONT'
      */
    var OfferingType: js.UndefOr[OfferingType] = js.undefined
    /**
      * AWS region, e.g. 'us-west-2'
      */
    var Region: js.UndefOr[__string] = js.undefined
    /**
      * Unique reservation ID, e.g. '1234567'
      */
    var ReservationId: js.UndefOr[__string] = js.undefined
    /**
      * Resource configuration details
      */
    var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined
    /**
      * Reservation UTC start date and time in ISO-8601 format, e.g. '2018-03-01T00:00:00'
      */
    var Start: js.UndefOr[__string] = js.undefined
    /**
      * Current state of reservation, e.g. 'ACTIVE'
      */
    var State: js.UndefOr[ReservationState] = js.undefined
    /**
      * Recurring usage charge for each reserved resource, e.g. '157.0'
      */
    var UsagePrice: js.UndefOr[__double] = js.undefined
  }
  
  trait ReservationResourceSpecification extends js.Object {
    /**
      * Codec, e.g. 'AVC'
      */
    var Codec: js.UndefOr[ReservationCodec] = js.undefined
    /**
      * Maximum bitrate, e.g. 'MAX_20_MBPS'
      */
    var MaximumBitrate: js.UndefOr[ReservationMaximumBitrate] = js.undefined
    /**
      * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
      */
    var MaximumFramerate: js.UndefOr[ReservationMaximumFramerate] = js.undefined
    /**
      * Resolution, e.g. 'HD'
      */
    var Resolution: js.UndefOr[ReservationResolution] = js.undefined
    /**
      * Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
      */
    var ResourceType: js.UndefOr[ReservationResourceType] = js.undefined
    /**
      * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
      */
    var SpecialFeature: js.UndefOr[ReservationSpecialFeature] = js.undefined
    /**
      * Video quality, e.g. 'STANDARD' (Outputs only)
      */
    var VideoQuality: js.UndefOr[ReservationVideoQuality] = js.undefined
  }
  
  trait RtmpCaptionInfoDestinationSettings extends js.Object
  
  trait RtmpGroupSettings extends js.Object {
    /**
      * Authentication scheme to use when connecting with CDN
      */
    var AuthenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined
    /**
      * Controls behavior when content cache fills up. If remote origin server stalls the RTMP connection and does not accept content fast enough the 'Media Cache' will fill up. When the cache reaches the duration specified by cacheLength the cache will stop accepting new content. If set to disconnectImmediately, the RTMP output will force a disconnect. Clear the media cache, and reconnect after restartDelay seconds. If set to waitForServer, the RTMP output will wait up to 5 minutes to allow the origin server to begin accepting data again.
      */
    var CacheFullBehavior: js.UndefOr[RtmpCacheFullBehavior] = js.undefined
    /**
      * Cache length, in seconds, is used to calculate buffer size.
      */
    var CacheLength: js.UndefOr[__integerMin30] = js.undefined
    /**
      * Controls the types of data that passes to onCaptionInfo outputs.  If set to 'all' then 608 and 708 carried DTVCC data will be passed.  If set to 'field1AndField2608' then DTVCC data will be stripped out, but 608 data from both fields will be passed. If set to 'field1608' then only the data carried in 608 from field 1 video will be passed.
      */
    var CaptionData: js.UndefOr[RtmpCaptionData] = js.undefined
    /**
      * Controls the behavior of this RTMP group if input becomes unavailable.
    - emitOutput: Emit a slate until input returns.
    - pauseOutput: Stop transmitting data until input returns. This does not close the underlying RTMP connection.
      */
    var InputLossAction: js.UndefOr[InputLossActionForRtmpOut] = js.undefined
    /**
      * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never restart.
      */
    var RestartDelay: js.UndefOr[__integerMin0] = js.undefined
  }
  
  trait RtmpOutputSettings extends js.Object {
    /**
      * If set to verifyAuthenticity, verify the tls certificate chain to a trusted Certificate Authority (CA).  This will cause rtmps outputs with self-signed certificates to fail.
      */
    var CertificateMode: js.UndefOr[RtmpOutputCertificateMode] = js.undefined
    /**
      * Number of seconds to wait before retrying a connection to the Flash Media server if the connection is lost.
      */
    var ConnectionRetryInterval: js.UndefOr[__integerMin1] = js.undefined
    /**
      * The RTMP endpoint excluding the stream name (eg. rtmp://host/appname). For connection to Akamai, a username and password must be supplied. URI fields accept format identifiers.
      */
    var Destination: OutputLocationRef
    /**
      * Number of retry attempts.
      */
    var NumRetries: js.UndefOr[__integerMin0] = js.undefined
  }
  
  trait ScheduleAction extends js.Object {
    /**
      * The name of the action, must be unique within the schedule. This name provides the main reference to an action once it is added to the schedule. A name is unique if it is no longer in the schedule. The schedule is automatically cleaned up to remove actions with a start time of more than 1 hour ago (approximately) so at that point a name can be reused.
      */
    var ActionName: __string
    /**
      * Settings for this schedule action.
      */
    var ScheduleActionSettings: ScheduleActionSettings
    /**
      * The time for the action to start in the channel.
      */
    var ScheduleActionStartSettings: ScheduleActionStartSettings
  }
  
  trait ScheduleActionSettings extends js.Object {
    /**
      * Action to insert HLS metadata
      */
    var HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings] = js.undefined
    /**
      * Action to switch the input
      */
    var InputSwitchSettings: js.UndefOr[InputSwitchScheduleActionSettings] = js.undefined
    /**
      * Action to pause or unpause one or both channel pipelines
      */
    var PauseStateSettings: js.UndefOr[PauseStateScheduleActionSettings] = js.undefined
    /**
      * Action to insert SCTE-35 return_to_network message
      */
    var Scte35ReturnToNetworkSettings: js.UndefOr[Scte35ReturnToNetworkScheduleActionSettings] = js.undefined
    /**
      * Action to insert SCTE-35 splice_insert message
      */
    var Scte35SpliceInsertSettings: js.UndefOr[Scte35SpliceInsertScheduleActionSettings] = js.undefined
    /**
      * Action to insert SCTE-35 time_signal message
      */
    var Scte35TimeSignalSettings: js.UndefOr[Scte35TimeSignalScheduleActionSettings] = js.undefined
    /**
      * Action to activate a static image overlay
      */
    var StaticImageActivateSettings: js.UndefOr[StaticImageActivateScheduleActionSettings] = js.undefined
    /**
      * Action to deactivate a static image overlay
      */
    var StaticImageDeactivateSettings: js.UndefOr[StaticImageDeactivateScheduleActionSettings] = js.undefined
  }
  
  trait ScheduleActionStartSettings extends js.Object {
    /**
      * Holds the start time for the action.
      */
    var FixedModeScheduleActionStartSettings: js.UndefOr[FixedModeScheduleActionStartSettings] = js.undefined
    /**
      * Specifies an action to follow for scheduling this action.
      */
    var FollowModeScheduleActionStartSettings: js.UndefOr[FollowModeScheduleActionStartSettings] = js.undefined
  }
  
  trait Scte20PlusEmbeddedDestinationSettings extends js.Object
  
  trait Scte20SourceSettings extends js.Object {
    /**
      * If upconvert, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
      */
    var Convert608To708: js.UndefOr[Scte20Convert608To708] = js.undefined
    /**
      * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
      */
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
  }
  
  trait Scte27DestinationSettings extends js.Object
  
  trait Scte27SourceSettings extends js.Object {
    /**
      * The pid field is used in conjunction with the caption selector languageCode field as follows:
      - Specify PID and Language: Extracts captions from that PID; the language is "informational".
      - Specify PID and omit Language: Extracts the specified PID.
      - Omit PID and specify Language: Extracts the specified language, whichever PID that happens to be.
      - Omit PID and omit Language: Valid only if source is DVB-Sub that is being passed through; all languages will be passed through.
      */
    var Pid: js.UndefOr[__integerMin1] = js.undefined
  }
  
  trait Scte35DeliveryRestrictions extends js.Object {
    /**
      * Corresponds to SCTE-35 archive_allowed_flag.
      */
    var ArchiveAllowedFlag: Scte35ArchiveAllowedFlag
    /**
      * Corresponds to SCTE-35 device_restrictions parameter.
      */
    var DeviceRestrictions: Scte35DeviceRestrictions
    /**
      * Corresponds to SCTE-35 no_regional_blackout_flag parameter.
      */
    var NoRegionalBlackoutFlag: Scte35NoRegionalBlackoutFlag
    /**
      * Corresponds to SCTE-35 web_delivery_allowed_flag parameter.
      */
    var WebDeliveryAllowedFlag: Scte35WebDeliveryAllowedFlag
  }
  
  trait Scte35Descriptor extends js.Object {
    /**
      * SCTE-35 Descriptor Settings.
      */
    var Scte35DescriptorSettings: Scte35DescriptorSettings
  }
  
  trait Scte35DescriptorSettings extends js.Object {
    /**
      * SCTE-35 Segmentation Descriptor.
      */
    var SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor
  }
  
  trait Scte35ReturnToNetworkScheduleActionSettings extends js.Object {
    /**
      * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
      */
    var SpliceEventId: __integerMin0Max4294967295
  }
  
  trait Scte35SegmentationDescriptor extends js.Object {
    /**
      * Holds the four SCTE-35 delivery restriction parameters.
      */
    var DeliveryRestrictions: js.UndefOr[Scte35DeliveryRestrictions] = js.undefined
    /**
      * Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
      */
    var SegmentNum: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
      */
    var SegmentationCancelIndicator: Scte35SegmentationCancelIndicator
    /**
      * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not enter a duration, the time_signal will continue until you insert a cancellation message.
      */
    var SegmentationDuration: js.UndefOr[__integerMin0Max1099511627775] = js.undefined
    /**
      * Corresponds to SCTE-35 segmentation_event_id. 
      */
    var SegmentationEventId: __integerMin0Max4294967295
    /**
      * Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35 specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK, enter the ID in hex (for example, "0x34") or decimal (for example, "52").
      */
    var SegmentationTypeId: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex characters. Do not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
      */
    var SegmentationUpid: js.UndefOr[__string] = js.undefined
    /**
      * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the SCTE-35 specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in decimal. In the CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either hex (for example, "0x0C" ) or in decimal (for example, "12").
      */
    var SegmentationUpidType: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
      */
    var SegmentsExpected: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
      */
    var SubSegmentNum: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
      * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified segmentation_type_id.
      */
    var SubSegmentsExpected: js.UndefOr[__integerMin0Max255] = js.undefined
  }
  
  trait Scte35SpliceInsert extends js.Object {
    /**
      * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to embedded SCTE 104/35 messages and does not apply to OOB messages.
      */
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined
    /**
      * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set to 0 will no longer trigger blackouts or Ad Avail slates
      */
    var NoRegionalBlackoutFlag: js.UndefOr[Scte35SpliceInsertNoRegionalBlackoutBehavior] = js.undefined
    /**
      * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set to 0 will no longer trigger blackouts or Ad Avail slates
      */
    var WebDeliveryAllowedFlag: js.UndefOr[Scte35SpliceInsertWebDeliveryAllowedBehavior] = js.undefined
  }
  
  trait Scte35SpliceInsertScheduleActionSettings extends js.Object {
    /**
      * Optional, the duration for the splice_insert, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds by 90,000. If you enter a duration, there is an expectation that the downstream system can read the duration and cue in at that time. If you do not enter a duration, the splice_insert will continue indefinitely and there is an expectation that you will enter a return_to_network to end the splice_insert at the appropriate time.
      */
    var Duration: js.UndefOr[__integerMin0Max8589934591] = js.undefined
    /**
      * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
      */
    var SpliceEventId: __integerMin0Max4294967295
  }
  
  trait Scte35TimeSignalApos extends js.Object {
    /**
      * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to embedded SCTE 104/35 messages and does not apply to OOB messages.
      */
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined
    /**
      * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set to 0 will no longer trigger blackouts or Ad Avail slates
      */
    var NoRegionalBlackoutFlag: js.UndefOr[Scte35AposNoRegionalBlackoutBehavior] = js.undefined
    /**
      * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set to 0 will no longer trigger blackouts or Ad Avail slates
      */
    var WebDeliveryAllowedFlag: js.UndefOr[Scte35AposWebDeliveryAllowedBehavior] = js.undefined
  }
  
  trait Scte35TimeSignalScheduleActionSettings extends js.Object {
    /**
      * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
      */
    var Scte35Descriptors: __listOfScte35Descriptor
  }
  
  trait SmpteTtDestinationSettings extends js.Object
  
  trait StandardHlsSettings extends js.Object {
    /**
      * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
      */
    var AudioRenditionSets: js.UndefOr[__string] = js.undefined
    var M3u8Settings: M3u8Settings
  }
  
  trait StartChannelRequest extends js.Object {
    /**
      * A request to start a channel
      */
    var ChannelId: __string
  }
  
  trait StartChannelResponse extends js.Object {
    /**
      * The unique arn of the channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A list of destinations of the channel. For UDP outputs, there is one
    destination per output. For other types (HLS, for example), there is
    one destination per packager.
      */
    var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
    /**
      * The endpoints where outgoing connections initiate from
      */
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined
    var EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined
    /**
      * The unique id of the channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * List of input attachments for channel.
      */
    var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined
    var InputSpecification: js.UndefOr[InputSpecification] = js.undefined
    /**
      * The log level being written to CloudWatch Logs.
      */
    var LogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * The name of the channel. (user-mutable)
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The number of currently healthy pipelines.
      */
    var PipelinesRunningCount: js.UndefOr[__integer] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    var State: js.UndefOr[ChannelState] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait StaticImageActivateScheduleActionSettings extends js.Object {
    /**
      * The duration in milliseconds for the image to remain on the video. If omitted or set to 0 the duration is unlimited and the image will remain until it is explicitly deactivated.
      */
    var Duration: js.UndefOr[__integerMin0] = js.undefined
    /**
      * The time in milliseconds for the image to fade in. The fade-in starts at the start time of the overlay. Default is 0 (no fade-in).
      */
    var FadeIn: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Applies only if a duration is specified. The time in milliseconds for the image to fade out. The fade-out starts when the duration time is hit, so it effectively extends the duration. Default is 0 (no fade-out).
      */
    var FadeOut: js.UndefOr[__integerMin0] = js.undefined
    /**
      * The height of the image when inserted into the video, in pixels. The overlay will be scaled up or down to the specified height. Leave blank to use the native height of the overlay.
      */
    var Height: js.UndefOr[__integerMin1] = js.undefined
    /**
      * The location and filename of the image file to overlay on the video. The file must be a 32-bit BMP, PNG, or TGA file, and must not be larger (in pixels) than the input video.
      */
    var Image: InputLocation
    /**
      * Placement of the left edge of the overlay relative to the left edge of the video frame, in pixels. 0 (the default) is the left edge of the frame. If the placement causes the overlay to extend beyond the right edge of the underlying video, then the overlay is cropped on the right.
      */
    var ImageX: js.UndefOr[__integerMin0] = js.undefined
    /**
      * Placement of the top edge of the overlay relative to the top edge of the video frame, in pixels. 0 (the default) is the top edge of the frame. If the placement causes the overlay to extend beyond the bottom edge of the underlying video, then the overlay is cropped on the bottom.
      */
    var ImageY: js.UndefOr[__integerMin0] = js.undefined
    /**
      * The number of the layer, 0 to 7. There are 8 layers that can be overlaid on the video, each layer with a different image. The layers are in Z order, which means that overlays with higher values of layer are inserted on top of overlays with lower values of layer. Default is 0.
      */
    var Layer: js.UndefOr[__integerMin0Max7] = js.undefined
    /**
      * Opacity of image where 0 is transparent and 100 is fully opaque. Default is 100.
      */
    var Opacity: js.UndefOr[__integerMin0Max100] = js.undefined
    /**
      * The width of the image when inserted into the video, in pixels. The overlay will be scaled up or down to the specified width. Leave blank to use the native width of the overlay.
      */
    var Width: js.UndefOr[__integerMin1] = js.undefined
  }
  
  trait StaticImageDeactivateScheduleActionSettings extends js.Object {
    /**
      * The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
      */
    var FadeOut: js.UndefOr[__integerMin0] = js.undefined
    /**
      * The image overlay layer to deactivate, 0 to 7. Default is 0.
      */
    var Layer: js.UndefOr[__integerMin0Max7] = js.undefined
  }
  
  trait StaticKeySettings extends js.Object {
    /**
      * The URL of the license server used for protecting content.
      */
    var KeyProviderServer: js.UndefOr[InputLocation] = js.undefined
    /**
      * Static key value as a 32 character hexadecimal string.
      */
    var StaticKeyValue: __stringMin32Max32
  }
  
  trait StopChannelRequest extends js.Object {
    /**
      * A request to stop a running channel
      */
    var ChannelId: __string
  }
  
  trait StopChannelResponse extends js.Object {
    /**
      * The unique arn of the channel.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * A list of destinations of the channel. For UDP outputs, there is one
    destination per output. For other types (HLS, for example), there is
    one destination per packager.
      */
    var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
    /**
      * The endpoints where outgoing connections initiate from
      */
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined
    var EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined
    /**
      * The unique id of the channel.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * List of input attachments for channel.
      */
    var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined
    var InputSpecification: js.UndefOr[InputSpecification] = js.undefined
    /**
      * The log level being written to CloudWatch Logs.
      */
    var LogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * The name of the channel. (user-mutable)
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The number of currently healthy pipelines.
      */
    var PipelinesRunningCount: js.UndefOr[__integer] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    var State: js.UndefOr[ChannelState] = js.undefined
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait Tags
    extends /* key */ org.scalablytyped.runtime.StringDictionary[__string]
  
  trait TeletextDestinationSettings extends js.Object
  
  trait TeletextSourceSettings extends js.Object {
    /**
      * Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100 (256) to 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x" prefix.
      */
    var PageNumber: js.UndefOr[__string] = js.undefined
  }
  
  trait TimecodeConfig extends js.Object {
    /**
      * Identifies the source for the timecode that will be associated with the events outputs.
    -Embedded (embedded): Initialize the output timecode with timecode from the the source.  If no embedded timecode is detected in the source, the system falls back to using "Start at 0" (zerobased).
    -System Clock (systemclock): Use the UTC time.
    -Start at 0 (zerobased): The time of the first frame of the event will be 00:00:00:00.
      */
    var Source: TimecodeConfigSource
    /**
      * Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies below this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No timecode sync when this is not specified.
      */
    var SyncThreshold: js.UndefOr[__integerMin1Max1000000] = js.undefined
  }
  
  trait TtmlDestinationSettings extends js.Object {
    /**
      * When set to passthrough, passes through style and position information from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
      */
    var StyleControl: js.UndefOr[TtmlDestinationStyleControl] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Update a channel schedule
      */
    def batchUpdateSchedule(): awsDashSdkLib.libRequestMod.Request[BatchUpdateScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchUpdateSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchUpdateScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchUpdateScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a channel schedule
      */
    def batchUpdateSchedule(params: BatchUpdateScheduleRequest): awsDashSdkLib.libRequestMod.Request[BatchUpdateScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchUpdateSchedule(
      params: BatchUpdateScheduleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchUpdateScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchUpdateScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new channel
      */
    def createChannel(): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new channel
      */
    def createChannel(params: CreateChannelRequest): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createChannel(
      params: CreateChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create an input
      */
    def createInput(): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createInput(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create an input
      */
    def createInput(params: CreateInputRequest): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createInput(
      params: CreateInputRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Input Security Group
      */
    def createInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[CreateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createInputSecurityGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInputSecurityGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Input Security Group
      */
    def createInputSecurityGroup(params: CreateInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createInputSecurityGroup(
      params: CreateInputSecurityGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInputSecurityGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create tags for a resource
      */
    def createTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create tags for a resource
      */
    def createTags(params: CreateTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTags(
      params: CreateTagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts deletion of channel. The associated outputs are also deleted.
      */
    def deleteChannel(): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts deletion of channel. The associated outputs are also deleted.
      */
    def deleteChannel(params: DeleteChannelRequest): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteChannel(
      params: DeleteChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the input end point
      */
    def deleteInput(): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInput(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the input end point
      */
    def deleteInput(params: DeleteInputRequest): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInput(
      params: DeleteInputRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an Input Security Group
      */
    def deleteInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[DeleteInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInputSecurityGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInputSecurityGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an Input Security Group
      */
    def deleteInputSecurityGroup(params: DeleteInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInputSecurityGroup(
      params: DeleteInputSecurityGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInputSecurityGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an expired reservation.
      */
    def deleteReservation(): awsDashSdkLib.libRequestMod.Request[DeleteReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReservation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReservationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an expired reservation.
      */
    def deleteReservation(params: DeleteReservationRequest): awsDashSdkLib.libRequestMod.Request[DeleteReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReservation(
      params: DeleteReservationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReservationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes tags for a resource
      */
    def deleteTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes tags for a resource
      */
    def deleteTags(params: DeleteTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTags(
      params: DeleteTagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details about a channel
      */
    def describeChannel(): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details about a channel
      */
    def describeChannel(params: DescribeChannelRequest): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeChannel(
      params: DescribeChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces details about an input
      */
    def describeInput(): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInput(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces details about an input
      */
    def describeInput(params: DescribeInputRequest): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInput(
      params: DescribeInputRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces a summary of an Input Security Group
      */
    def describeInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[DescribeInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInputSecurityGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInputSecurityGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces a summary of an Input Security Group
      */
    def describeInputSecurityGroup(params: DescribeInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInputSecurityGroup(
      params: DescribeInputSecurityGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInputSecurityGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get details for an offering.
      */
    def describeOffering(): awsDashSdkLib.libRequestMod.Request[DescribeOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOffering(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeOfferingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get details for an offering.
      */
    def describeOffering(params: DescribeOfferingRequest): awsDashSdkLib.libRequestMod.Request[DescribeOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOffering(
      params: DescribeOfferingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeOfferingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get details for a reservation.
      */
    def describeReservation(): awsDashSdkLib.libRequestMod.Request[DescribeReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReservation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReservationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get details for a reservation.
      */
    def describeReservation(params: DescribeReservationRequest): awsDashSdkLib.libRequestMod.Request[DescribeReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReservation(
      params: DescribeReservationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReservationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReservationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get a channel schedule
      */
    def describeSchedule(): awsDashSdkLib.libRequestMod.Request[DescribeScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get a channel schedule
      */
    def describeSchedule(params: DescribeScheduleRequest): awsDashSdkLib.libRequestMod.Request[DescribeScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSchedule(
      params: DescribeScheduleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces list of channels that have been created
      */
    def listChannels(): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listChannels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListChannelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces list of channels that have been created
      */
    def listChannels(params: ListChannelsRequest): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listChannels(
      params: ListChannelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListChannelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces a list of Input Security Groups for an account
      */
    def listInputSecurityGroups(): awsDashSdkLib.libRequestMod.Request[ListInputSecurityGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInputSecurityGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInputSecurityGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInputSecurityGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces a list of Input Security Groups for an account
      */
    def listInputSecurityGroups(params: ListInputSecurityGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListInputSecurityGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInputSecurityGroups(
      params: ListInputSecurityGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInputSecurityGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInputSecurityGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces list of inputs that have been created
      */
    def listInputs(): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInputs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInputsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces list of inputs that have been created
      */
    def listInputs(params: ListInputsRequest): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInputs(
      params: ListInputsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInputsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List offerings available for purchase.
      */
    def listOfferings(): awsDashSdkLib.libRequestMod.Request[ListOfferingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOfferings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOfferingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOfferingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List offerings available for purchase.
      */
    def listOfferings(params: ListOfferingsRequest): awsDashSdkLib.libRequestMod.Request[ListOfferingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOfferings(
      params: ListOfferingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOfferingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOfferingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List purchased reservations.
      */
    def listReservations(): awsDashSdkLib.libRequestMod.Request[ListReservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReservations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReservationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List purchased reservations.
      */
    def listReservations(params: ListReservationsRequest): awsDashSdkLib.libRequestMod.Request[ListReservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReservations(
      params: ListReservationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReservationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReservationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces list of tags that have been created for a resource
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Produces list of tags that have been created for a resource
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Purchase an offering and create a reservation.
      */
    def purchaseOffering(): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def purchaseOffering(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseOfferingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Purchase an offering and create a reservation.
      */
    def purchaseOffering(params: PurchaseOfferingRequest): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def purchaseOffering(
      params: PurchaseOfferingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseOfferingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts an existing channel
      */
    def startChannel(): awsDashSdkLib.libRequestMod.Request[StartChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts an existing channel
      */
    def startChannel(params: StartChannelRequest): awsDashSdkLib.libRequestMod.Request[StartChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startChannel(
      params: StartChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a running channel
      */
    def stopChannel(): awsDashSdkLib.libRequestMod.Request[StopChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops a running channel
      */
    def stopChannel(params: StopChannelRequest): awsDashSdkLib.libRequestMod.Request[StopChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopChannel(
      params: StopChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a channel.
      */
    def updateChannel(): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateChannel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a channel.
      */
    def updateChannel(params: UpdateChannelRequest): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateChannel(
      params: UpdateChannelRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateChannelResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an input.
      */
    def updateInput(): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateInput(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateInputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an input.
      */
    def updateInput(params: UpdateInputRequest): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateInput(
      params: UpdateInputRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateInputResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an Input Security Group's Whilelists.
      */
    def updateInputSecurityGroup(): awsDashSdkLib.libRequestMod.Request[UpdateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateInputSecurityGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateInputSecurityGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an Input Security Group's Whilelists.
      */
    def updateInputSecurityGroup(params: UpdateInputSecurityGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateInputSecurityGroup(
      params: UpdateInputSecurityGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateInputSecurityGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateInputSecurityGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UdpContainerSettings extends js.Object {
    var M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined
  }
  
  trait UdpGroupSettings extends js.Object {
    /**
      * Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When dropTs is selected the entire transport stream will stop being emitted.  When dropProgram is selected the program can be dropped from the transport stream (and replaced with null packets to meet the TS bitrate requirement).  Or, when emitProgram is chosen the transport stream will continue to be produced normally with repeat frames, black frames, or slate frames substituted for the absent input video.
      */
    var InputLossAction: js.UndefOr[InputLossActionForUdpOut] = js.undefined
    /**
      * Indicates ID3 frame that has the timecode.
      */
    var TimedMetadataId3Frame: js.UndefOr[UdpTimedMetadataId3Frame] = js.undefined
    /**
      * Timed Metadata interval in seconds.
      */
    var TimedMetadataId3Period: js.UndefOr[__integerMin0] = js.undefined
  }
  
  trait UdpOutputSettings extends js.Object {
    /**
      * UDP output buffering in milliseconds. Larger values increase latency through the transcoder but simultaneously assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while accommodating clock recovery, input switching, input disruptions, picture reordering, etc.
      */
    var BufferMsec: js.UndefOr[__integerMin0Max10000] = js.undefined
    var ContainerSettings: UdpContainerSettings
    /**
      * Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg. rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
      */
    var Destination: OutputLocationRef
    /**
      * Settings for enabling and adjusting Forward Error Correction on UDP outputs.
      */
    var FecOutputSettings: js.UndefOr[FecOutputSettings] = js.undefined
  }
  
  trait UpdateChannelRequest extends js.Object {
    /**
      * channel ID
      */
    var ChannelId: __string
    /**
      * A list of output destinations for this channel.
      */
    var Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
    /**
      * The encoder settings for this channel.
      */
    var EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined
    var InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined
    /**
      * Specification of input for this channel (max. bitrate, resolution, codec, etc.)
      */
    var InputSpecification: js.UndefOr[InputSpecification] = js.undefined
    /**
      * The log level to write to CloudWatch Logs.
      */
    var LogLevel: js.UndefOr[LogLevel] = js.undefined
    /**
      * The name of the channel.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not specify this on an update call but the role was previously set that role will be removed.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateChannelResponse extends js.Object {
    var Channel: js.UndefOr[Channel] = js.undefined
  }
  
  trait UpdateInputRequest extends js.Object {
    /**
      * Destination settings for PUSH type inputs.
      */
    var Destinations: js.UndefOr[__listOfInputDestinationRequest] = js.undefined
    /**
      * Unique ID of the input.
      */
    var InputId: __string
    /**
      * A list of security groups referenced by IDs to attach to the input.
      */
    var InputSecurityGroups: js.UndefOr[__listOf__string] = js.undefined
    /**
      * A list of the MediaConnect Flow ARNs that you want to use as the source of the input. You can specify as few as one
    Flow and presently, as many as two. The only requirement is when you have more than one is that each Flow is in a
    separate Availability Zone as this ensures your EML input is redundant to AZ issues.
      */
    var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlowRequest] = js.undefined
    /**
      * Name of the input.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * The source URLs for a PULL-type input. Every PULL type input needs
    exactly two source URLs for redundancy.
    Only specify sources for PULL type Inputs. Leave Destinations empty.
      */
    var Sources: js.UndefOr[__listOfInputSourceRequest] = js.undefined
  }
  
  trait UpdateInputResponse extends js.Object {
    var Input: js.UndefOr[Input] = js.undefined
  }
  
  trait UpdateInputSecurityGroupRequest extends js.Object {
    /**
      * The id of the Input Security Group to update.
      */
    var InputSecurityGroupId: __string
    /**
      * A collection of key-value pairs.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * List of IPv4 CIDR addresses to whitelist
      */
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr] = js.undefined
  }
  
  trait UpdateInputSecurityGroupResponse extends js.Object {
    var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
  }
  
  trait VideoCodecSettings extends js.Object {
    var FrameCaptureSettings: js.UndefOr[FrameCaptureSettings] = js.undefined
    var H264Settings: js.UndefOr[H264Settings] = js.undefined
  }
  
  trait VideoDescription extends js.Object {
    /**
      * Video codec settings.
      */
    var CodecSettings: js.UndefOr[VideoCodecSettings] = js.undefined
    /**
      * Output video height, in pixels. Must be an even number. For most codecs, you can leave this field and width blank in order to use the height and width (resolution) from the source. Note, however, that leaving blank is not recommended. For the Frame Capture codec, height and width are required.
      */
    var Height: js.UndefOr[__integer] = js.undefined
    /**
      * The name of this VideoDescription. Outputs will use this name to uniquely identify this Description.  Description names should be unique within this Live Event.
      */
    var Name: __string
    /**
      * Indicates how to respond to the AFD values in the input stream. RESPOND causes input video to be clipped, depending on the AFD value, input display aspect ratio, and output display aspect ratio, and (except for FRAMECAPTURE codec) includes the values in the output. PASSTHROUGH (does not apply to FRAMECAPTURE codec) ignores the AFD values and includes the values in the output, so input video is not clipped. NONE ignores the AFD values and does not include the values through to the output, so input video is not clipped.
      */
    var RespondToAfd: js.UndefOr[VideoDescriptionRespondToAfd] = js.undefined
    /**
      * STRETCHTOOUTPUT configures the output position to stretch the video to the specified output resolution (height and width). This option will override any position value. DEFAULT may insert black boxes (pillar boxes or letter boxes) around the video to provide the specified output resolution.
      */
    var ScalingBehavior: js.UndefOr[VideoDescriptionScalingBehavior] = js.undefined
    /**
      * Changes the strength of the anti-alias filter used for scaling. 0 is the softest setting, 100 is the sharpest. A setting of 50 is recommended for most content.
      */
    var Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined
    /**
      * Output video width, in pixels. Must be an even number. For most codecs, you can leave this field and height blank in order to use the height and width (resolution) from the source. Note, however, that leaving blank is not recommended. For the Frame Capture codec, height and width are required.
      */
    var Width: js.UndefOr[__integer] = js.undefined
  }
  
  trait VideoSelector extends js.Object {
    /**
      * Specifies the colorspace of an input. This setting works in tandem with colorSpaceConversion to determine if any conversion will be performed.
      */
    var ColorSpace: js.UndefOr[VideoSelectorColorSpace] = js.undefined
    /**
      * Applies only if colorSpace is a value other than follow. This field controls how the value in the colorSpace field will be used. fallback means that when the input does include color space data, that data will be used, but when the input has no color space data, the value in colorSpace will be used. Choose fallback if your input is sometimes missing color space data, but when it does have color space data, that data is correct. force means to always use the value in colorSpace. Choose force if your input usually has no color space data or might have unreliable color space data.
      */
    var ColorSpaceUsage: js.UndefOr[VideoSelectorColorSpaceUsage] = js.undefined
    /**
      * The video selector settings.
      */
    var SelectorSettings: js.UndefOr[VideoSelectorSettings] = js.undefined
  }
  
  trait VideoSelectorPid extends js.Object {
    /**
      * Selects a specific PID from within a video source.
      */
    var Pid: js.UndefOr[__integerMin0Max8191] = js.undefined
  }
  
  trait VideoSelectorProgramId extends js.Object {
    /**
      * Selects a specific program from within a multi-program transport stream. If the program doesn't exist, the first program within the transport stream will be selected by default.
      */
    var ProgramId: js.UndefOr[__integerMin0Max65536] = js.undefined
  }
  
  trait VideoSelectorSettings extends js.Object {
    var VideoSelectorPid: js.UndefOr[VideoSelectorPid] = js.undefined
    var VideoSelectorProgramId: js.UndefOr[VideoSelectorProgramId] = js.undefined
  }
  
  trait WebvttDestinationSettings extends js.Object
  
  trait _AacCodingMode extends js.Object
  
  trait _AacInputType extends js.Object
  
  trait _AacProfile extends js.Object
  
  trait _AacRateControlMode extends js.Object
  
  trait _AacRawFormat extends js.Object
  
  trait _AacSpec extends js.Object
  
  trait _AacVbrQuality extends js.Object
  
  trait _Ac3BitstreamMode extends js.Object
  
  trait _Ac3CodingMode extends js.Object
  
  trait _Ac3DrcProfile extends js.Object
  
  trait _Ac3LfeFilter extends js.Object
  
  trait _Ac3MetadataControl extends js.Object
  
  trait _AfdSignaling extends js.Object
  
  trait _AudioDescriptionAudioTypeControl extends js.Object
  
  trait _AudioDescriptionLanguageCodeControl extends js.Object
  
  trait _AudioLanguageSelectionPolicy extends js.Object
  
  trait _AudioNormalizationAlgorithm extends js.Object
  
  trait _AudioOnlyHlsTrackType extends js.Object
  
  trait _AudioType extends js.Object
  
  trait _AuthenticationScheme extends js.Object
  
  trait _AvailBlankingState extends js.Object
  
  trait _BlackoutSlateNetworkEndBlackout extends js.Object
  
  trait _BlackoutSlateState extends js.Object
  
  trait _BurnInAlignment extends js.Object
  
  trait _BurnInBackgroundColor extends js.Object
  
  trait _BurnInFontColor extends js.Object
  
  trait _BurnInOutlineColor extends js.Object
  
  trait _BurnInShadowColor extends js.Object
  
  trait _BurnInTeletextGridControl extends js.Object
  
  trait _ChannelState extends js.Object
  
  trait _DvbSdtOutputSdt extends js.Object
  
  trait _DvbSubDestinationAlignment extends js.Object
  
  trait _DvbSubDestinationBackgroundColor extends js.Object
  
  trait _DvbSubDestinationFontColor extends js.Object
  
  trait _DvbSubDestinationOutlineColor extends js.Object
  
  trait _DvbSubDestinationShadowColor extends js.Object
  
  trait _DvbSubDestinationTeletextGridControl extends js.Object
  
  trait _Eac3AttenuationControl extends js.Object
  
  trait _Eac3BitstreamMode extends js.Object
  
  trait _Eac3CodingMode extends js.Object
  
  trait _Eac3DcFilter extends js.Object
  
  trait _Eac3DrcLine extends js.Object
  
  trait _Eac3DrcRf extends js.Object
  
  trait _Eac3LfeControl extends js.Object
  
  trait _Eac3LfeFilter extends js.Object
  
  trait _Eac3MetadataControl extends js.Object
  
  trait _Eac3PassthroughControl extends js.Object
  
  trait _Eac3PhaseControl extends js.Object
  
  trait _Eac3StereoDownmix extends js.Object
  
  trait _Eac3SurroundExMode extends js.Object
  
  trait _Eac3SurroundMode extends js.Object
  
  trait _EmbeddedConvert608To708 extends js.Object
  
  trait _EmbeddedScte20Detection extends js.Object
  
  trait _FecOutputIncludeFec extends js.Object
  
  trait _FixedAfd extends js.Object
  
  trait _FollowPoint extends js.Object
  
  trait _GlobalConfigurationInputEndAction extends js.Object
  
  trait _GlobalConfigurationLowFramerateInputs extends js.Object
  
  trait _GlobalConfigurationOutputTimingSource extends js.Object
  
  trait _H264AdaptiveQuantization extends js.Object
  
  trait _H264ColorMetadata extends js.Object
  
  trait _H264EntropyEncoding extends js.Object
  
  trait _H264FlickerAq extends js.Object
  
  trait _H264FramerateControl extends js.Object
  
  trait _H264GopBReference extends js.Object
  
  trait _H264GopSizeUnits extends js.Object
  
  trait _H264Level extends js.Object
  
  trait _H264LookAheadRateControl extends js.Object
  
  trait _H264ParControl extends js.Object
  
  trait _H264Profile extends js.Object
  
  trait _H264RateControlMode extends js.Object
  
  trait _H264ScanType extends js.Object
  
  trait _H264SceneChangeDetect extends js.Object
  
  trait _H264SpatialAq extends js.Object
  
  trait _H264SubGopLength extends js.Object
  
  trait _H264Syntax extends js.Object
  
  trait _H264TemporalAq extends js.Object
  
  trait _H264TimecodeInsertionBehavior extends js.Object
  
  trait _HlsAdMarkers extends js.Object
  
  trait _HlsAkamaiHttpTransferMode extends js.Object
  
  trait _HlsCaptionLanguageSetting extends js.Object
  
  trait _HlsClientCache extends js.Object
  
  trait _HlsCodecSpecification extends js.Object
  
  trait _HlsDirectoryStructure extends js.Object
  
  trait _HlsEncryptionType extends js.Object
  
  trait _HlsIvInManifest extends js.Object
  
  trait _HlsIvSource extends js.Object
  
  trait _HlsManifestCompression extends js.Object
  
  trait _HlsManifestDurationFormat extends js.Object
  
  trait _HlsMode extends js.Object
  
  trait _HlsOutputSelection extends js.Object
  
  trait _HlsProgramDateTime extends js.Object
  
  trait _HlsRedundantManifest extends js.Object
  
  trait _HlsSegmentationMode extends js.Object
  
  trait _HlsStreamInfResolution extends js.Object
  
  trait _HlsTimedMetadataId3Frame extends js.Object
  
  trait _HlsTsFileMode extends js.Object
  
  trait _HlsWebdavHttpTransferMode extends js.Object
  
  trait _IFrameOnlyPlaylistType extends js.Object
  
  trait _InputCodec extends js.Object
  
  trait _InputDeblockFilter extends js.Object
  
  trait _InputDenoiseFilter extends js.Object
  
  trait _InputFilter extends js.Object
  
  trait _InputLossActionForHlsOut extends js.Object
  
  trait _InputLossActionForMsSmoothOut extends js.Object
  
  trait _InputLossActionForRtmpOut extends js.Object
  
  trait _InputLossActionForUdpOut extends js.Object
  
  trait _InputLossImageType extends js.Object
  
  trait _InputMaximumBitrate extends js.Object
  
  trait _InputResolution extends js.Object
  
  trait _InputSecurityGroupState extends js.Object
  
  trait _InputSourceEndBehavior extends js.Object
  
  trait _InputState extends js.Object
  
  trait _InputType extends js.Object
  
  trait _LogLevel extends js.Object
  
  trait _M2tsAbsentInputAudioBehavior extends js.Object
  
  trait _M2tsArib extends js.Object
  
  trait _M2tsAribCaptionsPidControl extends js.Object
  
  trait _M2tsAudioBufferModel extends js.Object
  
  trait _M2tsAudioInterval extends js.Object
  
  trait _M2tsAudioStreamType extends js.Object
  
  trait _M2tsBufferModel extends js.Object
  
  trait _M2tsCcDescriptor extends js.Object
  
  trait _M2tsEbifControl extends js.Object
  
  trait _M2tsEbpPlacement extends js.Object
  
  trait _M2tsEsRateInPes extends js.Object
  
  trait _M2tsKlv extends js.Object
  
  trait _M2tsPcrControl extends js.Object
  
  trait _M2tsRateMode extends js.Object
  
  trait _M2tsScte35Control extends js.Object
  
  trait _M2tsSegmentationMarkers extends js.Object
  
  trait _M2tsSegmentationStyle extends js.Object
  
  trait _M2tsTimedMetadataBehavior extends js.Object
  
  trait _M3u8PcrControl extends js.Object
  
  trait _M3u8Scte35Behavior extends js.Object
  
  trait _M3u8TimedMetadataBehavior extends js.Object
  
  trait _Mp2CodingMode extends js.Object
  
  trait _NetworkInputServerValidation extends js.Object
  
  trait _PipelineId extends js.Object
  
  trait _ReservationCodec extends js.Object
  
  trait _ReservationMaximumBitrate extends js.Object
  
  trait _ReservationMaximumFramerate extends js.Object
  
  trait _ReservationResolution extends js.Object
  
  trait _ReservationResourceType extends js.Object
  
  trait _ReservationSpecialFeature extends js.Object
  
  trait _ReservationState extends js.Object
  
  trait _ReservationVideoQuality extends js.Object
  
  trait _RtmpCacheFullBehavior extends js.Object
  
  trait _RtmpCaptionData extends js.Object
  
  trait _RtmpOutputCertificateMode extends js.Object
  
  trait _Scte20Convert608To708 extends js.Object
  
  trait _Scte35AposNoRegionalBlackoutBehavior extends js.Object
  
  trait _Scte35AposWebDeliveryAllowedBehavior extends js.Object
  
  trait _Scte35ArchiveAllowedFlag extends js.Object
  
  trait _Scte35DeviceRestrictions extends js.Object
  
  trait _Scte35NoRegionalBlackoutFlag extends js.Object
  
  trait _Scte35SegmentationCancelIndicator extends js.Object
  
  trait _Scte35SpliceInsertNoRegionalBlackoutBehavior extends js.Object
  
  trait _Scte35SpliceInsertWebDeliveryAllowedBehavior extends js.Object
  
  trait _Scte35WebDeliveryAllowedFlag extends js.Object
  
  trait _SmoothGroupAudioOnlyTimecodeControl extends js.Object
  
  trait _SmoothGroupCertificateMode extends js.Object
  
  trait _SmoothGroupEventIdMode extends js.Object
  
  trait _SmoothGroupEventStopBehavior extends js.Object
  
  trait _SmoothGroupSegmentationMode extends js.Object
  
  trait _SmoothGroupSparseTrackType extends js.Object
  
  trait _SmoothGroupStreamManifestBehavior extends js.Object
  
  trait _SmoothGroupTimestampOffsetMode extends js.Object
  
  trait _TimecodeConfigSource extends js.Object
  
  trait _TtmlDestinationStyleControl extends js.Object
  
  trait _UdpTimedMetadataId3Frame extends js.Object
  
  trait _VideoDescriptionRespondToAfd extends js.Object
  
  trait _VideoDescriptionScalingBehavior extends js.Object
  
  trait _VideoSelectorColorSpace extends js.Object
  
  trait _VideoSelectorColorSpaceUsage extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AacCodingMode = _AacCodingMode | java.lang.String
  type AacInputType = _AacInputType | java.lang.String
  type AacProfile = _AacProfile | java.lang.String
  type AacRateControlMode = _AacRateControlMode | java.lang.String
  type AacRawFormat = _AacRawFormat | java.lang.String
  type AacSpec = _AacSpec | java.lang.String
  type AacVbrQuality = _AacVbrQuality | java.lang.String
  type Ac3BitstreamMode = _Ac3BitstreamMode | java.lang.String
  type Ac3CodingMode = _Ac3CodingMode | java.lang.String
  type Ac3DrcProfile = _Ac3DrcProfile | java.lang.String
  type Ac3LfeFilter = _Ac3LfeFilter | java.lang.String
  type Ac3MetadataControl = _Ac3MetadataControl | java.lang.String
  type AfdSignaling = _AfdSignaling | java.lang.String
  type AudioDescriptionAudioTypeControl = _AudioDescriptionAudioTypeControl | java.lang.String
  type AudioDescriptionLanguageCodeControl = _AudioDescriptionLanguageCodeControl | java.lang.String
  type AudioLanguageSelectionPolicy = _AudioLanguageSelectionPolicy | java.lang.String
  type AudioNormalizationAlgorithm = _AudioNormalizationAlgorithm | java.lang.String
  type AudioNormalizationAlgorithmControl = awsDashSdkLib.awsDashSdkLibStrings.CORRECT_AUDIO | java.lang.String
  type AudioOnlyHlsTrackType = _AudioOnlyHlsTrackType | java.lang.String
  type AudioType = _AudioType | java.lang.String
  type AuthenticationScheme = _AuthenticationScheme | java.lang.String
  type AvailBlankingState = _AvailBlankingState | java.lang.String
  type BlackoutSlateNetworkEndBlackout = _BlackoutSlateNetworkEndBlackout | java.lang.String
  type BlackoutSlateState = _BlackoutSlateState | java.lang.String
  type BurnInAlignment = _BurnInAlignment | java.lang.String
  type BurnInBackgroundColor = _BurnInBackgroundColor | java.lang.String
  type BurnInFontColor = _BurnInFontColor | java.lang.String
  type BurnInOutlineColor = _BurnInOutlineColor | java.lang.String
  type BurnInShadowColor = _BurnInShadowColor | java.lang.String
  type BurnInTeletextGridControl = _BurnInTeletextGridControl | java.lang.String
  type ChannelState = _ChannelState | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DvbSdtOutputSdt = _DvbSdtOutputSdt | java.lang.String
  type DvbSubDestinationAlignment = _DvbSubDestinationAlignment | java.lang.String
  type DvbSubDestinationBackgroundColor = _DvbSubDestinationBackgroundColor | java.lang.String
  type DvbSubDestinationFontColor = _DvbSubDestinationFontColor | java.lang.String
  type DvbSubDestinationOutlineColor = _DvbSubDestinationOutlineColor | java.lang.String
  type DvbSubDestinationShadowColor = _DvbSubDestinationShadowColor | java.lang.String
  type DvbSubDestinationTeletextGridControl = _DvbSubDestinationTeletextGridControl | java.lang.String
  type Eac3AttenuationControl = _Eac3AttenuationControl | java.lang.String
  type Eac3BitstreamMode = _Eac3BitstreamMode | java.lang.String
  type Eac3CodingMode = _Eac3CodingMode | java.lang.String
  type Eac3DcFilter = _Eac3DcFilter | java.lang.String
  type Eac3DrcLine = _Eac3DrcLine | java.lang.String
  type Eac3DrcRf = _Eac3DrcRf | java.lang.String
  type Eac3LfeControl = _Eac3LfeControl | java.lang.String
  type Eac3LfeFilter = _Eac3LfeFilter | java.lang.String
  type Eac3MetadataControl = _Eac3MetadataControl | java.lang.String
  type Eac3PassthroughControl = _Eac3PassthroughControl | java.lang.String
  type Eac3PhaseControl = _Eac3PhaseControl | java.lang.String
  type Eac3StereoDownmix = _Eac3StereoDownmix | java.lang.String
  type Eac3SurroundExMode = _Eac3SurroundExMode | java.lang.String
  type Eac3SurroundMode = _Eac3SurroundMode | java.lang.String
  type EmbeddedConvert608To708 = _EmbeddedConvert608To708 | java.lang.String
  type EmbeddedScte20Detection = _EmbeddedScte20Detection | java.lang.String
  type FecOutputIncludeFec = _FecOutputIncludeFec | java.lang.String
  type FixedAfd = _FixedAfd | java.lang.String
  type FollowPoint = _FollowPoint | java.lang.String
  type GlobalConfigurationInputEndAction = _GlobalConfigurationInputEndAction | java.lang.String
  type GlobalConfigurationLowFramerateInputs = _GlobalConfigurationLowFramerateInputs | java.lang.String
  type GlobalConfigurationOutputTimingSource = _GlobalConfigurationOutputTimingSource | java.lang.String
  type H264AdaptiveQuantization = _H264AdaptiveQuantization | java.lang.String
  type H264ColorMetadata = _H264ColorMetadata | java.lang.String
  type H264EntropyEncoding = _H264EntropyEncoding | java.lang.String
  type H264FlickerAq = _H264FlickerAq | java.lang.String
  type H264FramerateControl = _H264FramerateControl | java.lang.String
  type H264GopBReference = _H264GopBReference | java.lang.String
  type H264GopSizeUnits = _H264GopSizeUnits | java.lang.String
  type H264Level = _H264Level | java.lang.String
  type H264LookAheadRateControl = _H264LookAheadRateControl | java.lang.String
  type H264ParControl = _H264ParControl | java.lang.String
  type H264Profile = _H264Profile | java.lang.String
  type H264RateControlMode = _H264RateControlMode | java.lang.String
  type H264ScanType = _H264ScanType | java.lang.String
  type H264SceneChangeDetect = _H264SceneChangeDetect | java.lang.String
  type H264SpatialAq = _H264SpatialAq | java.lang.String
  type H264SubGopLength = _H264SubGopLength | java.lang.String
  type H264Syntax = _H264Syntax | java.lang.String
  type H264TemporalAq = _H264TemporalAq | java.lang.String
  type H264TimecodeInsertionBehavior = _H264TimecodeInsertionBehavior | java.lang.String
  type HlsAdMarkers = _HlsAdMarkers | java.lang.String
  type HlsAkamaiHttpTransferMode = _HlsAkamaiHttpTransferMode | java.lang.String
  type HlsCaptionLanguageSetting = _HlsCaptionLanguageSetting | java.lang.String
  type HlsClientCache = _HlsClientCache | java.lang.String
  type HlsCodecSpecification = _HlsCodecSpecification | java.lang.String
  type HlsDirectoryStructure = _HlsDirectoryStructure | java.lang.String
  type HlsEncryptionType = _HlsEncryptionType | java.lang.String
  type HlsIvInManifest = _HlsIvInManifest | java.lang.String
  type HlsIvSource = _HlsIvSource | java.lang.String
  type HlsManifestCompression = _HlsManifestCompression | java.lang.String
  type HlsManifestDurationFormat = _HlsManifestDurationFormat | java.lang.String
  type HlsMediaStoreStorageClass = awsDashSdkLib.awsDashSdkLibStrings.TEMPORAL | java.lang.String
  type HlsMode = _HlsMode | java.lang.String
  type HlsOutputSelection = _HlsOutputSelection | java.lang.String
  type HlsProgramDateTime = _HlsProgramDateTime | java.lang.String
  type HlsRedundantManifest = _HlsRedundantManifest | java.lang.String
  type HlsSegmentationMode = _HlsSegmentationMode | java.lang.String
  type HlsStreamInfResolution = _HlsStreamInfResolution | java.lang.String
  type HlsTimedMetadataId3Frame = _HlsTimedMetadataId3Frame | java.lang.String
  type HlsTsFileMode = _HlsTsFileMode | java.lang.String
  type HlsWebdavHttpTransferMode = _HlsWebdavHttpTransferMode | java.lang.String
  type IFrameOnlyPlaylistType = _IFrameOnlyPlaylistType | java.lang.String
  type InputCodec = _InputCodec | java.lang.String
  type InputDeblockFilter = _InputDeblockFilter | java.lang.String
  type InputDenoiseFilter = _InputDenoiseFilter | java.lang.String
  type InputFilter = _InputFilter | java.lang.String
  type InputLossActionForHlsOut = _InputLossActionForHlsOut | java.lang.String
  type InputLossActionForMsSmoothOut = _InputLossActionForMsSmoothOut | java.lang.String
  type InputLossActionForRtmpOut = _InputLossActionForRtmpOut | java.lang.String
  type InputLossActionForUdpOut = _InputLossActionForUdpOut | java.lang.String
  type InputLossImageType = _InputLossImageType | java.lang.String
  type InputMaximumBitrate = _InputMaximumBitrate | java.lang.String
  type InputResolution = _InputResolution | java.lang.String
  type InputSecurityGroupState = _InputSecurityGroupState | java.lang.String
  type InputSourceEndBehavior = _InputSourceEndBehavior | java.lang.String
  type InputState = _InputState | java.lang.String
  type InputType = _InputType | java.lang.String
  type LogLevel = _LogLevel | java.lang.String
  type M2tsAbsentInputAudioBehavior = _M2tsAbsentInputAudioBehavior | java.lang.String
  type M2tsArib = _M2tsArib | java.lang.String
  type M2tsAribCaptionsPidControl = _M2tsAribCaptionsPidControl | java.lang.String
  type M2tsAudioBufferModel = _M2tsAudioBufferModel | java.lang.String
  type M2tsAudioInterval = _M2tsAudioInterval | java.lang.String
  type M2tsAudioStreamType = _M2tsAudioStreamType | java.lang.String
  type M2tsBufferModel = _M2tsBufferModel | java.lang.String
  type M2tsCcDescriptor = _M2tsCcDescriptor | java.lang.String
  type M2tsEbifControl = _M2tsEbifControl | java.lang.String
  type M2tsEbpPlacement = _M2tsEbpPlacement | java.lang.String
  type M2tsEsRateInPes = _M2tsEsRateInPes | java.lang.String
  type M2tsKlv = _M2tsKlv | java.lang.String
  type M2tsPcrControl = _M2tsPcrControl | java.lang.String
  type M2tsRateMode = _M2tsRateMode | java.lang.String
  type M2tsScte35Control = _M2tsScte35Control | java.lang.String
  type M2tsSegmentationMarkers = _M2tsSegmentationMarkers | java.lang.String
  type M2tsSegmentationStyle = _M2tsSegmentationStyle | java.lang.String
  type M2tsTimedMetadataBehavior = _M2tsTimedMetadataBehavior | java.lang.String
  type M3u8PcrControl = _M3u8PcrControl | java.lang.String
  type M3u8Scte35Behavior = _M3u8Scte35Behavior | java.lang.String
  type M3u8TimedMetadataBehavior = _M3u8TimedMetadataBehavior | java.lang.String
  type MaxResults = scala.Double
  type Mp2CodingMode = _Mp2CodingMode | java.lang.String
  type NetworkInputServerValidation = _NetworkInputServerValidation | java.lang.String
  type OfferingDurationUnits = awsDashSdkLib.awsDashSdkLibStrings.MONTHS | java.lang.String
  type OfferingType = awsDashSdkLib.awsDashSdkLibStrings.NO_UPFRONT | java.lang.String
  type PipelineId = _PipelineId | java.lang.String
  type ReservationCodec = _ReservationCodec | java.lang.String
  type ReservationMaximumBitrate = _ReservationMaximumBitrate | java.lang.String
  type ReservationMaximumFramerate = _ReservationMaximumFramerate | java.lang.String
  type ReservationResolution = _ReservationResolution | java.lang.String
  type ReservationResourceType = _ReservationResourceType | java.lang.String
  type ReservationSpecialFeature = _ReservationSpecialFeature | java.lang.String
  type ReservationState = _ReservationState | java.lang.String
  type ReservationVideoQuality = _ReservationVideoQuality | java.lang.String
  type RtmpCacheFullBehavior = _RtmpCacheFullBehavior | java.lang.String
  type RtmpCaptionData = _RtmpCaptionData | java.lang.String
  type RtmpOutputCertificateMode = _RtmpOutputCertificateMode | java.lang.String
  type Scte20Convert608To708 = _Scte20Convert608To708 | java.lang.String
  type Scte35AposNoRegionalBlackoutBehavior = _Scte35AposNoRegionalBlackoutBehavior | java.lang.String
  type Scte35AposWebDeliveryAllowedBehavior = _Scte35AposWebDeliveryAllowedBehavior | java.lang.String
  type Scte35ArchiveAllowedFlag = _Scte35ArchiveAllowedFlag | java.lang.String
  type Scte35DeviceRestrictions = _Scte35DeviceRestrictions | java.lang.String
  type Scte35NoRegionalBlackoutFlag = _Scte35NoRegionalBlackoutFlag | java.lang.String
  type Scte35SegmentationCancelIndicator = _Scte35SegmentationCancelIndicator | java.lang.String
  type Scte35SpliceInsertNoRegionalBlackoutBehavior = _Scte35SpliceInsertNoRegionalBlackoutBehavior | java.lang.String
  type Scte35SpliceInsertWebDeliveryAllowedBehavior = _Scte35SpliceInsertWebDeliveryAllowedBehavior | java.lang.String
  type Scte35WebDeliveryAllowedFlag = _Scte35WebDeliveryAllowedFlag | java.lang.String
  type SmoothGroupAudioOnlyTimecodeControl = _SmoothGroupAudioOnlyTimecodeControl | java.lang.String
  type SmoothGroupCertificateMode = _SmoothGroupCertificateMode | java.lang.String
  type SmoothGroupEventIdMode = _SmoothGroupEventIdMode | java.lang.String
  type SmoothGroupEventStopBehavior = _SmoothGroupEventStopBehavior | java.lang.String
  type SmoothGroupSegmentationMode = _SmoothGroupSegmentationMode | java.lang.String
  type SmoothGroupSparseTrackType = _SmoothGroupSparseTrackType | java.lang.String
  type SmoothGroupStreamManifestBehavior = _SmoothGroupStreamManifestBehavior | java.lang.String
  type SmoothGroupTimestampOffsetMode = _SmoothGroupTimestampOffsetMode | java.lang.String
  type TimecodeConfigSource = _TimecodeConfigSource | java.lang.String
  type TtmlDestinationStyleControl = _TtmlDestinationStyleControl | java.lang.String
  type UdpTimedMetadataId3Frame = _UdpTimedMetadataId3Frame | java.lang.String
  type VideoDescriptionRespondToAfd = _VideoDescriptionRespondToAfd | java.lang.String
  type VideoDescriptionScalingBehavior = _VideoDescriptionScalingBehavior | java.lang.String
  type VideoSelectorColorSpace = _VideoSelectorColorSpace | java.lang.String
  type VideoSelectorColorSpaceUsage = _VideoSelectorColorSpaceUsage | java.lang.String
  type __double = scala.Double
  type __doubleMin0 = scala.Double
  type __doubleMin1 = scala.Double
  type __doubleMinNegative59Max0 = scala.Double
  type __integer = scala.Double
  type __integerMin0 = scala.Double
  type __integerMin0Max10 = scala.Double
  type __integerMin0Max100 = scala.Double
  type __integerMin0Max1000 = scala.Double
  type __integerMin0Max10000 = scala.Double
  type __integerMin0Max1000000 = scala.Double
  type __integerMin0Max1099511627775 = scala.Double
  type __integerMin0Max128 = scala.Double
  type __integerMin0Max15 = scala.Double
  type __integerMin0Max255 = scala.Double
  type __integerMin0Max30 = scala.Double
  type __integerMin0Max3600 = scala.Double
  type __integerMin0Max4294967295 = scala.Double
  type __integerMin0Max500 = scala.Double
  type __integerMin0Max600 = scala.Double
  type __integerMin0Max65535 = scala.Double
  type __integerMin0Max65536 = scala.Double
  type __integerMin0Max7 = scala.Double
  type __integerMin0Max8191 = scala.Double
  type __integerMin0Max8589934591 = scala.Double
  type __integerMin1 = scala.Double
  type __integerMin1000 = scala.Double
  type __integerMin1000Max30000 = scala.Double
  type __integerMin1Max10 = scala.Double
  type __integerMin1Max1000000 = scala.Double
  type __integerMin1Max16 = scala.Double
  type __integerMin1Max20 = scala.Double
  type __integerMin1Max31 = scala.Double
  type __integerMin1Max32 = scala.Double
  type __integerMin1Max3600 = scala.Double
  type __integerMin1Max4 = scala.Double
  type __integerMin1Max5 = scala.Double
  type __integerMin1Max6 = scala.Double
  type __integerMin1Max8 = scala.Double
  type __integerMin25Max10000 = scala.Double
  type __integerMin25Max2000 = scala.Double
  type __integerMin3 = scala.Double
  type __integerMin30 = scala.Double
  type __integerMin4Max20 = scala.Double
  type __integerMin96Max600 = scala.Double
  type __integerMinNegative1000Max1000 = scala.Double
  type __integerMinNegative60Max6 = scala.Double
  type __integerMinNegative60Max60 = scala.Double
  type __listOfAudioChannelMapping = js.Array[AudioChannelMapping]
  type __listOfAudioDescription = js.Array[AudioDescription]
  type __listOfAudioSelector = js.Array[AudioSelector]
  type __listOfCaptionDescription = js.Array[CaptionDescription]
  type __listOfCaptionLanguageMapping = js.Array[CaptionLanguageMapping]
  type __listOfCaptionSelector = js.Array[CaptionSelector]
  type __listOfChannelEgressEndpoint = js.Array[ChannelEgressEndpoint]
  type __listOfChannelSummary = js.Array[ChannelSummary]
  type __listOfHlsAdMarkers = js.Array[HlsAdMarkers]
  type __listOfInput = js.Array[Input]
  type __listOfInputAttachment = js.Array[InputAttachment]
  type __listOfInputChannelLevel = js.Array[InputChannelLevel]
  type __listOfInputDestination = js.Array[InputDestination]
  type __listOfInputDestinationRequest = js.Array[InputDestinationRequest]
  type __listOfInputSecurityGroup = js.Array[InputSecurityGroup]
  type __listOfInputSource = js.Array[InputSource]
  type __listOfInputSourceRequest = js.Array[InputSourceRequest]
  type __listOfInputWhitelistRule = js.Array[InputWhitelistRule]
  type __listOfInputWhitelistRuleCidr = js.Array[InputWhitelistRuleCidr]
  type __listOfMediaConnectFlow = js.Array[MediaConnectFlow]
  type __listOfMediaConnectFlowRequest = js.Array[MediaConnectFlowRequest]
  type __listOfMediaPackageOutputDestinationSettings = js.Array[MediaPackageOutputDestinationSettings]
  type __listOfOffering = js.Array[Offering]
  type __listOfOutput = js.Array[Output]
  type __listOfOutputDestination = js.Array[OutputDestination]
  type __listOfOutputDestinationSettings = js.Array[OutputDestinationSettings]
  type __listOfOutputGroup = js.Array[OutputGroup]
  type __listOfPipelinePauseStateSettings = js.Array[PipelinePauseStateSettings]
  type __listOfReservation = js.Array[Reservation]
  type __listOfScheduleAction = js.Array[ScheduleAction]
  type __listOfScte35Descriptor = js.Array[Scte35Descriptor]
  type __listOfVideoDescription = js.Array[VideoDescription]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  type __stringMax32 = java.lang.String
  type __stringMin1 = java.lang.String
  type __stringMin1Max255 = java.lang.String
  type __stringMin1Max256 = java.lang.String
  type __stringMin32Max32 = java.lang.String
  type __stringMin34Max34 = java.lang.String
  type __stringMin3Max3 = java.lang.String
  type __stringMin6Max6 = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

