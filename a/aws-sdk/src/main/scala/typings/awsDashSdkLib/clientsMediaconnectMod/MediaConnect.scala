package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConnect
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaConnect: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ClientConfiguration = js.native
  /**
    * Adds outputs to an existing flow. You can create up to 20 outputs per flow.
    */
  def addFlowOutputs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.AddFlowOutputsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addFlowOutputs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.AddFlowOutputsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.AddFlowOutputsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds outputs to an existing flow. You can create up to 20 outputs per flow.
    */
  def addFlowOutputs(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.AddFlowOutputsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.AddFlowOutputsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addFlowOutputs(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.AddFlowOutputsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.AddFlowOutputsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.AddFlowOutputsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50).
    */
  def createFlow(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.CreateFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.CreateFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.CreateFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50).
    */
  def createFlow(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.CreateFlowRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.CreateFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFlow(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.CreateFlowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.CreateFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.CreateFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a flow. Before you can delete a flow, you must stop the flow.
    */
  def deleteFlow(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DeleteFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DeleteFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DeleteFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a flow. Before you can delete a flow, you must stop the flow.
    */
  def deleteFlow(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DeleteFlowRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DeleteFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFlow(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DeleteFlowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DeleteFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DeleteFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as details about the source, outputs, and entitlements.
    */
  def describeFlow(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DescribeFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DescribeFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DescribeFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as details about the source, outputs, and entitlements.
    */
  def describeFlow(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DescribeFlowRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DescribeFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFlow(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DescribeFlowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DescribeFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.DescribeFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Grants entitlements to an existing flow.
    */
  def grantFlowEntitlements(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.GrantFlowEntitlementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def grantFlowEntitlements(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.GrantFlowEntitlementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.GrantFlowEntitlementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Grants entitlements to an existing flow.
    */
  def grantFlowEntitlements(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.GrantFlowEntitlementsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.GrantFlowEntitlementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def grantFlowEntitlements(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.GrantFlowEntitlementsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.GrantFlowEntitlementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.GrantFlowEntitlementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per page.
    */
  def listEntitlements(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListEntitlementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEntitlements(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListEntitlementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListEntitlementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per page.
    */
  def listEntitlements(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListEntitlementsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListEntitlementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEntitlements(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListEntitlementsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListEntitlementsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListEntitlementsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays a list of flows that are associated with this account. This request returns a paginated result.
    */
  def listFlows(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListFlowsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFlows(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListFlowsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListFlowsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays a list of flows that are associated with this account. This request returns a paginated result.
    */
  def listFlows(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListFlowsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListFlowsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFlows(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListFlowsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListFlowsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListFlowsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags associated with the resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all tags associated with the resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes an output from an existing flow. This request can be made only on an output that does not have an entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When an entitlement is revoked from a flow, the service automatically removes the associated output.
    */
  def removeFlowOutput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RemoveFlowOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeFlowOutput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RemoveFlowOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RemoveFlowOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes an output from an existing flow. This request can be made only on an output that does not have an entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When an entitlement is revoked from a flow, the service automatically removes the associated output.
    */
  def removeFlowOutput(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RemoveFlowOutputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RemoveFlowOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeFlowOutput(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RemoveFlowOutputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RemoveFlowOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RemoveFlowOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the subscriber and the associated output is removed.
    */
  def revokeFlowEntitlement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RevokeFlowEntitlementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def revokeFlowEntitlement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RevokeFlowEntitlementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RevokeFlowEntitlementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the subscriber and the associated output is removed.
    */
  def revokeFlowEntitlement(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RevokeFlowEntitlementRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RevokeFlowEntitlementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def revokeFlowEntitlement(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RevokeFlowEntitlementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RevokeFlowEntitlementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.RevokeFlowEntitlementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a flow.
    */
  def startFlow(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StartFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StartFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StartFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a flow.
    */
  def startFlow(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StartFlowRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StartFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startFlow(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StartFlowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StartFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StartFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a flow.
    */
  def stopFlow(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StopFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StopFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StopFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a flow.
    */
  def stopFlow(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StopFlowRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StopFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopFlow(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StopFlowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StopFlowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.StopFlowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified tags to a resource. If the request does not mention an existing tag associated with the resource, that tag is not changed.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified tags to a resource. If the request does not mention an existing tag associated with the resource, that tag is not changed.
    */
  def tagResource(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified tags from a resource.
    */
  def untagResource(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the service will remove the outputs that are are used by the subscribers that are removed.
    */
  def updateFlowEntitlement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowEntitlementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFlowEntitlement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowEntitlementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowEntitlementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the service will remove the outputs that are are used by the subscribers that are removed.
    */
  def updateFlowEntitlement(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowEntitlementRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowEntitlementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFlowEntitlement(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowEntitlementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowEntitlementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowEntitlementResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing flow output.
    */
  def updateFlowOutput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFlowOutput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing flow output.
    */
  def updateFlowOutput(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowOutputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFlowOutput(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowOutputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the source of a flow.
    */
  def updateFlowSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFlowSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the source of a flow.
    */
  def updateFlowSource(params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowSourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFlowSource(
    params: awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediaconnectMod.MediaConnectNs.UpdateFlowSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

