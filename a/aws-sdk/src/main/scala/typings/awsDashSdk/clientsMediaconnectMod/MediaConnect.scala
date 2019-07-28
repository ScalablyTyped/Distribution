package typings.awsDashSdk.clientsMediaconnectMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConnect extends Service {
  @JSName("config")
  var config_MediaConnect: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds outputs to an existing flow. You can create up to 20 outputs per flow.
    */
  def addFlowOutputs(): Request[AddFlowOutputsResponse, AWSError] = js.native
  def addFlowOutputs(callback: js.Function2[/* err */ AWSError, /* data */ AddFlowOutputsResponse, Unit]): Request[AddFlowOutputsResponse, AWSError] = js.native
  /**
    * Adds outputs to an existing flow. You can create up to 20 outputs per flow.
    */
  def addFlowOutputs(params: AddFlowOutputsRequest): Request[AddFlowOutputsResponse, AWSError] = js.native
  def addFlowOutputs(
    params: AddFlowOutputsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddFlowOutputsResponse, Unit]
  ): Request[AddFlowOutputsResponse, AWSError] = js.native
  /**
    * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50).
    */
  def createFlow(): Request[CreateFlowResponse, AWSError] = js.native
  def createFlow(callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowResponse, Unit]): Request[CreateFlowResponse, AWSError] = js.native
  /**
    * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50).
    */
  def createFlow(params: CreateFlowRequest): Request[CreateFlowResponse, AWSError] = js.native
  def createFlow(
    params: CreateFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowResponse, Unit]
  ): Request[CreateFlowResponse, AWSError] = js.native
  /**
    * Deletes a flow. Before you can delete a flow, you must stop the flow.
    */
  def deleteFlow(): Request[DeleteFlowResponse, AWSError] = js.native
  def deleteFlow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowResponse, Unit]): Request[DeleteFlowResponse, AWSError] = js.native
  /**
    * Deletes a flow. Before you can delete a flow, you must stop the flow.
    */
  def deleteFlow(params: DeleteFlowRequest): Request[DeleteFlowResponse, AWSError] = js.native
  def deleteFlow(
    params: DeleteFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowResponse, Unit]
  ): Request[DeleteFlowResponse, AWSError] = js.native
  /**
    * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as details about the source, outputs, and entitlements.
    */
  def describeFlow(): Request[DescribeFlowResponse, AWSError] = js.native
  def describeFlow(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]): Request[DescribeFlowResponse, AWSError] = js.native
  /**
    * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as details about the source, outputs, and entitlements.
    */
  def describeFlow(params: DescribeFlowRequest): Request[DescribeFlowResponse, AWSError] = js.native
  def describeFlow(
    params: DescribeFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]
  ): Request[DescribeFlowResponse, AWSError] = js.native
  /**
    * Grants entitlements to an existing flow.
    */
  def grantFlowEntitlements(): Request[GrantFlowEntitlementsResponse, AWSError] = js.native
  def grantFlowEntitlements(callback: js.Function2[/* err */ AWSError, /* data */ GrantFlowEntitlementsResponse, Unit]): Request[GrantFlowEntitlementsResponse, AWSError] = js.native
  /**
    * Grants entitlements to an existing flow.
    */
  def grantFlowEntitlements(params: GrantFlowEntitlementsRequest): Request[GrantFlowEntitlementsResponse, AWSError] = js.native
  def grantFlowEntitlements(
    params: GrantFlowEntitlementsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GrantFlowEntitlementsResponse, Unit]
  ): Request[GrantFlowEntitlementsResponse, AWSError] = js.native
  /**
    * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per page.
    */
  def listEntitlements(): Request[ListEntitlementsResponse, AWSError] = js.native
  def listEntitlements(callback: js.Function2[/* err */ AWSError, /* data */ ListEntitlementsResponse, Unit]): Request[ListEntitlementsResponse, AWSError] = js.native
  /**
    * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per page.
    */
  def listEntitlements(params: ListEntitlementsRequest): Request[ListEntitlementsResponse, AWSError] = js.native
  def listEntitlements(
    params: ListEntitlementsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntitlementsResponse, Unit]
  ): Request[ListEntitlementsResponse, AWSError] = js.native
  /**
    * Displays a list of flows that are associated with this account. This request returns a paginated result.
    */
  def listFlows(): Request[ListFlowsResponse, AWSError] = js.native
  def listFlows(callback: js.Function2[/* err */ AWSError, /* data */ ListFlowsResponse, Unit]): Request[ListFlowsResponse, AWSError] = js.native
  /**
    * Displays a list of flows that are associated with this account. This request returns a paginated result.
    */
  def listFlows(params: ListFlowsRequest): Request[ListFlowsResponse, AWSError] = js.native
  def listFlows(
    params: ListFlowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFlowsResponse, Unit]
  ): Request[ListFlowsResponse, AWSError] = js.native
  /**
    * List all tags on an AWS Elemental MediaConnect resource
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List all tags on an AWS Elemental MediaConnect resource
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Removes an output from an existing flow. This request can be made only on an output that does not have an entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When an entitlement is revoked from a flow, the service automatically removes the associated output.
    */
  def removeFlowOutput(): Request[RemoveFlowOutputResponse, AWSError] = js.native
  def removeFlowOutput(callback: js.Function2[/* err */ AWSError, /* data */ RemoveFlowOutputResponse, Unit]): Request[RemoveFlowOutputResponse, AWSError] = js.native
  /**
    * Removes an output from an existing flow. This request can be made only on an output that does not have an entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When an entitlement is revoked from a flow, the service automatically removes the associated output.
    */
  def removeFlowOutput(params: RemoveFlowOutputRequest): Request[RemoveFlowOutputResponse, AWSError] = js.native
  def removeFlowOutput(
    params: RemoveFlowOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveFlowOutputResponse, Unit]
  ): Request[RemoveFlowOutputResponse, AWSError] = js.native
  /**
    * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the subscriber and the associated output is removed.
    */
  def revokeFlowEntitlement(): Request[RevokeFlowEntitlementResponse, AWSError] = js.native
  def revokeFlowEntitlement(callback: js.Function2[/* err */ AWSError, /* data */ RevokeFlowEntitlementResponse, Unit]): Request[RevokeFlowEntitlementResponse, AWSError] = js.native
  /**
    * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the subscriber and the associated output is removed.
    */
  def revokeFlowEntitlement(params: RevokeFlowEntitlementRequest): Request[RevokeFlowEntitlementResponse, AWSError] = js.native
  def revokeFlowEntitlement(
    params: RevokeFlowEntitlementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeFlowEntitlementResponse, Unit]
  ): Request[RevokeFlowEntitlementResponse, AWSError] = js.native
  /**
    * Starts a flow.
    */
  def startFlow(): Request[StartFlowResponse, AWSError] = js.native
  def startFlow(callback: js.Function2[/* err */ AWSError, /* data */ StartFlowResponse, Unit]): Request[StartFlowResponse, AWSError] = js.native
  /**
    * Starts a flow.
    */
  def startFlow(params: StartFlowRequest): Request[StartFlowResponse, AWSError] = js.native
  def startFlow(
    params: StartFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFlowResponse, Unit]
  ): Request[StartFlowResponse, AWSError] = js.native
  /**
    * Stops a flow.
    */
  def stopFlow(): Request[StopFlowResponse, AWSError] = js.native
  def stopFlow(callback: js.Function2[/* err */ AWSError, /* data */ StopFlowResponse, Unit]): Request[StopFlowResponse, AWSError] = js.native
  /**
    * Stops a flow.
    */
  def stopFlow(params: StopFlowRequest): Request[StopFlowResponse, AWSError] = js.native
  def stopFlow(
    params: StopFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopFlowResponse, Unit]
  ): Request[StopFlowResponse, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the service will remove the outputs that are are used by the subscribers that are removed.
    */
  def updateFlowEntitlement(): Request[UpdateFlowEntitlementResponse, AWSError] = js.native
  def updateFlowEntitlement(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowEntitlementResponse, Unit]): Request[UpdateFlowEntitlementResponse, AWSError] = js.native
  /**
    * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the service will remove the outputs that are are used by the subscribers that are removed.
    */
  def updateFlowEntitlement(params: UpdateFlowEntitlementRequest): Request[UpdateFlowEntitlementResponse, AWSError] = js.native
  def updateFlowEntitlement(
    params: UpdateFlowEntitlementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowEntitlementResponse, Unit]
  ): Request[UpdateFlowEntitlementResponse, AWSError] = js.native
  /**
    * Updates an existing flow output.
    */
  def updateFlowOutput(): Request[UpdateFlowOutputResponse, AWSError] = js.native
  def updateFlowOutput(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowOutputResponse, Unit]): Request[UpdateFlowOutputResponse, AWSError] = js.native
  /**
    * Updates an existing flow output.
    */
  def updateFlowOutput(params: UpdateFlowOutputRequest): Request[UpdateFlowOutputResponse, AWSError] = js.native
  def updateFlowOutput(
    params: UpdateFlowOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowOutputResponse, Unit]
  ): Request[UpdateFlowOutputResponse, AWSError] = js.native
  /**
    * Updates the source of a flow.
    */
  def updateFlowSource(): Request[UpdateFlowSourceResponse, AWSError] = js.native
  def updateFlowSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowSourceResponse, Unit]): Request[UpdateFlowSourceResponse, AWSError] = js.native
  /**
    * Updates the source of a flow.
    */
  def updateFlowSource(params: UpdateFlowSourceRequest): Request[UpdateFlowSourceResponse, AWSError] = js.native
  def updateFlowSource(
    params: UpdateFlowSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowSourceResponse, Unit]
  ): Request[UpdateFlowSourceResponse, AWSError] = js.native
}

