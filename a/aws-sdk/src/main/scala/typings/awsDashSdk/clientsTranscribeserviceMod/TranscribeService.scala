package typings.awsDashSdk.clientsTranscribeserviceMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranscribeService extends Service {
  @JSName("config")
  var config_TranscribeService: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. 
    */
  def createVocabulary(): Request[CreateVocabularyResponse, AWSError] = js.native
  def createVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyResponse, Unit]): Request[CreateVocabularyResponse, AWSError] = js.native
  /**
    * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. 
    */
  def createVocabulary(params: CreateVocabularyRequest): Request[CreateVocabularyResponse, AWSError] = js.native
  def createVocabulary(
    params: CreateVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyResponse, Unit]
  ): Request[CreateVocabularyResponse, AWSError] = js.native
  /**
    * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
    */
  def deleteTranscriptionJob(): Request[js.Object, AWSError] = js.native
  def deleteTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
    */
  def deleteTranscriptionJob(params: DeleteTranscriptionJobRequest): Request[js.Object, AWSError] = js.native
  def deleteTranscriptionJob(
    params: DeleteTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a vocabulary from Amazon Transcribe. 
    */
  def deleteVocabulary(): Request[js.Object, AWSError] = js.native
  def deleteVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a vocabulary from Amazon Transcribe. 
    */
  def deleteVocabulary(params: DeleteVocabularyRequest): Request[js.Object, AWSError] = js.native
  def deleteVocabulary(
    params: DeleteVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptionFileUri field.
    */
  def getTranscriptionJob(): Request[GetTranscriptionJobResponse, AWSError] = js.native
  def getTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptionJobResponse, Unit]): Request[GetTranscriptionJobResponse, AWSError] = js.native
  /**
    * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptionFileUri field.
    */
  def getTranscriptionJob(params: GetTranscriptionJobRequest): Request[GetTranscriptionJobResponse, AWSError] = js.native
  def getTranscriptionJob(
    params: GetTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptionJobResponse, Unit]
  ): Request[GetTranscriptionJobResponse, AWSError] = js.native
  /**
    * Gets information about a vocabulary. 
    */
  def getVocabulary(): Request[GetVocabularyResponse, AWSError] = js.native
  def getVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyResponse, Unit]): Request[GetVocabularyResponse, AWSError] = js.native
  /**
    * Gets information about a vocabulary. 
    */
  def getVocabulary(params: GetVocabularyRequest): Request[GetVocabularyResponse, AWSError] = js.native
  def getVocabulary(
    params: GetVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyResponse, Unit]
  ): Request[GetVocabularyResponse, AWSError] = js.native
  /**
    * Lists transcription jobs with the specified status.
    */
  def listTranscriptionJobs(): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  def listTranscriptionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTranscriptionJobsResponse, Unit]): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  /**
    * Lists transcription jobs with the specified status.
    */
  def listTranscriptionJobs(params: ListTranscriptionJobsRequest): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  def listTranscriptionJobs(
    params: ListTranscriptionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTranscriptionJobsResponse, Unit]
  ): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  /**
    * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
    */
  def listVocabularies(): Request[ListVocabulariesResponse, AWSError] = js.native
  def listVocabularies(callback: js.Function2[/* err */ AWSError, /* data */ ListVocabulariesResponse, Unit]): Request[ListVocabulariesResponse, AWSError] = js.native
  /**
    * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
    */
  def listVocabularies(params: ListVocabulariesRequest): Request[ListVocabulariesResponse, AWSError] = js.native
  def listVocabularies(
    params: ListVocabulariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVocabulariesResponse, Unit]
  ): Request[ListVocabulariesResponse, AWSError] = js.native
  /**
    * Starts an asynchronous job to transcribe speech to text. 
    */
  def startTranscriptionJob(): Request[StartTranscriptionJobResponse, AWSError] = js.native
  def startTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartTranscriptionJobResponse, Unit]): Request[StartTranscriptionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous job to transcribe speech to text. 
    */
  def startTranscriptionJob(params: StartTranscriptionJobRequest): Request[StartTranscriptionJobResponse, AWSError] = js.native
  def startTranscriptionJob(
    params: StartTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTranscriptionJobResponse, Unit]
  ): Request[StartTranscriptionJobResponse, AWSError] = js.native
  /**
    * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. 
    */
  def updateVocabulary(): Request[UpdateVocabularyResponse, AWSError] = js.native
  def updateVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyResponse, Unit]): Request[UpdateVocabularyResponse, AWSError] = js.native
  /**
    * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. 
    */
  def updateVocabulary(params: UpdateVocabularyRequest): Request[UpdateVocabularyResponse, AWSError] = js.native
  def updateVocabulary(
    params: UpdateVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyResponse, Unit]
  ): Request[UpdateVocabularyResponse, AWSError] = js.native
}

