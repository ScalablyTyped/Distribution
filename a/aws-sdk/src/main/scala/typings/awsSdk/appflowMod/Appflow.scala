package typings.awsSdk.appflowMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appflow extends Service {
  
  @JSName("config")
  var config_Appflow: ConfigBase with ClientConfiguration = js.native
  
  /**
    *  Creates a new connector profile associated with your AWS account. There is a soft quota of 100 connector profiles per AWS account. If you need more connector profiles than this quota allows, you can submit a request to the Amazon AppFlow team through the Amazon AppFlow support channel. 
    */
  def createConnectorProfile(): Request[CreateConnectorProfileResponse, AWSError] = js.native
  def createConnectorProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectorProfileResponse, Unit]): Request[CreateConnectorProfileResponse, AWSError] = js.native
  /**
    *  Creates a new connector profile associated with your AWS account. There is a soft quota of 100 connector profiles per AWS account. If you need more connector profiles than this quota allows, you can submit a request to the Amazon AppFlow team through the Amazon AppFlow support channel. 
    */
  def createConnectorProfile(params: CreateConnectorProfileRequest): Request[CreateConnectorProfileResponse, AWSError] = js.native
  def createConnectorProfile(
    params: CreateConnectorProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConnectorProfileResponse, Unit]
  ): Request[CreateConnectorProfileResponse, AWSError] = js.native
  
  /**
    *  Enables your application to create a new flow using Amazon AppFlow. You must create a connector profile before calling this API. Please note that the Request Syntax below shows syntax for multiple destinations, however, you can only transfer data to one item in this list at a time. Amazon AppFlow does not currently support flows to multiple destinations at once. 
    */
  def createFlow(): Request[CreateFlowResponse, AWSError] = js.native
  def createFlow(callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowResponse, Unit]): Request[CreateFlowResponse, AWSError] = js.native
  /**
    *  Enables your application to create a new flow using Amazon AppFlow. You must create a connector profile before calling this API. Please note that the Request Syntax below shows syntax for multiple destinations, however, you can only transfer data to one item in this list at a time. Amazon AppFlow does not currently support flows to multiple destinations at once. 
    */
  def createFlow(params: CreateFlowRequest): Request[CreateFlowResponse, AWSError] = js.native
  def createFlow(
    params: CreateFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowResponse, Unit]
  ): Request[CreateFlowResponse, AWSError] = js.native
  
  /**
    *  Enables you to delete an existing connector profile. 
    */
  def deleteConnectorProfile(): Request[DeleteConnectorProfileResponse, AWSError] = js.native
  def deleteConnectorProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectorProfileResponse, Unit]): Request[DeleteConnectorProfileResponse, AWSError] = js.native
  /**
    *  Enables you to delete an existing connector profile. 
    */
  def deleteConnectorProfile(params: DeleteConnectorProfileRequest): Request[DeleteConnectorProfileResponse, AWSError] = js.native
  def deleteConnectorProfile(
    params: DeleteConnectorProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConnectorProfileResponse, Unit]
  ): Request[DeleteConnectorProfileResponse, AWSError] = js.native
  
  /**
    *  Enables your application to delete an existing flow. Before deleting the flow, Amazon AppFlow validates the request by checking the flow configuration and status. You can delete flows one at a time. 
    */
  def deleteFlow(): Request[DeleteFlowResponse, AWSError] = js.native
  def deleteFlow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowResponse, Unit]): Request[DeleteFlowResponse, AWSError] = js.native
  /**
    *  Enables your application to delete an existing flow. Before deleting the flow, Amazon AppFlow validates the request by checking the flow configuration and status. You can delete flows one at a time. 
    */
  def deleteFlow(params: DeleteFlowRequest): Request[DeleteFlowResponse, AWSError] = js.native
  def deleteFlow(
    params: DeleteFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowResponse, Unit]
  ): Request[DeleteFlowResponse, AWSError] = js.native
  
  /**
    *  Provides details regarding the entity used with the connector, with a description of the data model for each entity. 
    */
  def describeConnectorEntity(): Request[DescribeConnectorEntityResponse, AWSError] = js.native
  def describeConnectorEntity(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectorEntityResponse, Unit]): Request[DescribeConnectorEntityResponse, AWSError] = js.native
  /**
    *  Provides details regarding the entity used with the connector, with a description of the data model for each entity. 
    */
  def describeConnectorEntity(params: DescribeConnectorEntityRequest): Request[DescribeConnectorEntityResponse, AWSError] = js.native
  def describeConnectorEntity(
    params: DescribeConnectorEntityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectorEntityResponse, Unit]
  ): Request[DescribeConnectorEntityResponse, AWSError] = js.native
  
  /**
    *  Returns a list of connector-profile details matching the provided connector-profile names and connector-types. Both input lists are optional, and you can use them to filter the result.  If no names or connector-types are provided, returns all connector profiles in a paginated form. If there is no match, this operation returns an empty list.
    */
  def describeConnectorProfiles(): Request[DescribeConnectorProfilesResponse, AWSError] = js.native
  def describeConnectorProfiles(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectorProfilesResponse, Unit]): Request[DescribeConnectorProfilesResponse, AWSError] = js.native
  /**
    *  Returns a list of connector-profile details matching the provided connector-profile names and connector-types. Both input lists are optional, and you can use them to filter the result.  If no names or connector-types are provided, returns all connector profiles in a paginated form. If there is no match, this operation returns an empty list.
    */
  def describeConnectorProfiles(params: DescribeConnectorProfilesRequest): Request[DescribeConnectorProfilesResponse, AWSError] = js.native
  def describeConnectorProfiles(
    params: DescribeConnectorProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectorProfilesResponse, Unit]
  ): Request[DescribeConnectorProfilesResponse, AWSError] = js.native
  
  /**
    *  Describes the connectors vended by Amazon AppFlow for specified connector types. If you don't specify a connector type, this operation describes all connectors vended by Amazon AppFlow. If there are more connectors than can be returned in one page, the response contains a nextToken object, which can be be passed in to the next call to the DescribeConnectors API operation to retrieve the next page. 
    */
  def describeConnectors(): Request[DescribeConnectorsResponse, AWSError] = js.native
  def describeConnectors(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectorsResponse, Unit]): Request[DescribeConnectorsResponse, AWSError] = js.native
  /**
    *  Describes the connectors vended by Amazon AppFlow for specified connector types. If you don't specify a connector type, this operation describes all connectors vended by Amazon AppFlow. If there are more connectors than can be returned in one page, the response contains a nextToken object, which can be be passed in to the next call to the DescribeConnectors API operation to retrieve the next page. 
    */
  def describeConnectors(params: DescribeConnectorsRequest): Request[DescribeConnectorsResponse, AWSError] = js.native
  def describeConnectors(
    params: DescribeConnectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConnectorsResponse, Unit]
  ): Request[DescribeConnectorsResponse, AWSError] = js.native
  
  /**
    *  Provides a description of the specified flow. 
    */
  def describeFlow(): Request[DescribeFlowResponse, AWSError] = js.native
  def describeFlow(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]): Request[DescribeFlowResponse, AWSError] = js.native
  /**
    *  Provides a description of the specified flow. 
    */
  def describeFlow(params: DescribeFlowRequest): Request[DescribeFlowResponse, AWSError] = js.native
  def describeFlow(
    params: DescribeFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]
  ): Request[DescribeFlowResponse, AWSError] = js.native
  
  /**
    *  Fetches the execution history of the flow. 
    */
  def describeFlowExecutionRecords(): Request[DescribeFlowExecutionRecordsResponse, AWSError] = js.native
  def describeFlowExecutionRecords(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowExecutionRecordsResponse, Unit]): Request[DescribeFlowExecutionRecordsResponse, AWSError] = js.native
  /**
    *  Fetches the execution history of the flow. 
    */
  def describeFlowExecutionRecords(params: DescribeFlowExecutionRecordsRequest): Request[DescribeFlowExecutionRecordsResponse, AWSError] = js.native
  def describeFlowExecutionRecords(
    params: DescribeFlowExecutionRecordsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowExecutionRecordsResponse, Unit]
  ): Request[DescribeFlowExecutionRecordsResponse, AWSError] = js.native
  
  /**
    *  Returns the list of available connector entities supported by Amazon AppFlow. For example, you can query Salesforce for Account and Opportunity entities, or query ServiceNow for the Incident entity. 
    */
  def listConnectorEntities(): Request[ListConnectorEntitiesResponse, AWSError] = js.native
  def listConnectorEntities(callback: js.Function2[/* err */ AWSError, /* data */ ListConnectorEntitiesResponse, Unit]): Request[ListConnectorEntitiesResponse, AWSError] = js.native
  /**
    *  Returns the list of available connector entities supported by Amazon AppFlow. For example, you can query Salesforce for Account and Opportunity entities, or query ServiceNow for the Incident entity. 
    */
  def listConnectorEntities(params: ListConnectorEntitiesRequest): Request[ListConnectorEntitiesResponse, AWSError] = js.native
  def listConnectorEntities(
    params: ListConnectorEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConnectorEntitiesResponse, Unit]
  ): Request[ListConnectorEntitiesResponse, AWSError] = js.native
  
  /**
    *  Lists all of the flows associated with your account. 
    */
  def listFlows(): Request[ListFlowsResponse, AWSError] = js.native
  def listFlows(callback: js.Function2[/* err */ AWSError, /* data */ ListFlowsResponse, Unit]): Request[ListFlowsResponse, AWSError] = js.native
  /**
    *  Lists all of the flows associated with your account. 
    */
  def listFlows(params: ListFlowsRequest): Request[ListFlowsResponse, AWSError] = js.native
  def listFlows(
    params: ListFlowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFlowsResponse, Unit]
  ): Request[ListFlowsResponse, AWSError] = js.native
  
  /**
    *  Retrieves the tags that are associated with a specified flow. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  Retrieves the tags that are associated with a specified flow. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    *  Activates an existing flow. For on-demand flows, this operation runs the flow immediately. For schedule and event-triggered flows, this operation activates the flow. 
    */
  def startFlow(): Request[StartFlowResponse, AWSError] = js.native
  def startFlow(callback: js.Function2[/* err */ AWSError, /* data */ StartFlowResponse, Unit]): Request[StartFlowResponse, AWSError] = js.native
  /**
    *  Activates an existing flow. For on-demand flows, this operation runs the flow immediately. For schedule and event-triggered flows, this operation activates the flow. 
    */
  def startFlow(params: StartFlowRequest): Request[StartFlowResponse, AWSError] = js.native
  def startFlow(
    params: StartFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFlowResponse, Unit]
  ): Request[StartFlowResponse, AWSError] = js.native
  
  /**
    *  Deactivates the existing flow. For on-demand flows, this operation returns an unsupportedOperationException error message. For schedule and event-triggered flows, this operation deactivates the flow. 
    */
  def stopFlow(): Request[StopFlowResponse, AWSError] = js.native
  def stopFlow(callback: js.Function2[/* err */ AWSError, /* data */ StopFlowResponse, Unit]): Request[StopFlowResponse, AWSError] = js.native
  /**
    *  Deactivates the existing flow. For on-demand flows, this operation returns an unsupportedOperationException error message. For schedule and event-triggered flows, this operation deactivates the flow. 
    */
  def stopFlow(params: StopFlowRequest): Request[StopFlowResponse, AWSError] = js.native
  def stopFlow(
    params: StopFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopFlowResponse, Unit]
  ): Request[StopFlowResponse, AWSError] = js.native
  
  /**
    *  Applies a tag to the specified flow. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Applies a tag to the specified flow. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    *  Removes a tag from the specified flow. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Removes a tag from the specified flow. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    *  Updates a given connector profile associated with your account. 
    */
  def updateConnectorProfile(): Request[UpdateConnectorProfileResponse, AWSError] = js.native
  def updateConnectorProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectorProfileResponse, Unit]): Request[UpdateConnectorProfileResponse, AWSError] = js.native
  /**
    *  Updates a given connector profile associated with your account. 
    */
  def updateConnectorProfile(params: UpdateConnectorProfileRequest): Request[UpdateConnectorProfileResponse, AWSError] = js.native
  def updateConnectorProfile(
    params: UpdateConnectorProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectorProfileResponse, Unit]
  ): Request[UpdateConnectorProfileResponse, AWSError] = js.native
  
  /**
    *  Updates an existing flow. 
    */
  def updateFlow(): Request[UpdateFlowResponse, AWSError] = js.native
  def updateFlow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowResponse, Unit]): Request[UpdateFlowResponse, AWSError] = js.native
  /**
    *  Updates an existing flow. 
    */
  def updateFlow(params: UpdateFlowRequest): Request[UpdateFlowResponse, AWSError] = js.native
  def updateFlow(
    params: UpdateFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowResponse, Unit]
  ): Request[UpdateFlowResponse, AWSError] = js.native
}
