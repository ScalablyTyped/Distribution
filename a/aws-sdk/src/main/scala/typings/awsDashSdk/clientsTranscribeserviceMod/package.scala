package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsTranscribeserviceMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DateTime = Date
  type FailureReason = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`en-US`
    - typings.awsDashSdk.awsDashSdkStrings.`es-US`
    - typings.awsDashSdk.awsDashSdkStrings.`en-AU`
    - typings.awsDashSdk.awsDashSdkStrings.`fr-CA`
    - typings.awsDashSdk.awsDashSdkStrings.`en-GB`
    - typings.awsDashSdk.awsDashSdkStrings.`de-DE`
    - typings.awsDashSdk.awsDashSdkStrings.`pt-BR`
    - typings.awsDashSdk.awsDashSdkStrings.`fr-FR`
    - typings.awsDashSdk.awsDashSdkStrings.`it-IT`
    - typings.awsDashSdk.awsDashSdkStrings.`ko-KR`
    - typings.awsDashSdk.awsDashSdkStrings.`es-ES`
    - typings.awsDashSdk.awsDashSdkStrings.`en-IN`
    - typings.awsDashSdk.awsDashSdkStrings.`hi-IN`
    - typings.awsDashSdk.awsDashSdkStrings.`ar-SA`
    - typings.awsDashSdk.awsDashSdkStrings.`ru-RU`
    - typings.awsDashSdk.awsDashSdkStrings.`zh-CN`
    - java.lang.String
  */
  type LanguageCode = _LanguageCode | String
  type MaxResults = Double
  type MaxSpeakers = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mp3
    - typings.awsDashSdk.awsDashSdkStrings.mp4
    - typings.awsDashSdk.awsDashSdkStrings.wav
    - typings.awsDashSdk.awsDashSdkStrings.flac
    - java.lang.String
  */
  type MediaFormat = _MediaFormat | String
  type MediaSampleRateHertz = Double
  type NextToken = String
  type OutputBucketName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER_BUCKET
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_BUCKET
    - java.lang.String
  */
  type OutputLocationType = _OutputLocationType | String
  type Phrase = String
  type Phrases = js.Array[Phrase]
  type TranscriptionJobName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - java.lang.String
  */
  type TranscriptionJobStatus = _TranscriptionJobStatus | String
  type TranscriptionJobSummaries = js.Array[TranscriptionJobSummary]
  type Uri = String
  type Vocabularies = js.Array[VocabularyInfo]
  type VocabularyName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type VocabularyState = _VocabularyState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-10-26`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
