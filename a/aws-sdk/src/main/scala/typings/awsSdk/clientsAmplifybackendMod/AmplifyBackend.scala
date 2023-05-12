package typings.awsSdk.clientsAmplifybackendMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'COGNITO' | string */ @js.native
trait AmplifyBackend extends StObject {
  
  /**
    * This operation clones an existing backend.
    */
  def cloneBackend(): Request[CloneBackendResponse, AWSError] = js.native
  def cloneBackend(callback: js.Function2[/* err */ AWSError, /* data */ CloneBackendResponse, Unit]): Request[CloneBackendResponse, AWSError] = js.native
  /**
    * This operation clones an existing backend.
    */
  def cloneBackend(params: CloneBackendRequest): Request[CloneBackendResponse, AWSError] = js.native
  def cloneBackend(
    params: CloneBackendRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CloneBackendResponse, Unit]
  ): Request[CloneBackendResponse, AWSError] = js.native
  
  var config: ConfigBase & ClientConfiguration = js.native
  
  /**
    * This operation creates a backend for an Amplify app. Backends are automatically created at the time of app creation.
    */
  def createBackend(): Request[CreateBackendResponse, AWSError] = js.native
  def createBackend(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendResponse, Unit]): Request[CreateBackendResponse, AWSError] = js.native
  /**
    * This operation creates a backend for an Amplify app. Backends are automatically created at the time of app creation.
    */
  def createBackend(params: CreateBackendRequest): Request[CreateBackendResponse, AWSError] = js.native
  def createBackend(
    params: CreateBackendRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendResponse, Unit]
  ): Request[CreateBackendResponse, AWSError] = js.native
  
  /**
    * Creates a new backend API resource.
    */
  def createBackendAPI(): Request[CreateBackendAPIResponse, AWSError] = js.native
  def createBackendAPI(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendAPIResponse, Unit]): Request[CreateBackendAPIResponse, AWSError] = js.native
  /**
    * Creates a new backend API resource.
    */
  def createBackendAPI(params: CreateBackendAPIRequest): Request[CreateBackendAPIResponse, AWSError] = js.native
  def createBackendAPI(
    params: CreateBackendAPIRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendAPIResponse, Unit]
  ): Request[CreateBackendAPIResponse, AWSError] = js.native
  
  /**
    * Creates a new backend authentication resource.
    */
  def createBackendAuth(): Request[CreateBackendAuthResponse, AWSError] = js.native
  def createBackendAuth(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendAuthResponse, Unit]): Request[CreateBackendAuthResponse, AWSError] = js.native
  /**
    * Creates a new backend authentication resource.
    */
  def createBackendAuth(params: CreateBackendAuthRequest): Request[CreateBackendAuthResponse, AWSError] = js.native
  def createBackendAuth(
    params: CreateBackendAuthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendAuthResponse, Unit]
  ): Request[CreateBackendAuthResponse, AWSError] = js.native
  
  /**
    * Creates a config object for a backend.
    */
  def createBackendConfig(): Request[CreateBackendConfigResponse, AWSError] = js.native
  def createBackendConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendConfigResponse, Unit]): Request[CreateBackendConfigResponse, AWSError] = js.native
  /**
    * Creates a config object for a backend.
    */
  def createBackendConfig(params: CreateBackendConfigRequest): Request[CreateBackendConfigResponse, AWSError] = js.native
  def createBackendConfig(
    params: CreateBackendConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendConfigResponse, Unit]
  ): Request[CreateBackendConfigResponse, AWSError] = js.native
  
  /**
    * Creates a backend storage resource.
    */
  def createBackendStorage(): Request[CreateBackendStorageResponse, AWSError] = js.native
  def createBackendStorage(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendStorageResponse, Unit]): Request[CreateBackendStorageResponse, AWSError] = js.native
  /**
    * Creates a backend storage resource.
    */
  def createBackendStorage(params: CreateBackendStorageRequest): Request[CreateBackendStorageResponse, AWSError] = js.native
  def createBackendStorage(
    params: CreateBackendStorageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendStorageResponse, Unit]
  ): Request[CreateBackendStorageResponse, AWSError] = js.native
  
  /**
    * Generates a one-time challenge code to authenticate a user into your Amplify Admin UI.
    */
  def createToken(): Request[CreateTokenResponse, AWSError] = js.native
  def createToken(callback: js.Function2[/* err */ AWSError, /* data */ CreateTokenResponse, Unit]): Request[CreateTokenResponse, AWSError] = js.native
  /**
    * Generates a one-time challenge code to authenticate a user into your Amplify Admin UI.
    */
  def createToken(params: CreateTokenRequest): Request[CreateTokenResponse, AWSError] = js.native
  def createToken(
    params: CreateTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTokenResponse, Unit]
  ): Request[CreateTokenResponse, AWSError] = js.native
  
  /**
    * Removes an existing environment from your Amplify project.
    */
  def deleteBackend(): Request[DeleteBackendResponse, AWSError] = js.native
  def deleteBackend(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackendResponse, Unit]): Request[DeleteBackendResponse, AWSError] = js.native
  /**
    * Removes an existing environment from your Amplify project.
    */
  def deleteBackend(params: DeleteBackendRequest): Request[DeleteBackendResponse, AWSError] = js.native
  def deleteBackend(
    params: DeleteBackendRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackendResponse, Unit]
  ): Request[DeleteBackendResponse, AWSError] = js.native
  
  /**
    * Deletes an existing backend API resource.
    */
  def deleteBackendAPI(): Request[DeleteBackendAPIResponse, AWSError] = js.native
  def deleteBackendAPI(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackendAPIResponse, Unit]): Request[DeleteBackendAPIResponse, AWSError] = js.native
  /**
    * Deletes an existing backend API resource.
    */
  def deleteBackendAPI(params: DeleteBackendAPIRequest): Request[DeleteBackendAPIResponse, AWSError] = js.native
  def deleteBackendAPI(
    params: DeleteBackendAPIRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackendAPIResponse, Unit]
  ): Request[DeleteBackendAPIResponse, AWSError] = js.native
  
  /**
    * Deletes an existing backend authentication resource.
    */
  def deleteBackendAuth(): Request[DeleteBackendAuthResponse, AWSError] = js.native
  def deleteBackendAuth(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackendAuthResponse, Unit]): Request[DeleteBackendAuthResponse, AWSError] = js.native
  /**
    * Deletes an existing backend authentication resource.
    */
  def deleteBackendAuth(params: DeleteBackendAuthRequest): Request[DeleteBackendAuthResponse, AWSError] = js.native
  def deleteBackendAuth(
    params: DeleteBackendAuthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackendAuthResponse, Unit]
  ): Request[DeleteBackendAuthResponse, AWSError] = js.native
  
  /**
    * Removes the specified backend storage resource.
    */
  def deleteBackendStorage(): Request[DeleteBackendStorageResponse, AWSError] = js.native
  def deleteBackendStorage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackendStorageResponse, Unit]): Request[DeleteBackendStorageResponse, AWSError] = js.native
  /**
    * Removes the specified backend storage resource.
    */
  def deleteBackendStorage(params: DeleteBackendStorageRequest): Request[DeleteBackendStorageResponse, AWSError] = js.native
  def deleteBackendStorage(
    params: DeleteBackendStorageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackendStorageResponse, Unit]
  ): Request[DeleteBackendStorageResponse, AWSError] = js.native
  
  /**
    * Deletes the challenge token based on the given appId and sessionId.
    */
  def deleteToken(): Request[DeleteTokenResponse, AWSError] = js.native
  def deleteToken(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTokenResponse, Unit]): Request[DeleteTokenResponse, AWSError] = js.native
  /**
    * Deletes the challenge token based on the given appId and sessionId.
    */
  def deleteToken(params: DeleteTokenRequest): Request[DeleteTokenResponse, AWSError] = js.native
  def deleteToken(
    params: DeleteTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTokenResponse, Unit]
  ): Request[DeleteTokenResponse, AWSError] = js.native
  
  /**
    * Generates a model schema for an existing backend API resource.
    */
  def generateBackendAPIModels(): Request[GenerateBackendAPIModelsResponse, AWSError] = js.native
  def generateBackendAPIModels(callback: js.Function2[/* err */ AWSError, /* data */ GenerateBackendAPIModelsResponse, Unit]): Request[GenerateBackendAPIModelsResponse, AWSError] = js.native
  /**
    * Generates a model schema for an existing backend API resource.
    */
  def generateBackendAPIModels(params: GenerateBackendAPIModelsRequest): Request[GenerateBackendAPIModelsResponse, AWSError] = js.native
  def generateBackendAPIModels(
    params: GenerateBackendAPIModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateBackendAPIModelsResponse, Unit]
  ): Request[GenerateBackendAPIModelsResponse, AWSError] = js.native
  
  /**
    * Provides project-level details for your Amplify UI project.
    */
  def getBackend(): Request[GetBackendResponse, AWSError] = js.native
  def getBackend(callback: js.Function2[/* err */ AWSError, /* data */ GetBackendResponse, Unit]): Request[GetBackendResponse, AWSError] = js.native
  /**
    * Provides project-level details for your Amplify UI project.
    */
  def getBackend(params: GetBackendRequest): Request[GetBackendResponse, AWSError] = js.native
  def getBackend(
    params: GetBackendRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackendResponse, Unit]
  ): Request[GetBackendResponse, AWSError] = js.native
  
  /**
    * Gets the details for a backend API.
    */
  def getBackendAPI(): Request[GetBackendAPIResponse, AWSError] = js.native
  def getBackendAPI(callback: js.Function2[/* err */ AWSError, /* data */ GetBackendAPIResponse, Unit]): Request[GetBackendAPIResponse, AWSError] = js.native
  /**
    * Gets the details for a backend API.
    */
  def getBackendAPI(params: GetBackendAPIRequest): Request[GetBackendAPIResponse, AWSError] = js.native
  def getBackendAPI(
    params: GetBackendAPIRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackendAPIResponse, Unit]
  ): Request[GetBackendAPIResponse, AWSError] = js.native
  
  /**
    * Gets a model introspection schema for an existing backend API resource.
    */
  def getBackendAPIModels(): Request[GetBackendAPIModelsResponse, AWSError] = js.native
  def getBackendAPIModels(callback: js.Function2[/* err */ AWSError, /* data */ GetBackendAPIModelsResponse, Unit]): Request[GetBackendAPIModelsResponse, AWSError] = js.native
  /**
    * Gets a model introspection schema for an existing backend API resource.
    */
  def getBackendAPIModels(params: GetBackendAPIModelsRequest): Request[GetBackendAPIModelsResponse, AWSError] = js.native
  def getBackendAPIModels(
    params: GetBackendAPIModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackendAPIModelsResponse, Unit]
  ): Request[GetBackendAPIModelsResponse, AWSError] = js.native
  
  /**
    * Gets a backend auth details.
    */
  def getBackendAuth(): Request[GetBackendAuthResponse, AWSError] = js.native
  def getBackendAuth(callback: js.Function2[/* err */ AWSError, /* data */ GetBackendAuthResponse, Unit]): Request[GetBackendAuthResponse, AWSError] = js.native
  /**
    * Gets a backend auth details.
    */
  def getBackendAuth(params: GetBackendAuthRequest): Request[GetBackendAuthResponse, AWSError] = js.native
  def getBackendAuth(
    params: GetBackendAuthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackendAuthResponse, Unit]
  ): Request[GetBackendAuthResponse, AWSError] = js.native
  
  /**
    * Returns information about a specific job.
    */
  def getBackendJob(): Request[GetBackendJobResponse, AWSError] = js.native
  def getBackendJob(callback: js.Function2[/* err */ AWSError, /* data */ GetBackendJobResponse, Unit]): Request[GetBackendJobResponse, AWSError] = js.native
  /**
    * Returns information about a specific job.
    */
  def getBackendJob(params: GetBackendJobRequest): Request[GetBackendJobResponse, AWSError] = js.native
  def getBackendJob(
    params: GetBackendJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackendJobResponse, Unit]
  ): Request[GetBackendJobResponse, AWSError] = js.native
  
  /**
    * Gets details for a backend storage resource.
    */
  def getBackendStorage(): Request[GetBackendStorageResponse, AWSError] = js.native
  def getBackendStorage(callback: js.Function2[/* err */ AWSError, /* data */ GetBackendStorageResponse, Unit]): Request[GetBackendStorageResponse, AWSError] = js.native
  /**
    * Gets details for a backend storage resource.
    */
  def getBackendStorage(params: GetBackendStorageRequest): Request[GetBackendStorageResponse, AWSError] = js.native
  def getBackendStorage(
    params: GetBackendStorageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackendStorageResponse, Unit]
  ): Request[GetBackendStorageResponse, AWSError] = js.native
  
  /**
    * Gets the challenge token based on the given appId and sessionId.
    */
  def getToken(): Request[GetTokenResponse, AWSError] = js.native
  def getToken(callback: js.Function2[/* err */ AWSError, /* data */ GetTokenResponse, Unit]): Request[GetTokenResponse, AWSError] = js.native
  /**
    * Gets the challenge token based on the given appId and sessionId.
    */
  def getToken(params: GetTokenRequest): Request[GetTokenResponse, AWSError] = js.native
  def getToken(
    params: GetTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTokenResponse, Unit]
  ): Request[GetTokenResponse, AWSError] = js.native
  
  /**
    * Imports an existing backend authentication resource.
    */
  def importBackendAuth(): Request[ImportBackendAuthResponse, AWSError] = js.native
  def importBackendAuth(callback: js.Function2[/* err */ AWSError, /* data */ ImportBackendAuthResponse, Unit]): Request[ImportBackendAuthResponse, AWSError] = js.native
  /**
    * Imports an existing backend authentication resource.
    */
  def importBackendAuth(params: ImportBackendAuthRequest): Request[ImportBackendAuthResponse, AWSError] = js.native
  def importBackendAuth(
    params: ImportBackendAuthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportBackendAuthResponse, Unit]
  ): Request[ImportBackendAuthResponse, AWSError] = js.native
  
  /**
    * Imports an existing backend storage resource.
    */
  def importBackendStorage(): Request[ImportBackendStorageResponse, AWSError] = js.native
  def importBackendStorage(callback: js.Function2[/* err */ AWSError, /* data */ ImportBackendStorageResponse, Unit]): Request[ImportBackendStorageResponse, AWSError] = js.native
  /**
    * Imports an existing backend storage resource.
    */
  def importBackendStorage(params: ImportBackendStorageRequest): Request[ImportBackendStorageResponse, AWSError] = js.native
  def importBackendStorage(
    params: ImportBackendStorageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportBackendStorageResponse, Unit]
  ): Request[ImportBackendStorageResponse, AWSError] = js.native
  
  /**
    * Lists the jobs for the backend of an Amplify app.
    */
  def listBackendJobs(): Request[ListBackendJobsResponse, AWSError] = js.native
  def listBackendJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListBackendJobsResponse, Unit]): Request[ListBackendJobsResponse, AWSError] = js.native
  /**
    * Lists the jobs for the backend of an Amplify app.
    */
  def listBackendJobs(params: ListBackendJobsRequest): Request[ListBackendJobsResponse, AWSError] = js.native
  def listBackendJobs(
    params: ListBackendJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBackendJobsResponse, Unit]
  ): Request[ListBackendJobsResponse, AWSError] = js.native
  
  /**
    * The list of S3 buckets in your account.
    */
  def listS3Buckets(): Request[ListS3BucketsResponse, AWSError] = js.native
  def listS3Buckets(callback: js.Function2[/* err */ AWSError, /* data */ ListS3BucketsResponse, Unit]): Request[ListS3BucketsResponse, AWSError] = js.native
  /**
    * The list of S3 buckets in your account.
    */
  def listS3Buckets(params: ListS3BucketsRequest): Request[ListS3BucketsResponse, AWSError] = js.native
  def listS3Buckets(
    params: ListS3BucketsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListS3BucketsResponse, Unit]
  ): Request[ListS3BucketsResponse, AWSError] = js.native
  
  /**
    * Removes all backend environments from your Amplify project.
    */
  def removeAllBackends(): Request[RemoveAllBackendsResponse, AWSError] = js.native
  def removeAllBackends(callback: js.Function2[/* err */ AWSError, /* data */ RemoveAllBackendsResponse, Unit]): Request[RemoveAllBackendsResponse, AWSError] = js.native
  /**
    * Removes all backend environments from your Amplify project.
    */
  def removeAllBackends(params: RemoveAllBackendsRequest): Request[RemoveAllBackendsResponse, AWSError] = js.native
  def removeAllBackends(
    params: RemoveAllBackendsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveAllBackendsResponse, Unit]
  ): Request[RemoveAllBackendsResponse, AWSError] = js.native
  
  /**
    * Removes the AWS resources required to access the Amplify Admin UI.
    */
  def removeBackendConfig(): Request[RemoveBackendConfigResponse, AWSError] = js.native
  def removeBackendConfig(callback: js.Function2[/* err */ AWSError, /* data */ RemoveBackendConfigResponse, Unit]): Request[RemoveBackendConfigResponse, AWSError] = js.native
  /**
    * Removes the AWS resources required to access the Amplify Admin UI.
    */
  def removeBackendConfig(params: RemoveBackendConfigRequest): Request[RemoveBackendConfigResponse, AWSError] = js.native
  def removeBackendConfig(
    params: RemoveBackendConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveBackendConfigResponse, Unit]
  ): Request[RemoveBackendConfigResponse, AWSError] = js.native
  
  /**
    * Updates an existing backend API resource.
    */
  def updateBackendAPI(): Request[UpdateBackendAPIResponse, AWSError] = js.native
  def updateBackendAPI(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackendAPIResponse, Unit]): Request[UpdateBackendAPIResponse, AWSError] = js.native
  /**
    * Updates an existing backend API resource.
    */
  def updateBackendAPI(params: UpdateBackendAPIRequest): Request[UpdateBackendAPIResponse, AWSError] = js.native
  def updateBackendAPI(
    params: UpdateBackendAPIRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackendAPIResponse, Unit]
  ): Request[UpdateBackendAPIResponse, AWSError] = js.native
  
  /**
    * Updates an existing backend authentication resource.
    */
  def updateBackendAuth(): Request[UpdateBackendAuthResponse, AWSError] = js.native
  def updateBackendAuth(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackendAuthResponse, Unit]): Request[UpdateBackendAuthResponse, AWSError] = js.native
  /**
    * Updates an existing backend authentication resource.
    */
  def updateBackendAuth(params: UpdateBackendAuthRequest): Request[UpdateBackendAuthResponse, AWSError] = js.native
  def updateBackendAuth(
    params: UpdateBackendAuthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackendAuthResponse, Unit]
  ): Request[UpdateBackendAuthResponse, AWSError] = js.native
  
  /**
    * Updates the AWS resources required to access the Amplify Admin UI.
    */
  def updateBackendConfig(): Request[UpdateBackendConfigResponse, AWSError] = js.native
  def updateBackendConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackendConfigResponse, Unit]): Request[UpdateBackendConfigResponse, AWSError] = js.native
  /**
    * Updates the AWS resources required to access the Amplify Admin UI.
    */
  def updateBackendConfig(params: UpdateBackendConfigRequest): Request[UpdateBackendConfigResponse, AWSError] = js.native
  def updateBackendConfig(
    params: UpdateBackendConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackendConfigResponse, Unit]
  ): Request[UpdateBackendConfigResponse, AWSError] = js.native
  
  /**
    * Updates a specific job.
    */
  def updateBackendJob(): Request[UpdateBackendJobResponse, AWSError] = js.native
  def updateBackendJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackendJobResponse, Unit]): Request[UpdateBackendJobResponse, AWSError] = js.native
  /**
    * Updates a specific job.
    */
  def updateBackendJob(params: UpdateBackendJobRequest): Request[UpdateBackendJobResponse, AWSError] = js.native
  def updateBackendJob(
    params: UpdateBackendJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackendJobResponse, Unit]
  ): Request[UpdateBackendJobResponse, AWSError] = js.native
  
  /**
    * Updates an existing backend storage resource.
    */
  def updateBackendStorage(): Request[UpdateBackendStorageResponse, AWSError] = js.native
  def updateBackendStorage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackendStorageResponse, Unit]): Request[UpdateBackendStorageResponse, AWSError] = js.native
  /**
    * Updates an existing backend storage resource.
    */
  def updateBackendStorage(params: UpdateBackendStorageRequest): Request[UpdateBackendStorageResponse, AWSError] = js.native
  def updateBackendStorage(
    params: UpdateBackendStorageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBackendStorageResponse, Unit]
  ): Request[UpdateBackendStorageResponse, AWSError] = js.native
}
