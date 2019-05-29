package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsTranscribeserviceMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DateTime = stdLib.Date
  type FailureReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`en-US`
    - awsDashSdkLib.awsDashSdkLibStrings.`es-US`
    - awsDashSdkLib.awsDashSdkLibStrings.`en-AU`
    - awsDashSdkLib.awsDashSdkLibStrings.`fr-CA`
    - awsDashSdkLib.awsDashSdkLibStrings.`en-GB`
    - awsDashSdkLib.awsDashSdkLibStrings.`de-DE`
    - awsDashSdkLib.awsDashSdkLibStrings.`pt-BR`
    - awsDashSdkLib.awsDashSdkLibStrings.`fr-FR`
    - awsDashSdkLib.awsDashSdkLibStrings.`it-IT`
    - awsDashSdkLib.awsDashSdkLibStrings.`ko-KR`
    - awsDashSdkLib.awsDashSdkLibStrings.`es-ES`
    - awsDashSdkLib.awsDashSdkLibStrings.`en-IN`
    - awsDashSdkLib.awsDashSdkLibStrings.`hi-IN`
    - awsDashSdkLib.awsDashSdkLibStrings.`ar-SA`
    - java.lang.String
  */
  type LanguageCode = _LanguageCode | java.lang.String
  type MaxResults = scala.Double
  type MaxSpeakers = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.mp3
    - awsDashSdkLib.awsDashSdkLibStrings.mp4
    - awsDashSdkLib.awsDashSdkLibStrings.wav
    - awsDashSdkLib.awsDashSdkLibStrings.flac
    - java.lang.String
  */
  type MediaFormat = _MediaFormat | java.lang.String
  type MediaSampleRateHertz = scala.Double
  type NextToken = java.lang.String
  type OutputBucketName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOMER_BUCKET
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE_BUCKET
    - java.lang.String
  */
  type OutputLocationType = _OutputLocationType | java.lang.String
  type Phrase = java.lang.String
  type Phrases = js.Array[Phrase]
  type TranscriptionJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - java.lang.String
  */
  type TranscriptionJobStatus = _TranscriptionJobStatus | java.lang.String
  type TranscriptionJobSummaries = js.Array[TranscriptionJobSummary]
  type Uri = java.lang.String
  type Vocabularies = js.Array[VocabularyInfo]
  type VocabularyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type VocabularyState = _VocabularyState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-10-26`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
