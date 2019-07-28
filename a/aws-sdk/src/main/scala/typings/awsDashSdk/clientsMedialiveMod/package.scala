package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.CORRECT_AUDIO
import typings.awsDashSdk.awsDashSdkStrings.MONTHS
import typings.awsDashSdk.awsDashSdkStrings.NO_UPFRONT
import typings.awsDashSdk.awsDashSdkStrings.TEMPORAL
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMedialiveMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AD_RECEIVER_MIX
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_1_0
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_1_1
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_2_0
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_5_1
    - java.lang.String
  */
  type AacCodingMode = _AacCodingMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BROADCASTER_MIXED_AD
    - typings.awsDashSdk.awsDashSdkStrings.NORMAL
    - java.lang.String
  */
  type AacInputType = _AacInputType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HEV1
    - typings.awsDashSdk.awsDashSdkStrings.HEV2
    - typings.awsDashSdk.awsDashSdkStrings.LC
    - java.lang.String
  */
  type AacProfile = _AacProfile | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CBR
    - typings.awsDashSdk.awsDashSdkStrings.VBR
    - java.lang.String
  */
  type AacRateControlMode = _AacRateControlMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LATM_LOAS
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type AacRawFormat = _AacRawFormat | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MPEG2
    - typings.awsDashSdk.awsDashSdkStrings.MPEG4
    - java.lang.String
  */
  type AacSpec = _AacSpec | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HIGH
    - typings.awsDashSdk.awsDashSdkStrings.LOW
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM_HIGH
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM_LOW
    - java.lang.String
  */
  type AacVbrQuality = _AacVbrQuality | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMMENTARY
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETE_MAIN
    - typings.awsDashSdk.awsDashSdkStrings.DIALOGUE
    - typings.awsDashSdk.awsDashSdkStrings.EMERGENCY
    - typings.awsDashSdk.awsDashSdkStrings.HEARING_IMPAIRED
    - typings.awsDashSdk.awsDashSdkStrings.MUSIC_AND_EFFECTS
    - typings.awsDashSdk.awsDashSdkStrings.VISUALLY_IMPAIRED
    - typings.awsDashSdk.awsDashSdkStrings.VOICE_OVER
    - java.lang.String
  */
  type Ac3BitstreamMode = _Ac3BitstreamMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_1_0
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_1_1
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_2_0
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_3_2_LFE
    - java.lang.String
  */
  type Ac3CodingMode = _Ac3CodingMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FILM_STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type Ac3DrcProfile = _Ac3DrcProfile | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type Ac3LfeFilter = _Ac3LfeFilter | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FOLLOW_INPUT
    - typings.awsDashSdk.awsDashSdkStrings.USE_CONFIGURED
    - java.lang.String
  */
  type Ac3MetadataControl = _Ac3MetadataControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AUTO
    - typings.awsDashSdk.awsDashSdkStrings.FIXED
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type AfdSignaling = _AfdSignaling | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FOLLOW_INPUT
    - typings.awsDashSdk.awsDashSdkStrings.USE_CONFIGURED
    - java.lang.String
  */
  type AudioDescriptionAudioTypeControl = _AudioDescriptionAudioTypeControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FOLLOW_INPUT
    - typings.awsDashSdk.awsDashSdkStrings.USE_CONFIGURED
    - java.lang.String
  */
  type AudioDescriptionLanguageCodeControl = _AudioDescriptionLanguageCodeControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LOOSE
    - typings.awsDashSdk.awsDashSdkStrings.STRICT
    - java.lang.String
  */
  type AudioLanguageSelectionPolicy = _AudioLanguageSelectionPolicy | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ITU_1770_1
    - typings.awsDashSdk.awsDashSdkStrings.ITU_1770_2
    - java.lang.String
  */
  type AudioNormalizationAlgorithm = _AudioNormalizationAlgorithm | String
  type AudioNormalizationAlgorithmControl = CORRECT_AUDIO | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALTERNATE_AUDIO_AUTO_SELECT
    - typings.awsDashSdk.awsDashSdkStrings.ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.ALTERNATE_AUDIO_NOT_AUTO_SELECT
    - typings.awsDashSdk.awsDashSdkStrings.AUDIO_ONLY_VARIANT_STREAM
    - java.lang.String
  */
  type AudioOnlyHlsTrackType = _AudioOnlyHlsTrackType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CLEAN_EFFECTS
    - typings.awsDashSdk.awsDashSdkStrings.HEARING_IMPAIRED
    - typings.awsDashSdk.awsDashSdkStrings.UNDEFINED
    - typings.awsDashSdk.awsDashSdkStrings.VISUAL_IMPAIRED_COMMENTARY
    - java.lang.String
  */
  type AudioType = _AudioType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AKAMAI
    - typings.awsDashSdk.awsDashSdkStrings.COMMON
    - java.lang.String
  */
  type AuthenticationScheme = _AuthenticationScheme | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type AvailBlankingState = _AvailBlankingState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type BlackoutSlateNetworkEndBlackout = _BlackoutSlateNetworkEndBlackout | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type BlackoutSlateState = _BlackoutSlateState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CENTERED
    - typings.awsDashSdk.awsDashSdkStrings.LEFT
    - typings.awsDashSdk.awsDashSdkStrings.SMART
    - java.lang.String
  */
  type BurnInAlignment = _BurnInAlignment | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLACK
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.WHITE
    - java.lang.String
  */
  type BurnInBackgroundColor = _BurnInBackgroundColor | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLACK
    - typings.awsDashSdk.awsDashSdkStrings.BLUE
    - typings.awsDashSdk.awsDashSdkStrings.GREEN
    - typings.awsDashSdk.awsDashSdkStrings.RED
    - typings.awsDashSdk.awsDashSdkStrings.WHITE
    - typings.awsDashSdk.awsDashSdkStrings.YELLOW
    - java.lang.String
  */
  type BurnInFontColor = _BurnInFontColor | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLACK
    - typings.awsDashSdk.awsDashSdkStrings.BLUE
    - typings.awsDashSdk.awsDashSdkStrings.GREEN
    - typings.awsDashSdk.awsDashSdkStrings.RED
    - typings.awsDashSdk.awsDashSdkStrings.WHITE
    - typings.awsDashSdk.awsDashSdkStrings.YELLOW
    - java.lang.String
  */
  type BurnInOutlineColor = _BurnInOutlineColor | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLACK
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.WHITE
    - java.lang.String
  */
  type BurnInShadowColor = _BurnInShadowColor | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FIXED
    - typings.awsDashSdk.awsDashSdkStrings.SCALED
    - java.lang.String
  */
  type BurnInTeletextGridControl = _BurnInTeletextGridControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.SINGLE_PIPELINE
    - java.lang.String
  */
  type ChannelClass = _ChannelClass | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.IDLE
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.RECOVERING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type ChannelState = _ChannelState | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SDT_FOLLOW
    - typings.awsDashSdk.awsDashSdkStrings.SDT_FOLLOW_IF_PRESENT
    - typings.awsDashSdk.awsDashSdkStrings.SDT_MANUAL
    - typings.awsDashSdk.awsDashSdkStrings.SDT_NONE
    - java.lang.String
  */
  type DvbSdtOutputSdt = _DvbSdtOutputSdt | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CENTERED
    - typings.awsDashSdk.awsDashSdkStrings.LEFT
    - typings.awsDashSdk.awsDashSdkStrings.SMART
    - java.lang.String
  */
  type DvbSubDestinationAlignment = _DvbSubDestinationAlignment | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLACK
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.WHITE
    - java.lang.String
  */
  type DvbSubDestinationBackgroundColor = _DvbSubDestinationBackgroundColor | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLACK
    - typings.awsDashSdk.awsDashSdkStrings.BLUE
    - typings.awsDashSdk.awsDashSdkStrings.GREEN
    - typings.awsDashSdk.awsDashSdkStrings.RED
    - typings.awsDashSdk.awsDashSdkStrings.WHITE
    - typings.awsDashSdk.awsDashSdkStrings.YELLOW
    - java.lang.String
  */
  type DvbSubDestinationFontColor = _DvbSubDestinationFontColor | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLACK
    - typings.awsDashSdk.awsDashSdkStrings.BLUE
    - typings.awsDashSdk.awsDashSdkStrings.GREEN
    - typings.awsDashSdk.awsDashSdkStrings.RED
    - typings.awsDashSdk.awsDashSdkStrings.WHITE
    - typings.awsDashSdk.awsDashSdkStrings.YELLOW
    - java.lang.String
  */
  type DvbSubDestinationOutlineColor = _DvbSubDestinationOutlineColor | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLACK
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.WHITE
    - java.lang.String
  */
  type DvbSubDestinationShadowColor = _DvbSubDestinationShadowColor | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FIXED
    - typings.awsDashSdk.awsDashSdkStrings.SCALED
    - java.lang.String
  */
  type DvbSubDestinationTeletextGridControl = _DvbSubDestinationTeletextGridControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ATTENUATE_3_DB
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type Eac3AttenuationControl = _Eac3AttenuationControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMMENTARY
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETE_MAIN
    - typings.awsDashSdk.awsDashSdkStrings.EMERGENCY
    - typings.awsDashSdk.awsDashSdkStrings.HEARING_IMPAIRED
    - typings.awsDashSdk.awsDashSdkStrings.VISUALLY_IMPAIRED
    - java.lang.String
  */
  type Eac3BitstreamMode = _Eac3BitstreamMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_1_0
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_2_0
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_3_2
    - java.lang.String
  */
  type Eac3CodingMode = _Eac3CodingMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type Eac3DcFilter = _Eac3DcFilter | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FILM_LIGHT
    - typings.awsDashSdk.awsDashSdkStrings.FILM_STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.MUSIC_LIGHT
    - typings.awsDashSdk.awsDashSdkStrings.MUSIC_STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.SPEECH
    - java.lang.String
  */
  type Eac3DrcLine = _Eac3DrcLine | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FILM_LIGHT
    - typings.awsDashSdk.awsDashSdkStrings.FILM_STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.MUSIC_LIGHT
    - typings.awsDashSdk.awsDashSdkStrings.MUSIC_STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.SPEECH
    - java.lang.String
  */
  type Eac3DrcRf = _Eac3DrcRf | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LFE
    - typings.awsDashSdk.awsDashSdkStrings.NO_LFE
    - java.lang.String
  */
  type Eac3LfeControl = _Eac3LfeControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type Eac3LfeFilter = _Eac3LfeFilter | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FOLLOW_INPUT
    - typings.awsDashSdk.awsDashSdkStrings.USE_CONFIGURED
    - java.lang.String
  */
  type Eac3MetadataControl = _Eac3MetadataControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NO_PASSTHROUGH
    - typings.awsDashSdk.awsDashSdkStrings.WHEN_POSSIBLE
    - java.lang.String
  */
  type Eac3PassthroughControl = _Eac3PassthroughControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NO_SHIFT
    - typings.awsDashSdk.awsDashSdkStrings.SHIFT_90_DEGREES
    - java.lang.String
  */
  type Eac3PhaseControl = _Eac3PhaseControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DPL2
    - typings.awsDashSdk.awsDashSdkStrings.LO_RO
    - typings.awsDashSdk.awsDashSdkStrings.LT_RT
    - typings.awsDashSdk.awsDashSdkStrings.NOT_INDICATED
    - java.lang.String
  */
  type Eac3StereoDownmix = _Eac3StereoDownmix | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.NOT_INDICATED
    - java.lang.String
  */
  type Eac3SurroundExMode = _Eac3SurroundExMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.NOT_INDICATED
    - java.lang.String
  */
  type Eac3SurroundMode = _Eac3SurroundMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.UPCONVERT
    - java.lang.String
  */
  type EmbeddedConvert608To708 = _EmbeddedConvert608To708 | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AUTO
    - typings.awsDashSdk.awsDashSdkStrings.OFF
    - java.lang.String
  */
  type EmbeddedScte20Detection = _EmbeddedScte20Detection | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COLUMN
    - typings.awsDashSdk.awsDashSdkStrings.COLUMN_AND_ROW
    - java.lang.String
  */
  type FecOutputIncludeFec = _FecOutputIncludeFec | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AFD_0000
    - typings.awsDashSdk.awsDashSdkStrings.AFD_0010
    - typings.awsDashSdk.awsDashSdkStrings.AFD_0011
    - typings.awsDashSdk.awsDashSdkStrings.AFD_0100
    - typings.awsDashSdk.awsDashSdkStrings.AFD_1000
    - typings.awsDashSdk.awsDashSdkStrings.AFD_1001
    - typings.awsDashSdk.awsDashSdkStrings.AFD_1010
    - typings.awsDashSdk.awsDashSdkStrings.AFD_1011
    - typings.awsDashSdk.awsDashSdkStrings.AFD_1101
    - typings.awsDashSdk.awsDashSdkStrings.AFD_1110
    - typings.awsDashSdk.awsDashSdkStrings.AFD_1111
    - java.lang.String
  */
  type FixedAfd = _FixedAfd | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.END
    - typings.awsDashSdk.awsDashSdkStrings.START
    - java.lang.String
  */
  type FollowPoint = _FollowPoint | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.SWITCH_AND_LOOP_INPUTS
    - java.lang.String
  */
  type GlobalConfigurationInputEndAction = _GlobalConfigurationInputEndAction | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type GlobalConfigurationLowFramerateInputs = _GlobalConfigurationLowFramerateInputs | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EPOCH_LOCKING
    - typings.awsDashSdk.awsDashSdkStrings.PIPELINE_LOCKING
    - java.lang.String
  */
  type GlobalConfigurationOutputLockingMode = _GlobalConfigurationOutputLockingMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INPUT_CLOCK
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM_CLOCK
    - java.lang.String
  */
  type GlobalConfigurationOutputTimingSource = _GlobalConfigurationOutputTimingSource | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HIGH
    - typings.awsDashSdk.awsDashSdkStrings.HIGHER
    - typings.awsDashSdk.awsDashSdkStrings.LOW
    - typings.awsDashSdk.awsDashSdkStrings.MAX
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM
    - typings.awsDashSdk.awsDashSdkStrings.OFF
    - java.lang.String
  */
  type H264AdaptiveQuantization = _H264AdaptiveQuantization | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IGNORE
    - typings.awsDashSdk.awsDashSdkStrings.INSERT
    - java.lang.String
  */
  type H264ColorMetadata = _H264ColorMetadata | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CABAC
    - typings.awsDashSdk.awsDashSdkStrings.CAVLC
    - java.lang.String
  */
  type H264EntropyEncoding = _H264EntropyEncoding | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type H264FlickerAq = _H264FlickerAq | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INITIALIZE_FROM_SOURCE
    - typings.awsDashSdk.awsDashSdkStrings.SPECIFIED
    - java.lang.String
  */
  type H264FramerateControl = _H264FramerateControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type H264GopBReference = _H264GopBReference | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FRAMES
    - typings.awsDashSdk.awsDashSdkStrings.SECONDS
    - java.lang.String
  */
  type H264GopSizeUnits = _H264GopSizeUnits | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_1
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_1_1
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_1_2
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_1_3
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_2
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_2_1
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_2_2
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_3
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_3_1
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_3_2
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_4
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_4_1
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_4_2
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_5
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_5_1
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_5_2
    - typings.awsDashSdk.awsDashSdkStrings.H264_LEVEL_AUTO
    - java.lang.String
  */
  type H264Level = _H264Level | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HIGH
    - typings.awsDashSdk.awsDashSdkStrings.LOW
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM
    - java.lang.String
  */
  type H264LookAheadRateControl = _H264LookAheadRateControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INITIALIZE_FROM_SOURCE
    - typings.awsDashSdk.awsDashSdkStrings.SPECIFIED
    - java.lang.String
  */
  type H264ParControl = _H264ParControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BASELINE
    - typings.awsDashSdk.awsDashSdkStrings.HIGH
    - typings.awsDashSdk.awsDashSdkStrings.HIGH_10BIT
    - typings.awsDashSdk.awsDashSdkStrings.HIGH_422
    - typings.awsDashSdk.awsDashSdkStrings.HIGH_422_10BIT
    - typings.awsDashSdk.awsDashSdkStrings.MAIN
    - java.lang.String
  */
  type H264Profile = _H264Profile | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CBR
    - typings.awsDashSdk.awsDashSdkStrings.QVBR
    - typings.awsDashSdk.awsDashSdkStrings.VBR
    - java.lang.String
  */
  type H264RateControlMode = _H264RateControlMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INTERLACED
    - typings.awsDashSdk.awsDashSdkStrings.PROGRESSIVE
    - java.lang.String
  */
  type H264ScanType = _H264ScanType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type H264SceneChangeDetect = _H264SceneChangeDetect | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type H264SpatialAq = _H264SpatialAq | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DYNAMIC
    - typings.awsDashSdk.awsDashSdkStrings.FIXED
    - java.lang.String
  */
  type H264SubGopLength = _H264SubGopLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.RP2027
    - java.lang.String
  */
  type H264Syntax = _H264Syntax | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type H264TemporalAq = _H264TemporalAq | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.PIC_TIMING_SEI
    - java.lang.String
  */
  type H264TimecodeInsertionBehavior = _H264TimecodeInsertionBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADOBE
    - typings.awsDashSdk.awsDashSdkStrings.ELEMENTAL
    - typings.awsDashSdk.awsDashSdkStrings.ELEMENTAL_SCTE35
    - java.lang.String
  */
  type HlsAdMarkers = _HlsAdMarkers | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CHUNKED
    - typings.awsDashSdk.awsDashSdkStrings.NON_CHUNKED
    - java.lang.String
  */
  type HlsAkamaiHttpTransferMode = _HlsAkamaiHttpTransferMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INSERT
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.OMIT
    - java.lang.String
  */
  type HlsCaptionLanguageSetting = _HlsCaptionLanguageSetting | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type HlsClientCache = _HlsClientCache | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RFC_4281
    - typings.awsDashSdk.awsDashSdkStrings.RFC_6381
    - java.lang.String
  */
  type HlsCodecSpecification = _HlsCodecSpecification | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SINGLE_DIRECTORY
    - typings.awsDashSdk.awsDashSdkStrings.SUBDIRECTORY_PER_STREAM
    - java.lang.String
  */
  type HlsDirectoryStructure = _HlsDirectoryStructure | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AES128
    - typings.awsDashSdk.awsDashSdkStrings.SAMPLE_AES
    - java.lang.String
  */
  type HlsEncryptionType = _HlsEncryptionType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXCLUDE
    - typings.awsDashSdk.awsDashSdkStrings.INCLUDE
    - java.lang.String
  */
  type HlsIvInManifest = _HlsIvInManifest | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXPLICIT
    - typings.awsDashSdk.awsDashSdkStrings.FOLLOWS_SEGMENT_NUMBER
    - java.lang.String
  */
  type HlsIvSource = _HlsIvSource | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GZIP
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type HlsManifestCompression = _HlsManifestCompression | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FLOATING_POINT
    - typings.awsDashSdk.awsDashSdkStrings.INTEGER
    - java.lang.String
  */
  type HlsManifestDurationFormat = _HlsManifestDurationFormat | String
  type HlsMediaStoreStorageClass = TEMPORAL | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LIVE
    - typings.awsDashSdk.awsDashSdkStrings.VOD
    - java.lang.String
  */
  type HlsMode = _HlsMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MANIFESTS_AND_SEGMENTS
    - typings.awsDashSdk.awsDashSdkStrings.SEGMENTS_ONLY
    - java.lang.String
  */
  type HlsOutputSelection = _HlsOutputSelection | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXCLUDE
    - typings.awsDashSdk.awsDashSdkStrings.INCLUDE
    - java.lang.String
  */
  type HlsProgramDateTime = _HlsProgramDateTime | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type HlsRedundantManifest = _HlsRedundantManifest | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USE_INPUT_SEGMENTATION
    - typings.awsDashSdk.awsDashSdkStrings.USE_SEGMENT_DURATION
    - java.lang.String
  */
  type HlsSegmentationMode = _HlsSegmentationMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXCLUDE
    - typings.awsDashSdk.awsDashSdkStrings.INCLUDE
    - java.lang.String
  */
  type HlsStreamInfResolution = _HlsStreamInfResolution | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.PRIV
    - typings.awsDashSdk.awsDashSdkStrings.TDRL
    - java.lang.String
  */
  type HlsTimedMetadataId3Frame = _HlsTimedMetadataId3Frame | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SEGMENTED_FILES
    - typings.awsDashSdk.awsDashSdkStrings.SINGLE_FILE
    - java.lang.String
  */
  type HlsTsFileMode = _HlsTsFileMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CHUNKED
    - typings.awsDashSdk.awsDashSdkStrings.NON_CHUNKED
    - java.lang.String
  */
  type HlsWebdavHttpTransferMode = _HlsWebdavHttpTransferMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - java.lang.String
  */
  type IFrameOnlyPlaylistType = _IFrameOnlyPlaylistType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.SINGLE_PIPELINE
    - java.lang.String
  */
  type InputClass = _InputClass | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MPEG2
    - typings.awsDashSdk.awsDashSdkStrings.AVC
    - typings.awsDashSdk.awsDashSdkStrings.HEVC
    - java.lang.String
  */
  type InputCodec = _InputCodec | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type InputDeblockFilter = _InputDeblockFilter | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type InputDenoiseFilter = _InputDenoiseFilter | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AUTO
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.FORCED
    - java.lang.String
  */
  type InputFilter = _InputFilter | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EMIT_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.PAUSE_OUTPUT
    - java.lang.String
  */
  type InputLossActionForHlsOut = _InputLossActionForHlsOut | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EMIT_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.PAUSE_OUTPUT
    - java.lang.String
  */
  type InputLossActionForMsSmoothOut = _InputLossActionForMsSmoothOut | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EMIT_OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.PAUSE_OUTPUT
    - java.lang.String
  */
  type InputLossActionForRtmpOut = _InputLossActionForRtmpOut | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DROP_PROGRAM
    - typings.awsDashSdk.awsDashSdkStrings.DROP_TS
    - typings.awsDashSdk.awsDashSdkStrings.EMIT_PROGRAM
    - java.lang.String
  */
  type InputLossActionForUdpOut = _InputLossActionForUdpOut | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COLOR
    - typings.awsDashSdk.awsDashSdkStrings.SLATE
    - java.lang.String
  */
  type InputLossImageType = _InputLossImageType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MAX_10_MBPS
    - typings.awsDashSdk.awsDashSdkStrings.MAX_20_MBPS
    - typings.awsDashSdk.awsDashSdkStrings.MAX_50_MBPS
    - java.lang.String
  */
  type InputMaximumBitrate = _InputMaximumBitrate | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SD
    - typings.awsDashSdk.awsDashSdkStrings.HD
    - typings.awsDashSdk.awsDashSdkStrings.UHD
    - java.lang.String
  */
  type InputResolution = _InputResolution | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IDLE
    - typings.awsDashSdk.awsDashSdkStrings.IN_USE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type InputSecurityGroupState = _InputSecurityGroupState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONTINUE
    - typings.awsDashSdk.awsDashSdkStrings.LOOP
    - java.lang.String
  */
  type InputSourceEndBehavior = _InputSourceEndBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STATIC
    - typings.awsDashSdk.awsDashSdkStrings.DYNAMIC
    - java.lang.String
  */
  type InputSourceType = _InputSourceType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DETACHED
    - typings.awsDashSdk.awsDashSdkStrings.ATTACHED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type InputState = _InputState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ZEROBASED
    - typings.awsDashSdk.awsDashSdkStrings.EMBEDDED
    - java.lang.String
  */
  type InputTimecodeSource = _InputTimecodeSource | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UDP_PUSH
    - typings.awsDashSdk.awsDashSdkStrings.RTP_PUSH
    - typings.awsDashSdk.awsDashSdkStrings.RTMP_PUSH
    - typings.awsDashSdk.awsDashSdkStrings.RTMP_PULL
    - typings.awsDashSdk.awsDashSdkStrings.URL_PULL
    - typings.awsDashSdk.awsDashSdkStrings.MP4_FILE
    - typings.awsDashSdk.awsDashSdkStrings.MEDIACONNECT
    - java.lang.String
  */
  type InputType = _InputType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXCLUDE_LAST_FRAME
    - typings.awsDashSdk.awsDashSdkStrings.INCLUDE_LAST_FRAME
    - java.lang.String
  */
  type LastFrameClippingBehavior = _LastFrameClippingBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.WARNING
    - typings.awsDashSdk.awsDashSdkStrings.INFO
    - typings.awsDashSdk.awsDashSdkStrings.DEBUG
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type LogLevel = _LogLevel | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DROP
    - typings.awsDashSdk.awsDashSdkStrings.ENCODE_SILENCE
    - java.lang.String
  */
  type M2tsAbsentInputAudioBehavior = _M2tsAbsentInputAudioBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type M2tsArib = _M2tsArib | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AUTO
    - typings.awsDashSdk.awsDashSdkStrings.USE_CONFIGURED
    - java.lang.String
  */
  type M2tsAribCaptionsPidControl = _M2tsAribCaptionsPidControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ATSC
    - typings.awsDashSdk.awsDashSdkStrings.DVB
    - java.lang.String
  */
  type M2tsAudioBufferModel = _M2tsAudioBufferModel | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO_AND_FIXED_INTERVALS
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO_INTERVAL
    - java.lang.String
  */
  type M2tsAudioInterval = _M2tsAudioInterval | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ATSC
    - typings.awsDashSdk.awsDashSdkStrings.DVB
    - java.lang.String
  */
  type M2tsAudioStreamType = _M2tsAudioStreamType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MULTIPLEX
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type M2tsBufferModel = _M2tsBufferModel | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type M2tsCcDescriptor = _M2tsCcDescriptor | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - java.lang.String
  */
  type M2tsEbifControl = _M2tsEbifControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO_AND_AUDIO_PIDS
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO_PID
    - java.lang.String
  */
  type M2tsEbpPlacement = _M2tsEbpPlacement | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXCLUDE
    - typings.awsDashSdk.awsDashSdkStrings.INCLUDE
    - java.lang.String
  */
  type M2tsEsRateInPes = _M2tsEsRateInPes | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - java.lang.String
  */
  type M2tsKlv = _M2tsKlv | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONFIGURED_PCR_PERIOD
    - typings.awsDashSdk.awsDashSdkStrings.PCR_EVERY_PES_PACKET
    - java.lang.String
  */
  type M2tsPcrControl = _M2tsPcrControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CBR
    - typings.awsDashSdk.awsDashSdkStrings.VBR
    - java.lang.String
  */
  type M2tsRateMode = _M2tsRateMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - java.lang.String
  */
  type M2tsScte35Control = _M2tsScte35Control | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EBP
    - typings.awsDashSdk.awsDashSdkStrings.EBP_LEGACY
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.PSI_SEGSTART
    - typings.awsDashSdk.awsDashSdkStrings.RAI_ADAPT
    - typings.awsDashSdk.awsDashSdkStrings.RAI_SEGSTART
    - java.lang.String
  */
  type M2tsSegmentationMarkers = _M2tsSegmentationMarkers | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MAINTAIN_CADENCE
    - typings.awsDashSdk.awsDashSdkStrings.RESET_CADENCE
    - java.lang.String
  */
  type M2tsSegmentationStyle = _M2tsSegmentationStyle | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NO_PASSTHROUGH
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - java.lang.String
  */
  type M2tsTimedMetadataBehavior = _M2tsTimedMetadataBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONFIGURED_PCR_PERIOD
    - typings.awsDashSdk.awsDashSdkStrings.PCR_EVERY_PES_PACKET
    - java.lang.String
  */
  type M3u8PcrControl = _M3u8PcrControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NO_PASSTHROUGH
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - java.lang.String
  */
  type M3u8Scte35Behavior = _M3u8Scte35Behavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NO_PASSTHROUGH
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - java.lang.String
  */
  type M3u8TimedMetadataBehavior = _M3u8TimedMetadataBehavior | String
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_1_0
    - typings.awsDashSdk.awsDashSdkStrings.CODING_MODE_2_0
    - java.lang.String
  */
  type Mp2CodingMode = _Mp2CodingMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME
    - typings.awsDashSdk.awsDashSdkStrings.CHECK_CRYPTOGRAPHY_ONLY
    - java.lang.String
  */
  type NetworkInputServerValidation = _NetworkInputServerValidation | String
  type OfferingDurationUnits = MONTHS | String
  type OfferingType = NO_UPFRONT | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PIPELINE_0
    - typings.awsDashSdk.awsDashSdkStrings.PIPELINE_1
    - java.lang.String
  */
  type PipelineId = _PipelineId | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MPEG2
    - typings.awsDashSdk.awsDashSdkStrings.AVC
    - typings.awsDashSdk.awsDashSdkStrings.HEVC
    - typings.awsDashSdk.awsDashSdkStrings.AUDIO
    - java.lang.String
  */
  type ReservationCodec = _ReservationCodec | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MAX_10_MBPS
    - typings.awsDashSdk.awsDashSdkStrings.MAX_20_MBPS
    - typings.awsDashSdk.awsDashSdkStrings.MAX_50_MBPS
    - java.lang.String
  */
  type ReservationMaximumBitrate = _ReservationMaximumBitrate | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MAX_30_FPS
    - typings.awsDashSdk.awsDashSdkStrings.MAX_60_FPS
    - java.lang.String
  */
  type ReservationMaximumFramerate = _ReservationMaximumFramerate | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SD
    - typings.awsDashSdk.awsDashSdkStrings.HD
    - typings.awsDashSdk.awsDashSdkStrings.UHD
    - java.lang.String
  */
  type ReservationResolution = _ReservationResolution | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INPUT
    - typings.awsDashSdk.awsDashSdkStrings.OUTPUT
    - typings.awsDashSdk.awsDashSdkStrings.CHANNEL
    - java.lang.String
  */
  type ReservationResourceType = _ReservationResourceType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADVANCED_AUDIO
    - typings.awsDashSdk.awsDashSdkStrings.AUDIO_NORMALIZATION
    - java.lang.String
  */
  type ReservationSpecialFeature = _ReservationSpecialFeature | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type ReservationState = _ReservationState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.ENHANCED
    - typings.awsDashSdk.awsDashSdkStrings.PREMIUM
    - java.lang.String
  */
  type ReservationVideoQuality = _ReservationVideoQuality | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISCONNECT_IMMEDIATELY
    - typings.awsDashSdk.awsDashSdkStrings.WAIT_FOR_SERVER
    - java.lang.String
  */
  type RtmpCacheFullBehavior = _RtmpCacheFullBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.FIELD1_608
    - typings.awsDashSdk.awsDashSdkStrings.FIELD1_AND_FIELD2_608
    - java.lang.String
  */
  type RtmpCaptionData = _RtmpCaptionData | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SELF_SIGNED
    - typings.awsDashSdk.awsDashSdkStrings.VERIFY_AUTHENTICITY
    - java.lang.String
  */
  type RtmpOutputCertificateMode = _RtmpOutputCertificateMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.UPCONVERT
    - java.lang.String
  */
  type Scte20Convert608To708 = _Scte20Convert608To708 | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FOLLOW
    - typings.awsDashSdk.awsDashSdkStrings.IGNORE
    - java.lang.String
  */
  type Scte35AposNoRegionalBlackoutBehavior = _Scte35AposNoRegionalBlackoutBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FOLLOW
    - typings.awsDashSdk.awsDashSdkStrings.IGNORE
    - java.lang.String
  */
  type Scte35AposWebDeliveryAllowedBehavior = _Scte35AposWebDeliveryAllowedBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ARCHIVE_NOT_ALLOWED
    - typings.awsDashSdk.awsDashSdkStrings.ARCHIVE_ALLOWED
    - java.lang.String
  */
  type Scte35ArchiveAllowedFlag = _Scte35ArchiveAllowedFlag | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.RESTRICT_GROUP0
    - typings.awsDashSdk.awsDashSdkStrings.RESTRICT_GROUP1
    - typings.awsDashSdk.awsDashSdkStrings.RESTRICT_GROUP2
    - java.lang.String
  */
  type Scte35DeviceRestrictions = _Scte35DeviceRestrictions | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REGIONAL_BLACKOUT
    - typings.awsDashSdk.awsDashSdkStrings.NO_REGIONAL_BLACKOUT
    - java.lang.String
  */
  type Scte35NoRegionalBlackoutFlag = _Scte35NoRegionalBlackoutFlag | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SEGMENTATION_EVENT_NOT_CANCELED
    - typings.awsDashSdk.awsDashSdkStrings.SEGMENTATION_EVENT_CANCELED
    - java.lang.String
  */
  type Scte35SegmentationCancelIndicator = _Scte35SegmentationCancelIndicator | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FOLLOW
    - typings.awsDashSdk.awsDashSdkStrings.IGNORE
    - java.lang.String
  */
  type Scte35SpliceInsertNoRegionalBlackoutBehavior = _Scte35SpliceInsertNoRegionalBlackoutBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FOLLOW
    - typings.awsDashSdk.awsDashSdkStrings.IGNORE
    - java.lang.String
  */
  type Scte35SpliceInsertWebDeliveryAllowedBehavior = _Scte35SpliceInsertWebDeliveryAllowedBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WEB_DELIVERY_NOT_ALLOWED
    - typings.awsDashSdk.awsDashSdkStrings.WEB_DELIVERY_ALLOWED
    - java.lang.String
  */
  type Scte35WebDeliveryAllowedFlag = _Scte35WebDeliveryAllowedFlag | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - typings.awsDashSdk.awsDashSdkStrings.USE_CONFIGURED_CLOCK
    - java.lang.String
  */
  type SmoothGroupAudioOnlyTimecodeControl = _SmoothGroupAudioOnlyTimecodeControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SELF_SIGNED
    - typings.awsDashSdk.awsDashSdkStrings.VERIFY_AUTHENTICITY
    - java.lang.String
  */
  type SmoothGroupCertificateMode = _SmoothGroupCertificateMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NO_EVENT_ID
    - typings.awsDashSdk.awsDashSdkStrings.USE_CONFIGURED
    - typings.awsDashSdk.awsDashSdkStrings.USE_TIMESTAMP
    - java.lang.String
  */
  type SmoothGroupEventIdMode = _SmoothGroupEventIdMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.SEND_EOS
    - java.lang.String
  */
  type SmoothGroupEventStopBehavior = _SmoothGroupEventStopBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USE_INPUT_SEGMENTATION
    - typings.awsDashSdk.awsDashSdkStrings.USE_SEGMENT_DURATION
    - java.lang.String
  */
  type SmoothGroupSegmentationMode = _SmoothGroupSegmentationMode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.SCTE_35
    - java.lang.String
  */
  type SmoothGroupSparseTrackType = _SmoothGroupSparseTrackType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DO_NOT_SEND
    - typings.awsDashSdk.awsDashSdkStrings.SEND
    - java.lang.String
  */
  type SmoothGroupStreamManifestBehavior = _SmoothGroupStreamManifestBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USE_CONFIGURED_OFFSET
    - typings.awsDashSdk.awsDashSdkStrings.USE_EVENT_START_DATE
    - java.lang.String
  */
  type SmoothGroupTimestampOffsetMode = _SmoothGroupTimestampOffsetMode | String
  type Tags = StringDictionary[__string]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EMBEDDED
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEMCLOCK
    - typings.awsDashSdk.awsDashSdkStrings.ZEROBASED
    - java.lang.String
  */
  type TimecodeConfigSource = _TimecodeConfigSource | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - typings.awsDashSdk.awsDashSdkStrings.USE_CONFIGURED
    - java.lang.String
  */
  type TtmlDestinationStyleControl = _TtmlDestinationStyleControl | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.PRIV
    - typings.awsDashSdk.awsDashSdkStrings.TDRL
    - java.lang.String
  */
  type UdpTimedMetadataId3Frame = _UdpTimedMetadataId3Frame | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - typings.awsDashSdk.awsDashSdkStrings.RESPOND
    - java.lang.String
  */
  type VideoDescriptionRespondToAfd = _VideoDescriptionRespondToAfd | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.STRETCH_TO_OUTPUT
    - java.lang.String
  */
  type VideoDescriptionScalingBehavior = _VideoDescriptionScalingBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FOLLOW
    - typings.awsDashSdk.awsDashSdkStrings.REC_601
    - typings.awsDashSdk.awsDashSdkStrings.REC_709
    - java.lang.String
  */
  type VideoSelectorColorSpace = _VideoSelectorColorSpace | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FALLBACK
    - typings.awsDashSdk.awsDashSdkStrings.FORCE
    - java.lang.String
  */
  type VideoSelectorColorSpaceUsage = _VideoSelectorColorSpaceUsage | String
  type __double = Double
  type __doubleMin0 = Double
  type __doubleMin1 = Double
  type __doubleMinNegative59Max0 = Double
  type __integer = Double
  type __integerMin0 = Double
  type __integerMin0Max10 = Double
  type __integerMin0Max100 = Double
  type __integerMin0Max1000 = Double
  type __integerMin0Max10000 = Double
  type __integerMin0Max1000000 = Double
  type __integerMin0Max128 = Double
  type __integerMin0Max15 = Double
  type __integerMin0Max255 = Double
  type __integerMin0Max30 = Double
  type __integerMin0Max3600 = Double
  type __integerMin0Max500 = Double
  type __integerMin0Max600 = Double
  type __integerMin0Max65535 = Double
  type __integerMin0Max65536 = Double
  type __integerMin0Max7 = Double
  type __integerMin0Max8191 = Double
  type __integerMin1 = Double
  type __integerMin1000 = Double
  type __integerMin1000Max30000 = Double
  type __integerMin1Max10 = Double
  type __integerMin1Max1000000 = Double
  type __integerMin1Max16 = Double
  type __integerMin1Max20 = Double
  type __integerMin1Max31 = Double
  type __integerMin1Max32 = Double
  type __integerMin1Max3600 = Double
  type __integerMin1Max4 = Double
  type __integerMin1Max5 = Double
  type __integerMin1Max6 = Double
  type __integerMin1Max8 = Double
  type __integerMin25Max10000 = Double
  type __integerMin25Max2000 = Double
  type __integerMin3 = Double
  type __integerMin30 = Double
  type __integerMin4Max20 = Double
  type __integerMin96Max600 = Double
  type __integerMinNegative1000Max1000 = Double
  type __integerMinNegative60Max6 = Double
  type __integerMinNegative60Max60 = Double
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
  type __listOfPipelineDetail = js.Array[PipelineDetail]
  type __listOfPipelinePauseStateSettings = js.Array[PipelinePauseStateSettings]
  type __listOfReservation = js.Array[Reservation]
  type __listOfScheduleAction = js.Array[ScheduleAction]
  type __listOfScte35Descriptor = js.Array[Scte35Descriptor]
  type __listOfVideoDescription = js.Array[VideoDescription]
  type __listOf__string = js.Array[__string]
  type __longMin0Max1099511627775 = Double
  type __longMin0Max4294967295 = Double
  type __longMin0Max8589934591 = Double
  type __string = String
  type __stringMax32 = String
  type __stringMin1 = String
  type __stringMin1Max255 = String
  type __stringMin1Max256 = String
  type __stringMin32Max32 = String
  type __stringMin34Max34 = String
  type __stringMin3Max3 = String
  type __stringMin6Max6 = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-10-14`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
