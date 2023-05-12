package typings.awsSdk.clientsM2Mod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait M2 extends Service {
  
  /**
    * Cancels the running of a specific batch job execution.
    */
  def cancelBatchJobExecution(): Request[CancelBatchJobExecutionResponse, AWSError] = js.native
  def cancelBatchJobExecution(callback: js.Function2[/* err */ AWSError, /* data */ CancelBatchJobExecutionResponse, Unit]): Request[CancelBatchJobExecutionResponse, AWSError] = js.native
  /**
    * Cancels the running of a specific batch job execution.
    */
  def cancelBatchJobExecution(params: CancelBatchJobExecutionRequest): Request[CancelBatchJobExecutionResponse, AWSError] = js.native
  def cancelBatchJobExecution(
    params: CancelBatchJobExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelBatchJobExecutionResponse, Unit]
  ): Request[CancelBatchJobExecutionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_M2: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new application with given parameters. Requires an existing runtime environment and application definition file.
    */
  def createApplication(): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]): Request[CreateApplicationResponse, AWSError] = js.native
  /**
    * Creates a new application with given parameters. Requires an existing runtime environment and application definition file.
    */
  def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]
  ): Request[CreateApplicationResponse, AWSError] = js.native
  
  /**
    * Starts a data set import task for a specific application.
    */
  def createDataSetImportTask(): Request[CreateDataSetImportTaskResponse, AWSError] = js.native
  def createDataSetImportTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSetImportTaskResponse, Unit]): Request[CreateDataSetImportTaskResponse, AWSError] = js.native
  /**
    * Starts a data set import task for a specific application.
    */
  def createDataSetImportTask(params: CreateDataSetImportTaskRequest): Request[CreateDataSetImportTaskResponse, AWSError] = js.native
  def createDataSetImportTask(
    params: CreateDataSetImportTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSetImportTaskResponse, Unit]
  ): Request[CreateDataSetImportTaskResponse, AWSError] = js.native
  
  /**
    * Creates and starts a deployment to deploy an application into a runtime environment.
    */
  def createDeployment(): Request[CreateDeploymentResponse, AWSError] = js.native
  def createDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResponse, Unit]): Request[CreateDeploymentResponse, AWSError] = js.native
  /**
    * Creates and starts a deployment to deploy an application into a runtime environment.
    */
  def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse, AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResponse, Unit]
  ): Request[CreateDeploymentResponse, AWSError] = js.native
  
  /**
    * Creates a runtime environment for a given runtime engine.
    */
  def createEnvironment(): Request[CreateEnvironmentResponse, AWSError] = js.native
  def createEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentResponse, Unit]): Request[CreateEnvironmentResponse, AWSError] = js.native
  /**
    * Creates a runtime environment for a given runtime engine.
    */
  def createEnvironment(params: CreateEnvironmentRequest): Request[CreateEnvironmentResponse, AWSError] = js.native
  def createEnvironment(
    params: CreateEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentResponse, Unit]
  ): Request[CreateEnvironmentResponse, AWSError] = js.native
  
  /**
    * Deletes a specific application. You cannot delete a running application.
    */
  def deleteApplication(): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, Unit]): Request[DeleteApplicationResponse, AWSError] = js.native
  /**
    * Deletes a specific application. You cannot delete a running application.
    */
  def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, Unit]
  ): Request[DeleteApplicationResponse, AWSError] = js.native
  
  /**
    * Deletes a specific application from the specific runtime environment where it was previously deployed. You cannot delete a runtime environment using DeleteEnvironment if any application has ever been deployed to it. This API removes the association of the application with the runtime environment so you can delete the environment smoothly.
    */
  def deleteApplicationFromEnvironment(): Request[DeleteApplicationFromEnvironmentResponse, AWSError] = js.native
  def deleteApplicationFromEnvironment(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationFromEnvironmentResponse, Unit]
  ): Request[DeleteApplicationFromEnvironmentResponse, AWSError] = js.native
  /**
    * Deletes a specific application from the specific runtime environment where it was previously deployed. You cannot delete a runtime environment using DeleteEnvironment if any application has ever been deployed to it. This API removes the association of the application with the runtime environment so you can delete the environment smoothly.
    */
  def deleteApplicationFromEnvironment(params: DeleteApplicationFromEnvironmentRequest): Request[DeleteApplicationFromEnvironmentResponse, AWSError] = js.native
  def deleteApplicationFromEnvironment(
    params: DeleteApplicationFromEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationFromEnvironmentResponse, Unit]
  ): Request[DeleteApplicationFromEnvironmentResponse, AWSError] = js.native
  
  /**
    * Deletes a specific runtime environment. The environment cannot contain deployed applications. If it does, you must delete those applications before you delete the environment.
    */
  def deleteEnvironment(): Request[DeleteEnvironmentResponse, AWSError] = js.native
  def deleteEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentResponse, Unit]): Request[DeleteEnvironmentResponse, AWSError] = js.native
  /**
    * Deletes a specific runtime environment. The environment cannot contain deployed applications. If it does, you must delete those applications before you delete the environment.
    */
  def deleteEnvironment(params: DeleteEnvironmentRequest): Request[DeleteEnvironmentResponse, AWSError] = js.native
  def deleteEnvironment(
    params: DeleteEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentResponse, Unit]
  ): Request[DeleteEnvironmentResponse, AWSError] = js.native
  
  /**
    * Describes the details of a specific application.
    */
  def getApplication(): Request[GetApplicationResponse, AWSError] = js.native
  def getApplication(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationResponse, Unit]): Request[GetApplicationResponse, AWSError] = js.native
  /**
    * Describes the details of a specific application.
    */
  def getApplication(params: GetApplicationRequest): Request[GetApplicationResponse, AWSError] = js.native
  def getApplication(
    params: GetApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationResponse, Unit]
  ): Request[GetApplicationResponse, AWSError] = js.native
  
  /**
    * Returns details about a specific version of a specific application.
    */
  def getApplicationVersion(): Request[GetApplicationVersionResponse, AWSError] = js.native
  def getApplicationVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationVersionResponse, Unit]): Request[GetApplicationVersionResponse, AWSError] = js.native
  /**
    * Returns details about a specific version of a specific application.
    */
  def getApplicationVersion(params: GetApplicationVersionRequest): Request[GetApplicationVersionResponse, AWSError] = js.native
  def getApplicationVersion(
    params: GetApplicationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationVersionResponse, Unit]
  ): Request[GetApplicationVersionResponse, AWSError] = js.native
  
  /**
    * Gets the details of a specific batch job execution for a specific application.
    */
  def getBatchJobExecution(): Request[GetBatchJobExecutionResponse, AWSError] = js.native
  def getBatchJobExecution(callback: js.Function2[/* err */ AWSError, /* data */ GetBatchJobExecutionResponse, Unit]): Request[GetBatchJobExecutionResponse, AWSError] = js.native
  /**
    * Gets the details of a specific batch job execution for a specific application.
    */
  def getBatchJobExecution(params: GetBatchJobExecutionRequest): Request[GetBatchJobExecutionResponse, AWSError] = js.native
  def getBatchJobExecution(
    params: GetBatchJobExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBatchJobExecutionResponse, Unit]
  ): Request[GetBatchJobExecutionResponse, AWSError] = js.native
  
  /**
    * Gets the details of a specific data set.
    */
  def getDataSetDetails(): Request[GetDataSetDetailsResponse, AWSError] = js.native
  def getDataSetDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetDataSetDetailsResponse, Unit]): Request[GetDataSetDetailsResponse, AWSError] = js.native
  /**
    * Gets the details of a specific data set.
    */
  def getDataSetDetails(params: GetDataSetDetailsRequest): Request[GetDataSetDetailsResponse, AWSError] = js.native
  def getDataSetDetails(
    params: GetDataSetDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataSetDetailsResponse, Unit]
  ): Request[GetDataSetDetailsResponse, AWSError] = js.native
  
  /**
    * Gets the status of a data set import task initiated with the CreateDataSetImportTask operation.
    */
  def getDataSetImportTask(): Request[GetDataSetImportTaskResponse, AWSError] = js.native
  def getDataSetImportTask(callback: js.Function2[/* err */ AWSError, /* data */ GetDataSetImportTaskResponse, Unit]): Request[GetDataSetImportTaskResponse, AWSError] = js.native
  /**
    * Gets the status of a data set import task initiated with the CreateDataSetImportTask operation.
    */
  def getDataSetImportTask(params: GetDataSetImportTaskRequest): Request[GetDataSetImportTaskResponse, AWSError] = js.native
  def getDataSetImportTask(
    params: GetDataSetImportTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataSetImportTaskResponse, Unit]
  ): Request[GetDataSetImportTaskResponse, AWSError] = js.native
  
  /**
    * Gets details of a specific deployment with a given deployment identifier.
    */
  def getDeployment(): Request[GetDeploymentResponse, AWSError] = js.native
  def getDeployment(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentResponse, Unit]): Request[GetDeploymentResponse, AWSError] = js.native
  /**
    * Gets details of a specific deployment with a given deployment identifier.
    */
  def getDeployment(params: GetDeploymentRequest): Request[GetDeploymentResponse, AWSError] = js.native
  def getDeployment(
    params: GetDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentResponse, Unit]
  ): Request[GetDeploymentResponse, AWSError] = js.native
  
  /**
    * Describes a specific runtime environment.
    */
  def getEnvironment(): Request[GetEnvironmentResponse, AWSError] = js.native
  def getEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentResponse, Unit]): Request[GetEnvironmentResponse, AWSError] = js.native
  /**
    * Describes a specific runtime environment.
    */
  def getEnvironment(params: GetEnvironmentRequest): Request[GetEnvironmentResponse, AWSError] = js.native
  def getEnvironment(
    params: GetEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentResponse, Unit]
  ): Request[GetEnvironmentResponse, AWSError] = js.native
  
  /**
    * Returns a list of the application versions for a specific application.
    */
  def listApplicationVersions(): Request[ListApplicationVersionsResponse, AWSError] = js.native
  def listApplicationVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationVersionsResponse, Unit]): Request[ListApplicationVersionsResponse, AWSError] = js.native
  /**
    * Returns a list of the application versions for a specific application.
    */
  def listApplicationVersions(params: ListApplicationVersionsRequest): Request[ListApplicationVersionsResponse, AWSError] = js.native
  def listApplicationVersions(
    params: ListApplicationVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationVersionsResponse, Unit]
  ): Request[ListApplicationVersionsResponse, AWSError] = js.native
  
  /**
    * Lists the applications associated with a specific Amazon Web Services account. You can provide the unique identifier of a specific runtime environment in a query parameter to see all applications associated with that environment.
    */
  def listApplications(): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]): Request[ListApplicationsResponse, AWSError] = js.native
  /**
    * Lists the applications associated with a specific Amazon Web Services account. You can provide the unique identifier of a specific runtime environment in a query parameter to see all applications associated with that environment.
    */
  def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(
    params: ListApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]
  ): Request[ListApplicationsResponse, AWSError] = js.native
  
  /**
    * Lists all the available batch job definitions based on the batch job resources uploaded during the application creation. You can use the batch job definitions in the list to start a batch job.
    */
  def listBatchJobDefinitions(): Request[ListBatchJobDefinitionsResponse, AWSError] = js.native
  def listBatchJobDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListBatchJobDefinitionsResponse, Unit]): Request[ListBatchJobDefinitionsResponse, AWSError] = js.native
  /**
    * Lists all the available batch job definitions based on the batch job resources uploaded during the application creation. You can use the batch job definitions in the list to start a batch job.
    */
  def listBatchJobDefinitions(params: ListBatchJobDefinitionsRequest): Request[ListBatchJobDefinitionsResponse, AWSError] = js.native
  def listBatchJobDefinitions(
    params: ListBatchJobDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBatchJobDefinitionsResponse, Unit]
  ): Request[ListBatchJobDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists historical, current, and scheduled batch job executions for a specific application.
    */
  def listBatchJobExecutions(): Request[ListBatchJobExecutionsResponse, AWSError] = js.native
  def listBatchJobExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListBatchJobExecutionsResponse, Unit]): Request[ListBatchJobExecutionsResponse, AWSError] = js.native
  /**
    * Lists historical, current, and scheduled batch job executions for a specific application.
    */
  def listBatchJobExecutions(params: ListBatchJobExecutionsRequest): Request[ListBatchJobExecutionsResponse, AWSError] = js.native
  def listBatchJobExecutions(
    params: ListBatchJobExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBatchJobExecutionsResponse, Unit]
  ): Request[ListBatchJobExecutionsResponse, AWSError] = js.native
  
  /**
    * Lists the data set imports for the specified application.
    */
  def listDataSetImportHistory(): Request[ListDataSetImportHistoryResponse, AWSError] = js.native
  def listDataSetImportHistory(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetImportHistoryResponse, Unit]): Request[ListDataSetImportHistoryResponse, AWSError] = js.native
  /**
    * Lists the data set imports for the specified application.
    */
  def listDataSetImportHistory(params: ListDataSetImportHistoryRequest): Request[ListDataSetImportHistoryResponse, AWSError] = js.native
  def listDataSetImportHistory(
    params: ListDataSetImportHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetImportHistoryResponse, Unit]
  ): Request[ListDataSetImportHistoryResponse, AWSError] = js.native
  
  /**
    * Lists the data sets imported for a specific application. In Amazon Web Services Mainframe Modernization, data sets are associated with applications deployed on runtime environments. This is known as importing data sets. Currently, Amazon Web Services Mainframe Modernization can import data sets into catalogs using CreateDataSetImportTask.
    */
  def listDataSets(): Request[ListDataSetsResponse, AWSError] = js.native
  def listDataSets(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetsResponse, Unit]): Request[ListDataSetsResponse, AWSError] = js.native
  /**
    * Lists the data sets imported for a specific application. In Amazon Web Services Mainframe Modernization, data sets are associated with applications deployed on runtime environments. This is known as importing data sets. Currently, Amazon Web Services Mainframe Modernization can import data sets into catalogs using CreateDataSetImportTask.
    */
  def listDataSets(params: ListDataSetsRequest): Request[ListDataSetsResponse, AWSError] = js.native
  def listDataSets(
    params: ListDataSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetsResponse, Unit]
  ): Request[ListDataSetsResponse, AWSError] = js.native
  
  /**
    * Returns a list of all deployments of a specific application. A deployment is a combination of a specific application and a specific version of that application. Each deployment is mapped to a particular application version.
    */
  def listDeployments(): Request[ListDeploymentsResponse, AWSError] = js.native
  def listDeployments(callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentsResponse, Unit]): Request[ListDeploymentsResponse, AWSError] = js.native
  /**
    * Returns a list of all deployments of a specific application. A deployment is a combination of a specific application and a specific version of that application. Each deployment is mapped to a particular application version.
    */
  def listDeployments(params: ListDeploymentsRequest): Request[ListDeploymentsResponse, AWSError] = js.native
  def listDeployments(
    params: ListDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentsResponse, Unit]
  ): Request[ListDeploymentsResponse, AWSError] = js.native
  
  /**
    * Lists the available engine versions.
    */
  def listEngineVersions(): Request[ListEngineVersionsResponse, AWSError] = js.native
  def listEngineVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListEngineVersionsResponse, Unit]): Request[ListEngineVersionsResponse, AWSError] = js.native
  /**
    * Lists the available engine versions.
    */
  def listEngineVersions(params: ListEngineVersionsRequest): Request[ListEngineVersionsResponse, AWSError] = js.native
  def listEngineVersions(
    params: ListEngineVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEngineVersionsResponse, Unit]
  ): Request[ListEngineVersionsResponse, AWSError] = js.native
  
  /**
    * Lists the runtime environments.
    */
  def listEnvironments(): Request[ListEnvironmentsResponse, AWSError] = js.native
  def listEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsResponse, Unit]): Request[ListEnvironmentsResponse, AWSError] = js.native
  /**
    * Lists the runtime environments.
    */
  def listEnvironments(params: ListEnvironmentsRequest): Request[ListEnvironmentsResponse, AWSError] = js.native
  def listEnvironments(
    params: ListEnvironmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsResponse, Unit]
  ): Request[ListEnvironmentsResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Starts an application that is currently stopped.
    */
  def startApplication(): Request[StartApplicationResponse, AWSError] = js.native
  def startApplication(callback: js.Function2[/* err */ AWSError, /* data */ StartApplicationResponse, Unit]): Request[StartApplicationResponse, AWSError] = js.native
  /**
    * Starts an application that is currently stopped.
    */
  def startApplication(params: StartApplicationRequest): Request[StartApplicationResponse, AWSError] = js.native
  def startApplication(
    params: StartApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartApplicationResponse, Unit]
  ): Request[StartApplicationResponse, AWSError] = js.native
  
  /**
    * Starts a batch job and returns the unique identifier of this execution of the batch job. The associated application must be running in order to start the batch job.
    */
  def startBatchJob(): Request[StartBatchJobResponse, AWSError] = js.native
  def startBatchJob(callback: js.Function2[/* err */ AWSError, /* data */ StartBatchJobResponse, Unit]): Request[StartBatchJobResponse, AWSError] = js.native
  /**
    * Starts a batch job and returns the unique identifier of this execution of the batch job. The associated application must be running in order to start the batch job.
    */
  def startBatchJob(params: StartBatchJobRequest): Request[StartBatchJobResponse, AWSError] = js.native
  def startBatchJob(
    params: StartBatchJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartBatchJobResponse, Unit]
  ): Request[StartBatchJobResponse, AWSError] = js.native
  
  /**
    * Stops a running application.
    */
  def stopApplication(): Request[StopApplicationResponse, AWSError] = js.native
  def stopApplication(callback: js.Function2[/* err */ AWSError, /* data */ StopApplicationResponse, Unit]): Request[StopApplicationResponse, AWSError] = js.native
  /**
    * Stops a running application.
    */
  def stopApplication(params: StopApplicationRequest): Request[StopApplicationResponse, AWSError] = js.native
  def stopApplication(
    params: StopApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopApplicationResponse, Unit]
  ): Request[StopApplicationResponse, AWSError] = js.native
  
  /**
    * Adds one or more tags to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an application and creates a new version.
    */
  def updateApplication(): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]): Request[UpdateApplicationResponse, AWSError] = js.native
  /**
    * Updates an application and creates a new version.
    */
  def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]
  ): Request[UpdateApplicationResponse, AWSError] = js.native
  
  /**
    * Updates the configuration details for a specific runtime environment.
    */
  def updateEnvironment(): Request[UpdateEnvironmentResponse, AWSError] = js.native
  def updateEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentResponse, Unit]): Request[UpdateEnvironmentResponse, AWSError] = js.native
  /**
    * Updates the configuration details for a specific runtime environment.
    */
  def updateEnvironment(params: UpdateEnvironmentRequest): Request[UpdateEnvironmentResponse, AWSError] = js.native
  def updateEnvironment(
    params: UpdateEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentResponse, Unit]
  ): Request[UpdateEnvironmentResponse, AWSError] = js.native
}
