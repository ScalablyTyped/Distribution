package typings.awsSdk.clientsIotdeviceadvisorMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotDeviceAdvisor extends Service {
  
  @JSName("config")
  var config_IotDeviceAdvisor: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a Device Advisor test suite. Requires permission to access the CreateSuiteDefinition action.
    */
  def createSuiteDefinition(): Request[CreateSuiteDefinitionResponse, AWSError] = js.native
  def createSuiteDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateSuiteDefinitionResponse, Unit]): Request[CreateSuiteDefinitionResponse, AWSError] = js.native
  /**
    * Creates a Device Advisor test suite. Requires permission to access the CreateSuiteDefinition action.
    */
  def createSuiteDefinition(params: CreateSuiteDefinitionRequest): Request[CreateSuiteDefinitionResponse, AWSError] = js.native
  def createSuiteDefinition(
    params: CreateSuiteDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSuiteDefinitionResponse, Unit]
  ): Request[CreateSuiteDefinitionResponse, AWSError] = js.native
  
  /**
    * Deletes a Device Advisor test suite. Requires permission to access the DeleteSuiteDefinition action.
    */
  def deleteSuiteDefinition(): Request[DeleteSuiteDefinitionResponse, AWSError] = js.native
  def deleteSuiteDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSuiteDefinitionResponse, Unit]): Request[DeleteSuiteDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a Device Advisor test suite. Requires permission to access the DeleteSuiteDefinition action.
    */
  def deleteSuiteDefinition(params: DeleteSuiteDefinitionRequest): Request[DeleteSuiteDefinitionResponse, AWSError] = js.native
  def deleteSuiteDefinition(
    params: DeleteSuiteDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSuiteDefinitionResponse, Unit]
  ): Request[DeleteSuiteDefinitionResponse, AWSError] = js.native
  
  /**
    * Gets information about an Device Advisor endpoint.
    */
  def getEndpoint(): Request[GetEndpointResponse, AWSError] = js.native
  def getEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ GetEndpointResponse, Unit]): Request[GetEndpointResponse, AWSError] = js.native
  /**
    * Gets information about an Device Advisor endpoint.
    */
  def getEndpoint(params: GetEndpointRequest): Request[GetEndpointResponse, AWSError] = js.native
  def getEndpoint(
    params: GetEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEndpointResponse, Unit]
  ): Request[GetEndpointResponse, AWSError] = js.native
  
  /**
    * Gets information about a Device Advisor test suite. Requires permission to access the GetSuiteDefinition action.
    */
  def getSuiteDefinition(): Request[GetSuiteDefinitionResponse, AWSError] = js.native
  def getSuiteDefinition(callback: js.Function2[/* err */ AWSError, /* data */ GetSuiteDefinitionResponse, Unit]): Request[GetSuiteDefinitionResponse, AWSError] = js.native
  /**
    * Gets information about a Device Advisor test suite. Requires permission to access the GetSuiteDefinition action.
    */
  def getSuiteDefinition(params: GetSuiteDefinitionRequest): Request[GetSuiteDefinitionResponse, AWSError] = js.native
  def getSuiteDefinition(
    params: GetSuiteDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSuiteDefinitionResponse, Unit]
  ): Request[GetSuiteDefinitionResponse, AWSError] = js.native
  
  /**
    * Gets information about a Device Advisor test suite run. Requires permission to access the GetSuiteRun action.
    */
  def getSuiteRun(): Request[GetSuiteRunResponse, AWSError] = js.native
  def getSuiteRun(callback: js.Function2[/* err */ AWSError, /* data */ GetSuiteRunResponse, Unit]): Request[GetSuiteRunResponse, AWSError] = js.native
  /**
    * Gets information about a Device Advisor test suite run. Requires permission to access the GetSuiteRun action.
    */
  def getSuiteRun(params: GetSuiteRunRequest): Request[GetSuiteRunResponse, AWSError] = js.native
  def getSuiteRun(
    params: GetSuiteRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSuiteRunResponse, Unit]
  ): Request[GetSuiteRunResponse, AWSError] = js.native
  
  /**
    * Gets a report download link for a successful Device Advisor qualifying test suite run. Requires permission to access the GetSuiteRunReport action.
    */
  def getSuiteRunReport(): Request[GetSuiteRunReportResponse, AWSError] = js.native
  def getSuiteRunReport(callback: js.Function2[/* err */ AWSError, /* data */ GetSuiteRunReportResponse, Unit]): Request[GetSuiteRunReportResponse, AWSError] = js.native
  /**
    * Gets a report download link for a successful Device Advisor qualifying test suite run. Requires permission to access the GetSuiteRunReport action.
    */
  def getSuiteRunReport(params: GetSuiteRunReportRequest): Request[GetSuiteRunReportResponse, AWSError] = js.native
  def getSuiteRunReport(
    params: GetSuiteRunReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSuiteRunReportResponse, Unit]
  ): Request[GetSuiteRunReportResponse, AWSError] = js.native
  
  /**
    * Lists the Device Advisor test suites you have created. Requires permission to access the ListSuiteDefinitions action.
    */
  def listSuiteDefinitions(): Request[ListSuiteDefinitionsResponse, AWSError] = js.native
  def listSuiteDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListSuiteDefinitionsResponse, Unit]): Request[ListSuiteDefinitionsResponse, AWSError] = js.native
  /**
    * Lists the Device Advisor test suites you have created. Requires permission to access the ListSuiteDefinitions action.
    */
  def listSuiteDefinitions(params: ListSuiteDefinitionsRequest): Request[ListSuiteDefinitionsResponse, AWSError] = js.native
  def listSuiteDefinitions(
    params: ListSuiteDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSuiteDefinitionsResponse, Unit]
  ): Request[ListSuiteDefinitionsResponse, AWSError] = js.native
  
  /**
    * Lists runs of the specified Device Advisor test suite. You can list all runs of the test suite, or the runs of a specific version of the test suite. Requires permission to access the ListSuiteRuns action.
    */
  def listSuiteRuns(): Request[ListSuiteRunsResponse, AWSError] = js.native
  def listSuiteRuns(callback: js.Function2[/* err */ AWSError, /* data */ ListSuiteRunsResponse, Unit]): Request[ListSuiteRunsResponse, AWSError] = js.native
  /**
    * Lists runs of the specified Device Advisor test suite. You can list all runs of the test suite, or the runs of a specific version of the test suite. Requires permission to access the ListSuiteRuns action.
    */
  def listSuiteRuns(params: ListSuiteRunsRequest): Request[ListSuiteRunsResponse, AWSError] = js.native
  def listSuiteRuns(
    params: ListSuiteRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSuiteRunsResponse, Unit]
  ): Request[ListSuiteRunsResponse, AWSError] = js.native
  
  /**
    * Lists the tags attached to an IoT Device Advisor resource. Requires permission to access the ListTagsForResource action.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags attached to an IoT Device Advisor resource. Requires permission to access the ListTagsForResource action.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Starts a Device Advisor test suite run. Requires permission to access the StartSuiteRun action.
    */
  def startSuiteRun(): Request[StartSuiteRunResponse, AWSError] = js.native
  def startSuiteRun(callback: js.Function2[/* err */ AWSError, /* data */ StartSuiteRunResponse, Unit]): Request[StartSuiteRunResponse, AWSError] = js.native
  /**
    * Starts a Device Advisor test suite run. Requires permission to access the StartSuiteRun action.
    */
  def startSuiteRun(params: StartSuiteRunRequest): Request[StartSuiteRunResponse, AWSError] = js.native
  def startSuiteRun(
    params: StartSuiteRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSuiteRunResponse, Unit]
  ): Request[StartSuiteRunResponse, AWSError] = js.native
  
  /**
    * Stops a Device Advisor test suite run that is currently running. Requires permission to access the StopSuiteRun action.
    */
  def stopSuiteRun(): Request[StopSuiteRunResponse, AWSError] = js.native
  def stopSuiteRun(callback: js.Function2[/* err */ AWSError, /* data */ StopSuiteRunResponse, Unit]): Request[StopSuiteRunResponse, AWSError] = js.native
  /**
    * Stops a Device Advisor test suite run that is currently running. Requires permission to access the StopSuiteRun action.
    */
  def stopSuiteRun(params: StopSuiteRunRequest): Request[StopSuiteRunResponse, AWSError] = js.native
  def stopSuiteRun(
    params: StopSuiteRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopSuiteRunResponse, Unit]
  ): Request[StopSuiteRunResponse, AWSError] = js.native
  
  /**
    * Adds to and modifies existing tags of an IoT Device Advisor resource. Requires permission to access the TagResource action.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds to and modifies existing tags of an IoT Device Advisor resource. Requires permission to access the TagResource action.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from an IoT Device Advisor resource. Requires permission to access the UntagResource action.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from an IoT Device Advisor resource. Requires permission to access the UntagResource action.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a Device Advisor test suite. Requires permission to access the UpdateSuiteDefinition action.
    */
  def updateSuiteDefinition(): Request[UpdateSuiteDefinitionResponse, AWSError] = js.native
  def updateSuiteDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSuiteDefinitionResponse, Unit]): Request[UpdateSuiteDefinitionResponse, AWSError] = js.native
  /**
    * Updates a Device Advisor test suite. Requires permission to access the UpdateSuiteDefinition action.
    */
  def updateSuiteDefinition(params: UpdateSuiteDefinitionRequest): Request[UpdateSuiteDefinitionResponse, AWSError] = js.native
  def updateSuiteDefinition(
    params: UpdateSuiteDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSuiteDefinitionResponse, Unit]
  ): Request[UpdateSuiteDefinitionResponse, AWSError] = js.native
}
