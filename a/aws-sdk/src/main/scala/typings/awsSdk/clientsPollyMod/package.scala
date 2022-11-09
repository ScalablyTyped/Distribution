package typings.awsSdk.clientsPollyMod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Alphabet = String

type AudioStream = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

type ContentType = String

type DateTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.standard__
  - typings.awsSdk.awsSdkStrings.neural
  - java.lang.String
*/
type Engine = _Engine | String

type EngineList = js.Array[Engine]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Female_
  - typings.awsSdk.awsSdkStrings.Male_
  - java.lang.String
*/
type Gender = _Gender | String

type IncludeAdditionalLanguageCodes = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.arb
  - typings.awsSdk.awsSdkStrings.`cmn-CN`
  - typings.awsSdk.awsSdkStrings.`cy-GB`
  - typings.awsSdk.awsSdkStrings.`da-DK`
  - typings.awsSdk.awsSdkStrings.`de-DE`
  - typings.awsSdk.awsSdkStrings.`en-AU`
  - typings.awsSdk.awsSdkStrings.`en-GB`
  - typings.awsSdk.awsSdkStrings.`en-GB-WLS`
  - typings.awsSdk.awsSdkStrings.`en-IN`
  - typings.awsSdk.awsSdkStrings.`en-US`
  - typings.awsSdk.awsSdkStrings.`es-ES`
  - typings.awsSdk.awsSdkStrings.`es-MX`
  - typings.awsSdk.awsSdkStrings.`es-US`
  - typings.awsSdk.awsSdkStrings.`fr-CA`
  - typings.awsSdk.awsSdkStrings.`fr-FR`
  - typings.awsSdk.awsSdkStrings.`is-IS`
  - typings.awsSdk.awsSdkStrings.`it-IT`
  - typings.awsSdk.awsSdkStrings.`ja-JP`
  - typings.awsSdk.awsSdkStrings.`hi-IN`
  - typings.awsSdk.awsSdkStrings.`ko-KR`
  - typings.awsSdk.awsSdkStrings.`nb-NO`
  - typings.awsSdk.awsSdkStrings.`nl-NL`
  - typings.awsSdk.awsSdkStrings.`pl-PL`
  - typings.awsSdk.awsSdkStrings.`pt-BR`
  - typings.awsSdk.awsSdkStrings.`pt-PT`
  - typings.awsSdk.awsSdkStrings.`ro-RO`
  - typings.awsSdk.awsSdkStrings.`ru-RU`
  - typings.awsSdk.awsSdkStrings.`sv-SE`
  - typings.awsSdk.awsSdkStrings.`tr-TR`
  - typings.awsSdk.awsSdkStrings.`en-NZ`
  - typings.awsSdk.awsSdkStrings.`en-ZA`
  - typings.awsSdk.awsSdkStrings.`ca-ES`
  - typings.awsSdk.awsSdkStrings.`de-AT`
  - typings.awsSdk.awsSdkStrings.`yue-CN`
  - java.lang.String
*/
type LanguageCode = _LanguageCode | String

type LanguageCodeList = js.Array[LanguageCode]

type LanguageName = String

type LastModified = js.Date

type LexemesCount = Double

type LexiconArn = String

type LexiconContent = String

type LexiconDescriptionList = js.Array[LexiconDescription]

type LexiconName = String

type LexiconNameList = js.Array[LexiconName]

type MaxResults = Double

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.json__
  - typings.awsSdk.awsSdkStrings.mp3_
  - typings.awsSdk.awsSdkStrings.ogg_vorbis
  - typings.awsSdk.awsSdkStrings.pcm
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
  - typings.awsSdk.awsSdkStrings.sentence
  - typings.awsSdk.awsSdkStrings.ssml_
  - typings.awsSdk.awsSdkStrings.viseme
  - typings.awsSdk.awsSdkStrings.word_
  - java.lang.String
*/
type SpeechMarkType = _SpeechMarkType | String

type SpeechMarkTypeList = js.Array[SpeechMarkType]

type SynthesisTasks = js.Array[SynthesisTask]

type TaskId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.scheduled__
  - typings.awsSdk.awsSdkStrings.inProgress__
  - typings.awsSdk.awsSdkStrings.completed__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type TaskStatus = _TaskStatus | String

type TaskStatusReason = String

type Text = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ssml_
  - typings.awsSdk.awsSdkStrings.text__
  - java.lang.String
*/
type TextType = _TextType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Aditi
  - typings.awsSdk.awsSdkStrings.Amy_
  - typings.awsSdk.awsSdkStrings.Astrid_
  - typings.awsSdk.awsSdkStrings.Bianca_
  - typings.awsSdk.awsSdkStrings.Brian_
  - typings.awsSdk.awsSdkStrings.Camila_
  - typings.awsSdk.awsSdkStrings.Carla_
  - typings.awsSdk.awsSdkStrings.Carmen_
  - typings.awsSdk.awsSdkStrings.Celine_
  - typings.awsSdk.awsSdkStrings.Chantal_
  - typings.awsSdk.awsSdkStrings.Conchita_
  - typings.awsSdk.awsSdkStrings.Cristiano_
  - typings.awsSdk.awsSdkStrings.Dora_
  - typings.awsSdk.awsSdkStrings.Emma_
  - typings.awsSdk.awsSdkStrings.Enrique_
  - typings.awsSdk.awsSdkStrings.Ewa_
  - typings.awsSdk.awsSdkStrings.Filiz_
  - typings.awsSdk.awsSdkStrings.Gabrielle
  - typings.awsSdk.awsSdkStrings.Geraint_
  - typings.awsSdk.awsSdkStrings.Giorgio_
  - typings.awsSdk.awsSdkStrings.Gwyneth_
  - typings.awsSdk.awsSdkStrings.Hans_
  - typings.awsSdk.awsSdkStrings.Ines_
  - typings.awsSdk.awsSdkStrings.Ivy_
  - typings.awsSdk.awsSdkStrings.Jacek_
  - typings.awsSdk.awsSdkStrings.Jan_
  - typings.awsSdk.awsSdkStrings.Joanna_
  - typings.awsSdk.awsSdkStrings.Joey_
  - typings.awsSdk.awsSdkStrings.Justin_
  - typings.awsSdk.awsSdkStrings.Karl_
  - typings.awsSdk.awsSdkStrings.Kendra_
  - typings.awsSdk.awsSdkStrings.Kevin
  - typings.awsSdk.awsSdkStrings.Kimberly_
  - typings.awsSdk.awsSdkStrings.Lea_
  - typings.awsSdk.awsSdkStrings.Liv_
  - typings.awsSdk.awsSdkStrings.Lotte_
  - typings.awsSdk.awsSdkStrings.Lucia_
  - typings.awsSdk.awsSdkStrings.Lupe_
  - typings.awsSdk.awsSdkStrings.Mads_
  - typings.awsSdk.awsSdkStrings.Maja_
  - typings.awsSdk.awsSdkStrings.Marlene_
  - typings.awsSdk.awsSdkStrings.Mathieu_
  - typings.awsSdk.awsSdkStrings.Matthew_
  - typings.awsSdk.awsSdkStrings.Maxim_
  - typings.awsSdk.awsSdkStrings.Mia_
  - typings.awsSdk.awsSdkStrings.Miguel_
  - typings.awsSdk.awsSdkStrings.Mizuki_
  - typings.awsSdk.awsSdkStrings.Naja_
  - typings.awsSdk.awsSdkStrings.Nicole_
  - typings.awsSdk.awsSdkStrings.Olivia
  - typings.awsSdk.awsSdkStrings.Penelope_
  - typings.awsSdk.awsSdkStrings.Raveena_
  - typings.awsSdk.awsSdkStrings.Ricardo_
  - typings.awsSdk.awsSdkStrings.Ruben_
  - typings.awsSdk.awsSdkStrings.Russell_
  - typings.awsSdk.awsSdkStrings.Salli_
  - typings.awsSdk.awsSdkStrings.Seoyeon_
  - typings.awsSdk.awsSdkStrings.Takumi_
  - typings.awsSdk.awsSdkStrings.Tatyana_
  - typings.awsSdk.awsSdkStrings.Vicki_
  - typings.awsSdk.awsSdkStrings.Vitoria_
  - typings.awsSdk.awsSdkStrings.Zeina_
  - typings.awsSdk.awsSdkStrings.Zhiyu_
  - typings.awsSdk.awsSdkStrings.Aria
  - typings.awsSdk.awsSdkStrings.Ayanda
  - typings.awsSdk.awsSdkStrings.Arlet
  - typings.awsSdk.awsSdkStrings.Hannah
  - typings.awsSdk.awsSdkStrings.Arthur
  - typings.awsSdk.awsSdkStrings.Daniel
  - typings.awsSdk.awsSdkStrings.Liam
  - typings.awsSdk.awsSdkStrings.Pedro
  - typings.awsSdk.awsSdkStrings.Kajal
  - typings.awsSdk.awsSdkStrings.Hiujin
  - typings.awsSdk.awsSdkStrings.Laura
  - typings.awsSdk.awsSdkStrings.Elin
  - typings.awsSdk.awsSdkStrings.Ida
  - typings.awsSdk.awsSdkStrings.Suvi
  - java.lang.String
*/
type VoiceId = _VoiceId | String

type VoiceList = js.Array[Voice]

type VoiceName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-06-10`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
