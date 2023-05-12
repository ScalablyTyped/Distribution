package typings.awsSdk.clientsMigrationhubstrategyMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationHubStrategy extends Service {
  
  @JSName("config")
  var config_MigrationHubStrategy: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  Retrieves details about an application component. 
    */
  def getApplicationComponentDetails(): Request[GetApplicationComponentDetailsResponse, AWSError] = js.native
  def getApplicationComponentDetails(
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationComponentDetailsResponse, Unit]
  ): Request[GetApplicationComponentDetailsResponse, AWSError] = js.native
  /**
    *  Retrieves details about an application component. 
    */
  def getApplicationComponentDetails(params: GetApplicationComponentDetailsRequest): Request[GetApplicationComponentDetailsResponse, AWSError] = js.native
  def getApplicationComponentDetails(
    params: GetApplicationComponentDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationComponentDetailsResponse, Unit]
  ): Request[GetApplicationComponentDetailsResponse, AWSError] = js.native
  
  /**
    *  Retrieves a list of all the recommended strategies and tools for an application component running on a server. 
    */
  def getApplicationComponentStrategies(): Request[GetApplicationComponentStrategiesResponse, AWSError] = js.native
  def getApplicationComponentStrategies(
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationComponentStrategiesResponse, Unit]
  ): Request[GetApplicationComponentStrategiesResponse, AWSError] = js.native
  /**
    *  Retrieves a list of all the recommended strategies and tools for an application component running on a server. 
    */
  def getApplicationComponentStrategies(params: GetApplicationComponentStrategiesRequest): Request[GetApplicationComponentStrategiesResponse, AWSError] = js.native
  def getApplicationComponentStrategies(
    params: GetApplicationComponentStrategiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationComponentStrategiesResponse, Unit]
  ): Request[GetApplicationComponentStrategiesResponse, AWSError] = js.native
  
  /**
    *  Retrieves the status of an on-going assessment. 
    */
  def getAssessment(): Request[GetAssessmentResponse, AWSError] = js.native
  def getAssessment(callback: js.Function2[/* err */ AWSError, /* data */ GetAssessmentResponse, Unit]): Request[GetAssessmentResponse, AWSError] = js.native
  /**
    *  Retrieves the status of an on-going assessment. 
    */
  def getAssessment(params: GetAssessmentRequest): Request[GetAssessmentResponse, AWSError] = js.native
  def getAssessment(
    params: GetAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssessmentResponse, Unit]
  ): Request[GetAssessmentResponse, AWSError] = js.native
  
  /**
    *  Retrieves the details about a specific import task. 
    */
  def getImportFileTask(): Request[GetImportFileTaskResponse, AWSError] = js.native
  def getImportFileTask(callback: js.Function2[/* err */ AWSError, /* data */ GetImportFileTaskResponse, Unit]): Request[GetImportFileTaskResponse, AWSError] = js.native
  /**
    *  Retrieves the details about a specific import task. 
    */
  def getImportFileTask(params: GetImportFileTaskRequest): Request[GetImportFileTaskResponse, AWSError] = js.native
  def getImportFileTask(
    params: GetImportFileTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImportFileTaskResponse, Unit]
  ): Request[GetImportFileTaskResponse, AWSError] = js.native
  
  /**
    * Retrieve the latest ID of a specific assessment task.
    */
  def getLatestAssessmentId(): Request[GetLatestAssessmentIdResponse, AWSError] = js.native
  def getLatestAssessmentId(callback: js.Function2[/* err */ AWSError, /* data */ GetLatestAssessmentIdResponse, Unit]): Request[GetLatestAssessmentIdResponse, AWSError] = js.native
  /**
    * Retrieve the latest ID of a specific assessment task.
    */
  def getLatestAssessmentId(params: GetLatestAssessmentIdRequest): Request[GetLatestAssessmentIdResponse, AWSError] = js.native
  def getLatestAssessmentId(
    params: GetLatestAssessmentIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLatestAssessmentIdResponse, Unit]
  ): Request[GetLatestAssessmentIdResponse, AWSError] = js.native
  
  /**
    *  Retrieves your migration and modernization preferences. 
    */
  def getPortfolioPreferences(): Request[GetPortfolioPreferencesResponse, AWSError] = js.native
  def getPortfolioPreferences(callback: js.Function2[/* err */ AWSError, /* data */ GetPortfolioPreferencesResponse, Unit]): Request[GetPortfolioPreferencesResponse, AWSError] = js.native
  /**
    *  Retrieves your migration and modernization preferences. 
    */
  def getPortfolioPreferences(params: GetPortfolioPreferencesRequest): Request[GetPortfolioPreferencesResponse, AWSError] = js.native
  def getPortfolioPreferences(
    params: GetPortfolioPreferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPortfolioPreferencesResponse, Unit]
  ): Request[GetPortfolioPreferencesResponse, AWSError] = js.native
  
  /**
    *  Retrieves overall summary including the number of servers to rehost and the overall number of anti-patterns. 
    */
  def getPortfolioSummary(): Request[GetPortfolioSummaryResponse, AWSError] = js.native
  def getPortfolioSummary(callback: js.Function2[/* err */ AWSError, /* data */ GetPortfolioSummaryResponse, Unit]): Request[GetPortfolioSummaryResponse, AWSError] = js.native
  /**
    *  Retrieves overall summary including the number of servers to rehost and the overall number of anti-patterns. 
    */
  def getPortfolioSummary(params: GetPortfolioSummaryRequest): Request[GetPortfolioSummaryResponse, AWSError] = js.native
  def getPortfolioSummary(
    params: GetPortfolioSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPortfolioSummaryResponse, Unit]
  ): Request[GetPortfolioSummaryResponse, AWSError] = js.native
  
  /**
    *  Retrieves detailed information about the specified recommendation report. 
    */
  def getRecommendationReportDetails(): Request[GetRecommendationReportDetailsResponse, AWSError] = js.native
  def getRecommendationReportDetails(
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationReportDetailsResponse, Unit]
  ): Request[GetRecommendationReportDetailsResponse, AWSError] = js.native
  /**
    *  Retrieves detailed information about the specified recommendation report. 
    */
  def getRecommendationReportDetails(params: GetRecommendationReportDetailsRequest): Request[GetRecommendationReportDetailsResponse, AWSError] = js.native
  def getRecommendationReportDetails(
    params: GetRecommendationReportDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationReportDetailsResponse, Unit]
  ): Request[GetRecommendationReportDetailsResponse, AWSError] = js.native
  
  /**
    *  Retrieves detailed information about a specified server. 
    */
  def getServerDetails(): Request[GetServerDetailsResponse, AWSError] = js.native
  def getServerDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetServerDetailsResponse, Unit]): Request[GetServerDetailsResponse, AWSError] = js.native
  /**
    *  Retrieves detailed information about a specified server. 
    */
  def getServerDetails(params: GetServerDetailsRequest): Request[GetServerDetailsResponse, AWSError] = js.native
  def getServerDetails(
    params: GetServerDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServerDetailsResponse, Unit]
  ): Request[GetServerDetailsResponse, AWSError] = js.native
  
  /**
    *  Retrieves recommended strategies and tools for the specified server. 
    */
  def getServerStrategies(): Request[GetServerStrategiesResponse, AWSError] = js.native
  def getServerStrategies(callback: js.Function2[/* err */ AWSError, /* data */ GetServerStrategiesResponse, Unit]): Request[GetServerStrategiesResponse, AWSError] = js.native
  /**
    *  Retrieves recommended strategies and tools for the specified server. 
    */
  def getServerStrategies(params: GetServerStrategiesRequest): Request[GetServerStrategiesResponse, AWSError] = js.native
  def getServerStrategies(
    params: GetServerStrategiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServerStrategiesResponse, Unit]
  ): Request[GetServerStrategiesResponse, AWSError] = js.native
  
  /**
    *  Retrieves a list of all the application components (processes). 
    */
  def listApplicationComponents(): Request[ListApplicationComponentsResponse, AWSError] = js.native
  def listApplicationComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationComponentsResponse, Unit]): Request[ListApplicationComponentsResponse, AWSError] = js.native
  /**
    *  Retrieves a list of all the application components (processes). 
    */
  def listApplicationComponents(params: ListApplicationComponentsRequest): Request[ListApplicationComponentsResponse, AWSError] = js.native
  def listApplicationComponents(
    params: ListApplicationComponentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationComponentsResponse, Unit]
  ): Request[ListApplicationComponentsResponse, AWSError] = js.native
  
  /**
    *  Retrieves a list of all the installed collectors. 
    */
  def listCollectors(): Request[ListCollectorsResponse, AWSError] = js.native
  def listCollectors(callback: js.Function2[/* err */ AWSError, /* data */ ListCollectorsResponse, Unit]): Request[ListCollectorsResponse, AWSError] = js.native
  /**
    *  Retrieves a list of all the installed collectors. 
    */
  def listCollectors(params: ListCollectorsRequest): Request[ListCollectorsResponse, AWSError] = js.native
  def listCollectors(
    params: ListCollectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCollectorsResponse, Unit]
  ): Request[ListCollectorsResponse, AWSError] = js.native
  
  /**
    *  Retrieves a list of all the imports performed. 
    */
  def listImportFileTask(): Request[ListImportFileTaskResponse, AWSError] = js.native
  def listImportFileTask(callback: js.Function2[/* err */ AWSError, /* data */ ListImportFileTaskResponse, Unit]): Request[ListImportFileTaskResponse, AWSError] = js.native
  /**
    *  Retrieves a list of all the imports performed. 
    */
  def listImportFileTask(params: ListImportFileTaskRequest): Request[ListImportFileTaskResponse, AWSError] = js.native
  def listImportFileTask(
    params: ListImportFileTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImportFileTaskResponse, Unit]
  ): Request[ListImportFileTaskResponse, AWSError] = js.native
  
  /**
    *  Returns a list of all the servers. 
    */
  def listServers(): Request[ListServersResponse, AWSError] = js.native
  def listServers(callback: js.Function2[/* err */ AWSError, /* data */ ListServersResponse, Unit]): Request[ListServersResponse, AWSError] = js.native
  /**
    *  Returns a list of all the servers. 
    */
  def listServers(params: ListServersRequest): Request[ListServersResponse, AWSError] = js.native
  def listServers(
    params: ListServersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServersResponse, Unit]
  ): Request[ListServersResponse, AWSError] = js.native
  
  /**
    *  Saves the specified migration and modernization preferences. 
    */
  def putPortfolioPreferences(): Request[PutPortfolioPreferencesResponse, AWSError] = js.native
  def putPortfolioPreferences(callback: js.Function2[/* err */ AWSError, /* data */ PutPortfolioPreferencesResponse, Unit]): Request[PutPortfolioPreferencesResponse, AWSError] = js.native
  /**
    *  Saves the specified migration and modernization preferences. 
    */
  def putPortfolioPreferences(params: PutPortfolioPreferencesRequest): Request[PutPortfolioPreferencesResponse, AWSError] = js.native
  def putPortfolioPreferences(
    params: PutPortfolioPreferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPortfolioPreferencesResponse, Unit]
  ): Request[PutPortfolioPreferencesResponse, AWSError] = js.native
  
  /**
    *  Starts the assessment of an on-premises environment. 
    */
  def startAssessment(): Request[StartAssessmentResponse, AWSError] = js.native
  def startAssessment(callback: js.Function2[/* err */ AWSError, /* data */ StartAssessmentResponse, Unit]): Request[StartAssessmentResponse, AWSError] = js.native
  /**
    *  Starts the assessment of an on-premises environment. 
    */
  def startAssessment(params: StartAssessmentRequest): Request[StartAssessmentResponse, AWSError] = js.native
  def startAssessment(
    params: StartAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAssessmentResponse, Unit]
  ): Request[StartAssessmentResponse, AWSError] = js.native
  
  /**
    *  Starts a file import. 
    */
  def startImportFileTask(): Request[StartImportFileTaskResponse, AWSError] = js.native
  def startImportFileTask(callback: js.Function2[/* err */ AWSError, /* data */ StartImportFileTaskResponse, Unit]): Request[StartImportFileTaskResponse, AWSError] = js.native
  /**
    *  Starts a file import. 
    */
  def startImportFileTask(params: StartImportFileTaskRequest): Request[StartImportFileTaskResponse, AWSError] = js.native
  def startImportFileTask(
    params: StartImportFileTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartImportFileTaskResponse, Unit]
  ): Request[StartImportFileTaskResponse, AWSError] = js.native
  
  /**
    *  Starts generating a recommendation report. 
    */
  def startRecommendationReportGeneration(): Request[StartRecommendationReportGenerationResponse, AWSError] = js.native
  def startRecommendationReportGeneration(
    callback: js.Function2[/* err */ AWSError, /* data */ StartRecommendationReportGenerationResponse, Unit]
  ): Request[StartRecommendationReportGenerationResponse, AWSError] = js.native
  /**
    *  Starts generating a recommendation report. 
    */
  def startRecommendationReportGeneration(params: StartRecommendationReportGenerationRequest): Request[StartRecommendationReportGenerationResponse, AWSError] = js.native
  def startRecommendationReportGeneration(
    params: StartRecommendationReportGenerationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartRecommendationReportGenerationResponse, Unit]
  ): Request[StartRecommendationReportGenerationResponse, AWSError] = js.native
  
  /**
    *  Stops the assessment of an on-premises environment. 
    */
  def stopAssessment(): Request[StopAssessmentResponse, AWSError] = js.native
  def stopAssessment(callback: js.Function2[/* err */ AWSError, /* data */ StopAssessmentResponse, Unit]): Request[StopAssessmentResponse, AWSError] = js.native
  /**
    *  Stops the assessment of an on-premises environment. 
    */
  def stopAssessment(params: StopAssessmentRequest): Request[StopAssessmentResponse, AWSError] = js.native
  def stopAssessment(
    params: StopAssessmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopAssessmentResponse, Unit]
  ): Request[StopAssessmentResponse, AWSError] = js.native
  
  /**
    *  Updates the configuration of an application component. 
    */
  def updateApplicationComponentConfig(): Request[UpdateApplicationComponentConfigResponse, AWSError] = js.native
  def updateApplicationComponentConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationComponentConfigResponse, Unit]
  ): Request[UpdateApplicationComponentConfigResponse, AWSError] = js.native
  /**
    *  Updates the configuration of an application component. 
    */
  def updateApplicationComponentConfig(params: UpdateApplicationComponentConfigRequest): Request[UpdateApplicationComponentConfigResponse, AWSError] = js.native
  def updateApplicationComponentConfig(
    params: UpdateApplicationComponentConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationComponentConfigResponse, Unit]
  ): Request[UpdateApplicationComponentConfigResponse, AWSError] = js.native
  
  /**
    *  Updates the configuration of the specified server. 
    */
  def updateServerConfig(): Request[UpdateServerConfigResponse, AWSError] = js.native
  def updateServerConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServerConfigResponse, Unit]): Request[UpdateServerConfigResponse, AWSError] = js.native
  /**
    *  Updates the configuration of the specified server. 
    */
  def updateServerConfig(params: UpdateServerConfigRequest): Request[UpdateServerConfigResponse, AWSError] = js.native
  def updateServerConfig(
    params: UpdateServerConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServerConfigResponse, Unit]
  ): Request[UpdateServerConfigResponse, AWSError] = js.native
}
