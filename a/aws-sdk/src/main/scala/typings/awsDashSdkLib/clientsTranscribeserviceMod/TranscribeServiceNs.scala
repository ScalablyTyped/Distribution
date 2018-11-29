package typings
package awsDashSdkLib.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/transcribeservice", "TranscribeService")
@js.native
object TranscribeServiceNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateVocabularyRequest extends js.Object {
    /**
         * The language code of the vocabulary entries.
         */
    var LanguageCode: LanguageCode
    /**
         * An array of strings that contains the vocabulary entries. 
         */
    var Phrases: Phrases
    /**
         * The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive.
         */
    var VocabularyName: VocabularyName
  }
  
  
  trait CreateVocabularyResponse extends js.Object {
    /**
         * If the VocabularyState field is FAILED, this field contains information about why the job failed.
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The language code of the vocabulary entries.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * The date and time that the vocabulary was created.
         */
    var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
    /**
         * The name of the vocabulary.
         */
    var VocabularyName: js.UndefOr[VocabularyName] = js.undefined
    /**
         * The processing state of the vocabulary. When the VocabularyState field contains READY the vocabulary is ready to be used in a StartTranscriptionJob request.
         */
    var VocabularyState: js.UndefOr[VocabularyState] = js.undefined
  }
  
  
  trait DeleteTranscriptionJobRequest extends js.Object {
    /**
         * The name of the transcription job to be deleted.
         */
    var TranscriptionJobName: TranscriptionJobName
  }
  
  
  trait DeleteVocabularyRequest extends js.Object {
    /**
         * The name of the vocabulary to delete. 
         */
    var VocabularyName: VocabularyName
  }
  
  
  trait GetTranscriptionJobRequest extends js.Object {
    /**
         * The name of the job.
         */
    var TranscriptionJobName: TranscriptionJobName
  }
  
  
  trait GetTranscriptionJobResponse extends js.Object {
    /**
         * An object that contains the results of the transcription job.
         */
    var TranscriptionJob: js.UndefOr[TranscriptionJob] = js.undefined
  }
  
  
  trait GetVocabularyRequest extends js.Object {
    /**
         * The name of the vocabulary to return information about. The name is case-sensitive.
         */
    var VocabularyName: VocabularyName
  }
  
  
  trait GetVocabularyResponse extends js.Object {
    /**
         * The S3 location where the vocabulary is stored. Use this URI to get the contents of the vocabulary. The URI is available for a limited time.
         */
    var DownloadUri: js.UndefOr[Uri] = js.undefined
    /**
         * If the VocabularyState field is FAILED, this field contains information about why the job failed.
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The language code of the vocabulary entries.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * The date and time that the vocabulary was last modified.
         */
    var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
    /**
         * The name of the vocabulary to return.
         */
    var VocabularyName: js.UndefOr[VocabularyName] = js.undefined
    /**
         * The processing state of the vocabulary.
         */
    var VocabularyState: js.UndefOr[VocabularyState] = js.undefined
  }
  
  
  trait ListTranscriptionJobsRequest extends js.Object {
    /**
         * When specified, the jobs returned in the list are limited to jobs whose name contains the specified string.
         */
    var JobNameContains: js.UndefOr[TranscriptionJobName] = js.undefined
    /**
         * The maximum number of jobs to return in the response. If there are fewer results in the list, this response contains only the actual results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * If the result of the previous request to ListTranscriptionJobs was truncated, include the NextToken to fetch the next set of jobs.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * When specified, returns only transcription jobs with the specified status.
         */
    var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
  }
  
  
  trait ListTranscriptionJobsResponse extends js.Object {
    /**
         * The ListTranscriptionJobs operation returns a page of jobs at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the ListTranscriptionJobs operation to return in the next page of jobs.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The requested status of the jobs returned.
         */
    var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
    /**
         * A list of objects containing summary information for a transcription job.
         */
    var TranscriptionJobSummaries: js.UndefOr[TranscriptionJobSummaries] = js.undefined
  }
  
  
  trait ListVocabulariesRequest extends js.Object {
    /**
         * The maximum number of vocabularies to return in the response. If there are fewer results in the list, this response contains only the actual results.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * When specified, the vocabularies returned in the list are limited to vocabularies whose name contains the specified string. The search is case-insensitive, ListVocabularies will return both "vocabularyname" and "VocabularyName" in the response list.
         */
    var NameContains: js.UndefOr[VocabularyName] = js.undefined
    /**
         * If the result of the previous request to ListVocabularies was truncated, include the NextToken to fetch the next set of jobs.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * When specified, only returns vocabularies with the VocabularyState field equal to the specified state.
         */
    var StateEquals: js.UndefOr[VocabularyState] = js.undefined
  }
  
  
  trait ListVocabulariesResponse extends js.Object {
    /**
         * The ListVocabularies operation returns a page of vocabularies at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the ListVocabularies operation to return in the next page of jobs.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The requested vocabulary state.
         */
    var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
    /**
         * A list of objects that describe the vocabularies that match the search criteria in the request.
         */
    var Vocabularies: js.UndefOr[Vocabularies] = js.undefined
  }
  
  
  trait Media extends js.Object {
    /**
         * The S3 location of the input media file. The URI must be in the same region as the API endpoint that you are calling. The general form is:   https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt;   For example:  https://s3-us-east-1.amazonaws.com/examplebucket/example.mp4   https://s3-us-east-1.amazonaws.com/examplebucket/mediadocs/example.mp4  For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide.
         */
    var MediaFileUri: js.UndefOr[Uri] = js.undefined
  }
  
  
  trait Settings extends js.Object {
    /**
         * Instructs Amazon Transcribe to process each audio channel separately and then merge the transcription output of each channel into a single transcription.  Amazon Transcribe also produces a transcription of each item detected on an audio channel, including the start time and end time of the item and alternative transcriptions of the item including the confidence that Amazon Transcribe has in the transcription. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException.
         */
    var ChannelIdentification: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this number, multiple speakers will be identified as a single speaker. If you specify the MaxSpeakerLabels field, you must set the ShowSpeakerLabels field to true.
         */
    var MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.undefined
    /**
         * Determines whether the transcription job uses speaker recognition to identify different speakers in the input audio. Speaker recognition labels individual speakers in the audio file. If you set the ShowSpeakerLabels field to true, you must also set the maximum number of speaker labels MaxSpeakerLabels field. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException.
         */
    var ShowSpeakerLabels: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The name of a vocabulary to use when processing the transcription job.
         */
    var VocabularyName: js.UndefOr[VocabularyName] = js.undefined
  }
  
  
  trait StartTranscriptionJobRequest extends js.Object {
    /**
         * The language code for the language used in the input media file.
         */
    var LanguageCode: LanguageCode
    /**
         * An object that describes the input media for a transcription job.
         */
    var Media: Media
    /**
         * The format of the input media file.
         */
    var MediaFormat: MediaFormat
    /**
         * The sample rate, in Hertz, of the audio track in the input media file. 
         */
    var MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined
    /**
         * The location where the transcription is stored. If you set the OutputBucketName, Amazon Transcribe puts the transcription in the specified S3 bucket. When you call the GetTranscriptionJob operation, the operation returns this location in the TranscriptFileUri field. The S3 bucket must have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see Permissions Required for IAM User Roles. If you don't set the OutputBucketName, Amazon Transcribe generates a pre-signed URL, a shareable URL that provides secure access to your transcription, and returns it in the TranscriptFileUri field. Use this URL to download the transcription.
         */
    var OutputBucketName: js.UndefOr[OutputBucketName] = js.undefined
    /**
         * A Settings object that provides optional settings for a transcription job.
         */
    var Settings: js.UndefOr[Settings] = js.undefined
    /**
         * The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The name must also be unique within an AWS account.
         */
    var TranscriptionJobName: TranscriptionJobName
  }
  
  
  trait StartTranscriptionJobResponse extends js.Object {
    /**
         * An object containing details of the asynchronous transcription job.
         */
    var TranscriptionJob: js.UndefOr[TranscriptionJob] = js.undefined
  }
  
  
  trait Transcript extends js.Object {
    /**
         * The location where the transcription is stored. Use this URI to access the transcription. If you specified an S3 bucket in the OutputBucketName field when you created the job, this is the URI of that bucket. If you chose to store the transcription in Amazon Transcribe, this is a shareable URL that provides secure access to that location.
         */
    var TranscriptFileUri: js.UndefOr[Uri] = js.undefined
  }
  
  
  trait TranscriptionJob extends js.Object {
    /**
         * A timestamp that shows when the job was completed.
         */
    var CompletionTime: js.UndefOr[DateTime] = js.undefined
    /**
         * A timestamp that shows when the job was created.
         */
    var CreationTime: js.UndefOr[DateTime] = js.undefined
    /**
         * If the TranscriptionJobStatus field is FAILED, this field contains information about why the job failed.
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The language code for the input speech.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * An object that describes the input media for the transcription job.
         */
    var Media: js.UndefOr[Media] = js.undefined
    /**
         * The format of the input media file.
         */
    var MediaFormat: js.UndefOr[MediaFormat] = js.undefined
    /**
         * The sample rate, in Hertz, of the audio track in the input media file. 
         */
    var MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined
    /**
         * Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the maximum number of speakers that should be identified and to specify a custom vocabulary to use when processing the transcription job.
         */
    var Settings: js.UndefOr[Settings] = js.undefined
    /**
         * An object that describes the output of the transcription job.
         */
    var Transcript: js.UndefOr[Transcript] = js.undefined
    /**
         * The name of the transcription job.
         */
    var TranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined
    /**
         * The status of the transcription job.
         */
    var TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus] = js.undefined
  }
  
  
  trait TranscriptionJobSummary extends js.Object {
    /**
         * A timestamp that shows when the job was completed.
         */
    var CompletionTime: js.UndefOr[DateTime] = js.undefined
    /**
         * A timestamp that shows when the job was created.
         */
    var CreationTime: js.UndefOr[DateTime] = js.undefined
    /**
         * If the TranscriptionJobStatus field is FAILED, a description of the error.
         */
    var FailureReason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The language code for the input speech.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * Indicates the location of the output of the transcription job. If the value is CUSTOMER_BUCKET then the location is the S3 bucket specified in the outputBucketName field when the transcription job was started with the StartTranscriptionJob operation. If the value is SERVICE_BUCKET then the output is stored by Amazon Transcribe and can be retrieved using the URI in the GetTranscriptionJob response's TranscriptFileUri field.
         */
    var OutputLocationType: js.UndefOr[OutputLocationType] = js.undefined
    /**
         * The name of the transcription job.
         */
    var TranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined
    /**
         * The status of the transcription job. When the status is COMPLETED, use the GetTranscriptionJob operation to get the results of the transcription.
         */
    var TranscriptionJobStatus: js.UndefOr[TranscriptionJobStatus] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message. 
       */
    def createVocabulary(): awsDashSdkLib.libRequestMod.Request[CreateVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message. 
       */
    def createVocabulary(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVocabularyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message. 
       */
    def createVocabulary(params: CreateVocabularyRequest): awsDashSdkLib.libRequestMod.Request[CreateVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message. 
       */
    def createVocabulary(
      params: CreateVocabularyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVocabularyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
       */
    def deleteTranscriptionJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
       */
    def deleteTranscriptionJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
       */
    def deleteTranscriptionJob(params: DeleteTranscriptionJobRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
       */
    def deleteTranscriptionJob(
      params: DeleteTranscriptionJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a vocabulary from Amazon Transcribe. 
       */
    def deleteVocabulary(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a vocabulary from Amazon Transcribe. 
       */
    def deleteVocabulary(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a vocabulary from Amazon Transcribe. 
       */
    def deleteVocabulary(params: DeleteVocabularyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a vocabulary from Amazon Transcribe. 
       */
    def deleteVocabulary(
      params: DeleteVocabularyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptionFileUri field.
       */
    def getTranscriptionJob(): awsDashSdkLib.libRequestMod.Request[GetTranscriptionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptionFileUri field.
       */
    def getTranscriptionJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTranscriptionJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTranscriptionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptionFileUri field.
       */
    def getTranscriptionJob(params: GetTranscriptionJobRequest): awsDashSdkLib.libRequestMod.Request[GetTranscriptionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptionFileUri field.
       */
    def getTranscriptionJob(
      params: GetTranscriptionJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTranscriptionJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTranscriptionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a vocabulary. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message.
       */
    def getVocabulary(): awsDashSdkLib.libRequestMod.Request[GetVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a vocabulary. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message.
       */
    def getVocabulary(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVocabularyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a vocabulary. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message.
       */
    def getVocabulary(params: GetVocabularyRequest): awsDashSdkLib.libRequestMod.Request[GetVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about a vocabulary. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message.
       */
    def getVocabulary(
      params: GetVocabularyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVocabularyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists transcription jobs with the specified status.
       */
    def listTranscriptionJobs(): awsDashSdkLib.libRequestMod.Request[ListTranscriptionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists transcription jobs with the specified status.
       */
    def listTranscriptionJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTranscriptionJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTranscriptionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists transcription jobs with the specified status.
       */
    def listTranscriptionJobs(params: ListTranscriptionJobsRequest): awsDashSdkLib.libRequestMod.Request[ListTranscriptionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists transcription jobs with the specified status.
       */
    def listTranscriptionJobs(
      params: ListTranscriptionJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTranscriptionJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTranscriptionJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
       */
    def listVocabularies(): awsDashSdkLib.libRequestMod.Request[ListVocabulariesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
       */
    def listVocabularies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVocabulariesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVocabulariesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
       */
    def listVocabularies(params: ListVocabulariesRequest): awsDashSdkLib.libRequestMod.Request[ListVocabulariesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
       */
    def listVocabularies(
      params: ListVocabulariesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVocabulariesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVocabulariesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an asynchronous job to transcribe speech to text. Note that en-AU, en-UK, and fr-CA languages are in preview and are only available to whitelisted customers. 
       */
    def startTranscriptionJob(): awsDashSdkLib.libRequestMod.Request[StartTranscriptionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an asynchronous job to transcribe speech to text. Note that en-AU, en-UK, and fr-CA languages are in preview and are only available to whitelisted customers. 
       */
    def startTranscriptionJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartTranscriptionJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartTranscriptionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an asynchronous job to transcribe speech to text. Note that en-AU, en-UK, and fr-CA languages are in preview and are only available to whitelisted customers. 
       */
    def startTranscriptionJob(params: StartTranscriptionJobRequest): awsDashSdkLib.libRequestMod.Request[StartTranscriptionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an asynchronous job to transcribe speech to text. Note that en-AU, en-UK, and fr-CA languages are in preview and are only available to whitelisted customers. 
       */
    def startTranscriptionJob(
      params: StartTranscriptionJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartTranscriptionJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartTranscriptionJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message.
       */
    def updateVocabulary(): awsDashSdkLib.libRequestMod.Request[UpdateVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message.
       */
    def updateVocabulary(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVocabularyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message.
       */
    def updateVocabulary(params: UpdateVocabularyRequest): awsDashSdkLib.libRequestMod.Request[UpdateVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. Note that vocabularies for en-AU, en-UK, and fr-CA languages that are in preview are not available. In the console, the vocabulary section will be greyed-out and SDK will return error message.
       */
    def updateVocabulary(
      params: UpdateVocabularyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVocabularyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVocabularyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateVocabularyRequest extends js.Object {
    /**
         * The language code of the vocabulary entries.
         */
    var LanguageCode: LanguageCode
    /**
         * An array of strings containing the vocabulary entries.
         */
    var Phrases: Phrases
    /**
         * The name of the vocabulary to update. The name is case-sensitive.
         */
    var VocabularyName: VocabularyName
  }
  
  
  trait UpdateVocabularyResponse extends js.Object {
    /**
         * The language code of the vocabulary entries.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * The date and time that the vocabulary was updated.
         */
    var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
    /**
         * The name of the vocabulary that was updated.
         */
    var VocabularyName: js.UndefOr[VocabularyName] = js.undefined
    /**
         * The processing state of the vocabulary. When the VocabularyState field contains READY the vocabulary is ready to be used in a StartTranscriptionJob request.
         */
    var VocabularyState: js.UndefOr[VocabularyState] = js.undefined
  }
  
  
  trait VocabularyInfo extends js.Object {
    /**
         * The language code of the vocabulary entries.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * The date and time that the vocabulary was last modified.
         */
    var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
    /**
         * The name of the vocabulary.
         */
    var VocabularyName: js.UndefOr[VocabularyName] = js.undefined
    /**
         * The processing state of the vocabulary. If the state is READY you can use the vocabulary in a StartTranscriptionJob request.
         */
    var VocabularyState: js.UndefOr[VocabularyState] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DateTime = stdLib.Date
  type FailureReason = java.lang.String
  type LanguageCode = awsDashSdkLib.awsDashSdkLibStrings.`en-US` | awsDashSdkLib.awsDashSdkLibStrings.`es-US` | awsDashSdkLib.awsDashSdkLibStrings.`en-AU` | awsDashSdkLib.awsDashSdkLibStrings.`fr-CA` | awsDashSdkLib.awsDashSdkLibStrings.`en-GB` | awsDashSdkLib.awsDashSdkLibStrings.`de-DE` | awsDashSdkLib.awsDashSdkLibStrings.`pt-BR` | awsDashSdkLib.awsDashSdkLibStrings.`fr-FR` | java.lang.String
  type MaxResults = scala.Double
  type MaxSpeakers = scala.Double
  type MediaFormat = awsDashSdkLib.awsDashSdkLibStrings.mp3 | awsDashSdkLib.awsDashSdkLibStrings.mp4 | awsDashSdkLib.awsDashSdkLibStrings.wav | awsDashSdkLib.awsDashSdkLibStrings.flac | java.lang.String
  type MediaSampleRateHertz = scala.Double
  type NextToken = java.lang.String
  type OutputBucketName = java.lang.String
  type OutputLocationType = awsDashSdkLib.awsDashSdkLibStrings.CUSTOMER_BUCKET | awsDashSdkLib.awsDashSdkLibStrings.SERVICE_BUCKET | java.lang.String
  type Phrase = java.lang.String
  type Phrases = js.Array[Phrase]
  type TranscriptionJobName = java.lang.String
  type TranscriptionJobStatus = awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | java.lang.String
  type TranscriptionJobSummaries = js.Array[TranscriptionJobSummary]
  type Uri = java.lang.String
  type Vocabularies = js.Array[VocabularyInfo]
  type VocabularyName = java.lang.String
  type VocabularyState = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.READY | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-10-26` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

