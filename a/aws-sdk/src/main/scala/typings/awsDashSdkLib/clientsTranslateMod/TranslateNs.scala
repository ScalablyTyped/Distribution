package typings
package awsDashSdkLib.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/translate", "Translate")
@js.native
object TranslateNs extends js.Object {
  
  trait AppliedTerminology extends js.Object {
    /**
         * The name of the custom terminology applied to the input text by Amazon Translate for the translated text response.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The specific terms of the custom terminology applied to the input text by Amazon Translate for the translated text response. A maximum of 250 terms will be returned, and the specific terms applied will be the first 250 terms in the source text. 
         */
    var Terms: js.UndefOr[TermList] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DeleteTerminologyRequest extends js.Object {
    /**
         * The name of the custom terminology being deleted. 
         */
    var Name: ResourceName
  }
  
  
  trait EncryptionKey extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the encryption key being used to encrypt the custom terminology.
         */
    var Id: EncryptionKeyID
    /**
         * The type of encryption key used by Amazon Translate to encrypt custom terminologies.
         */
    var Type: EncryptionKeyType
  }
  
  
  trait GetTerminologyRequest extends js.Object {
    /**
         * The name of the custom terminology being retrieved.
         */
    var Name: ResourceName
    /**
         * The data format of the custom terminology being retrieved, either CSV or TMX.
         */
    var TerminologyDataFormat: TerminologyDataFormat
  }
  
  
  trait GetTerminologyResponse extends js.Object {
    /**
         * The data location of the custom terminology being retrieved. The custom terminology file is returned in a presigned url that has a 30 minute expiration.
         */
    var TerminologyDataLocation: js.UndefOr[TerminologyDataLocation] = js.undefined
    /**
         * The properties of the custom terminology being retrieved.
         */
    var TerminologyProperties: js.UndefOr[TerminologyProperties] = js.undefined
  }
  
  
  trait ImportTerminologyRequest extends js.Object {
    /**
         * The description of the custom terminology being imported.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The encryption key for the custom terminology being imported.
         */
    var EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined
    /**
         * The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy is supported. In this case, the imported terminology will overwrite an existing terminology of the same name.
         */
    var MergeStrategy: MergeStrategy
    /**
         * The name of the custom terminology being imported.
         */
    var Name: ResourceName
    /**
         * The terminology data for the custom terminology being imported.
         */
    var TerminologyData: TerminologyData
  }
  
  
  trait ImportTerminologyResponse extends js.Object {
    /**
         * The properties of the custom terminology being imported.
         */
    var TerminologyProperties: js.UndefOr[TerminologyProperties] = js.undefined
  }
  
  
  trait ListTerminologiesRequest extends js.Object {
    /**
         * The maximum number of custom terminologies returned per list request.
         */
    var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
    /**
         * If the result of the request to ListTerminologies was truncated, include the NextToken to fetch the next group of custom terminologies. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListTerminologiesResponse extends js.Object {
    /**
         *  If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom terminologies. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The properties list of the custom terminologies returned on the list request.
         */
    var TerminologyPropertiesList: js.UndefOr[TerminologyPropertiesList] = js.undefined
  }
  
  
  trait Term extends js.Object {
    /**
         * The source text of the term being translated by the custom terminology.
         */
    var SourceText: js.UndefOr[String] = js.undefined
    /**
         * The target text of the term being translated by the custom terminology.
         */
    var TargetText: js.UndefOr[String] = js.undefined
  }
  
  
  trait TerminologyData extends js.Object {
    /**
         * The file containing the custom terminology data.
         */
    var File: TerminologyFile
    /**
         * The data format of the custom terminology. Either CSV or TMX.
         */
    var Format: TerminologyDataFormat
  }
  
  
  trait TerminologyDataLocation extends js.Object {
    /**
         * The location of the custom terminology data.
         */
    var Location: String
    /**
         * The repository type for the custom terminology data.
         */
    var RepositoryType: String
  }
  
  
  trait TerminologyProperties extends js.Object {
    /**
         *  The Amazon Resource Name (ARN) of the custom terminology. 
         */
    var Arn: js.UndefOr[TerminologyArn] = js.undefined
    /**
         * The time at which the custom terminology was created, based on the timestamp.
         */
    var CreatedAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * The description of the custom terminology properties.
         */
    var Description: js.UndefOr[Description] = js.undefined
    /**
         * The encryption key for the custom terminology.
         */
    var EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined
    /**
         * The time at which the custom terminology was last update, based on the timestamp.
         */
    var LastUpdatedAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the custom terminology.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The size of the file used when importing a custom terminology.
         */
    var SizeBytes: js.UndefOr[Integer] = js.undefined
    /**
         * The language code for the source text of the translation request for which the custom terminology is being used.
         */
    var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined
    /**
         * The language codes for the target languages available with the custom terminology file. All possible target languages are returned in array.
         */
    var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.undefined
    /**
         * The number of terms included in the custom terminology.
         */
    var TermCount: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait TranslateTextRequest extends js.Object {
    /**
         * The language code for the language of the source text. The language must be a language supported by Amazon Translate.  To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
         */
    var SourceLanguageCode: LanguageCodeString
    /**
         * The language code requested for the language of the target text. The language must be a language supported by Amazon Translate.
         */
    var TargetLanguageCode: LanguageCodeString
    /**
         * The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length of 0 and a maximum length of 1.
         */
    var TerminologyNames: js.UndefOr[ResourceNameList] = js.undefined
    /**
         * The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character set, this may be fewer than 5,000 characters.
         */
    var Text: BoundedLengthString
  }
  
  
  trait TranslateTextResponse extends js.Object {
    /**
         * The names of the custom terminologies applied to the input text by Amazon Translate for the translated text response.
         */
    var AppliedTerminologies: js.UndefOr[AppliedTerminologyList] = js.undefined
    /**
         * The language code for the language of the source text. 
         */
    var SourceLanguageCode: LanguageCodeString
    /**
         * The language code for the language of the target text. 
         */
    var TargetLanguageCode: LanguageCodeString
    /**
         * The the translated text. The maximum length of this text is 5kb.
         */
    var TranslatedText: String
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * A synchronous action that deletes a custom terminology.
       */
    def deleteTerminology(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A synchronous action that deletes a custom terminology.
       */
    def deleteTerminology(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A synchronous action that deletes a custom terminology.
       */
    def deleteTerminology(params: DeleteTerminologyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A synchronous action that deletes a custom terminology.
       */
    def deleteTerminology(
      params: DeleteTerminologyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a custom terminology.
       */
    def getTerminology(): awsDashSdkLib.libRequestMod.Request[GetTerminologyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a custom terminology.
       */
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
    /**
       * Retrieves a custom terminology.
       */
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
    /**
       * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology name. Importing a terminology with the same name as an existing one will merge the terminologies based on the chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology will overwrite an existing terminology of the same name. If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully propagate and be available for use in a translation due to cache policies with the DataPlane service that performs the translations.
       */
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
    /**
       * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology name. Importing a terminology with the same name as an existing one will merge the terminologies based on the chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology will overwrite an existing terminology of the same name. If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully propagate and be available for use in a translation due to cache policies with the DataPlane service that performs the translations.
       */
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
    /**
       * Provides a list of custom terminologies associated with your account.
       */
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
    /**
       * Provides a list of custom terminologies associated with your account.
       */
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
    /**
       * Translates input text from the source language to the target language. It is not necessary to use English (en) as either the source or the target language but not all language combinations are supported by Amazon Translate. For more information, see Supported Language Pairs.   Arabic (ar)   Chinese (Simplified) (zh)   Chinese (Traditional) (zh-TW)   Czech (cs)   Danish (da)   Dutch (nl)   English (en)   Finnish (fi)   French (fr)   German (de)   Hebrew (he)   Indonesian (id)   Italian (it)   Japanese (ja)   Korean (ko)   Polish (pl)   Portuguese (pt)   Russian (ru)   Spanish (es)   Swedish (sv)   Turkish (tr)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
       */
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
    /**
       * Translates input text from the source language to the target language. It is not necessary to use English (en) as either the source or the target language but not all language combinations are supported by Amazon Translate. For more information, see Supported Language Pairs.   Arabic (ar)   Chinese (Simplified) (zh)   Chinese (Traditional) (zh-TW)   Czech (cs)   Danish (da)   Dutch (nl)   English (en)   Finnish (fi)   French (fr)   German (de)   Hebrew (he)   Indonesian (id)   Italian (it)   Japanese (ja)   Korean (ko)   Polish (pl)   Portuguese (pt)   Russian (ru)   Spanish (es)   Swedish (sv)   Turkish (tr)   To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
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
  type AppliedTerminologyList = js.Array[AppliedTerminology]
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Description = java.lang.String
  type EncryptionKeyID = java.lang.String
  type EncryptionKeyType = awsDashSdkLib.awsDashSdkLibStrings.KMS | java.lang.String
  type Integer = scala.Double
  type LanguageCodeString = java.lang.String
  type LanguageCodeStringList = js.Array[LanguageCodeString]
  type MaxResultsInteger = scala.Double
  type MergeStrategy = awsDashSdkLib.awsDashSdkLibStrings.OVERWRITE | java.lang.String
  type NextToken = java.lang.String
  type ResourceName = java.lang.String
  type ResourceNameList = js.Array[ResourceName]
  type String = java.lang.String
  type TermList = js.Array[Term]
  type TerminologyArn = java.lang.String
  type TerminologyDataFormat = awsDashSdkLib.awsDashSdkLibStrings.CSV | awsDashSdkLib.awsDashSdkLibStrings.TMX | java.lang.String
  type TerminologyFile = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsTranslateMod.Blob | java.lang.String
  type TerminologyPropertiesList = js.Array[TerminologyProperties]
  type Timestamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-07-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

