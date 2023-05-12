package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ChimeSdkMeeting
import typings.awsSdk.awsSdkStrings.ContentOnly
import typings.awsSdk.awsSdkStrings.Enabled_
import typings.awsSdk.awsSdkStrings.GridView
import typings.awsSdk.awsSdkStrings.NEGATIVE
import typings.awsSdk.awsSdkStrings.PII
import typings.awsSdk.awsSdkStrings.RTMP
import typings.awsSdk.awsSdkStrings.S3Bucket
import typings.awsSdk.awsSdkStrings.VideoOnly
import typings.awsSdk.awsSdkStrings.pcm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

type Arn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ArtifactsConcatenationState = _ArtifactsConcatenationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ArtifactsState = _ArtifactsState | java.lang.String

type AttendeeIdList = js.Array[GuidString]

type AudioArtifactsConcatenationState = Enabled_ | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Stereo_
  - typings.awsSdk.awsSdkStrings.Mono
  - java.lang.String
*/
type AudioChannelsOption = _AudioChannelsOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AudioOnly
  - typings.awsSdk.awsSdkStrings.AudioWithActiveSpeakerVideo
  - typings.awsSdk.awsSdkStrings.AudioWithCompositedVideo
  - java.lang.String
*/
type AudioMuxType = _AudioMuxType | java.lang.String

type AudioSampleRateOption = java.lang.String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`en-US`
  - typings.awsSdk.awsSdkStrings.`en-GB`
  - typings.awsSdk.awsSdkStrings.`es-US`
  - typings.awsSdk.awsSdkStrings.`fr-CA`
  - typings.awsSdk.awsSdkStrings.`fr-FR`
  - typings.awsSdk.awsSdkStrings.`en-AU`
  - typings.awsSdk.awsSdkStrings.`it-IT`
  - typings.awsSdk.awsSdkStrings.`de-DE`
  - typings.awsSdk.awsSdkStrings.`pt-BR`
  - java.lang.String
*/
type CallAnalyticsLanguageCode = _CallAnalyticsLanguageCode | java.lang.String

type CategoryName = java.lang.String

type CategoryNameList = js.Array[CategoryName]

type ChannelDefinitions = js.Array[ChannelDefinition]

type ChannelId = Double

type ClientRequestToken = java.lang.String

type ConcatenationSinkList = js.Array[ConcatenationSink]

type ConcatenationSinkType = S3Bucket | java.lang.String

type ConcatenationSourceList = js.Array[ConcatenationSource]

type ConcatenationSourceType = typings.awsSdk.awsSdkStrings.MediaCapturePipeline | java.lang.String

type ContentMuxType = ContentOnly | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.redacted
  - typings.awsSdk.awsSdkStrings.redacted_and_unredacted
  - java.lang.String
*/
type ContentRedactionOutput = _ContentRedactionOutput | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PresenterOnly
  - typings.awsSdk.awsSdkStrings.Horizontal_
  - typings.awsSdk.awsSdkStrings.Vertical_
  - java.lang.String
*/
type ContentShareLayoutOption = _ContentShareLayoutOption | java.lang.String

type ContentType = PII | java.lang.String

type ExternalUserIdList = js.Array[ExternalUserIdType]

type ExternalUserIdType = java.lang.String

type FragmentNumberString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ProducerTimestamp
  - typings.awsSdk.awsSdkStrings.ServerTimestamp
  - java.lang.String
*/
type FragmentSelectorType = _FragmentSelectorType | java.lang.String

type GuidString = java.lang.String

type Iso8601Timestamp = js.Date

type Keyword = java.lang.String

type KeywordMatchWordList = js.Array[Keyword]

type KinesisVideoStreamArn = java.lang.String

type LayoutOption = GridView | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AudioWithCompositedVideo
  - typings.awsSdk.awsSdkStrings.AudioWithActiveSpeakerVideo
  - java.lang.String
*/
type LiveConnectorMuxType = _LiveConnectorMuxType | java.lang.String

type LiveConnectorSinkList = js.Array[LiveConnectorSinkConfiguration]

type LiveConnectorSinkType = RTMP | java.lang.String

type LiveConnectorSourceList = js.Array[LiveConnectorSourceConfiguration]

type LiveConnectorSourceType = ChimeSdkMeeting | java.lang.String

type MediaCapturePipelineSummaryList = js.Array[MediaCapturePipelineSummary]

type MediaEncoding = pcm | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AmazonTranscribeCallAnalyticsProcessor
  - typings.awsSdk.awsSdkStrings.VoiceAnalyticsProcessor
  - typings.awsSdk.awsSdkStrings.AmazonTranscribeProcessor
  - typings.awsSdk.awsSdkStrings.KinesisDataStreamSink
  - typings.awsSdk.awsSdkStrings.LambdaFunctionSink
  - typings.awsSdk.awsSdkStrings.SqsQueueSink
  - typings.awsSdk.awsSdkStrings.SnsTopicSink
  - typings.awsSdk.awsSdkStrings.S3RecordingSink
  - java.lang.String
*/
type MediaInsightsPipelineConfigurationElementType = _MediaInsightsPipelineConfigurationElementType | java.lang.String

type MediaInsightsPipelineConfigurationElements = js.Array[MediaInsightsPipelineConfigurationElement]

type MediaInsightsPipelineConfigurationNameString = java.lang.String

type MediaInsightsPipelineConfigurationSummaryList = js.Array[MediaInsightsPipelineConfigurationSummary]

type MediaInsightsRuntimeMetadata = StringDictionary[String]

type MediaPipelineList = js.Array[MediaPipelineSummary]

type MediaPipelineSinkType = S3Bucket | java.lang.String

type MediaPipelineSourceType = ChimeSdkMeeting | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Initializing_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Stopping_
  - typings.awsSdk.awsSdkStrings.Stopped_
  - typings.awsSdk.awsSdkStrings.Paused_
  - java.lang.String
*/
type MediaPipelineStatus = _MediaPipelineStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pause_
  - typings.awsSdk.awsSdkStrings.Resume_
  - java.lang.String
*/
type MediaPipelineStatusUpdate = _MediaPipelineStatusUpdate | java.lang.String

type MediaSampleRateHertz = Double

type ModelName = java.lang.String

type NonEmptyString = java.lang.String

type NumberOfChannels = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.high__
  - typings.awsSdk.awsSdkStrings.medium__
  - typings.awsSdk.awsSdkStrings.low__
  - java.lang.String
*/
type PartialResultsStability = _PartialResultsStability | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGENT
  - typings.awsSdk.awsSdkStrings.CUSTOMER
  - java.lang.String
*/
type ParticipantRole = _ParticipantRole | java.lang.String

type PiiEntityTypes = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TopLeft
  - typings.awsSdk.awsSdkStrings.TopRight
  - typings.awsSdk.awsSdkStrings.BottomLeft
  - typings.awsSdk.awsSdkStrings.BottomRight
  - java.lang.String
*/
type PresenterPosition = _PresenterPosition | java.lang.String

type RealTimeAlertRuleList = js.Array[RealTimeAlertRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KeywordMatch
  - typings.awsSdk.awsSdkStrings.Sentiment
  - typings.awsSdk.awsSdkStrings.IssueDetection
  - java.lang.String
*/
type RealTimeAlertRuleType = _RealTimeAlertRuleType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Wav_
  - typings.awsSdk.awsSdkStrings.Opus_
  - java.lang.String
*/
type RecordingFileFormat = _RecordingFileFormat | java.lang.String

type RecordingStreamList = js.Array[RecordingStreamConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HD
  - typings.awsSdk.awsSdkStrings.FHD
  - java.lang.String
*/
type ResolutionOption = _ResolutionOption | java.lang.String

type ResultMax = Double

type RuleName = java.lang.String

type SensitiveString = java.lang.String

type SentimentTimePeriodInSeconds = Double

type SentimentType = NEGATIVE | java.lang.String

type Streams = js.Array[StreamConfiguration]

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type VideoMuxType = VideoOnly | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.remove__
  - typings.awsSdk.awsSdkStrings.mask__
  - typings.awsSdk.awsSdkStrings.tag_
  - java.lang.String
*/
type VocabularyFilterMethod = _VocabularyFilterMethod | java.lang.String

type VocabularyFilterName = java.lang.String

type VocabularyName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type VoiceAnalyticsConfigurationStatus = _VoiceAnalyticsConfigurationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-07-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
