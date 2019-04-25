package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConnect
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaConnect: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds outputs to an existing flow. You can create up to 20 outputs per flow.
    */
  def addFlowOutputs(): awsDashSdkLib.libRequestMod.Request[AddFlowOutputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addFlowOutputs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddFlowOutputsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddFlowOutputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds outputs to an existing flow. You can create up to 20 outputs per flow.
    */
  def addFlowOutputs(params: AddFlowOutputsRequest): awsDashSdkLib.libRequestMod.Request[AddFlowOutputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addFlowOutputs(
    params: AddFlowOutputsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddFlowOutputsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddFlowOutputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50).
    */
  def createFlow(): awsDashSdkLib.libRequestMod.Request[CreateFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50).
    */
  def createFlow(params: CreateFlowRequest): awsDashSdkLib.libRequestMod.Request[CreateFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFlow(
    params: CreateFlowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a flow. Before you can delete a flow, you must stop the flow.
    */
  def deleteFlow(): awsDashSdkLib.libRequestMod.Request[DeleteFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a flow. Before you can delete a flow, you must stop the flow.
    */
  def deleteFlow(params: DeleteFlowRequest): awsDashSdkLib.libRequestMod.Request[DeleteFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFlow(
    params: DeleteFlowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as details about the source, outputs, and entitlements.
    */
  def describeFlow(): awsDashSdkLib.libRequestMod.Request[DescribeFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as details about the source, outputs, and entitlements.
    */
  def describeFlow(params: DescribeFlowRequest): awsDashSdkLib.libRequestMod.Request[DescribeFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFlow(
    params: DescribeFlowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Grants entitlements to an existing flow.
    */
  def grantFlowEntitlements(): awsDashSdkLib.libRequestMod.Request[GrantFlowEntitlementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def grantFlowEntitlements(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GrantFlowEntitlementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GrantFlowEntitlementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Grants entitlements to an existing flow.
    */
  def grantFlowEntitlements(params: GrantFlowEntitlementsRequest): awsDashSdkLib.libRequestMod.Request[GrantFlowEntitlementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def grantFlowEntitlements(
    params: GrantFlowEntitlementsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GrantFlowEntitlementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GrantFlowEntitlementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per page.
    */
  def listEntitlements(): awsDashSdkLib.libRequestMod.Request[ListEntitlementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEntitlements(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEntitlementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEntitlementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per page.
    */
  def listEntitlements(params: ListEntitlementsRequest): awsDashSdkLib.libRequestMod.Request[ListEntitlementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEntitlements(
    params: ListEntitlementsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEntitlementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEntitlementsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays a list of flows that are associated with this account. This request returns a paginated result.
    */
  def listFlows(): awsDashSdkLib.libRequestMod.Request[ListFlowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFlows(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFlowsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFlowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Displays a list of flows that are associated with this account. This request returns a paginated result.
    */
  def listFlows(params: ListFlowsRequest): awsDashSdkLib.libRequestMod.Request[ListFlowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFlows(
    params: ListFlowsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFlowsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFlowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all tags on an AWS Elemental MediaConnect resource
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all tags on an AWS Elemental MediaConnect resource
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes an output from an existing flow. This request can be made only on an output that does not have an entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When an entitlement is revoked from a flow, the service automatically removes the associated output.
    */
  def removeFlowOutput(): awsDashSdkLib.libRequestMod.Request[RemoveFlowOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeFlowOutput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveFlowOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveFlowOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes an output from an existing flow. This request can be made only on an output that does not have an entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When an entitlement is revoked from a flow, the service automatically removes the associated output.
    */
  def removeFlowOutput(params: RemoveFlowOutputRequest): awsDashSdkLib.libRequestMod.Request[RemoveFlowOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeFlowOutput(
    params: RemoveFlowOutputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveFlowOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveFlowOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the subscriber and the associated output is removed.
    */
  def revokeFlowEntitlement(): awsDashSdkLib.libRequestMod.Request[RevokeFlowEntitlementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def revokeFlowEntitlement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RevokeFlowEntitlementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RevokeFlowEntitlementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the subscriber and the associated output is removed.
    */
  def revokeFlowEntitlement(params: RevokeFlowEntitlementRequest): awsDashSdkLib.libRequestMod.Request[RevokeFlowEntitlementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def revokeFlowEntitlement(
    params: RevokeFlowEntitlementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RevokeFlowEntitlementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RevokeFlowEntitlementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a flow.
    */
  def startFlow(): awsDashSdkLib.libRequestMod.Request[StartFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a flow.
    */
  def startFlow(params: StartFlowRequest): awsDashSdkLib.libRequestMod.Request[StartFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startFlow(
    params: StartFlowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a flow.
    */
  def stopFlow(): awsDashSdkLib.libRequestMod.Request[StopFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a flow.
    */
  def stopFlow(params: StopFlowRequest): awsDashSdkLib.libRequestMod.Request[StopFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopFlow(
    params: StopFlowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopFlowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the service will remove the outputs that are are used by the subscribers that are removed.
    */
  def updateFlowEntitlement(): awsDashSdkLib.libRequestMod.Request[UpdateFlowEntitlementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFlowEntitlement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFlowEntitlementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFlowEntitlementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the service will remove the outputs that are are used by the subscribers that are removed.
    */
  def updateFlowEntitlement(params: UpdateFlowEntitlementRequest): awsDashSdkLib.libRequestMod.Request[UpdateFlowEntitlementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFlowEntitlement(
    params: UpdateFlowEntitlementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFlowEntitlementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFlowEntitlementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing flow output.
    */
  def updateFlowOutput(): awsDashSdkLib.libRequestMod.Request[UpdateFlowOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFlowOutput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFlowOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFlowOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing flow output.
    */
  def updateFlowOutput(params: UpdateFlowOutputRequest): awsDashSdkLib.libRequestMod.Request[UpdateFlowOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFlowOutput(
    params: UpdateFlowOutputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFlowOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFlowOutputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the source of a flow.
    */
  def updateFlowSource(): awsDashSdkLib.libRequestMod.Request[UpdateFlowSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFlowSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFlowSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFlowSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the source of a flow.
    */
  def updateFlowSource(params: UpdateFlowSourceRequest): awsDashSdkLib.libRequestMod.Request[UpdateFlowSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFlowSource(
    params: UpdateFlowSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFlowSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFlowSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

