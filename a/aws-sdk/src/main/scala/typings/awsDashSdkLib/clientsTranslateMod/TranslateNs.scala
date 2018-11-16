package typings
package awsDashSdkLib.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/translate", "Translate")
@js.native
object TranslateNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait TranslateTextRequest extends js.Object {
    /**
         * One of the supported language codes for the source text. If the TargetLanguageCode is not "en", the SourceLanguageCode must be "en". To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
         */
    var SourceLanguageCode: LanguageCodeString
    /**
         * One of the supported language codes for the target text. If the SourceLanguageCode is not "en", the TargetLanguageCode must be "en".
         */
    var TargetLanguageCode: LanguageCodeString
    /**
         * The text to translate.
         */
    var Text: BoundedLengthString
  }
  
  
  trait TranslateTextResponse extends js.Object {
    /**
         * The language code for the language of the input text. 
         */
    var SourceLanguageCode: LanguageCodeString
    /**
         * The language code for the language of the translated text. 
         */
    var TargetLanguageCode: LanguageCodeString
    /**
         * The text translated into the target language.
         */
    var TranslatedText: java.lang.String
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Translates input text from the source language to the target language. You can translate between English (en) and one of the following languages, or between one of the following languages and English.   Arabic (ar)   Chinese (Simplified) (zh)   French (fr)   German (de)   Portuguese (pt)   Spanish (es)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
       */
    def translateText(): awsDashSdkLib.libRequestMod.Request[TranslateTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Translates input text from the source language to the target language. You can translate between English (en) and one of the following languages, or between one of the following languages and English.   Arabic (ar)   Chinese (Simplified) (zh)   French (fr)   German (de)   Portuguese (pt)   Spanish (es)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
       */
    def translateText(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TranslateTextResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TranslateTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Translates input text from the source language to the target language. You can translate between English (en) and one of the following languages, or between one of the following languages and English.   Arabic (ar)   Chinese (Simplified) (zh)   French (fr)   German (de)   Portuguese (pt)   Spanish (es)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
       */
    def translateText(params: TranslateTextRequest): awsDashSdkLib.libRequestMod.Request[TranslateTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Translates input text from the source language to the target language. You can translate between English (en) and one of the following languages, or between one of the following languages and English.   Arabic (ar)   Chinese (Simplified) (zh)   French (fr)   German (de)   Portuguese (pt)   Spanish (es)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
       */
    def translateText(
      params: TranslateTextRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TranslateTextResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TranslateTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type LanguageCodeString = java.lang.String
  type String = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-07-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

