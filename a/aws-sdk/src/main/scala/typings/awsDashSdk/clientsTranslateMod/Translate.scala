package typings.awsDashSdk.clientsTranslateMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translate extends Service {
  @JSName("config")
  var config_Translate: ConfigBase with ClientConfiguration = js.native
  /**
    * A synchronous action that deletes a custom terminology.
    */
  def deleteTerminology(): Request[js.Object, AWSError] = js.native
  def deleteTerminology(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * A synchronous action that deletes a custom terminology.
    */
  def deleteTerminology(params: DeleteTerminologyRequest): Request[js.Object, AWSError] = js.native
  def deleteTerminology(
    params: DeleteTerminologyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Retrieves a custom terminology.
    */
  def getTerminology(): Request[GetTerminologyResponse, AWSError] = js.native
  def getTerminology(callback: js.Function2[/* err */ AWSError, /* data */ GetTerminologyResponse, Unit]): Request[GetTerminologyResponse, AWSError] = js.native
  /**
    * Retrieves a custom terminology.
    */
  def getTerminology(params: GetTerminologyRequest): Request[GetTerminologyResponse, AWSError] = js.native
  def getTerminology(
    params: GetTerminologyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTerminologyResponse, Unit]
  ): Request[GetTerminologyResponse, AWSError] = js.native
  /**
    * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology name. Importing a terminology with the same name as an existing one will merge the terminologies based on the chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology will overwrite an existing terminology of the same name. If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully propagate and be available for use in a translation due to cache policies with the DataPlane service that performs the translations.
    */
  def importTerminology(): Request[ImportTerminologyResponse, AWSError] = js.native
  def importTerminology(callback: js.Function2[/* err */ AWSError, /* data */ ImportTerminologyResponse, Unit]): Request[ImportTerminologyResponse, AWSError] = js.native
  /**
    * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology name. Importing a terminology with the same name as an existing one will merge the terminologies based on the chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology will overwrite an existing terminology of the same name. If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully propagate and be available for use in a translation due to cache policies with the DataPlane service that performs the translations.
    */
  def importTerminology(params: ImportTerminologyRequest): Request[ImportTerminologyResponse, AWSError] = js.native
  def importTerminology(
    params: ImportTerminologyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportTerminologyResponse, Unit]
  ): Request[ImportTerminologyResponse, AWSError] = js.native
  /**
    * Provides a list of custom terminologies associated with your account.
    */
  def listTerminologies(): Request[ListTerminologiesResponse, AWSError] = js.native
  def listTerminologies(callback: js.Function2[/* err */ AWSError, /* data */ ListTerminologiesResponse, Unit]): Request[ListTerminologiesResponse, AWSError] = js.native
  /**
    * Provides a list of custom terminologies associated with your account.
    */
  def listTerminologies(params: ListTerminologiesRequest): Request[ListTerminologiesResponse, AWSError] = js.native
  def listTerminologies(
    params: ListTerminologiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTerminologiesResponse, Unit]
  ): Request[ListTerminologiesResponse, AWSError] = js.native
  /**
    * Translates input text from the source language to the target language. It is not necessary to use English (en) as either the source or the target language but not all language combinations are supported by Amazon Translate. For more information, see Supported Language Pairs.   Arabic (ar)   Chinese (Simplified) (zh)   Chinese (Traditional) (zh-TW)   Czech (cs)   Danish (da)   Dutch (nl)   English (en)   Finnish (fi)   French (fr)   German (de)   Hebrew (he)   Indonesian (id)   Italian (it)   Japanese (ja)   Korean (ko)   Polish (pl)   Portuguese (pt)   Russian (ru)   Spanish (es)   Swedish (sv)   Turkish (tr)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
    */
  def translateText(): Request[TranslateTextResponse, AWSError] = js.native
  def translateText(callback: js.Function2[/* err */ AWSError, /* data */ TranslateTextResponse, Unit]): Request[TranslateTextResponse, AWSError] = js.native
  /**
    * Translates input text from the source language to the target language. It is not necessary to use English (en) as either the source or the target language but not all language combinations are supported by Amazon Translate. For more information, see Supported Language Pairs.   Arabic (ar)   Chinese (Simplified) (zh)   Chinese (Traditional) (zh-TW)   Czech (cs)   Danish (da)   Dutch (nl)   English (en)   Finnish (fi)   French (fr)   German (de)   Hebrew (he)   Indonesian (id)   Italian (it)   Japanese (ja)   Korean (ko)   Polish (pl)   Portuguese (pt)   Russian (ru)   Spanish (es)   Swedish (sv)   Turkish (tr)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
    */
  def translateText(params: TranslateTextRequest): Request[TranslateTextResponse, AWSError] = js.native
  def translateText(
    params: TranslateTextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TranslateTextResponse, Unit]
  ): Request[TranslateTextResponse, AWSError] = js.native
}

