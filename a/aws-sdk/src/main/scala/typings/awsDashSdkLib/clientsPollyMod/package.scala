package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPollyMod {
  type Alphabet = java.lang.String
  type AudioStream = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String | nodeLib.streamMod.Readable
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContentType = java.lang.String
  type DateTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Female
    - awsDashSdkLib.awsDashSdkLibStrings.Male
    - java.lang.String
  */
  type Gender = _Gender | java.lang.String
  type IncludeAdditionalLanguageCodes = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`cmn-CN`
    - awsDashSdkLib.awsDashSdkLibStrings.`cy-GB`
    - awsDashSdkLib.awsDashSdkLibStrings.`da-DK`
    - awsDashSdkLib.awsDashSdkLibStrings.`de-DE`
    - awsDashSdkLib.awsDashSdkLibStrings.`en-AU`
    - awsDashSdkLib.awsDashSdkLibStrings.`en-GB`
    - awsDashSdkLib.awsDashSdkLibStrings.`en-GB-WLS`
    - awsDashSdkLib.awsDashSdkLibStrings.`en-IN`
    - awsDashSdkLib.awsDashSdkLibStrings.`en-US`
    - awsDashSdkLib.awsDashSdkLibStrings.`es-ES`
    - awsDashSdkLib.awsDashSdkLibStrings.`es-MX`
    - awsDashSdkLib.awsDashSdkLibStrings.`es-US`
    - awsDashSdkLib.awsDashSdkLibStrings.`fr-CA`
    - awsDashSdkLib.awsDashSdkLibStrings.`fr-FR`
    - awsDashSdkLib.awsDashSdkLibStrings.`is-IS`
    - awsDashSdkLib.awsDashSdkLibStrings.`it-IT`
    - awsDashSdkLib.awsDashSdkLibStrings.`ja-JP`
    - awsDashSdkLib.awsDashSdkLibStrings.`hi-IN`
    - awsDashSdkLib.awsDashSdkLibStrings.`ko-KR`
    - awsDashSdkLib.awsDashSdkLibStrings.`nb-NO`
    - awsDashSdkLib.awsDashSdkLibStrings.`nl-NL`
    - awsDashSdkLib.awsDashSdkLibStrings.`pl-PL`
    - awsDashSdkLib.awsDashSdkLibStrings.`pt-BR`
    - awsDashSdkLib.awsDashSdkLibStrings.`pt-PT`
    - awsDashSdkLib.awsDashSdkLibStrings.`ro-RO`
    - awsDashSdkLib.awsDashSdkLibStrings.`ru-RU`
    - awsDashSdkLib.awsDashSdkLibStrings.`sv-SE`
    - awsDashSdkLib.awsDashSdkLibStrings.`tr-TR`
    - java.lang.String
  */
  type LanguageCode = _LanguageCode | java.lang.String
  type LanguageCodeList = js.Array[LanguageCode]
  type LanguageName = java.lang.String
  type LastModified = stdLib.Date
  type LexemesCount = scala.Double
  type LexiconArn = java.lang.String
  type LexiconContent = java.lang.String
  type LexiconDescriptionList = js.Array[LexiconDescription]
  type LexiconName = java.lang.String
  type LexiconNameList = js.Array[LexiconName]
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.json
    - awsDashSdkLib.awsDashSdkLibStrings.mp3
    - awsDashSdkLib.awsDashSdkLibStrings.ogg_vorbis
    - awsDashSdkLib.awsDashSdkLibStrings.pcm
    - java.lang.String
  */
  type OutputFormat = _OutputFormat | java.lang.String
  type OutputS3BucketName = java.lang.String
  type OutputS3KeyPrefix = java.lang.String
  type OutputUri = java.lang.String
  type RequestCharacters = scala.Double
  type SampleRate = java.lang.String
  type Size = scala.Double
  type SnsTopicArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.sentence
    - awsDashSdkLib.awsDashSdkLibStrings.ssml
    - awsDashSdkLib.awsDashSdkLibStrings.viseme
    - awsDashSdkLib.awsDashSdkLibStrings.word
    - java.lang.String
  */
  type SpeechMarkType = _SpeechMarkType | java.lang.String
  type SpeechMarkTypeList = js.Array[SpeechMarkType]
  type SynthesisTasks = js.Array[SynthesisTask]
  type TaskId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.scheduled
    - awsDashSdkLib.awsDashSdkLibStrings.inProgress
    - awsDashSdkLib.awsDashSdkLibStrings.completed
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - java.lang.String
  */
  type TaskStatus = _TaskStatus | java.lang.String
  type TaskStatusReason = java.lang.String
  type Text = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ssml
    - awsDashSdkLib.awsDashSdkLibStrings.text
    - java.lang.String
  */
  type TextType = _TextType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Geraint
    - awsDashSdkLib.awsDashSdkLibStrings.Gwyneth
    - awsDashSdkLib.awsDashSdkLibStrings.Mads
    - awsDashSdkLib.awsDashSdkLibStrings.Naja
    - awsDashSdkLib.awsDashSdkLibStrings.Hans
    - awsDashSdkLib.awsDashSdkLibStrings.Marlene
    - awsDashSdkLib.awsDashSdkLibStrings.Nicole
    - awsDashSdkLib.awsDashSdkLibStrings.Russell
    - awsDashSdkLib.awsDashSdkLibStrings.Amy
    - awsDashSdkLib.awsDashSdkLibStrings.Brian
    - awsDashSdkLib.awsDashSdkLibStrings.Emma
    - awsDashSdkLib.awsDashSdkLibStrings.Raveena
    - awsDashSdkLib.awsDashSdkLibStrings.Ivy
    - awsDashSdkLib.awsDashSdkLibStrings.Joanna
    - awsDashSdkLib.awsDashSdkLibStrings.Joey
    - awsDashSdkLib.awsDashSdkLibStrings.Justin
    - awsDashSdkLib.awsDashSdkLibStrings.Kendra
    - awsDashSdkLib.awsDashSdkLibStrings.Kimberly
    - awsDashSdkLib.awsDashSdkLibStrings.Matthew
    - awsDashSdkLib.awsDashSdkLibStrings.Salli
    - awsDashSdkLib.awsDashSdkLibStrings.Conchita
    - awsDashSdkLib.awsDashSdkLibStrings.Enrique
    - awsDashSdkLib.awsDashSdkLibStrings.Miguel
    - awsDashSdkLib.awsDashSdkLibStrings.Penelope
    - awsDashSdkLib.awsDashSdkLibStrings.Chantal
    - awsDashSdkLib.awsDashSdkLibStrings.Celine
    - awsDashSdkLib.awsDashSdkLibStrings.Lea
    - awsDashSdkLib.awsDashSdkLibStrings.Mathieu
    - awsDashSdkLib.awsDashSdkLibStrings.Dora
    - awsDashSdkLib.awsDashSdkLibStrings.Karl
    - awsDashSdkLib.awsDashSdkLibStrings.Carla
    - awsDashSdkLib.awsDashSdkLibStrings.Giorgio
    - awsDashSdkLib.awsDashSdkLibStrings.Mizuki
    - awsDashSdkLib.awsDashSdkLibStrings.Liv
    - awsDashSdkLib.awsDashSdkLibStrings.Lotte
    - awsDashSdkLib.awsDashSdkLibStrings.Ruben
    - awsDashSdkLib.awsDashSdkLibStrings.Ewa
    - awsDashSdkLib.awsDashSdkLibStrings.Jacek
    - awsDashSdkLib.awsDashSdkLibStrings.Jan
    - awsDashSdkLib.awsDashSdkLibStrings.Maja
    - awsDashSdkLib.awsDashSdkLibStrings.Ricardo
    - awsDashSdkLib.awsDashSdkLibStrings.Vitoria
    - awsDashSdkLib.awsDashSdkLibStrings.Cristiano
    - awsDashSdkLib.awsDashSdkLibStrings.Ines
    - awsDashSdkLib.awsDashSdkLibStrings.Carmen
    - awsDashSdkLib.awsDashSdkLibStrings.Maxim
    - awsDashSdkLib.awsDashSdkLibStrings.Tatyana
    - awsDashSdkLib.awsDashSdkLibStrings.Astrid
    - awsDashSdkLib.awsDashSdkLibStrings.Filiz
    - awsDashSdkLib.awsDashSdkLibStrings.Vicki
    - awsDashSdkLib.awsDashSdkLibStrings.Takumi
    - awsDashSdkLib.awsDashSdkLibStrings.Seoyeon
    - awsDashSdkLib.awsDashSdkLibStrings.Aditi
    - awsDashSdkLib.awsDashSdkLibStrings.Zhiyu
    - awsDashSdkLib.awsDashSdkLibStrings.Bianca
    - awsDashSdkLib.awsDashSdkLibStrings.Lucia
    - awsDashSdkLib.awsDashSdkLibStrings.Mia
    - java.lang.String
  */
  type VoiceId = _VoiceId | java.lang.String
  type VoiceList = js.Array[Voice]
  type VoiceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-06-10`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
