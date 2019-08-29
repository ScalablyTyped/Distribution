package typings.awsDashSdk.clientsGlobalacceleratorMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalAccelerator extends Service {
  @JSName("config")
  var config_GlobalAccelerator: ConfigBase with ClientConfiguration = js.native
  /**
    * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example.  You must specify the US-West-2 (Oregon) Region to create or update accelerators. 
    */
  def createAccelerator(): Request[CreateAcceleratorResponse, AWSError] = js.native
  def createAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ CreateAcceleratorResponse, Unit]): Request[CreateAcceleratorResponse, AWSError] = js.native
  /**
    * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example.  You must specify the US-West-2 (Oregon) Region to create or update accelerators. 
    */
  def createAccelerator(params: CreateAcceleratorRequest): Request[CreateAcceleratorResponse, AWSError] = js.native
  def createAccelerator(
    params: CreateAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAcceleratorResponse, Unit]
  ): Request[CreateAcceleratorResponse, AWSError] = js.native
  /**
    * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
    */
  def createEndpointGroup(): Request[CreateEndpointGroupResponse, AWSError] = js.native
  def createEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointGroupResponse, Unit]): Request[CreateEndpointGroupResponse, AWSError] = js.native
  /**
    * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
    */
  def createEndpointGroup(params: CreateEndpointGroupRequest): Request[CreateEndpointGroupResponse, AWSError] = js.native
  def createEndpointGroup(
    params: CreateEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointGroupResponse, Unit]
  ): Request[CreateEndpointGroupResponse, AWSError] = js.native
  /**
    * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
    */
  def createListener(): Request[CreateListenerResponse, AWSError] = js.native
  def createListener(callback: js.Function2[/* err */ AWSError, /* data */ CreateListenerResponse, Unit]): Request[CreateListenerResponse, AWSError] = js.native
  /**
    * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
    */
  def createListener(params: CreateListenerRequest): Request[CreateListenerResponse, AWSError] = js.native
  def createListener(
    params: CreateListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateListenerResponse, Unit]
  ): Request[CreateListenerResponse, AWSError] = js.native
  /**
    * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups).
    */
  def deleteAccelerator(): Request[js.Object, AWSError] = js.native
  def deleteAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent resources (listeners and endpoint groups).
    */
  def deleteAccelerator(params: DeleteAcceleratorRequest): Request[js.Object, AWSError] = js.native
  def deleteAccelerator(
    params: DeleteAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Delete an endpoint group from a listener.
    */
  def deleteEndpointGroup(): Request[js.Object, AWSError] = js.native
  def deleteEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an endpoint group from a listener.
    */
  def deleteEndpointGroup(params: DeleteEndpointGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteEndpointGroup(
    params: DeleteEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Delete a listener from an accelerator.
    */
  def deleteListener(): Request[js.Object, AWSError] = js.native
  def deleteListener(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a listener from an accelerator.
    */
  def deleteListener(params: DeleteListenerRequest): Request[js.Object, AWSError] = js.native
  def deleteListener(
    params: DeleteListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
    */
  def describeAccelerator(): Request[DescribeAcceleratorResponse, AWSError] = js.native
  def describeAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorResponse, Unit]): Request[DescribeAcceleratorResponse, AWSError] = js.native
  /**
    * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
    */
  def describeAccelerator(params: DescribeAcceleratorRequest): Request[DescribeAcceleratorResponse, AWSError] = js.native
  def describeAccelerator(
    params: DescribeAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorResponse, Unit]
  ): Request[DescribeAcceleratorResponse, AWSError] = js.native
  /**
    * Describe the attributes of an accelerator.
    */
  def describeAcceleratorAttributes(): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  def describeAcceleratorAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorAttributesResponse, Unit]): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Describe the attributes of an accelerator.
    */
  def describeAcceleratorAttributes(params: DescribeAcceleratorAttributesRequest): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  def describeAcceleratorAttributes(
    params: DescribeAcceleratorAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorAttributesResponse, Unit]
  ): Request[DescribeAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Describe an endpoint group.
    */
  def describeEndpointGroup(): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  def describeEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointGroupResponse, Unit]): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  /**
    * Describe an endpoint group.
    */
  def describeEndpointGroup(params: DescribeEndpointGroupRequest): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  def describeEndpointGroup(
    params: DescribeEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointGroupResponse, Unit]
  ): Request[DescribeEndpointGroupResponse, AWSError] = js.native
  /**
    * Describe a listener.
    */
  def describeListener(): Request[DescribeListenerResponse, AWSError] = js.native
  def describeListener(callback: js.Function2[/* err */ AWSError, /* data */ DescribeListenerResponse, Unit]): Request[DescribeListenerResponse, AWSError] = js.native
  /**
    * Describe a listener.
    */
  def describeListener(params: DescribeListenerRequest): Request[DescribeListenerResponse, AWSError] = js.native
  def describeListener(
    params: DescribeListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeListenerResponse, Unit]
  ): Request[DescribeListenerResponse, AWSError] = js.native
  /**
    * List the accelerators for an AWS account.
    */
  def listAccelerators(): Request[ListAcceleratorsResponse, AWSError] = js.native
  def listAccelerators(callback: js.Function2[/* err */ AWSError, /* data */ ListAcceleratorsResponse, Unit]): Request[ListAcceleratorsResponse, AWSError] = js.native
  /**
    * List the accelerators for an AWS account.
    */
  def listAccelerators(params: ListAcceleratorsRequest): Request[ListAcceleratorsResponse, AWSError] = js.native
  def listAccelerators(
    params: ListAcceleratorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAcceleratorsResponse, Unit]
  ): Request[ListAcceleratorsResponse, AWSError] = js.native
  /**
    * List the endpoint groups that are associated with a listener.
    */
  def listEndpointGroups(): Request[ListEndpointGroupsResponse, AWSError] = js.native
  def listEndpointGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointGroupsResponse, Unit]): Request[ListEndpointGroupsResponse, AWSError] = js.native
  /**
    * List the endpoint groups that are associated with a listener.
    */
  def listEndpointGroups(params: ListEndpointGroupsRequest): Request[ListEndpointGroupsResponse, AWSError] = js.native
  def listEndpointGroups(
    params: ListEndpointGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointGroupsResponse, Unit]
  ): Request[ListEndpointGroupsResponse, AWSError] = js.native
  /**
    * List the listeners for an accelerator.
    */
  def listListeners(): Request[ListListenersResponse, AWSError] = js.native
  def listListeners(callback: js.Function2[/* err */ AWSError, /* data */ ListListenersResponse, Unit]): Request[ListListenersResponse, AWSError] = js.native
  /**
    * List the listeners for an accelerator.
    */
  def listListeners(params: ListListenersRequest): Request[ListListenersResponse, AWSError] = js.native
  def listListeners(
    params: ListListenersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListListenersResponse, Unit]
  ): Request[ListListenersResponse, AWSError] = js.native
  /**
    * Update an accelerator. To see an AWS CLI example of updating an accelerator, scroll down to Example.  You must specify the US-West-2 (Oregon) Region to create or update accelerators. 
    */
  def updateAccelerator(): Request[UpdateAcceleratorResponse, AWSError] = js.native
  def updateAccelerator(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorResponse, Unit]): Request[UpdateAcceleratorResponse, AWSError] = js.native
  /**
    * Update an accelerator. To see an AWS CLI example of updating an accelerator, scroll down to Example.  You must specify the US-West-2 (Oregon) Region to create or update accelerators. 
    */
  def updateAccelerator(params: UpdateAcceleratorRequest): Request[UpdateAcceleratorResponse, AWSError] = js.native
  def updateAccelerator(
    params: UpdateAcceleratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorResponse, Unit]
  ): Request[UpdateAcceleratorResponse, AWSError] = js.native
  /**
    * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
    */
  def updateAcceleratorAttributes(): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  def updateAcceleratorAttributes(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorAttributesResponse, Unit]): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
    */
  def updateAcceleratorAttributes(params: UpdateAcceleratorAttributesRequest): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  def updateAcceleratorAttributes(
    params: UpdateAcceleratorAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAcceleratorAttributesResponse, Unit]
  ): Request[UpdateAcceleratorAttributesResponse, AWSError] = js.native
  /**
    * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
    */
  def updateEndpointGroup(): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  def updateEndpointGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointGroupResponse, Unit]): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  /**
    * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
    */
  def updateEndpointGroup(params: UpdateEndpointGroupRequest): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  def updateEndpointGroup(
    params: UpdateEndpointGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEndpointGroupResponse, Unit]
  ): Request[UpdateEndpointGroupResponse, AWSError] = js.native
  /**
    * Update a listener.
    */
  def updateListener(): Request[UpdateListenerResponse, AWSError] = js.native
  def updateListener(callback: js.Function2[/* err */ AWSError, /* data */ UpdateListenerResponse, Unit]): Request[UpdateListenerResponse, AWSError] = js.native
  /**
    * Update a listener.
    */
  def updateListener(params: UpdateListenerRequest): Request[UpdateListenerResponse, AWSError] = js.native
  def updateListener(
    params: UpdateListenerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateListenerResponse, Unit]
  ): Request[UpdateListenerResponse, AWSError] = js.native
}

