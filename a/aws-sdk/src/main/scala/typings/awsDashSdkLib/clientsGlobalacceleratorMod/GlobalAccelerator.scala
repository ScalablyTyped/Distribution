package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalAccelerator
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_GlobalAccelerator: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example.
    */
  def createAccelerator(): awsDashSdkLib.libRequestMod.Request[CreateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAccelerator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example.
    */
  def createAccelerator(params: CreateAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[CreateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAccelerator(
    params: CreateAcceleratorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
    */
  def createEndpointGroup(): awsDashSdkLib.libRequestMod.Request[CreateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEndpointGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
    */
  def createEndpointGroup(params: CreateEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEndpointGroup(
    params: CreateEndpointGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
    */
  def createListener(): awsDashSdkLib.libRequestMod.Request[CreateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
    */
  def createListener(params: CreateListenerRequest): awsDashSdkLib.libRequestMod.Request[CreateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createListener(
    params: CreateListenerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups).
    */
  def deleteAccelerator(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAccelerator(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups).
    */
  def deleteAccelerator(params: DeleteAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAccelerator(
    params: DeleteAcceleratorRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete an endpoint group from a listener.
    */
  def deleteEndpointGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpointGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete an endpoint group from a listener.
    */
  def deleteEndpointGroup(params: DeleteEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpointGroup(
    params: DeleteEndpointGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a listener from an accelerator.
    */
  def deleteListener(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteListener(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a listener from an accelerator.
    */
  def deleteListener(params: DeleteListenerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteListener(
    params: DeleteListenerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
    */
  def describeAccelerator(): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccelerator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
    */
  def describeAccelerator(params: DescribeAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccelerator(
    params: DescribeAcceleratorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe the attributes of an accelerator.
    */
  def describeAcceleratorAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAcceleratorAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAcceleratorAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe the attributes of an accelerator.
    */
  def describeAcceleratorAttributes(params: DescribeAcceleratorAttributesRequest): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAcceleratorAttributes(
    params: DescribeAcceleratorAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAcceleratorAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an endpoint group.
    */
  def describeEndpointGroup(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpointGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an endpoint group.
    */
  def describeEndpointGroup(params: DescribeEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEndpointGroup(
    params: DescribeEndpointGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe a listener.
    */
  def describeListener(): awsDashSdkLib.libRequestMod.Request[DescribeListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe a listener.
    */
  def describeListener(params: DescribeListenerRequest): awsDashSdkLib.libRequestMod.Request[DescribeListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeListener(
    params: DescribeListenerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the accelerators for an AWS account.
    */
  def listAccelerators(): awsDashSdkLib.libRequestMod.Request[ListAcceleratorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAccelerators(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAcceleratorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAcceleratorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the accelerators for an AWS account.
    */
  def listAccelerators(params: ListAcceleratorsRequest): awsDashSdkLib.libRequestMod.Request[ListAcceleratorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAccelerators(
    params: ListAcceleratorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAcceleratorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAcceleratorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the endpoint groups that are associated with a listener.
    */
  def listEndpointGroups(): awsDashSdkLib.libRequestMod.Request[ListEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEndpointGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEndpointGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the endpoint groups that are associated with a listener.
    */
  def listEndpointGroups(params: ListEndpointGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEndpointGroups(
    params: ListEndpointGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEndpointGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEndpointGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the listeners for an accelerator.
    */
  def listListeners(): awsDashSdkLib.libRequestMod.Request[ListListenersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listListeners(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListListenersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListListenersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the listeners for an accelerator.
    */
  def listListeners(params: ListListenersRequest): awsDashSdkLib.libRequestMod.Request[ListListenersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listListeners(
    params: ListListenersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListListenersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListListenersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an accelerator.
    */
  def updateAccelerator(): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccelerator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an accelerator.
    */
  def updateAccelerator(params: UpdateAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccelerator(
    params: UpdateAcceleratorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
    */
  def updateAcceleratorAttributes(): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAcceleratorAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAcceleratorAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
    */
  def updateAcceleratorAttributes(params: UpdateAcceleratorAttributesRequest): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAcceleratorAttributes(
    params: UpdateAcceleratorAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAcceleratorAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAcceleratorAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
    */
  def updateEndpointGroup(): awsDashSdkLib.libRequestMod.Request[UpdateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEndpointGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
    */
  def updateEndpointGroup(params: UpdateEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEndpointGroup(
    params: UpdateEndpointGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEndpointGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a listener.
    */
  def updateListener(): awsDashSdkLib.libRequestMod.Request[UpdateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update a listener.
    */
  def updateListener(params: UpdateListenerRequest): awsDashSdkLib.libRequestMod.Request[UpdateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateListener(
    params: UpdateListenerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateListenerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

