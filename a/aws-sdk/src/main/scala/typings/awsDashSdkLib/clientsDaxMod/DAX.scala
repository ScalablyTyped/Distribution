package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DAX
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DAX: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
    */
  def createCluster(): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
    */
  def createCluster(params: CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes in a DAX cluster.
    */
  def createParameterGroup(): awsDashSdkLib.libRequestMod.Request[CreateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes in a DAX cluster.
    */
  def createParameterGroup(params: CreateParameterGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createParameterGroup(
    params: CreateParameterGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new subnet group.
    */
  def createSubnetGroup(): awsDashSdkLib.libRequestMod.Request[CreateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new subnet group.
    */
  def createSubnetGroup(params: CreateSubnetGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSubnetGroup(
    params: CreateSubnetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more nodes from a DAX cluster.  You cannot use DecreaseReplicationFactor to remove the last node in a DAX cluster. If you need to do this, use DeleteCluster instead. 
    */
  def decreaseReplicationFactor(): awsDashSdkLib.libRequestMod.Request[DecreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def decreaseReplicationFactor(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DecreaseReplicationFactorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DecreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more nodes from a DAX cluster.  You cannot use DecreaseReplicationFactor to remove the last node in a DAX cluster. If you need to do this, use DeleteCluster instead. 
    */
  def decreaseReplicationFactor(params: DecreaseReplicationFactorRequest): awsDashSdkLib.libRequestMod.Request[DecreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def decreaseReplicationFactor(
    params: DecreaseReplicationFactorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DecreaseReplicationFactorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DecreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a previously provisioned DAX cluster. DeleteCluster deletes all associated nodes, node endpoints and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins deleting the cluster; you cannot cancel or revert this action.
    */
  def deleteCluster(): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a previously provisioned DAX cluster. DeleteCluster deletes all associated nodes, node endpoints and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins deleting the cluster; you cannot cancel or revert this action.
    */
  def deleteCluster(params: DeleteClusterRequest): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX clusters.
    */
  def deleteParameterGroup(): awsDashSdkLib.libRequestMod.Request[DeleteParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX clusters.
    */
  def deleteParameterGroup(params: DeleteParameterGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteParameterGroup(
    params: DeleteParameterGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a subnet group.  You cannot delete a subnet group if it is associated with any DAX clusters. 
    */
  def deleteSubnetGroup(): awsDashSdkLib.libRequestMod.Request[DeleteSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a subnet group.  You cannot delete a subnet group if it is associated with any DAX clusters. 
    */
  def deleteSubnetGroup(params: DeleteSubnetGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSubnetGroup(
    params: DeleteSubnetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific DAX cluster if a cluster identifier is supplied. If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes are successfully provisioned. If the cluster is in the DELETING state, only cluster level information will be displayed. If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is available, the cluster is ready for use. If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is displayed.
    */
  def describeClusters(): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific DAX cluster if a cluster identifier is supplied. If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes are successfully provisioned. If the cluster is in the DELETING state, only cluster level information will be displayed. If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is available, the cluster is ready for use. If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is displayed.
    */
  def describeClusters(params: DescribeClustersRequest): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeClusters(
    params: DescribeClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the default system parameter information for the DAX caching software.
    */
  def describeDefaultParameters(): awsDashSdkLib.libRequestMod.Request[DescribeDefaultParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDefaultParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDefaultParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDefaultParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the default system parameter information for the DAX caching software.
    */
  def describeDefaultParameters(params: DescribeDefaultParametersRequest): awsDashSdkLib.libRequestMod.Request[DescribeDefaultParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDefaultParameters(
    params: DescribeDefaultParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDefaultParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDefaultParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX cluster or parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX cluster or parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(params: DescribeEventsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEvents(
    params: DescribeEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain only the descriptions for that group.
    */
  def describeParameterGroups(): awsDashSdkLib.libRequestMod.Request[DescribeParameterGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeParameterGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeParameterGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain only the descriptions for that group.
    */
  def describeParameterGroups(params: DescribeParameterGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeParameterGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeParameterGroups(
    params: DescribeParameterGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeParameterGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeParameterGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular parameter group.
    */
  def describeParameters(): awsDashSdkLib.libRequestMod.Request[DescribeParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular parameter group.
    */
  def describeParameters(params: DescribeParametersRequest): awsDashSdkLib.libRequestMod.Request[DescribeParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeParameters(
    params: DescribeParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeParametersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeParametersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the description of that group.
    */
  def describeSubnetGroups(): awsDashSdkLib.libRequestMod.Request[DescribeSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSubnetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSubnetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the description of that group.
    */
  def describeSubnetGroups(params: DescribeSubnetGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSubnetGroups(
    params: DescribeSubnetGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSubnetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more nodes to a DAX cluster.
    */
  def increaseReplicationFactor(): awsDashSdkLib.libRequestMod.Request[IncreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def increaseReplicationFactor(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IncreaseReplicationFactorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IncreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more nodes to a DAX cluster.
    */
  def increaseReplicationFactor(params: IncreaseReplicationFactorRequest): awsDashSdkLib.libRequestMod.Request[IncreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def increaseReplicationFactor(
    params: IncreaseReplicationFactorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ IncreaseReplicationFactorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[IncreaseReplicationFactorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all of the tags for a DAX cluster. You can call ListTags up to 10 times per second, per account.
    */
  def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all of the tags for a DAX cluster. You can call ListTags up to 10 times per second, per account.
    */
  def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the node status is set to REBOOTING.
    */
  def rebootNode(): awsDashSdkLib.libRequestMod.Request[RebootNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootNode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootNodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the node status is set to REBOOTING.
    */
  def rebootNode(params: RebootNodeRequest): awsDashSdkLib.libRequestMod.Request[RebootNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rebootNode(
    params: RebootNodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RebootNodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RebootNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a set of tags with a DAX resource. You can call TagResource up to 5 times per second, per account. 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a set of tags with a DAX resource. You can call TagResource up to 5 times per second, per account. 
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the association of tags from a DAX resource. You can call UntagResource up to 5 times per second, per account. 
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the association of tags from a DAX resource. You can call UntagResource up to 5 times per second, per account. 
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration parameters by specifying the parameters and the new values.
    */
  def updateCluster(): awsDashSdkLib.libRequestMod.Request[UpdateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration parameters by specifying the parameters and the new values.
    */
  def updateCluster(params: UpdateClusterRequest): awsDashSdkLib.libRequestMod.Request[UpdateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCluster(
    params: UpdateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def updateParameterGroup(): awsDashSdkLib.libRequestMod.Request[UpdateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def updateParameterGroup(params: UpdateParameterGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateParameterGroup(
    params: UpdateParameterGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateParameterGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateParameterGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing subnet group.
    */
  def updateSubnetGroup(): awsDashSdkLib.libRequestMod.Request[UpdateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing subnet group.
    */
  def updateSubnetGroup(params: UpdateSubnetGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSubnetGroup(
    params: UpdateSubnetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSubnetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

