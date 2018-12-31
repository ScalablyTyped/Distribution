package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/mediaconnect", "MediaConnect")
@js.native
object MediaConnectNs extends js.Object {
  trait AddFlowOutputsRequest extends js.Object {
    /**
      * The flow that you want to add outputs to.
      */
    var FlowArn: __string
    /**
      * A list of outputs that you want to add.
      */
    var Outputs: __listOfAddOutputRequest
  }
  
  trait AddFlowOutputsResponse extends js.Object {
    /**
      * The ARN of the flow that these outputs were added to.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
    /**
      * The details of the newly added outputs.
      */
    var Outputs: js.UndefOr[__listOfOutput] = js.undefined
  }
  
  trait AddOutputRequest extends js.Object {
    /**
      * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The IP address from which video will be sent to output destinations.
      */
    var Destination: __string
    /**
      * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
      */
    var Encryption: js.UndefOr[Encryption] = js.undefined
    /**
      * The maximum latency in milliseconds for Zixi-based streams.
      */
    var MaxLatency: js.UndefOr[__integer] = js.undefined
    /**
      * The name of the output. This value must be unique within the current flow.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The port to use when content is distributed to this output.
      */
    var Port: __integer
    /**
      * The protocol to use for the output.
      */
    var Protocol: Protocol
    /**
      * The smoothing latency in milliseconds for RTP and RTP-FEC streams.
      */
    var SmoothingLatency: js.UndefOr[__integer] = js.undefined
    /**
      * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
      */
    var StreamId: js.UndefOr[__string] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateFlowRequest extends js.Object {
    /**
      * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS Region.
      */
    var AvailabilityZone: js.UndefOr[__string] = js.undefined
    /**
      * The entitlements that you want to grant on a flow.
      */
    var Entitlements: js.UndefOr[__listOfGrantEntitlementRequest] = js.undefined
    /**
      * The name of the flow.
      */
    var Name: __string
    /**
      * The outputs that you want to add to this flow.
      */
    var Outputs: js.UndefOr[__listOfAddOutputRequest] = js.undefined
    var Source: SetSourceRequest
  }
  
  trait CreateFlowResponse extends js.Object {
    var Flow: js.UndefOr[Flow] = js.undefined
  }
  
  trait DeleteFlowRequest extends js.Object {
    /**
      * The ARN of the flow that you want to delete.
      */
    var FlowArn: __string
  }
  
  trait DeleteFlowResponse extends js.Object {
    /**
      * The ARN of the flow that was deleted.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
    /**
      * The status of the flow when the DeleteFlow process begins.
      */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  trait DescribeFlowRequest extends js.Object {
    /**
      * The ARN of the flow that you want to describe.
      */
    var FlowArn: __string
  }
  
  trait DescribeFlowResponse extends js.Object {
    var Flow: js.UndefOr[Flow] = js.undefined
    var Messages: js.UndefOr[Messages] = js.undefined
  }
  
  trait Encryption extends js.Object {
    /**
      * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
      */
    var Algorithm: Algorithm
    /**
      * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
      */
    var KeyType: js.UndefOr[KeyType] = js.undefined
    /**
      * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
      */
    var RoleArn: __string
    /**
      * The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption key.
      */
    var SecretArn: __string
  }
  
  trait Entitlement extends js.Object {
    /**
      * A description of the entitlement.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The type of encryption that will be used on the output that is associated with this entitlement.
      */
    var Encryption: js.UndefOr[Encryption] = js.undefined
    /**
      * The ARN of the entitlement.
      */
    var EntitlementArn: __string
    /**
      * The name of the entitlement.
      */
    var Name: __string
    /**
      * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flow using your content as the source.
      */
    var Subscribers: __listOf__string
  }
  
  trait Flow extends js.Object {
    /**
      * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS.
      */
    var AvailabilityZone: __string
    /**
      * A description of the flow. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The IP address from which video will be sent to output destinations.
      */
    var EgressIp: js.UndefOr[__string] = js.undefined
    /**
      * The entitlements in this flow.
      */
    var Entitlements: __listOfEntitlement
    /**
      * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
      */
    var FlowArn: __string
    /**
      * The name of the flow.
      */
    var Name: __string
    /**
      * The outputs in this flow.
      */
    var Outputs: __listOfOutput
    var Source: Source
    /**
      * The current status of the flow.
      */
    var Status: Status
  }
  
  trait GrantEntitlementRequest extends js.Object {
    /**
      * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the subscriber or end user.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The type of encryption that will be used on the output that is associated with this entitlement.
      */
    var Encryption: js.UndefOr[Encryption] = js.undefined
    /**
      * The name of the entitlement. This value must be unique within the current flow.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flows using your content as the source.
      */
    var Subscribers: __listOf__string
  }
  
  trait GrantFlowEntitlementsRequest extends js.Object {
    /**
      * The list of entitlements that you want to grant.
      */
    var Entitlements: __listOfGrantEntitlementRequest
    /**
      * The flow that you want to grant entitlements on.
      */
    var FlowArn: __string
  }
  
  trait GrantFlowEntitlementsResponse extends js.Object {
    /**
      * The entitlements that were just granted.
      */
    var Entitlements: js.UndefOr[__listOfEntitlement] = js.undefined
    /**
      * The ARN of the flow that these entitlements were granted to.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
  }
  
  trait ListEntitlementsRequest extends js.Object {
    /**
      * The maximum number of results to return per API request. For example, you submit a ListEntitlements request with MaxResults set at 5. Although 20 items match your request, the service returns no more than the first 5 items. (The service also returns a NextToken value that you can use to fetch the next batch of results.) The service might return fewer results than the MaxResults value. If MaxResults is not included in the request, the service defaults to pagination with a maximum of 20 results per page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a second time and specify the NextToken value.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListEntitlementsResponse extends js.Object {
    /**
      * A list of entitlements that have been granted to you from other AWS accounts.
      */
    var Entitlements: js.UndefOr[__listOfListedEntitlement] = js.undefined
    /**
      * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a second time and specify the NextToken value.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListFlowsRequest extends js.Object {
    /**
      * The maximum number of results to return per API request. For example, you submit a ListFlows request with MaxResults set at 5. Although 20 items match your request, the service returns no more than the first 5 items. (The service also returns a NextToken value that you can use to fetch the next batch of results.) The service might return fewer results than the MaxResults value. If MaxResults is not included in the request, the service defaults to pagination with a maximum of 10 results per page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token that identifies which batch of results that you want to see. For example, you submit a ListFlows request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListFlows request a second time and specify the NextToken value.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListFlowsResponse extends js.Object {
    /**
      * A list of flow summaries.
      */
    var Flows: js.UndefOr[__listOfListedFlow] = js.undefined
    /**
      * The token that identifies which batch of results that you want to see. For example, you submit a ListFlows request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListFlows request a second time and specify the NextToken value.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListedEntitlement extends js.Object {
    /**
      * The ARN of the entitlement.
      */
    var EntitlementArn: __string
    /**
      * The name of the entitlement.
      */
    var EntitlementName: __string
  }
  
  trait ListedFlow extends js.Object {
    /**
      * The Availability Zone that the flow was created in.
      */
    var AvailabilityZone: __string
    /**
      * A description of the flow.
      */
    var Description: __string
    /**
      * The ARN of the flow.
      */
    var FlowArn: __string
    /**
      * The name of the flow.
      */
    var Name: __string
    /**
      * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another AWS account).
      */
    var SourceType: SourceType
    /**
      * The current status of the flow.
      */
    var Status: Status
  }
  
  trait Messages extends js.Object {
    /**
      * A list of errors that might have been generated from processes on this flow.
      */
    var Errors: __listOf__string
  }
  
  trait Output extends js.Object {
    /**
      * A description of the output.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The address where you want to send the output.
      */
    var Destination: js.UndefOr[__string] = js.undefined
    /**
      * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
      */
    var Encryption: js.UndefOr[Encryption] = js.undefined
    /**
      * The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
      */
    var EntitlementArn: js.UndefOr[__string] = js.undefined
    /**
      * The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that were added by creating a MediaLive input.
      */
    var MediaLiveInputArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the output. This value must be unique within the current flow.
      */
    var Name: __string
    /**
      * The ARN of the output.
      */
    var OutputArn: __string
    /**
      * The port to use when content is distributed to this output.
      */
    var Port: js.UndefOr[__integer] = js.undefined
    /**
      * Attributes related to the transport stream that are used in the output.
      */
    var Transport: js.UndefOr[Transport] = js.undefined
  }
  
  trait RemoveFlowOutputRequest extends js.Object {
    /**
      * The flow that you want to remove an output from.
      */
    var FlowArn: __string
    /**
      * The ARN of the output that you want to remove.
      */
    var OutputArn: __string
  }
  
  trait RemoveFlowOutputResponse extends js.Object {
    /**
      * The ARN of the flow that is associated with the output you removed.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the output that was removed.
      */
    var OutputArn: js.UndefOr[__string] = js.undefined
  }
  
  trait RevokeFlowEntitlementRequest extends js.Object {
    /**
      * The ARN of the entitlement that you want to revoke.
      */
    var EntitlementArn: __string
    /**
      * The flow that you want to revoke an entitlement from.
      */
    var FlowArn: __string
  }
  
  trait RevokeFlowEntitlementResponse extends js.Object {
    /**
      * The ARN of the entitlement that was revoked.
      */
    var EntitlementArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the flow that the entitlement was revoked from.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
  }
  
  trait SetSourceRequest extends js.Object {
    /**
      * The type of encryption that is used on the content ingested from this source.
      */
    var Decryption: js.UndefOr[Encryption] = js.undefined
    /**
      * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow originator, and the ARN is generated as part of the originator's flow.
      */
    var EntitlementArn: js.UndefOr[__string] = js.undefined
    /**
      * The port that the flow will be listening on for incoming content.
      */
    var IngestPort: js.UndefOr[__integer] = js.undefined
    /**
      * The smoothing max bitrate for RTP and RTP-FEC streams.
      */
    var MaxBitrate: js.UndefOr[__integer] = js.undefined
    /**
      * The maximum latency in milliseconds for Zixi-based streams.
      */
    var MaxLatency: js.UndefOr[__integer] = js.undefined
    /**
      * The name of the source.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The protocol that is used by the source.
      */
    var Protocol: js.UndefOr[Protocol] = js.undefined
    /**
      * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
      */
    var StreamId: js.UndefOr[__string] = js.undefined
    /**
      * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
      */
    var WhitelistCidr: js.UndefOr[__string] = js.undefined
  }
  
  trait Source extends js.Object {
    /**
      * The type of encryption that is used on the content ingested from this source.
      */
    var Decryption: js.UndefOr[Encryption] = js.undefined
    /**
      * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
      */
    var EntitlementArn: js.UndefOr[__string] = js.undefined
    /**
      * The IP address that the flow will be listening on for incoming content.
      */
    var IngestIp: js.UndefOr[__string] = js.undefined
    /**
      * The port that the flow will be listening on for incoming content.
      */
    var IngestPort: js.UndefOr[__integer] = js.undefined
    /**
      * The name of the source.
      */
    var Name: __string
    /**
      * The ARN of the source.
      */
    var SourceArn: __string
    /**
      * Attributes related to the transport stream that are used in the source.
      */
    var Transport: js.UndefOr[Transport] = js.undefined
    /**
      * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
      */
    var WhitelistCidr: js.UndefOr[__string] = js.undefined
  }
  
  trait StartFlowRequest extends js.Object {
    /**
      * The ARN of the flow that you want to start.
      */
    var FlowArn: __string
  }
  
  trait StartFlowResponse extends js.Object {
    /**
      * The ARN of the flow that you started.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
    /**
      * The status of the flow when the StartFlow process begins.
      */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  trait StopFlowRequest extends js.Object {
    /**
      * The ARN of the flow that you want to stop.
      */
    var FlowArn: __string
  }
  
  trait StopFlowResponse extends js.Object {
    /**
      * The ARN of the flow that you stopped.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
    /**
      * The status of the flow when the StopFlow process begins.
      */
    var Status: js.UndefOr[Status] = js.undefined
  }
  
  trait Transport extends js.Object {
    /**
      * The smoothing max bitrate for RTP and RTP-FEC streams.
      */
    var MaxBitrate: js.UndefOr[__integer] = js.undefined
    /**
      * The maximum latency in milliseconds for Zixi-based streams.
      */
    var MaxLatency: js.UndefOr[__integer] = js.undefined
    /**
      * The protocol that is used by the source or output.
      */
    var Protocol: Protocol
    /**
      * The smoothing latency in milliseconds for RTP and RTP-FEC streams.
      */
    var SmoothingLatency: js.UndefOr[__integer] = js.undefined
    /**
      * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
      */
    var StreamId: js.UndefOr[__string] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UpdateEncryption extends js.Object {
    /**
      * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
      */
    var Algorithm: js.UndefOr[Algorithm] = js.undefined
    /**
      * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
      */
    var KeyType: js.UndefOr[KeyType] = js.undefined
    /**
      * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN that was assigned to the secret that you created in AWS Secrets Manager to store the encryption key.
      */
    var SecretArn: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateFlowEntitlementRequest extends js.Object {
    /**
      * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the subscriber or end user.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The type of encryption that will be used on the output associated with this entitlement.
      */
    var Encryption: js.UndefOr[UpdateEncryption] = js.undefined
    /**
      * The ARN of the entitlement that you want to update.
      */
    var EntitlementArn: __string
    /**
      * The flow that is associated with the entitlement that you want to update.
      */
    var FlowArn: __string
    /**
      * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flow using your content as the source.
      */
    var Subscribers: js.UndefOr[__listOf__string] = js.undefined
  }
  
  trait UpdateFlowEntitlementResponse extends js.Object {
    var Entitlement: js.UndefOr[Entitlement] = js.undefined
    /**
      * The ARN of the flow that this entitlement was granted on.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateFlowOutputRequest extends js.Object {
    /**
      * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The IP address where you want to send the output.
      */
    var Destination: js.UndefOr[__string] = js.undefined
    /**
      * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
      */
    var Encryption: js.UndefOr[UpdateEncryption] = js.undefined
    /**
      * The flow that is associated with the output that you want to update.
      */
    var FlowArn: __string
    /**
      * The maximum latency in milliseconds for Zixi-based streams.
      */
    var MaxLatency: js.UndefOr[__integer] = js.undefined
    /**
      * The ARN of the output that you want to update.
      */
    var OutputArn: __string
    /**
      * The port to use when content is distributed to this output.
      */
    var Port: js.UndefOr[__integer] = js.undefined
    /**
      * The protocol to use for the output.
      */
    var Protocol: js.UndefOr[Protocol] = js.undefined
    /**
      * The smoothing latency in milliseconds for RTP and RTP-FEC streams.
      */
    var SmoothingLatency: js.UndefOr[__integer] = js.undefined
    /**
      * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
      */
    var StreamId: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateFlowOutputResponse extends js.Object {
    /**
      * The ARN of the flow that is associated with the updated output.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
    var Output: js.UndefOr[Output] = js.undefined
  }
  
  trait UpdateFlowSourceRequest extends js.Object {
    /**
      * The type of encryption used on the content ingested from this source.
      */
    var Decryption: js.UndefOr[UpdateEncryption] = js.undefined
    /**
      * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow originator, and the ARN is generated as part of the originator's flow.
      */
    var EntitlementArn: js.UndefOr[__string] = js.undefined
    /**
      * The flow that is associated with the source that you want to update.
      */
    var FlowArn: __string
    /**
      * The port that the flow will be listening on for incoming content.
      */
    var IngestPort: js.UndefOr[__integer] = js.undefined
    /**
      * The smoothing max bitrate for RTP and RTP-FEC streams.
      */
    var MaxBitrate: js.UndefOr[__integer] = js.undefined
    /**
      * The maximum latency in milliseconds for Zixi-based streams.
      */
    var MaxLatency: js.UndefOr[__integer] = js.undefined
    /**
      * The protocol that is used by the source.
      */
    var Protocol: js.UndefOr[Protocol] = js.undefined
    /**
      * The ARN of the source that you want to update.
      */
    var SourceArn: __string
    /**
      * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
      */
    var StreamId: js.UndefOr[__string] = js.undefined
    /**
      * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
      */
    var WhitelistCidr: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateFlowSourceResponse extends js.Object {
    /**
      * The ARN of the flow that you want to update.
      */
    var FlowArn: js.UndefOr[__string] = js.undefined
    /**
      * The settings for the source of the flow.
      */
    var Source: js.UndefOr[Source] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Algorithm = awsDashSdkLib.awsDashSdkLibStrings.aes128 | awsDashSdkLib.awsDashSdkLibStrings.aes192 | awsDashSdkLib.awsDashSdkLibStrings.aes256 | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type KeyType = awsDashSdkLib.awsDashSdkLibStrings.`static-key` | java.lang.String
  type MaxResults = scala.Double
  type Protocol = awsDashSdkLib.awsDashSdkLibStrings.`zixi-push` | awsDashSdkLib.awsDashSdkLibStrings.`rtp-fec` | awsDashSdkLib.awsDashSdkLibStrings.rtp | java.lang.String
  type SourceType = awsDashSdkLib.awsDashSdkLibStrings.OWNED | awsDashSdkLib.awsDashSdkLibStrings.ENTITLED | java.lang.String
  type Status = awsDashSdkLib.awsDashSdkLibStrings.STANDBY | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.STARTING | awsDashSdkLib.awsDashSdkLibStrings.STOPPING | awsDashSdkLib.awsDashSdkLibStrings.ERROR | java.lang.String
  type __integer = scala.Double
  type __listOfAddOutputRequest = js.Array[AddOutputRequest]
  type __listOfEntitlement = js.Array[Entitlement]
  type __listOfGrantEntitlementRequest = js.Array[GrantEntitlementRequest]
  type __listOfListedEntitlement = js.Array[ListedEntitlement]
  type __listOfListedFlow = js.Array[ListedFlow]
  type __listOfOutput = js.Array[Output]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-11-14` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

