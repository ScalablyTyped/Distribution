package typings.awsSdk.clientsDaxMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DAX extends Service {
  
  @JSName("config")
  var config_DAX: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
    */
  def createCluster(): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
    */
  def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]
  ): Request[CreateClusterResponse, AWSError] = js.native
  
  /**
    * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes in a DAX cluster.
    */
  def createParameterGroup(): Request[CreateParameterGroupResponse, AWSError] = js.native
  def createParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateParameterGroupResponse, Unit]): Request[CreateParameterGroupResponse, AWSError] = js.native
  /**
    * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes in a DAX cluster.
    */
  def createParameterGroup(params: CreateParameterGroupRequest): Request[CreateParameterGroupResponse, AWSError] = js.native
  def createParameterGroup(
    params: CreateParameterGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateParameterGroupResponse, Unit]
  ): Request[CreateParameterGroupResponse, AWSError] = js.native
  
  /**
    * Creates a new subnet group.
    */
  def createSubnetGroup(): Request[CreateSubnetGroupResponse, AWSError] = js.native
  def createSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateSubnetGroupResponse, Unit]): Request[CreateSubnetGroupResponse, AWSError] = js.native
  /**
    * Creates a new subnet group.
    */
  def createSubnetGroup(params: CreateSubnetGroupRequest): Request[CreateSubnetGroupResponse, AWSError] = js.native
  def createSubnetGroup(
    params: CreateSubnetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubnetGroupResponse, Unit]
  ): Request[CreateSubnetGroupResponse, AWSError] = js.native
  
  /**
    * Removes one or more nodes from a DAX cluster.  You cannot use DecreaseReplicationFactor to remove the last node in a DAX cluster. If you need to do this, use DeleteCluster instead. 
    */
  def decreaseReplicationFactor(): Request[DecreaseReplicationFactorResponse, AWSError] = js.native
  def decreaseReplicationFactor(callback: js.Function2[/* err */ AWSError, /* data */ DecreaseReplicationFactorResponse, Unit]): Request[DecreaseReplicationFactorResponse, AWSError] = js.native
  /**
    * Removes one or more nodes from a DAX cluster.  You cannot use DecreaseReplicationFactor to remove the last node in a DAX cluster. If you need to do this, use DeleteCluster instead. 
    */
  def decreaseReplicationFactor(params: DecreaseReplicationFactorRequest): Request[DecreaseReplicationFactorResponse, AWSError] = js.native
  def decreaseReplicationFactor(
    params: DecreaseReplicationFactorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DecreaseReplicationFactorResponse, Unit]
  ): Request[DecreaseReplicationFactorResponse, AWSError] = js.native
  
  /**
    * Deletes a previously provisioned DAX cluster. DeleteCluster deletes all associated nodes, node endpoints and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins deleting the cluster; you cannot cancel or revert this action.
    */
  def deleteCluster(): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * Deletes a previously provisioned DAX cluster. DeleteCluster deletes all associated nodes, node endpoints and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins deleting the cluster; you cannot cancel or revert this action.
    */
  def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]
  ): Request[DeleteClusterResponse, AWSError] = js.native
  
  /**
    * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX clusters.
    */
  def deleteParameterGroup(): Request[DeleteParameterGroupResponse, AWSError] = js.native
  def deleteParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteParameterGroupResponse, Unit]): Request[DeleteParameterGroupResponse, AWSError] = js.native
  /**
    * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX clusters.
    */
  def deleteParameterGroup(params: DeleteParameterGroupRequest): Request[DeleteParameterGroupResponse, AWSError] = js.native
  def deleteParameterGroup(
    params: DeleteParameterGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteParameterGroupResponse, Unit]
  ): Request[DeleteParameterGroupResponse, AWSError] = js.native
  
  /**
    * Deletes a subnet group.  You cannot delete a subnet group if it is associated with any DAX clusters. 
    */
  def deleteSubnetGroup(): Request[DeleteSubnetGroupResponse, AWSError] = js.native
  def deleteSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubnetGroupResponse, Unit]): Request[DeleteSubnetGroupResponse, AWSError] = js.native
  /**
    * Deletes a subnet group.  You cannot delete a subnet group if it is associated with any DAX clusters. 
    */
  def deleteSubnetGroup(params: DeleteSubnetGroupRequest): Request[DeleteSubnetGroupResponse, AWSError] = js.native
  def deleteSubnetGroup(
    params: DeleteSubnetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubnetGroupResponse, Unit]
  ): Request[DeleteSubnetGroupResponse, AWSError] = js.native
  
  /**
    * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific DAX cluster if a cluster identifier is supplied. If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes are successfully provisioned. If the cluster is in the DELETING state, only cluster level information will be displayed. If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is available, the cluster is ready for use. If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is displayed.
    */
  def describeClusters(): Request[DescribeClustersResponse, AWSError] = js.native
  def describeClusters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClustersResponse, Unit]): Request[DescribeClustersResponse, AWSError] = js.native
  /**
    * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific DAX cluster if a cluster identifier is supplied. If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes are successfully provisioned. If the cluster is in the DELETING state, only cluster level information will be displayed. If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is available, the cluster is ready for use. If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is displayed.
    */
  def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse, AWSError] = js.native
  def describeClusters(
    params: DescribeClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClustersResponse, Unit]
  ): Request[DescribeClustersResponse, AWSError] = js.native
  
  /**
    * Returns the default system parameter information for the DAX caching software.
    */
  def describeDefaultParameters(): Request[DescribeDefaultParametersResponse, AWSError] = js.native
  def describeDefaultParameters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDefaultParametersResponse, Unit]): Request[DescribeDefaultParametersResponse, AWSError] = js.native
  /**
    * Returns the default system parameter information for the DAX caching software.
    */
  def describeDefaultParameters(params: DescribeDefaultParametersRequest): Request[DescribeDefaultParametersResponse, AWSError] = js.native
  def describeDefaultParameters(
    params: DescribeDefaultParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDefaultParametersResponse, Unit]
  ): Request[DescribeDefaultParametersResponse, AWSError] = js.native
  
  /**
    * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX cluster or parameter group by providing the name as a parameter. By default, only the events occurring within the last 24 hours are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]): Request[DescribeEventsResponse, AWSError] = js.native
  /**
    * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX cluster or parameter group by providing the name as a parameter. By default, only the events occurring within the last 24 hours are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]
  ): Request[DescribeEventsResponse, AWSError] = js.native
  
  /**
    * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain only the descriptions for that group.
    */
  def describeParameterGroups(): Request[DescribeParameterGroupsResponse, AWSError] = js.native
  def describeParameterGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeParameterGroupsResponse, Unit]): Request[DescribeParameterGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain only the descriptions for that group.
    */
  def describeParameterGroups(params: DescribeParameterGroupsRequest): Request[DescribeParameterGroupsResponse, AWSError] = js.native
  def describeParameterGroups(
    params: DescribeParameterGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeParameterGroupsResponse, Unit]
  ): Request[DescribeParameterGroupsResponse, AWSError] = js.native
  
  /**
    * Returns the detailed parameter list for a particular parameter group.
    */
  def describeParameters(): Request[DescribeParametersResponse, AWSError] = js.native
  def describeParameters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeParametersResponse, Unit]): Request[DescribeParametersResponse, AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular parameter group.
    */
  def describeParameters(params: DescribeParametersRequest): Request[DescribeParametersResponse, AWSError] = js.native
  def describeParameters(
    params: DescribeParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeParametersResponse, Unit]
  ): Request[DescribeParametersResponse, AWSError] = js.native
  
  /**
    * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the description of that group.
    */
  def describeSubnetGroups(): Request[DescribeSubnetGroupsResponse, AWSError] = js.native
  def describeSubnetGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubnetGroupsResponse, Unit]): Request[DescribeSubnetGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the description of that group.
    */
  def describeSubnetGroups(params: DescribeSubnetGroupsRequest): Request[DescribeSubnetGroupsResponse, AWSError] = js.native
  def describeSubnetGroups(
    params: DescribeSubnetGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubnetGroupsResponse, Unit]
  ): Request[DescribeSubnetGroupsResponse, AWSError] = js.native
  
  /**
    * Adds one or more nodes to a DAX cluster.
    */
  def increaseReplicationFactor(): Request[IncreaseReplicationFactorResponse, AWSError] = js.native
  def increaseReplicationFactor(callback: js.Function2[/* err */ AWSError, /* data */ IncreaseReplicationFactorResponse, Unit]): Request[IncreaseReplicationFactorResponse, AWSError] = js.native
  /**
    * Adds one or more nodes to a DAX cluster.
    */
  def increaseReplicationFactor(params: IncreaseReplicationFactorRequest): Request[IncreaseReplicationFactorResponse, AWSError] = js.native
  def increaseReplicationFactor(
    params: IncreaseReplicationFactorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ IncreaseReplicationFactorResponse, Unit]
  ): Request[IncreaseReplicationFactorResponse, AWSError] = js.native
  
  /**
    * List all of the tags for a DAX cluster. You can call ListTags up to 10 times per second, per account.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * List all of the tags for a DAX cluster. You can call ListTags up to 10 times per second, per account.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  
  /**
    * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the node status is set to REBOOTING.   RebootNode restarts the DAX engine process and does not remove the contents of the cache.  
    */
  def rebootNode(): Request[RebootNodeResponse, AWSError] = js.native
  def rebootNode(callback: js.Function2[/* err */ AWSError, /* data */ RebootNodeResponse, Unit]): Request[RebootNodeResponse, AWSError] = js.native
  /**
    * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the node status is set to REBOOTING.   RebootNode restarts the DAX engine process and does not remove the contents of the cache.  
    */
  def rebootNode(params: RebootNodeRequest): Request[RebootNodeResponse, AWSError] = js.native
  def rebootNode(
    params: RebootNodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootNodeResponse, Unit]
  ): Request[RebootNodeResponse, AWSError] = js.native
  
  /**
    * Associates a set of tags with a DAX resource. You can call TagResource up to 5 times per second, per account. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates a set of tags with a DAX resource. You can call TagResource up to 5 times per second, per account. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the association of tags from a DAX resource. You can call UntagResource up to 5 times per second, per account. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the association of tags from a DAX resource. You can call UntagResource up to 5 times per second, per account. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration parameters by specifying the parameters and the new values.
    */
  def updateCluster(): Request[UpdateClusterResponse, AWSError] = js.native
  def updateCluster(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterResponse, Unit]): Request[UpdateClusterResponse, AWSError] = js.native
  /**
    * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration parameters by specifying the parameters and the new values.
    */
  def updateCluster(params: UpdateClusterRequest): Request[UpdateClusterResponse, AWSError] = js.native
  def updateCluster(
    params: UpdateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterResponse, Unit]
  ): Request[UpdateClusterResponse, AWSError] = js.native
  
  /**
    * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def updateParameterGroup(): Request[UpdateParameterGroupResponse, AWSError] = js.native
  def updateParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateParameterGroupResponse, Unit]): Request[UpdateParameterGroupResponse, AWSError] = js.native
  /**
    * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def updateParameterGroup(params: UpdateParameterGroupRequest): Request[UpdateParameterGroupResponse, AWSError] = js.native
  def updateParameterGroup(
    params: UpdateParameterGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateParameterGroupResponse, Unit]
  ): Request[UpdateParameterGroupResponse, AWSError] = js.native
  
  /**
    * Modifies an existing subnet group.
    */
  def updateSubnetGroup(): Request[UpdateSubnetGroupResponse, AWSError] = js.native
  def updateSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubnetGroupResponse, Unit]): Request[UpdateSubnetGroupResponse, AWSError] = js.native
  /**
    * Modifies an existing subnet group.
    */
  def updateSubnetGroup(params: UpdateSubnetGroupRequest): Request[UpdateSubnetGroupResponse, AWSError] = js.native
  def updateSubnetGroup(
    params: UpdateSubnetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubnetGroupResponse, Unit]
  ): Request[UpdateSubnetGroupResponse, AWSError] = js.native
}
