package typings
package awsDashSdkLib.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translate
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Translate: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsTranslateMod.TranslateNs.ClientConfiguration = js.native
  /**
     * Translates input text from the source language to the target language. You can translate between English (en) and one of the following languages, or between one of the following languages and English.   Arabic (ar)   Chinese (Simplified) (zh)   French (fr)   German (de)   Portuguese (pt)   Spanish (es)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
     */
  def translateText(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranslateMod.TranslateNs.TranslateTextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Translates input text from the source language to the target language. You can translate between English (en) and one of the following languages, or between one of the following languages and English.   Arabic (ar)   Chinese (Simplified) (zh)   French (fr)   German (de)   Portuguese (pt)   Spanish (es)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
     */
  def translateText(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranslateMod.TranslateNs.TranslateTextResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranslateMod.TranslateNs.TranslateTextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Translates input text from the source language to the target language. You can translate between English (en) and one of the following languages, or between one of the following languages and English.   Arabic (ar)   Chinese (Simplified) (zh)   French (fr)   German (de)   Portuguese (pt)   Spanish (es)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
     */
  def translateText(params: awsDashSdkLib.clientsTranslateMod.TranslateNs.TranslateTextRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranslateMod.TranslateNs.TranslateTextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Translates input text from the source language to the target language. You can translate between English (en) and one of the following languages, or between one of the following languages and English.   Arabic (ar)   Chinese (Simplified) (zh)   French (fr)   German (de)   Portuguese (pt)   Spanish (es)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
     */
  def translateText(
    params: awsDashSdkLib.clientsTranslateMod.TranslateNs.TranslateTextRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranslateMod.TranslateNs.TranslateTextResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranslateMod.TranslateNs.TranslateTextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

