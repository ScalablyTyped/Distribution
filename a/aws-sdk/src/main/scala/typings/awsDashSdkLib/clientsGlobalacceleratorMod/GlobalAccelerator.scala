package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalAccelerator
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_GlobalAccelerator: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ClientConfiguration = js.native
  /**
    * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example.
    */
  def createAccelerator(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAccelerator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see an AWS CLI example of creating an accelerator, scroll down to Example.
    */
  def createAccelerator(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAccelerator(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateAcceleratorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
    */
  def createEndpointGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEndpointGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS Region. To see an AWS CLI example of creating an endpoint group, scroll down to Example.
    */
  def createEndpointGroup(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEndpointGroup(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateEndpointGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
    */
  def createListener(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of creating a listener, scroll down to Example.
    */
  def createListener(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateListenerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createListener(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateListenerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.CreateListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteAccelerator(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DeleteAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAccelerator(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DeleteAcceleratorRequest,
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
  def deleteEndpointGroup(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DeleteEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEndpointGroup(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DeleteEndpointGroupRequest,
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
  def deleteListener(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DeleteListenerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteListener(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DeleteListenerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
    */
  def describeAccelerator(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccelerator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to Example.
    */
  def describeAccelerator(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccelerator(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe the attributes of an accelerator.
    */
  def describeAcceleratorAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAcceleratorAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe the attributes of an accelerator.
    */
  def describeAcceleratorAttributes(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAcceleratorAttributes(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeAcceleratorAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe an endpoint group.
    */
  def describeEndpointGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEndpointGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe an endpoint group.
    */
  def describeEndpointGroup(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEndpointGroup(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeEndpointGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe a listener.
    */
  def describeListener(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describe a listener.
    */
  def describeListener(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeListenerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeListener(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeListenerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.DescribeListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the accelerators for an AWS account.
    */
  def listAccelerators(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListAcceleratorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAccelerators(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListAcceleratorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListAcceleratorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the accelerators for an AWS account.
    */
  def listAccelerators(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListAcceleratorsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListAcceleratorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAccelerators(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListAcceleratorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListAcceleratorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListAcceleratorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the endpoint groups that are associated with a listener.
    */
  def listEndpointGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListEndpointGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEndpointGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListEndpointGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListEndpointGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the endpoint groups that are associated with a listener.
    */
  def listEndpointGroups(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListEndpointGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListEndpointGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEndpointGroups(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListEndpointGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListEndpointGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListEndpointGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the listeners for an accelerator.
    */
  def listListeners(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListListenersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listListeners(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListListenersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListListenersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the listeners for an accelerator.
    */
  def listListeners(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListListenersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListListenersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listListeners(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListListenersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListListenersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.ListListenersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update an accelerator.
    */
  def updateAccelerator(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAccelerator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update an accelerator.
    */
  def updateAccelerator(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAccelerator(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
    */
  def updateAcceleratorAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAcceleratorAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow logs, scroll down to Example.
    */
  def updateAcceleratorAttributes(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAcceleratorAttributes(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateAcceleratorAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
    */
  def updateEndpointGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEndpointGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to Example.
    */
  def updateEndpointGroup(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateEndpointGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEndpointGroup(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateEndpointGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateEndpointGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateEndpointGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update a listener.
    */
  def updateListener(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update a listener.
    */
  def updateListener(params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateListenerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateListener(
    params: awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateListenerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateListenerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlobalacceleratorMod.GlobalAcceleratorNs.UpdateListenerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

