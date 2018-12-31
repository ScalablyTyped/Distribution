package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DAX
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DAX: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDaxMod.DAXNs.ClientConfiguration = js.native
  /**
    * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
    */
  def createCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
    */
  def createCluster(params: awsDashSdkLib.clientsDaxMod.DAXNs.CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCluster(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.CreateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes in a DAX cluster.
    */
  def createParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.CreateParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes in a DAX cluster.
    */
  def createParameterGroup(params: awsDashSdkLib.clientsDaxMod.DAXNs.CreateParameterGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createParameterGroup(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.CreateParameterGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.CreateParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new subnet group.
    */
  def createSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.CreateSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new subnet group.
    */
  def createSubnetGroup(params: awsDashSdkLib.clientsDaxMod.DAXNs.CreateSubnetGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSubnetGroup(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.CreateSubnetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.CreateSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.CreateSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes one or more nodes from a DAX cluster.  You cannot use DecreaseReplicationFactor to remove the last node in a DAX cluster. If you need to do this, use DeleteCluster instead. 
    */
  def decreaseReplicationFactor(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DecreaseReplicationFactorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def decreaseReplicationFactor(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DecreaseReplicationFactorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DecreaseReplicationFactorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes one or more nodes from a DAX cluster.  You cannot use DecreaseReplicationFactor to remove the last node in a DAX cluster. If you need to do this, use DeleteCluster instead. 
    */
  def decreaseReplicationFactor(params: awsDashSdkLib.clientsDaxMod.DAXNs.DecreaseReplicationFactorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DecreaseReplicationFactorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def decreaseReplicationFactor(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.DecreaseReplicationFactorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DecreaseReplicationFactorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DecreaseReplicationFactorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously provisioned DAX cluster. DeleteCluster deletes all associated nodes, node endpoints and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins deleting the cluster; you cannot cancel or revert this action.
    */
  def deleteCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously provisioned DAX cluster. DeleteCluster deletes all associated nodes, node endpoints and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins deleting the cluster; you cannot cancel or revert this action.
    */
  def deleteCluster(params: awsDashSdkLib.clientsDaxMod.DAXNs.DeleteClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCluster(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.DeleteClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX clusters.
    */
  def deleteParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DeleteParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX clusters.
    */
  def deleteParameterGroup(params: awsDashSdkLib.clientsDaxMod.DAXNs.DeleteParameterGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteParameterGroup(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.DeleteParameterGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DeleteParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a subnet group.  You cannot delete a subnet group if it is associated with any DAX clusters. 
    */
  def deleteSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DeleteSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a subnet group.  You cannot delete a subnet group if it is associated with any DAX clusters. 
    */
  def deleteSubnetGroup(params: awsDashSdkLib.clientsDaxMod.DAXNs.DeleteSubnetGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSubnetGroup(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.DeleteSubnetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DeleteSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DeleteSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific DAX cluster if a cluster identifier is supplied. If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes are successfully provisioned. If the cluster is in the DELETING state, only cluster level information will be displayed. If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is available, the cluster is ready for use. If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is displayed.
    */
  def describeClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific DAX cluster if a cluster identifier is supplied. If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes are successfully provisioned. If the cluster is in the DELETING state, only cluster level information will be displayed. If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is available, the cluster is ready for use. If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is displayed.
    */
  def describeClusters(params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeClustersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClusters(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default system parameter information for the DAX caching software.
    */
  def describeDefaultParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeDefaultParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDefaultParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeDefaultParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeDefaultParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the default system parameter information for the DAX caching software.
    */
  def describeDefaultParameters(params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeDefaultParametersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeDefaultParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDefaultParameters(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeDefaultParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeDefaultParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeDefaultParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX cluster or parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX cluster or parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvents(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain only the descriptions for that group.
    */
  def describeParameterGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParameterGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParameterGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParameterGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain only the descriptions for that group.
    */
  def describeParameterGroups(params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParameterGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParameterGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeParameterGroups(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParameterGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParameterGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParameterGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular parameter group.
    */
  def describeParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the detailed parameter list for a particular parameter group.
    */
  def describeParameters(params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParametersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeParameters(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeParametersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the description of that group.
    */
  def describeSubnetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeSubnetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSubnetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeSubnetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeSubnetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the description of that group.
    */
  def describeSubnetGroups(params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeSubnetGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeSubnetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSubnetGroups(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.DescribeSubnetGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.DescribeSubnetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.DescribeSubnetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds one or more nodes to a DAX cluster.
    */
  def increaseReplicationFactor(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.IncreaseReplicationFactorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def increaseReplicationFactor(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.IncreaseReplicationFactorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.IncreaseReplicationFactorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds one or more nodes to a DAX cluster.
    */
  def increaseReplicationFactor(params: awsDashSdkLib.clientsDaxMod.DAXNs.IncreaseReplicationFactorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.IncreaseReplicationFactorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def increaseReplicationFactor(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.IncreaseReplicationFactorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.IncreaseReplicationFactorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.IncreaseReplicationFactorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List all of the tags for a DAX cluster. You can call ListTags up to 10 times per second, per account.
    */
  def listTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List all of the tags for a DAX cluster. You can call ListTags up to 10 times per second, per account.
    */
  def listTags(params: awsDashSdkLib.clientsDaxMod.DAXNs.ListTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTags(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the node status is set to REBOOTING.
    */
  def rebootNode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.RebootNodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootNode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.RebootNodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.RebootNodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the node status is set to REBOOTING.
    */
  def rebootNode(params: awsDashSdkLib.clientsDaxMod.DAXNs.RebootNodeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.RebootNodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rebootNode(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.RebootNodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.RebootNodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.RebootNodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a set of tags with a DAX resource. You can call TagResource up to 5 times per second, per account. 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a set of tags with a DAX resource. You can call TagResource up to 5 times per second, per account. 
    */
  def tagResource(params: awsDashSdkLib.clientsDaxMod.DAXNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the association of tags from a DAX resource. You can call UntagResource up to 5 times per second, per account. 
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the association of tags from a DAX resource. You can call UntagResource up to 5 times per second, per account. 
    */
  def untagResource(params: awsDashSdkLib.clientsDaxMod.DAXNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration parameters by specifying the parameters and the new values.
    */
  def updateCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.UpdateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration parameters by specifying the parameters and the new values.
    */
  def updateCluster(params: awsDashSdkLib.clientsDaxMod.DAXNs.UpdateClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateCluster(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.UpdateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.UpdateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def updateParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.UpdateParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def updateParameterGroup(params: awsDashSdkLib.clientsDaxMod.DAXNs.UpdateParameterGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateParameterGroup(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.UpdateParameterGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.UpdateParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateParameterGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing subnet group.
    */
  def updateSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.UpdateSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing subnet group.
    */
  def updateSubnetGroup(params: awsDashSdkLib.clientsDaxMod.DAXNs.UpdateSubnetGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSubnetGroup(
    params: awsDashSdkLib.clientsDaxMod.DAXNs.UpdateSubnetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDaxMod.DAXNs.UpdateSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDaxMod.DAXNs.UpdateSubnetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

