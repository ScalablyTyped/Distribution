package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsTranscribeserviceMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DataAccessRoleArn = String
  type DateTime = Date
  type FailureReason = String
  type KMSKeyId = String
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
    - typings.awsDashSdk.awsDashSdkStrings.`nl-NL`
    - typings.awsDashSdk.awsDashSdkStrings.`id-ID`
    - typings.awsDashSdk.awsDashSdkStrings.`ta-IN`
    - typings.awsDashSdk.awsDashSdkStrings.`fa-IR`
    - typings.awsDashSdk.awsDashSdkStrings.`en-IE`
    - typings.awsDashSdk.awsDashSdkStrings.`en-AB`
    - typings.awsDashSdk.awsDashSdkStrings.`en-WL`
    - typings.awsDashSdk.awsDashSdkStrings.`pt-PT`
    - typings.awsDashSdk.awsDashSdkStrings.`te-IN`
    - typings.awsDashSdk.awsDashSdkStrings.`tr-TR`
    - typings.awsDashSdk.awsDashSdkStrings.`de-CH`
    - typings.awsDashSdk.awsDashSdkStrings.`he-IL`
    - typings.awsDashSdk.awsDashSdkStrings.`ms-MY`
    - typings.awsDashSdk.awsDashSdkStrings.`ja-JP`
    - typings.awsDashSdk.awsDashSdkStrings.`ar-AE`
    - java.lang.String
  */
  type LanguageCode = _LanguageCode | String
  type MaxAlternatives = Double
  type MaxResults = Double
  type MaxSpeakers = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mp3
    - typings.awsDashSdk.awsDashSdkStrings.mp4_
    - typings.awsDashSdk.awsDashSdkStrings.wav_
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
    - typings.awsDashSdk.awsDashSdkStrings.QUEUED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - java.lang.String
  */
  type TranscriptionJobStatus = _TranscriptionJobStatus | String
  type TranscriptionJobSummaries = js.Array[TranscriptionJobSummary]
  type Uri = String
  type Vocabularies = js.Array[VocabularyInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.remove__
    - typings.awsDashSdk.awsDashSdkStrings.mask
    - java.lang.String
  */
  type VocabularyFilterMethod = _VocabularyFilterMethod | String
  type VocabularyFilterName = String
  type VocabularyFilters = js.Array[VocabularyFilterInfo]
  type VocabularyName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type VocabularyState = _VocabularyState | String
  type Word = String
  type Words = js.Array[Word]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-10-26`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
