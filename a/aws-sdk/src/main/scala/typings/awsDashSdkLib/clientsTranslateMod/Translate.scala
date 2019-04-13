package typings
package awsDashSdkLib.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translate
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Translate: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * A synchronous action that deletes a custom terminology.
    */
  def deleteTerminology(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTerminology(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * A synchronous action that deletes a custom terminology.
    */
  def deleteTerminology(params: DeleteTerminologyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTerminology(
    params: DeleteTerminologyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a custom terminology.
    */
  def getTerminology(): awsDashSdkLib.libRequestMod.Request[GetTerminologyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTerminology(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTerminologyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTerminologyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a custom terminology.
    */
  def getTerminology(params: GetTerminologyRequest): awsDashSdkLib.libRequestMod.Request[GetTerminologyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTerminology(
    params: GetTerminologyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTerminologyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTerminologyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology name. Importing a terminology with the same name as an existing one will merge the terminologies based on the chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology will overwrite an existing terminology of the same name. If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully propagate and be available for use in a translation due to cache policies with the DataPlane service that performs the translations.
    */
  def importTerminology(): awsDashSdkLib.libRequestMod.Request[ImportTerminologyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importTerminology(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportTerminologyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportTerminologyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology name. Importing a terminology with the same name as an existing one will merge the terminologies based on the chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology will overwrite an existing terminology of the same name. If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully propagate and be available for use in a translation due to cache policies with the DataPlane service that performs the translations.
    */
  def importTerminology(params: ImportTerminologyRequest): awsDashSdkLib.libRequestMod.Request[ImportTerminologyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importTerminology(
    params: ImportTerminologyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportTerminologyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportTerminologyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides a list of custom terminologies associated with your account.
    */
  def listTerminologies(): awsDashSdkLib.libRequestMod.Request[ListTerminologiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTerminologies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTerminologiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTerminologiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides a list of custom terminologies associated with your account.
    */
  def listTerminologies(params: ListTerminologiesRequest): awsDashSdkLib.libRequestMod.Request[ListTerminologiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTerminologies(
    params: ListTerminologiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTerminologiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTerminologiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Translates input text from the source language to the target language. It is not necessary to use English (en) as either the source or the target language but not all language combinations are supported by Amazon Translate. For more information, see Supported Language Pairs.   Arabic (ar)   Chinese (Simplified) (zh)   Chinese (Traditional) (zh-TW)   Czech (cs)   Danish (da)   Dutch (nl)   English (en)   Finnish (fi)   French (fr)   German (de)   Hebrew (he)   Indonesian (id)   Italian (it)   Japanese (ja)   Korean (ko)   Polish (pl)   Portuguese (pt)   Russian (ru)   Spanish (es)   Swedish (sv)   Turkish (tr)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
    */
  def translateText(): awsDashSdkLib.libRequestMod.Request[TranslateTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def translateText(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TranslateTextResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TranslateTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Translates input text from the source language to the target language. It is not necessary to use English (en) as either the source or the target language but not all language combinations are supported by Amazon Translate. For more information, see Supported Language Pairs.   Arabic (ar)   Chinese (Simplified) (zh)   Chinese (Traditional) (zh-TW)   Czech (cs)   Danish (da)   Dutch (nl)   English (en)   Finnish (fi)   French (fr)   German (de)   Hebrew (he)   Indonesian (id)   Italian (it)   Japanese (ja)   Korean (ko)   Polish (pl)   Portuguese (pt)   Russian (ru)   Spanish (es)   Swedish (sv)   Turkish (tr)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
    */
  def translateText(params: TranslateTextRequest): awsDashSdkLib.libRequestMod.Request[TranslateTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def translateText(
    params: TranslateTextRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TranslateTextResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TranslateTextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

