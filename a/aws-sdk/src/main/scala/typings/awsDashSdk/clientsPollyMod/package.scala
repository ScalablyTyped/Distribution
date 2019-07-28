package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPollyMod {
  type Alphabet = String
  type AudioStream = Buffer | Uint8Array | Blob | String | Readable
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ContentType = String
  type DateTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Female
    - typings.awsDashSdk.awsDashSdkStrings.Male
    - java.lang.String
  */
  type Gender = _Gender | String
  type IncludeAdditionalLanguageCodes = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.arb
    - typings.awsDashSdk.awsDashSdkStrings.`cmn-CN`
    - typings.awsDashSdk.awsDashSdkStrings.`cy-GB`
    - typings.awsDashSdk.awsDashSdkStrings.`da-DK`
    - typings.awsDashSdk.awsDashSdkStrings.`de-DE`
    - typings.awsDashSdk.awsDashSdkStrings.`en-AU`
    - typings.awsDashSdk.awsDashSdkStrings.`en-GB`
    - typings.awsDashSdk.awsDashSdkStrings.`en-GB-WLS`
    - typings.awsDashSdk.awsDashSdkStrings.`en-IN`
    - typings.awsDashSdk.awsDashSdkStrings.`en-US`
    - typings.awsDashSdk.awsDashSdkStrings.`es-ES`
    - typings.awsDashSdk.awsDashSdkStrings.`es-MX`
    - typings.awsDashSdk.awsDashSdkStrings.`es-US`
    - typings.awsDashSdk.awsDashSdkStrings.`fr-CA`
    - typings.awsDashSdk.awsDashSdkStrings.`fr-FR`
    - typings.awsDashSdk.awsDashSdkStrings.`is-IS`
    - typings.awsDashSdk.awsDashSdkStrings.`it-IT`
    - typings.awsDashSdk.awsDashSdkStrings.`ja-JP`
    - typings.awsDashSdk.awsDashSdkStrings.`hi-IN`
    - typings.awsDashSdk.awsDashSdkStrings.`ko-KR`
    - typings.awsDashSdk.awsDashSdkStrings.`nb-NO`
    - typings.awsDashSdk.awsDashSdkStrings.`nl-NL`
    - typings.awsDashSdk.awsDashSdkStrings.`pl-PL`
    - typings.awsDashSdk.awsDashSdkStrings.`pt-BR`
    - typings.awsDashSdk.awsDashSdkStrings.`pt-PT`
    - typings.awsDashSdk.awsDashSdkStrings.`ro-RO`
    - typings.awsDashSdk.awsDashSdkStrings.`ru-RU`
    - typings.awsDashSdk.awsDashSdkStrings.`sv-SE`
    - typings.awsDashSdk.awsDashSdkStrings.`tr-TR`
    - java.lang.String
  */
  type LanguageCode = _LanguageCode | String
  type LanguageCodeList = js.Array[LanguageCode]
  type LanguageName = String
  type LastModified = Date
  type LexemesCount = Double
  type LexiconArn = String
  type LexiconContent = String
  type LexiconDescriptionList = js.Array[LexiconDescription]
  type LexiconName = String
  type LexiconNameList = js.Array[LexiconName]
  type MaxResults = Double
  type NextToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.json
    - typings.awsDashSdk.awsDashSdkStrings.mp3
    - typings.awsDashSdk.awsDashSdkStrings.ogg_vorbis
    - typings.awsDashSdk.awsDashSdkStrings.pcm
    - java.lang.String
  */
  type OutputFormat = _OutputFormat | String
  type OutputS3BucketName = String
  type OutputS3KeyPrefix = String
  type OutputUri = String
  type RequestCharacters = Double
  type SampleRate = String
  type Size = Double
  type SnsTopicArn = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.sentence
    - typings.awsDashSdk.awsDashSdkStrings.ssml
    - typings.awsDashSdk.awsDashSdkStrings.viseme
    - typings.awsDashSdk.awsDashSdkStrings.word
    - java.lang.String
  */
  type SpeechMarkType = _SpeechMarkType | String
  type SpeechMarkTypeList = js.Array[SpeechMarkType]
  type SynthesisTasks = js.Array[SynthesisTask]
  type TaskId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.scheduled
    - typings.awsDashSdk.awsDashSdkStrings.inProgress
    - typings.awsDashSdk.awsDashSdkStrings.completed
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - java.lang.String
  */
  type TaskStatus = _TaskStatus | String
  type TaskStatusReason = String
  type Text = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ssml
    - typings.awsDashSdk.awsDashSdkStrings.text
    - java.lang.String
  */
  type TextType = _TextType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Aditi
    - typings.awsDashSdk.awsDashSdkStrings.Amy
    - typings.awsDashSdk.awsDashSdkStrings.Astrid
    - typings.awsDashSdk.awsDashSdkStrings.Bianca
    - typings.awsDashSdk.awsDashSdkStrings.Brian
    - typings.awsDashSdk.awsDashSdkStrings.Carla
    - typings.awsDashSdk.awsDashSdkStrings.Carmen
    - typings.awsDashSdk.awsDashSdkStrings.Celine
    - typings.awsDashSdk.awsDashSdkStrings.Chantal
    - typings.awsDashSdk.awsDashSdkStrings.Conchita
    - typings.awsDashSdk.awsDashSdkStrings.Cristiano
    - typings.awsDashSdk.awsDashSdkStrings.Dora
    - typings.awsDashSdk.awsDashSdkStrings.Emma
    - typings.awsDashSdk.awsDashSdkStrings.Enrique
    - typings.awsDashSdk.awsDashSdkStrings.Ewa
    - typings.awsDashSdk.awsDashSdkStrings.Filiz
    - typings.awsDashSdk.awsDashSdkStrings.Geraint
    - typings.awsDashSdk.awsDashSdkStrings.Giorgio
    - typings.awsDashSdk.awsDashSdkStrings.Gwyneth
    - typings.awsDashSdk.awsDashSdkStrings.Hans
    - typings.awsDashSdk.awsDashSdkStrings.Ines
    - typings.awsDashSdk.awsDashSdkStrings.Ivy
    - typings.awsDashSdk.awsDashSdkStrings.Jacek
    - typings.awsDashSdk.awsDashSdkStrings.Jan
    - typings.awsDashSdk.awsDashSdkStrings.Joanna
    - typings.awsDashSdk.awsDashSdkStrings.Joey
    - typings.awsDashSdk.awsDashSdkStrings.Justin
    - typings.awsDashSdk.awsDashSdkStrings.Karl
    - typings.awsDashSdk.awsDashSdkStrings.Kendra
    - typings.awsDashSdk.awsDashSdkStrings.Kimberly
    - typings.awsDashSdk.awsDashSdkStrings.Lea
    - typings.awsDashSdk.awsDashSdkStrings.Liv
    - typings.awsDashSdk.awsDashSdkStrings.Lotte
    - typings.awsDashSdk.awsDashSdkStrings.Lucia
    - typings.awsDashSdk.awsDashSdkStrings.Mads
    - typings.awsDashSdk.awsDashSdkStrings.Maja
    - typings.awsDashSdk.awsDashSdkStrings.Marlene
    - typings.awsDashSdk.awsDashSdkStrings.Mathieu
    - typings.awsDashSdk.awsDashSdkStrings.Matthew
    - typings.awsDashSdk.awsDashSdkStrings.Maxim
    - typings.awsDashSdk.awsDashSdkStrings.Mia
    - typings.awsDashSdk.awsDashSdkStrings.Miguel
    - typings.awsDashSdk.awsDashSdkStrings.Mizuki
    - typings.awsDashSdk.awsDashSdkStrings.Naja
    - typings.awsDashSdk.awsDashSdkStrings.Nicole
    - typings.awsDashSdk.awsDashSdkStrings.Penelope
    - typings.awsDashSdk.awsDashSdkStrings.Raveena
    - typings.awsDashSdk.awsDashSdkStrings.Ricardo
    - typings.awsDashSdk.awsDashSdkStrings.Ruben
    - typings.awsDashSdk.awsDashSdkStrings.Russell
    - typings.awsDashSdk.awsDashSdkStrings.Salli
    - typings.awsDashSdk.awsDashSdkStrings.Seoyeon
    - typings.awsDashSdk.awsDashSdkStrings.Takumi
    - typings.awsDashSdk.awsDashSdkStrings.Tatyana
    - typings.awsDashSdk.awsDashSdkStrings.Vicki
    - typings.awsDashSdk.awsDashSdkStrings.Vitoria
    - typings.awsDashSdk.awsDashSdkStrings.Zeina
    - typings.awsDashSdk.awsDashSdkStrings.Zhiyu
    - java.lang.String
  */
  type VoiceId = _VoiceId | String
  type VoiceList = js.Array[Voice]
  type VoiceName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-06-10`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
