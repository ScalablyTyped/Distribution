package typings
package awsDashSdkLib.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/polly", "Polly")
@js.native
object PollyNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DeleteLexiconInput extends js.Object {
    /**
         * The name of the lexicon to delete. Must be an existing lexicon in the region.
         */
    var Name: LexiconName
  }
  
  
  trait DeleteLexiconOutput extends js.Object
  
  
  trait DescribeVoicesInput extends js.Object {
    /**
         * Boolean value indicating whether to return any bilingual voices that use the specified language as an additional language. For instance, if you request all languages that use US English (es-US), and there is an Italian voice that speaks both Italian (it-IT) and US English, that voice will be included if you specify yes but not if you specify no.
         */
    var IncludeAdditionalLanguageCodes: js.UndefOr[IncludeAdditionalLanguageCodes] = js.undefined
    /**
         *  The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list of voices returned. If you don't specify this optional parameter, all available voices are returned. 
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * An opaque pagination token returned from the previous DescribeVoices operation. If present, this indicates where to continue the listing.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait DescribeVoicesOutput extends js.Object {
    /**
         * The pagination token to use in the next request to continue the listing of voices. NextToken is returned only if the response is truncated.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of voices with their properties.
         */
    var Voices: js.UndefOr[VoiceList] = js.undefined
  }
  
  
  trait GetLexiconInput extends js.Object {
    /**
         * Name of the lexicon.
         */
    var Name: LexiconName
  }
  
  
  trait GetLexiconOutput extends js.Object {
    /**
         * Lexicon object that provides name and the string content of the lexicon. 
         */
    var Lexicon: js.UndefOr[Lexicon] = js.undefined
    /**
         * Metadata of the lexicon, including phonetic alphabetic used, language code, lexicon ARN, number of lexemes defined in the lexicon, and size of lexicon in bytes.
         */
    var LexiconAttributes: js.UndefOr[LexiconAttributes] = js.undefined
  }
  
  
  trait GetSpeechSynthesisTaskInput extends js.Object {
    /**
         * The Amazon Polly generated identifier for a speech synthesis task.
         */
    var TaskId: TaskId
  }
  
  
  trait GetSpeechSynthesisTaskOutput extends js.Object {
    /**
         * SynthesisTask object that provides information from the requested task, including output format, creation time, task status, and so on.
         */
    var SynthesisTask: js.UndefOr[SynthesisTask] = js.undefined
  }
  
  
  trait Lexicon extends js.Object {
    /**
         * Lexicon content in string format. The content of a lexicon must be in PLS format.
         */
    var Content: js.UndefOr[LexiconContent] = js.undefined
    /**
         * Name of the lexicon.
         */
    var Name: js.UndefOr[LexiconName] = js.undefined
  }
  
  
  trait LexiconAttributes extends js.Object {
    /**
         * Phonetic alphabet used in the lexicon. Valid values are ipa and x-sampa.
         */
    var Alphabet: js.UndefOr[Alphabet] = js.undefined
    /**
         * Language code that the lexicon applies to. A lexicon with a language code such as "en" would be applied to all English languages (en-GB, en-US, en-AUS, en-WLS, and so on.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * Date lexicon was last modified (a timestamp value).
         */
    var LastModified: js.UndefOr[LastModified] = js.undefined
    /**
         * Number of lexemes in the lexicon.
         */
    var LexemesCount: js.UndefOr[LexemesCount] = js.undefined
    /**
         * Amazon Resource Name (ARN) of the lexicon.
         */
    var LexiconArn: js.UndefOr[LexiconArn] = js.undefined
    /**
         * Total size of the lexicon, in characters.
         */
    var Size: js.UndefOr[Size] = js.undefined
  }
  
  
  trait LexiconDescription extends js.Object {
    /**
         * Provides lexicon metadata.
         */
    var Attributes: js.UndefOr[LexiconAttributes] = js.undefined
    /**
         * Name of the lexicon.
         */
    var Name: js.UndefOr[LexiconName] = js.undefined
  }
  
  
  trait ListLexiconsInput extends js.Object {
    /**
         * An opaque pagination token returned from previous ListLexicons operation. If present, indicates where to continue the list of lexicons.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListLexiconsOutput extends js.Object {
    /**
         * A list of lexicon names and attributes.
         */
    var Lexicons: js.UndefOr[LexiconDescriptionList] = js.undefined
    /**
         * The pagination token to use in the next request to continue the listing of lexicons. NextToken is returned only if the response is truncated.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListSpeechSynthesisTasksInput extends js.Object {
    /**
         * Maximum number of speech synthesis tasks returned in a List operation.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The pagination token to use in the next request to continue the listing of speech synthesis tasks. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Status of the speech synthesis tasks returned in a List operation
         */
    var Status: js.UndefOr[TaskStatus] = js.undefined
  }
  
  
  trait ListSpeechSynthesisTasksOutput extends js.Object {
    /**
         * An opaque pagination token returned from the previous List operation in this request. If present, this indicates where to continue the listing.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * List of SynthesisTask objects that provides information from the specified task in the list request, including output format, creation time, task status, and so on.
         */
    var SynthesisTasks: js.UndefOr[SynthesisTasks] = js.undefined
  }
  
  @js.native
  class Presigner () extends js.Object {
    /**
       * Creates a presigner object with a set of configuration options.
       */
    def this(options: awsDashSdkLib.libPollyPresignerMod.PresignerNs.PresignerOptions) = this()
    /**
       * Generate a signed URL.
       */
    def getSynthesizeSpeechUrl(params: SynthesizeSpeechInput): java.lang.String = js.native
    /**
       * Generate a signed URL.
       */
    def getSynthesizeSpeechUrl(
      params: SynthesizeSpeechInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* url */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
    /**
       * Generate a signed URL.
       */
    def getSynthesizeSpeechUrl(
      params: SynthesizeSpeechInput,
      error: scala.Double,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* url */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
    /**
       * Generate a signed URL.
       */
    def getSynthesizeSpeechUrl(params: SynthesizeSpeechInput, expires: scala.Double): java.lang.String = js.native
  }
  
  
  trait PutLexiconInput extends js.Object {
    /**
         * Content of the PLS lexicon as string data.
         */
    var Content: LexiconContent
    /**
         * Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name is a case-sensitive alphanumeric string up to 20 characters long. 
         */
    var Name: LexiconName
  }
  
  
  trait PutLexiconOutput extends js.Object
  
  
  trait StartSpeechSynthesisTaskInput extends js.Object {
    /**
         * Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. 
         */
    var LexiconNames: js.UndefOr[LexiconNameList] = js.undefined
    /**
         * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json. 
         */
    var OutputFormat: OutputFormat
    /**
         * Amazon S3 bucket name to which the output file will be saved.
         */
    var OutputS3BucketName: OutputS3BucketName
    /**
         * The Amazon S3 key prefix for the output speech file.
         */
    var OutputS3KeyPrefix: js.UndefOr[OutputS3KeyPrefix] = js.undefined
    /**
         * The audio frequency specified in Hz. The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050". Valid values for pcm are "8000" and "16000" The default value is "16000". 
         */
    var SampleRate: js.UndefOr[SampleRate] = js.undefined
    /**
         * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
         */
    var SnsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined
    /**
         * The type of speech marks returned for the input text.
         */
    var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined
    /**
         * The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text. 
         */
    var Text: Text
    /**
         * Specifies whether the input text is plain text or SSML. The default value is plain text. 
         */
    var TextType: js.UndefOr[TextType] = js.undefined
    /**
         * Voice ID to use for the synthesis. 
         */
    var VoiceId: VoiceId
  }
  
  
  trait StartSpeechSynthesisTaskOutput extends js.Object {
    /**
         * SynthesisTask object that provides information and attributes about a newly submitted speech synthesis task.
         */
    var SynthesisTask: js.UndefOr[SynthesisTask] = js.undefined
  }
  
  
  trait SynthesisTask extends js.Object {
    /**
         * Timestamp for the time the synthesis task was started.
         */
    var CreationTime: js.UndefOr[DateTime] = js.undefined
    /**
         * Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. 
         */
    var LexiconNames: js.UndefOr[LexiconNameList] = js.undefined
    /**
         * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json. 
         */
    var OutputFormat: js.UndefOr[OutputFormat] = js.undefined
    /**
         * Pathway for the output speech file.
         */
    var OutputUri: js.UndefOr[OutputUri] = js.undefined
    /**
         * Number of billable characters synthesized.
         */
    var RequestCharacters: js.UndefOr[RequestCharacters] = js.undefined
    /**
         * The audio frequency specified in Hz. The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050". Valid values for pcm are "8000" and "16000" The default value is "16000". 
         */
    var SampleRate: js.UndefOr[SampleRate] = js.undefined
    /**
         * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
         */
    var SnsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined
    /**
         * The type of speech marks returned for the input text.
         */
    var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined
    /**
         * The Amazon Polly generated identifier for a speech synthesis task.
         */
    var TaskId: js.UndefOr[TaskId] = js.undefined
    /**
         * Current status of the individual speech synthesis task.
         */
    var TaskStatus: js.UndefOr[TaskStatus] = js.undefined
    /**
         * Reason for the current status of a specific speech synthesis task, including errors if the task has failed.
         */
    var TaskStatusReason: js.UndefOr[TaskStatusReason] = js.undefined
    /**
         * Specifies whether the input text is plain text or SSML. The default value is plain text. 
         */
    var TextType: js.UndefOr[TextType] = js.undefined
    /**
         * Voice ID to use for the synthesis. 
         */
    var VoiceId: js.UndefOr[VoiceId] = js.undefined
  }
  
  
  trait SynthesizeSpeechInput extends js.Object {
    /**
         * Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. For information about storing lexicons, see PutLexicon.
         */
    var LexiconNames: js.UndefOr[LexiconNameList] = js.undefined
    /**
         *  The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json.  When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format. 
         */
    var OutputFormat: OutputFormat
    /**
         *  The audio frequency specified in Hz.  The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050".   Valid values for pcm are "8000" and "16000" The default value is "16000". 
         */
    var SampleRate: js.UndefOr[SampleRate] = js.undefined
    /**
         * The type of speech marks returned for the input text.
         */
    var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined
    /**
         *  Input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text. 
         */
    var Text: Text
    /**
         *  Specifies whether the input text is plain text or SSML. The default value is plain text. For more information, see Using SSML.
         */
    var TextType: js.UndefOr[TextType] = js.undefined
    /**
         *  Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the DescribeVoices operation. 
         */
    var VoiceId: VoiceId
  }
  
  
  trait SynthesizeSpeechOutput extends js.Object {
    /**
         *  Stream containing the synthesized speech. 
         */
    var AudioStream: js.UndefOr[AudioStream] = js.undefined
    /**
         *  Specifies the type audio stream. This should reflect the OutputFormat parameter in your request.     If you request mp3 as the OutputFormat, the ContentType returned is audio/mpeg.     If you request ogg_vorbis as the OutputFormat, the ContentType returned is audio/ogg.     If you request pcm as the OutputFormat, the ContentType returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.    If you request json as the OutputFormat, the ContentType returned is audio/json.    
         */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
         * Number of characters synthesized.
         */
    var RequestCharacters: js.UndefOr[RequestCharacters] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServicesPollyMod.PollyCustomizations {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or ListLexicon APIs. For more information, see Managing Lexicons.
       */
    def deleteLexicon(): awsDashSdkLib.libRequestMod.Request[DeleteLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or ListLexicon APIs. For more information, see Managing Lexicons.
       */
    def deleteLexicon(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLexiconOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or ListLexicon APIs. For more information, see Managing Lexicons.
       */
    def deleteLexicon(params: DeleteLexiconInput): awsDashSdkLib.libRequestMod.Request[DeleteLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not available for speech synthesis, nor is it possible to retrieve it using either the GetLexicon or ListLexicon APIs. For more information, see Managing Lexicons.
       */
    def deleteLexicon(
      params: DeleteLexiconInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLexiconOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice name.  When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the voice you want from the list of voices returned by DescribeVoices. For example, you want your news reader application to read news in a specific language, but giving a user the option to choose the voice. Using the DescribeVoices operation you can provide the user with a list of available voices to select from.  You can optionally specify a language code to filter the available voices. For example, if you specify en-US, the operation returns a list of all available US English voices.  This operation requires permissions to perform the polly:DescribeVoices action.
       */
    def describeVoices(): awsDashSdkLib.libRequestMod.Request[DescribeVoicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice name.  When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the voice you want from the list of voices returned by DescribeVoices. For example, you want your news reader application to read news in a specific language, but giving a user the option to choose the voice. Using the DescribeVoices operation you can provide the user with a list of available voices to select from.  You can optionally specify a language code to filter the available voices. For example, if you specify en-US, the operation returns a list of all available US English voices.  This operation requires permissions to perform the polly:DescribeVoices action.
       */
    def describeVoices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVoicesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVoicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice name.  When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the voice you want from the list of voices returned by DescribeVoices. For example, you want your news reader application to read news in a specific language, but giving a user the option to choose the voice. Using the DescribeVoices operation you can provide the user with a list of available voices to select from.  You can optionally specify a language code to filter the available voices. For example, if you specify en-US, the operation returns a list of all available US English voices.  This operation requires permissions to perform the polly:DescribeVoices action.
       */
    def describeVoices(params: DescribeVoicesInput): awsDashSdkLib.libRequestMod.Request[DescribeVoicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice name.  When synthesizing speech ( SynthesizeSpeech ), you provide the voice ID for the voice you want from the list of voices returned by DescribeVoices. For example, you want your news reader application to read news in a specific language, but giving a user the option to choose the voice. Using the DescribeVoices operation you can provide the user with a list of available voices to select from.  You can optionally specify a language code to filter the available voices. For example, if you specify en-US, the operation returns a list of all available US English voices.  This operation requires permissions to perform the polly:DescribeVoices action.
       */
    def describeVoices(
      params: DescribeVoicesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVoicesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVoicesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.
       */
    def getLexicon(): awsDashSdkLib.libRequestMod.Request[GetLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.
       */
    def getLexicon(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLexiconOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.
       */
    def getLexicon(params: GetLexiconInput): awsDashSdkLib.libRequestMod.Request[GetLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see Managing Lexicons.
       */
    def getLexicon(
      params: GetLexiconInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLexiconOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output of the task.
       */
    def getSpeechSynthesisTask(): awsDashSdkLib.libRequestMod.Request[GetSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output of the task.
       */
    def getSpeechSynthesisTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSpeechSynthesisTaskOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output of the task.
       */
    def getSpeechSynthesisTask(params: GetSpeechSynthesisTaskInput): awsDashSdkLib.libRequestMod.Request[GetSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output of the task.
       */
    def getSpeechSynthesisTask(
      params: GetSpeechSynthesisTaskInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSpeechSynthesisTaskOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.
       */
    def listLexicons(): awsDashSdkLib.libRequestMod.Request[ListLexiconsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.
       */
    def listLexicons(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLexiconsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLexiconsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.
       */
    def listLexicons(params: ListLexiconsInput): awsDashSdkLib.libRequestMod.Request[ListLexiconsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see Managing Lexicons.
       */
    def listLexicons(
      params: ListLexiconsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLexiconsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLexiconsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks by their status, for example, allowing users to list only tasks that are completed.
       */
    def listSpeechSynthesisTasks(): awsDashSdkLib.libRequestMod.Request[ListSpeechSynthesisTasksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks by their status, for example, allowing users to list only tasks that are completed.
       */
    def listSpeechSynthesisTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSpeechSynthesisTasksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSpeechSynthesisTasksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks by their status, for example, allowing users to list only tasks that are completed.
       */
    def listSpeechSynthesisTasks(params: ListSpeechSynthesisTasksInput): awsDashSdkLib.libRequestMod.Request[ListSpeechSynthesisTasksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks by their status, for example, allowing users to list only tasks that are completed.
       */
    def listSpeechSynthesisTasks(
      params: ListSpeechSynthesisTasksInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSpeechSynthesisTasksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSpeechSynthesisTasksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some time before the lexicon is available to the SynthesizeSpeech operation. For more information, see Managing Lexicons.
       */
    def putLexicon(): awsDashSdkLib.libRequestMod.Request[PutLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some time before the lexicon is available to the SynthesizeSpeech operation. For more information, see Managing Lexicons.
       */
    def putLexicon(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLexiconOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some time before the lexicon is available to the SynthesizeSpeech operation. For more information, see Managing Lexicons.
       */
    def putLexicon(params: PutLexiconInput): awsDashSdkLib.libRequestMod.Request[PutLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some time before the lexicon is available to the SynthesizeSpeech operation. For more information, see Managing Lexicons.
       */
    def putLexicon(
      params: PutLexiconInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLexiconOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLexiconOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which will include an identifier of this task as well as the current status.
       */
    def startSpeechSynthesisTask(): awsDashSdkLib.libRequestMod.Request[StartSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which will include an identifier of this task as well as the current status.
       */
    def startSpeechSynthesisTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartSpeechSynthesisTaskOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which will include an identifier of this task as well as the current status.
       */
    def startSpeechSynthesisTask(params: StartSpeechSynthesisTaskInput): awsDashSdkLib.libRequestMod.Request[StartSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows the creation of an asynchronous synthesis task, by starting a new SpeechSynthesisTask. This operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which will include an identifier of this task as well as the current status.
       */
    def startSpeechSynthesisTask(
      params: StartSpeechSynthesisTaskInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartSpeechSynthesisTaskOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartSpeechSynthesisTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML. Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by English voices) unless phoneme mapping is used. For more information, see How it Works.
       */
    def synthesizeSpeech(): awsDashSdkLib.libRequestMod.Request[SynthesizeSpeechOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML. Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by English voices) unless phoneme mapping is used. For more information, see How it Works.
       */
    def synthesizeSpeech(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SynthesizeSpeechOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SynthesizeSpeechOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML. Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by English voices) unless phoneme mapping is used. For more information, see How it Works.
       */
    def synthesizeSpeech(params: SynthesizeSpeechInput): awsDashSdkLib.libRequestMod.Request[SynthesizeSpeechOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML. Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by English voices) unless phoneme mapping is used. For more information, see How it Works.
       */
    def synthesizeSpeech(
      params: SynthesizeSpeechInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SynthesizeSpeechOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SynthesizeSpeechOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait Voice extends js.Object {
    /**
         * Additional codes for languages available for the specified voice in addition to its default language.  For example, the default language for Aditi is Indian English (en-IN) because it was first used for that language. Since Aditi is bilingual and fluent in both Indian English and Hindi, this parameter would show the code hi-IN.
         */
    var AdditionalLanguageCodes: js.UndefOr[LanguageCodeList] = js.undefined
    /**
         * Gender of the voice.
         */
    var Gender: js.UndefOr[Gender] = js.undefined
    /**
         * Amazon Polly assigned voice ID. This is the ID that you specify when calling the SynthesizeSpeech operation.
         */
    var Id: js.UndefOr[VoiceId] = js.undefined
    /**
         * Language code of the voice.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * Human readable name of the language in English.
         */
    var LanguageName: js.UndefOr[LanguageName] = js.undefined
    /**
         * Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you might display in your application.
         */
    var Name: js.UndefOr[VoiceName] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  @JSName("Presigner")
  @js.native
  object PresignerNs extends js.Object {
    
    trait PresignerOptions extends js.Object {
      /**
           * An optional map of parameters to bind to every request sent by this service object. 
           */
      var params: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
      /**
           * An optional pre-configured instance of the AWS.Polly service object to use for requests. The object may bound parameters used by the presigner.
           */
      var service: js.UndefOr[awsDashSdkLib.clientsPollyMod.namespaced] = js.undefined
    }
    
  }
  
  type Alphabet = java.lang.String
  type AudioStream = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsPollyMod.Blob | java.lang.String | nodeLib.streamMod.Readable
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContentType = java.lang.String
  type DateTime = stdLib.Date
  type Gender = awsDashSdkLib.awsDashSdkLibStrings.Female | awsDashSdkLib.awsDashSdkLibStrings.Male | java.lang.String
  type IncludeAdditionalLanguageCodes = scala.Boolean
  type LanguageCode = awsDashSdkLib.awsDashSdkLibStrings.`cmn-CN` | awsDashSdkLib.awsDashSdkLibStrings.`cy-GB` | awsDashSdkLib.awsDashSdkLibStrings.`da-DK` | awsDashSdkLib.awsDashSdkLibStrings.`de-DE` | awsDashSdkLib.awsDashSdkLibStrings.`en-AU` | awsDashSdkLib.awsDashSdkLibStrings.`en-GB` | awsDashSdkLib.awsDashSdkLibStrings.`en-GB-WLS` | awsDashSdkLib.awsDashSdkLibStrings.`en-IN` | awsDashSdkLib.awsDashSdkLibStrings.`en-US` | awsDashSdkLib.awsDashSdkLibStrings.`es-ES` | awsDashSdkLib.awsDashSdkLibStrings.`es-US` | awsDashSdkLib.awsDashSdkLibStrings.`fr-CA` | awsDashSdkLib.awsDashSdkLibStrings.`fr-FR` | awsDashSdkLib.awsDashSdkLibStrings.`is-IS` | awsDashSdkLib.awsDashSdkLibStrings.`it-IT` | awsDashSdkLib.awsDashSdkLibStrings.`ja-JP` | awsDashSdkLib.awsDashSdkLibStrings.`hi-IN` | awsDashSdkLib.awsDashSdkLibStrings.`ko-KR` | awsDashSdkLib.awsDashSdkLibStrings.`nb-NO` | awsDashSdkLib.awsDashSdkLibStrings.`nl-NL` | awsDashSdkLib.awsDashSdkLibStrings.`pl-PL` | awsDashSdkLib.awsDashSdkLibStrings.`pt-BR` | awsDashSdkLib.awsDashSdkLibStrings.`pt-PT` | awsDashSdkLib.awsDashSdkLibStrings.`ro-RO` | awsDashSdkLib.awsDashSdkLibStrings.`ru-RU` | awsDashSdkLib.awsDashSdkLibStrings.`sv-SE` | awsDashSdkLib.awsDashSdkLibStrings.`tr-TR` | java.lang.String
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
  type OutputFormat = awsDashSdkLib.awsDashSdkLibStrings.json | awsDashSdkLib.awsDashSdkLibStrings.mp3 | awsDashSdkLib.awsDashSdkLibStrings.ogg_vorbis | awsDashSdkLib.awsDashSdkLibStrings.pcm | java.lang.String
  type OutputS3BucketName = java.lang.String
  type OutputS3KeyPrefix = java.lang.String
  type OutputUri = java.lang.String
  type RequestCharacters = scala.Double
  type SampleRate = java.lang.String
  type Size = scala.Double
  type SnsTopicArn = java.lang.String
  type SpeechMarkType = awsDashSdkLib.awsDashSdkLibStrings.sentence | awsDashSdkLib.awsDashSdkLibStrings.ssml | awsDashSdkLib.awsDashSdkLibStrings.viseme | awsDashSdkLib.awsDashSdkLibStrings.word | java.lang.String
  type SpeechMarkTypeList = js.Array[SpeechMarkType]
  type SynthesisTasks = js.Array[SynthesisTask]
  type TaskId = java.lang.String
  type TaskStatus = awsDashSdkLib.awsDashSdkLibStrings.scheduled | awsDashSdkLib.awsDashSdkLibStrings.inProgress | awsDashSdkLib.awsDashSdkLibStrings.completed | awsDashSdkLib.awsDashSdkLibStrings.failed | java.lang.String
  type TaskStatusReason = java.lang.String
  type Text = java.lang.String
  type TextType = awsDashSdkLib.awsDashSdkLibStrings.ssml | awsDashSdkLib.awsDashSdkLibStrings.text | java.lang.String
  type VoiceId = /* LimitUnionLength: was union type with length 55 */js.Any
  type VoiceList = js.Array[Voice]
  type VoiceName = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-06-10` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

