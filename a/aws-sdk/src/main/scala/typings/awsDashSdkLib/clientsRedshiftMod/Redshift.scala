package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redshift
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Redshift: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClientConfiguration = js.native
  /**
     * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type, or number of nodes) and no additional costs. 
     */
  def acceptReservedNodeExchange(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AcceptReservedNodeExchangeOutputMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type, or number of nodes) and no additional costs. 
     */
  def acceptReservedNodeExchange(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AcceptReservedNodeExchangeOutputMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AcceptReservedNodeExchangeOutputMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type, or number of nodes) and no additional costs. 
     */
  def acceptReservedNodeExchange(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AcceptReservedNodeExchangeInputMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AcceptReservedNodeExchangeOutputMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type, or number of nodes) and no additional costs. 
     */
  def acceptReservedNodeExchange(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AcceptReservedNodeExchangeInputMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AcceptReservedNodeExchangeOutputMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AcceptReservedNodeExchangeOutputMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group. You can add as many as 20 ingress rules to an Amazon Redshift security group. If you authorize access to an Amazon EC2 security group, specify EC2SecurityGroupName and EC2SecurityGroupOwnerId. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS region.  If you authorize access to a CIDR/IP address range, specify CIDRIP. For an overview of CIDR blocks, see the Wikipedia article on Classless Inter-Domain Routing.  You must also associate the security group with a cluster so that clients running on these IP addresses or the EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to Working with Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def authorizeClusterSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeClusterSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group. You can add as many as 20 ingress rules to an Amazon Redshift security group. If you authorize access to an Amazon EC2 security group, specify EC2SecurityGroupName and EC2SecurityGroupOwnerId. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS region.  If you authorize access to a CIDR/IP address range, specify CIDRIP. For an overview of CIDR blocks, see the Wikipedia article on Classless Inter-Domain Routing.  You must also associate the security group with a cluster so that clients running on these IP addresses or the EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to Working with Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def authorizeClusterSecurityGroupIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeClusterSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeClusterSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group. You can add as many as 20 ingress rules to an Amazon Redshift security group. If you authorize access to an Amazon EC2 security group, specify EC2SecurityGroupName and EC2SecurityGroupOwnerId. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS region.  If you authorize access to a CIDR/IP address range, specify CIDRIP. For an overview of CIDR blocks, see the Wikipedia article on Classless Inter-Domain Routing.  You must also associate the security group with a cluster so that clients running on these IP addresses or the EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to Working with Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def authorizeClusterSecurityGroupIngress(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeClusterSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeClusterSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group. You can add as many as 20 ingress rules to an Amazon Redshift security group. If you authorize access to an Amazon EC2 security group, specify EC2SecurityGroupName and EC2SecurityGroupOwnerId. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS region.  If you authorize access to a CIDR/IP address range, specify CIDRIP. For an overview of CIDR blocks, see the Wikipedia article on Classless Inter-Domain Routing.  You must also associate the security group with a cluster so that clients running on these IP addresses or the EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to Working with Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def authorizeClusterSecurityGroupIngress(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeClusterSecurityGroupIngressMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeClusterSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeClusterSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Authorizes the specified AWS customer account to restore the specified snapshot.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def authorizeSnapshotAccess(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeSnapshotAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Authorizes the specified AWS customer account to restore the specified snapshot.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def authorizeSnapshotAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeSnapshotAccessResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeSnapshotAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Authorizes the specified AWS customer account to restore the specified snapshot.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def authorizeSnapshotAccess(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeSnapshotAccessMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeSnapshotAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Authorizes the specified AWS customer account to restore the specified snapshot.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def authorizeSnapshotAccess(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeSnapshotAccessMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeSnapshotAccessResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.AuthorizeSnapshotAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated snapshot and it must be in the available state. When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained until you delete them.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def copyClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CopyClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated snapshot and it must be in the available state. When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained until you delete them.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def copyClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CopyClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CopyClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated snapshot and it must be in the available state. When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained until you delete them.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def copyClusterSnapshot(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CopyClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CopyClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated snapshot and it must be in the available state. When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained until you delete them.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def copyClusterSnapshot(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CopyClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CopyClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CopyClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new cluster. To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def createCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new cluster. To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def createCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new cluster. To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def createCluster(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new cluster. To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def createCluster(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon Redshift parameter group. Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster is created by using ModifyCluster.  Parameters in the parameter group define specific behavior that applies to the databases you create on the cluster. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon Redshift parameter group. Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster is created by using ModifyCluster.  Parameters in the parameter group define specific behavior that applies to the databases you create on the cluster. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon Redshift parameter group. Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster is created by using ModifyCluster.  Parameters in the parameter group define specific behavior that applies to the databases you create on the cluster. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterParameterGroup(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon Redshift parameter group. Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster is created by using ModifyCluster.  Parameters in the parameter group define specific behavior that applies to the databases you create on the cluster. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterParameterGroup(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterParameterGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterParameterGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSecurityGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSecurityGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSecurityGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSecurityGroup(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSecurityGroup(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSecurityGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSecurityGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSecurityGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a manual snapshot of the specified cluster. The cluster must be in the available state.   For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a manual snapshot of the specified cluster. The cluster must be in the available state.   For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a manual snapshot of the specified cluster. The cluster must be in the available state.   For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSnapshot(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a manual snapshot of the specified cluster. The cluster must be in the available state.   For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSnapshot(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.  For information about subnet groups, go to Amazon Redshift Cluster Subnet Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.  For information about subnet groups, go to Amazon Redshift Cluster Subnet Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.  For information about subnet groups, go to Amazon Redshift Cluster Subnet Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSubnetGroup(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.  For information about subnet groups, go to Amazon Redshift Cluster Subnet Groups in the Amazon Redshift Cluster Management Guide.
     */
  def createClusterSubnetGroup(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateClusterSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities. Notifications will be sent for all events you want that match those criteria. For example, you can specify source type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity = ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup categories for the specified clusters. If you specify both the source type and source IDs, such as source type = cluster and source identifier = my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source type but do not specify a source identifier, you will receive notice of the events for the objects of that type in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source type if you specify a source ID.
     */
  def createEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities. Notifications will be sent for all events you want that match those criteria. For example, you can specify source type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity = ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup categories for the specified clusters. If you specify both the source type and source IDs, such as source type = cluster and source identifier = my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source type but do not specify a source identifier, you will receive notice of the events for the objects of that type in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source type if you specify a source ID.
     */
  def createEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities. Notifications will be sent for all events you want that match those criteria. For example, you can specify source type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity = ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup categories for the specified clusters. If you specify both the source type and source IDs, such as source type = cluster and source identifier = my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source type but do not specify a source identifier, you will receive notice of the events for the objects of that type in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source type if you specify a source ID.
     */
  def createEventSubscription(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities. Notifications will be sent for all events you want that match those criteria. For example, you can specify source type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity = ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup categories for the specified clusters. If you specify both the source type and source IDs, such as source type = cluster and source identifier = my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source type but do not specify a source identifier, you will receive notice of the events for the objects of that type in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source type if you specify a source ID.
     */
  def createEventSubscription(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in order to store and retrieve the keys used to encrypt the cluster databases. The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate, you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and use encryption keys in the HSM. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
     */
  def createHsmClientCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmClientCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in order to store and retrieve the keys used to encrypt the cluster databases. The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate, you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and use encryption keys in the HSM. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
     */
  def createHsmClientCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmClientCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmClientCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in order to store and retrieve the keys used to encrypt the cluster databases. The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate, you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and use encryption keys in the HSM. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
     */
  def createHsmClientCertificate(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmClientCertificateMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmClientCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in order to store and retrieve the keys used to encrypt the cluster databases. The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate, you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and use encryption keys in the HSM. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
     */
  def createHsmClientCertificate(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmClientCertificateMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmClientCertificateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmClientCertificateResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM. In addition to creating an HSM configuration, you must also create an HSM client certificate. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
     */
  def createHsmConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM. In addition to creating an HSM configuration, you must also create an HSM client certificate. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
     */
  def createHsmConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM. In addition to creating an HSM configuration, you must also create an HSM client certificate. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
     */
  def createHsmConfiguration(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmConfigurationMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM. In addition to creating an HSM configuration, you must also create an HSM client certificate. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
     */
  def createHsmConfiguration(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmConfigurationMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateHsmConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key Management Service (AWS KMS) to encrypt copied snapshots in a destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
     */
  def createSnapshotCopyGrant(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateSnapshotCopyGrantResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key Management Service (AWS KMS) to encrypt copied snapshots in a destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
     */
  def createSnapshotCopyGrant(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateSnapshotCopyGrantResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateSnapshotCopyGrantResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key Management Service (AWS KMS) to encrypt copied snapshots in a destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
     */
  def createSnapshotCopyGrant(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateSnapshotCopyGrantMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateSnapshotCopyGrantResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key Management Service (AWS KMS) to encrypt copied snapshots in a destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
     */
  def createSnapshotCopyGrant(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateSnapshotCopyGrantMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateSnapshotCopyGrantResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateSnapshotCopyGrantResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more tags to a specified resource. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an error and the attempt will fail. If you specify a key that already exists for the resource, the value for that key will be updated with the new value.
     */
  def createTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to a specified resource. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an error and the attempt will fail. If you specify a key that already exists for the resource, the value for that key will be updated with the new value.
     */
  def createTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to a specified resource. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an error and the attempt will fail. If you specify a key that already exists for the resource, the value for that key will be updated with the new value.
     */
  def createTags(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateTagsMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds one or more tags to a specified resource. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an error and the attempt will fail. If you specify a key that already exists for the resource, the value for that key will be updated with the new value.
     */
  def createTags(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.CreateTagsMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a previously provisioned cluster. A successful response from the web service indicates that the request was received correctly. Use DescribeClusters to monitor the status of the deletion. The delete operation cannot be canceled or reverted once submitted. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you want to shut down the cluster and retain it for future use, set SkipFinalClusterSnapshot to false and specify a name for FinalClusterSnapshotIdentifier. You can later restore this snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the cluster.   For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def deleteCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a previously provisioned cluster. A successful response from the web service indicates that the request was received correctly. Use DescribeClusters to monitor the status of the deletion. The delete operation cannot be canceled or reverted once submitted. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you want to shut down the cluster and retain it for future use, set SkipFinalClusterSnapshot to false and specify a name for FinalClusterSnapshotIdentifier. You can later restore this snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the cluster.   For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def deleteCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a previously provisioned cluster. A successful response from the web service indicates that the request was received correctly. Use DescribeClusters to monitor the status of the deletion. The delete operation cannot be canceled or reverted once submitted. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you want to shut down the cluster and retain it for future use, set SkipFinalClusterSnapshot to false and specify a name for FinalClusterSnapshotIdentifier. You can later restore this snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the cluster.   For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def deleteCluster(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a previously provisioned cluster. A successful response from the web service indicates that the request was received correctly. Use DescribeClusters to monitor the status of the deletion. The delete operation cannot be canceled or reverted once submitted. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you want to shut down the cluster and retain it for future use, set SkipFinalClusterSnapshot to false and specify a name for FinalClusterSnapshotIdentifier. You can later restore this snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the cluster.   For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def deleteCluster(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified Amazon Redshift parameter group.  You cannot delete a parameter group if it is associated with a cluster. 
     */
  def deleteClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified Amazon Redshift parameter group.  You cannot delete a parameter group if it is associated with a cluster. 
     */
  def deleteClusterParameterGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified Amazon Redshift parameter group.  You cannot delete a parameter group if it is associated with a cluster. 
     */
  def deleteClusterParameterGroup(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified Amazon Redshift parameter group.  You cannot delete a parameter group if it is associated with a cluster. 
     */
  def deleteClusterParameterGroup(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterParameterGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Amazon Redshift security group.  You cannot delete a security group that is associated with any clusters. You cannot delete the default security group.   For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def deleteClusterSecurityGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Amazon Redshift security group.  You cannot delete a security group that is associated with any clusters. You cannot delete the default security group.   For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def deleteClusterSecurityGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Amazon Redshift security group.  You cannot delete a security group that is associated with any clusters. You cannot delete the default security group.   For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def deleteClusterSecurityGroup(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Amazon Redshift security group.  You cannot delete a security group that is associated with any clusters. You cannot delete the default security group.   For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
     */
  def deleteClusterSecurityGroup(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSecurityGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified manual snapshot. The snapshot must be in the available state, with no other users authorized to access the snapshot.  Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can delete the snapshot.
     */
  def deleteClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified manual snapshot. The snapshot must be in the available state, with no other users authorized to access the snapshot.  Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can delete the snapshot.
     */
  def deleteClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified manual snapshot. The snapshot must be in the available state, with no other users authorized to access the snapshot.  Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can delete the snapshot.
     */
  def deleteClusterSnapshot(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified manual snapshot. The snapshot must be in the available state, with no other users authorized to access the snapshot.  Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can delete the snapshot.
     */
  def deleteClusterSnapshot(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified cluster subnet group.
     */
  def deleteClusterSubnetGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified cluster subnet group.
     */
  def deleteClusterSubnetGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified cluster subnet group.
     */
  def deleteClusterSubnetGroup(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified cluster subnet group.
     */
  def deleteClusterSubnetGroup(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteClusterSubnetGroupMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Amazon Redshift event notification subscription.
     */
  def deleteEventSubscription(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Amazon Redshift event notification subscription.
     */
  def deleteEventSubscription(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Amazon Redshift event notification subscription.
     */
  def deleteEventSubscription(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an Amazon Redshift event notification subscription.
     */
  def deleteEventSubscription(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteEventSubscriptionMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified HSM client certificate.
     */
  def deleteHsmClientCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified HSM client certificate.
     */
  def deleteHsmClientCertificate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified HSM client certificate.
     */
  def deleteHsmClientCertificate(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteHsmClientCertificateMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified HSM client certificate.
     */
  def deleteHsmClientCertificate(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteHsmClientCertificateMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Amazon Redshift HSM configuration.
     */
  def deleteHsmConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Amazon Redshift HSM configuration.
     */
  def deleteHsmConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Amazon Redshift HSM configuration.
     */
  def deleteHsmConfiguration(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteHsmConfigurationMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Amazon Redshift HSM configuration.
     */
  def deleteHsmConfiguration(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteHsmConfigurationMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified snapshot copy grant.
     */
  def deleteSnapshotCopyGrant(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified snapshot copy grant.
     */
  def deleteSnapshotCopyGrant(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified snapshot copy grant.
     */
  def deleteSnapshotCopyGrant(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteSnapshotCopyGrantMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified snapshot copy grant.
     */
  def deleteSnapshotCopyGrant(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteSnapshotCopyGrantMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the tag or tags.
     */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the tag or tags.
     */
  def deleteTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the tag or tags.
     */
  def deleteTags(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteTagsMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the tag or tags.
     */
  def deleteTags(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DeleteTagsMessage,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Returns an array of ClusterDbRevision objects.
     */
  def describeClusterDbRevisions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterDbRevisionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of ClusterDbRevision objects.
     */
  def describeClusterDbRevisions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterDbRevisionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterDbRevisionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of ClusterDbRevision objects.
     */
  def describeClusterDbRevisions(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterDbRevisionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterDbRevisionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of ClusterDbRevision objects.
     */
  def describeClusterDbRevisions(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterDbRevisionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterDbRevisionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterDbRevisionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default parameter group. For each parameter group, the response includes the parameter group name, description, and parameter group family name. You can optionally specify a name to retrieve the description of a specific parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all parameter groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterParameterGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default parameter group. For each parameter group, the response includes the parameter group name, description, and parameter group family name. You can optionally specify a name to retrieve the description of a specific parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all parameter groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterParameterGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default parameter group. For each parameter group, the response includes the parameter group name, description, and parameter group family name. You can optionally specify a name to retrieve the description of a specific parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all parameter groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterParameterGroups(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default parameter group. For each parameter group, the response includes the parameter group name, description, and parameter group family name. You can optionally specify a name to retrieve the description of a specific parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all parameter groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterParameterGroups(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterParameterGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each parameter the response includes information such as parameter name, description, data type, value, whether the parameter value is modifiable, and so on. You can specify source filter to retrieve parameters of only specific type. For example, to retrieve parameters that were modified by a user action such as from ModifyClusterParameterGroup, you can specify source equal to user.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def describeClusterParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each parameter the response includes information such as parameter name, description, data type, value, whether the parameter value is modifiable, and so on. You can specify source filter to retrieve parameters of only specific type. For example, to retrieve parameters that were modified by a user action such as from ModifyClusterParameterGroup, you can specify source equal to user.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def describeClusterParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each parameter the response includes information such as parameter name, description, data type, value, whether the parameter value is modifiable, and so on. You can specify source filter to retrieve parameters of only specific type. For example, to retrieve parameters that were modified by a user action such as from ModifyClusterParameterGroup, you can specify source equal to user.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def describeClusterParameters(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each parameter the response includes information such as parameter name, description, data type, value, whether the parameter value is modifiable, and so on. You can specify source filter to retrieve parameters of only specific type. For example, to retrieve parameters that were modified by a user action such as from ModifyClusterParameterGroup, you can specify source equal to user.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def describeClusterParameters(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupDetails, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupDetails, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the response will contain only information about only that security group.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all security groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, security groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSecurityGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the response will contain only information about only that security group.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all security groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, security groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSecurityGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSecurityGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the response will contain only information about only that security group.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all security groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, security groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSecurityGroups(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterSecurityGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the response will contain only information about only that security group.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all security groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, security groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSecurityGroups(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterSecurityGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSecurityGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSecurityGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No information is returned for snapshots owned by inactive AWS customer accounts. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all snapshots that have any combination of those values are returned. Only snapshots that you own are returned in the response; shared snapshots are not returned with the tag key and tag value request parameters. If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSnapshots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No information is returned for snapshots owned by inactive AWS customer accounts. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all snapshots that have any combination of those values are returned. Only snapshots that you own are returned in the response; shared snapshots are not returned with the tag key and tag value request parameters. If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSnapshots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No information is returned for snapshots owned by inactive AWS customer accounts. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all snapshots that have any combination of those values are returned. Only snapshots that you own are returned in the response; shared snapshots are not returned with the tag key and tag value request parameters. If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSnapshots(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No information is returned for snapshots owned by inactive AWS customer accounts. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all snapshots that have any combination of those values are returned. Only snapshots that you own are returned in the response; shared snapshots are not returned with the tag key and tag value request parameters. If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSnapshots(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterSnapshotsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By default, this operation returns information about all cluster subnet groups that are defined in you AWS account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subnet groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSubnetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By default, this operation returns information about all cluster subnet groups that are defined in you AWS account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subnet groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSubnetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By default, this operation returns information about all cluster subnet groups that are defined in you AWS account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subnet groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSubnetGroups(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By default, this operation returns information about all cluster subnet groups that are defined in you AWS account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subnet groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusterSubnetGroups(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterSubnetGroupsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSubnetGroupMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterSubnetGroupMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all the available maintenance tracks.
     */
  def describeClusterTracks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TrackListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all the available maintenance tracks.
     */
  def describeClusterTracks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TrackListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TrackListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all the available maintenance tracks.
     */
  def describeClusterTracks(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterTracksMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TrackListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all the available maintenance tracks.
     */
  def describeClusterTracks(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterTracksMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TrackListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TrackListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before creating any clusters to learn more about the Amazon Redshift versions. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def describeClusterVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterVersionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before creating any clusters to learn more about the Amazon Redshift versions. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def describeClusterVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterVersionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterVersionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before creating any clusters to learn more about the Amazon Redshift versions. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def describeClusterVersions(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterVersionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterVersionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before creating any clusters to learn more about the Amazon Redshift versions. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def describeClusterVersions(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterVersionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterVersionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterVersionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns properties of provisioned clusters including general cluster properties, cluster database properties, maintenance and backup properties, and security and access properties. This operation supports pagination. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all clusters that have any combination of those values are returned. If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns properties of provisioned clusters including general cluster properties, cluster database properties, maintenance and backup properties, and security and access properties. This operation supports pagination. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all clusters that have any combination of those values are returned. If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns properties of provisioned clusters including general cluster properties, cluster database properties, maintenance and backup properties, and security and access properties. This operation supports pagination. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all clusters that have any combination of those values are returned. If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusters(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClustersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns properties of provisioned clusters including general cluster properties, cluster database properties, maintenance and backup properties, and security and access properties. This operation supports pagination. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all clusters that have any combination of those values are returned. If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeClusters(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClustersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of parameter settings for the specified parameter group family.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def describeDefaultClusterParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of parameter settings for the specified parameter group family.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def describeDefaultClusterParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeDefaultClusterParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of parameter settings for the specified parameter group family.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def describeDefaultClusterParameters(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeDefaultClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of parameter settings for the specified parameter group family.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def describeDefaultClusterParameters(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeDefaultClusterParametersMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeDefaultClusterParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeDefaultClusterParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays a list of event categories for all event source types, or for a specified source type. For a list of the event categories and source types, go to Amazon Redshift Event Notifications.
     */
  def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays a list of event categories for all event source types, or for a specified source type. For a list of the event categories and source types, go to Amazon Redshift Event Notifications.
     */
  def describeEventCategories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventCategoriesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays a list of event categories for all event source types, or for a specified source type. For a list of the event categories and source types, go to Amazon Redshift Event Notifications.
     */
  def describeEventCategories(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays a list of event categories for all event source types, or for a specified source type. For a list of the event categories and source types, go to Amazon Redshift Event Notifications.
     */
  def describeEventCategories(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeEventCategoriesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventCategoriesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventCategoriesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you specify a subscription name, lists the description for that subscription. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification subscriptions that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subscriptions that have any combination of those values are returned. If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeEventSubscriptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you specify a subscription name, lists the description for that subscription. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification subscriptions that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subscriptions that have any combination of those values are returned. If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeEventSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventSubscriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you specify a subscription name, lists the description for that subscription. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification subscriptions that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subscriptions that have any combination of those values are returned. If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeEventSubscriptions(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeEventSubscriptionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you specify a subscription name, lists the description for that subscription. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification subscriptions that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subscriptions that have any combination of those values are returned. If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeEventSubscriptions(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeEventSubscriptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventSubscriptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventSubscriptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
     */
  def describeEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
     */
  def describeEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
     */
  def describeEvents(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
     */
  def describeEvents(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeEventsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EventsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns information about all the HSM certificates owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client certificates that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM client certificates that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeHsmClientCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmClientCertificateMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns information about all the HSM certificates owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client certificates that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM client certificates that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeHsmClientCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmClientCertificateMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmClientCertificateMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns information about all the HSM certificates owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client certificates that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM client certificates that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeHsmClientCertificates(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeHsmClientCertificatesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmClientCertificateMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns information about all the HSM certificates owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client certificates that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM client certificates that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeHsmClientCertificates(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeHsmClientCertificatesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmClientCertificateMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmClientCertificateMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified, returns information about all the HSM configurations owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM connections that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeHsmConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmConfigurationMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified, returns information about all the HSM configurations owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM connections that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeHsmConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmConfigurationMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmConfigurationMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified, returns information about all the HSM configurations owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM connections that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeHsmConfigurations(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeHsmConfigurationsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmConfigurationMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified, returns information about all the HSM configurations owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM connections that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeHsmConfigurations(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeHsmConfigurationsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmConfigurationMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.HsmConfigurationMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon Redshift cluster.
     */
  def describeLoggingStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon Redshift cluster.
     */
  def describeLoggingStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon Redshift cluster.
     */
  def describeLoggingStatus(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeLoggingStatusMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon Redshift cluster.
     */
  def describeLoggingStatus(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeLoggingStatusMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS region that you can specify, and the node types you can request. The node types differ by available storage, memory, CPU and price. With the cost involved you might want to obtain a list of cluster options in the specific region and specify values when creating a cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def describeOrderableClusterOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.OrderableClusterOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS region that you can specify, and the node types you can request. The node types differ by available storage, memory, CPU and price. With the cost involved you might want to obtain a list of cluster options in the specific region and specify values when creating a cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def describeOrderableClusterOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.OrderableClusterOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.OrderableClusterOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS region that you can specify, and the node types you can request. The node types differ by available storage, memory, CPU and price. With the cost involved you might want to obtain a list of cluster options in the specific region and specify values when creating a cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def describeOrderableClusterOptions(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeOrderableClusterOptionsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.OrderableClusterOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS region that you can specify, and the node types you can request. The node types differ by available storage, memory, CPU and price. With the cost involved you might want to obtain a list of cluster options in the specific region and specify values when creating a cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
     */
  def describeOrderableClusterOptions(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeOrderableClusterOptionsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.OrderableClusterOptionsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.OrderableClusterOptionsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you. These descriptions help you determine which reserve node offering you want to purchase. You then use the unique offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon Redshift cluster.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
     */
  def describeReservedNodeOfferings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodeOfferingsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you. These descriptions help you determine which reserve node offering you want to purchase. You then use the unique offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon Redshift cluster.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
     */
  def describeReservedNodeOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodeOfferingsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodeOfferingsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you. These descriptions help you determine which reserve node offering you want to purchase. You then use the unique offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon Redshift cluster.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
     */
  def describeReservedNodeOfferings(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeReservedNodeOfferingsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodeOfferingsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you. These descriptions help you determine which reserve node offering you want to purchase. You then use the unique offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon Redshift cluster.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
     */
  def describeReservedNodeOfferings(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeReservedNodeOfferingsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodeOfferingsMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodeOfferingsMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the descriptions of the reserved nodes.
     */
  def describeReservedNodes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the descriptions of the reserved nodes.
     */
  def describeReservedNodes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the descriptions of the reserved nodes.
     */
  def describeReservedNodes(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeReservedNodesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the descriptions of the reserved nodes.
     */
  def describeReservedNodes(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeReservedNodesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodesMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ReservedNodesMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the last resize operation for the specified cluster. If no resize operation has ever been initiated for the specified cluster, a HTTP 404 error is returned. If a resize operation was initiated and completed, the status of the resize remains as SUCCEEDED until the next resize.  A resize operation can be requested using ModifyCluster and specifying a different number or type of nodes for the cluster. 
     */
  def describeResize(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeProgressMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the last resize operation for the specified cluster. If no resize operation has ever been initiated for the specified cluster, a HTTP 404 error is returned. If a resize operation was initiated and completed, the status of the resize remains as SUCCEEDED until the next resize.  A resize operation can be requested using ModifyCluster and specifying a different number or type of nodes for the cluster. 
     */
  def describeResize(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeProgressMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeProgressMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the last resize operation for the specified cluster. If no resize operation has ever been initiated for the specified cluster, a HTTP 404 error is returned. If a resize operation was initiated and completed, the status of the resize remains as SUCCEEDED until the next resize.  A resize operation can be requested using ModifyCluster and specifying a different number or type of nodes for the cluster. 
     */
  def describeResize(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeResizeMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeProgressMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the last resize operation for the specified cluster. If no resize operation has ever been initiated for the specified cluster, a HTTP 404 error is returned. If a resize operation was initiated and completed, the status of the resize remains as SUCCEEDED until the next resize.  A resize operation can be requested using ModifyCluster and specifying a different number or type of nodes for the cluster. 
     */
  def describeResize(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeResizeMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeProgressMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeProgressMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of snapshot copy grants owned by the AWS account in the destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
     */
  def describeSnapshotCopyGrants(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotCopyGrantMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of snapshot copy grants owned by the AWS account in the destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
     */
  def describeSnapshotCopyGrants(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotCopyGrantMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotCopyGrantMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of snapshot copy grants owned by the AWS account in the destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
     */
  def describeSnapshotCopyGrants(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeSnapshotCopyGrantsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotCopyGrantMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of snapshot copy grants owned by the AWS account in the destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
     */
  def describeSnapshotCopyGrants(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeSnapshotCopyGrantsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotCopyGrantMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotCopyGrantMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the status of one or more table restore requests made using the RestoreTableFromClusterSnapshot API action. If you don't specify a value for the TableRestoreRequestId parameter, then DescribeTableRestoreStatus returns the status of all table restore requests ordered by the date and time of the request in ascending order. Otherwise DescribeTableRestoreStatus returns the status of the table specified by TableRestoreRequestId.
     */
  def describeTableRestoreStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TableRestoreStatusMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the status of one or more table restore requests made using the RestoreTableFromClusterSnapshot API action. If you don't specify a value for the TableRestoreRequestId parameter, then DescribeTableRestoreStatus returns the status of all table restore requests ordered by the date and time of the request in ascending order. Otherwise DescribeTableRestoreStatus returns the status of the table specified by TableRestoreRequestId.
     */
  def describeTableRestoreStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TableRestoreStatusMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TableRestoreStatusMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the status of one or more table restore requests made using the RestoreTableFromClusterSnapshot API action. If you don't specify a value for the TableRestoreRequestId parameter, then DescribeTableRestoreStatus returns the status of all table restore requests ordered by the date and time of the request in ascending order. Otherwise DescribeTableRestoreStatus returns the status of the table specified by TableRestoreRequestId.
     */
  def describeTableRestoreStatus(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeTableRestoreStatusMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TableRestoreStatusMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the status of one or more table restore requests made using the RestoreTableFromClusterSnapshot API action. If you don't specify a value for the TableRestoreRequestId parameter, then DescribeTableRestoreStatus returns the status of all table restore requests ordered by the date and time of the request in ascending order. Otherwise DescribeTableRestoreStatus returns the status of the table specified by TableRestoreRequestId.
     */
  def describeTableRestoreStatus(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeTableRestoreStatusMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TableRestoreStatusMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TableRestoreStatusMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all tags for a given type of resource, such as clusters, snapshots, and so on. The following are limitations for DescribeTags:    You cannot specify an ARN and a resource-type value together in the same request.   You cannot use the MaxRecords and Marker parameters together with the ARN parameter.   The MaxRecords parameter can be a range from 10 to 50 results to return in a request.   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all resources that have any combination of those values are returned. If both tag keys and values are omitted from the request, resources are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TaggedResourceListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all tags for a given type of resource, such as clusters, snapshots, and so on. The following are limitations for DescribeTags:    You cannot specify an ARN and a resource-type value together in the same request.   You cannot use the MaxRecords and Marker parameters together with the ARN parameter.   The MaxRecords parameter can be a range from 10 to 50 results to return in a request.   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all resources that have any combination of those values are returned. If both tag keys and values are omitted from the request, resources are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TaggedResourceListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TaggedResourceListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all tags for a given type of resource, such as clusters, snapshots, and so on. The following are limitations for DescribeTags:    You cannot specify an ARN and a resource-type value together in the same request.   You cannot use the MaxRecords and Marker parameters together with the ARN parameter.   The MaxRecords parameter can be a range from 10 to 50 results to return in a request.   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all resources that have any combination of those values are returned. If both tag keys and values are omitted from the request, resources are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeTags(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeTagsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TaggedResourceListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all tags for a given type of resource, such as clusters, snapshots, and so on. The following are limitations for DescribeTags:    You cannot specify an ARN and a resource-type value together in the same request.   You cannot use the MaxRecords and Marker parameters together with the ARN parameter.   The MaxRecords parameter can be a range from 10 to 50 results to return in a request.   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all resources that have any combination of those values are returned. If both tag keys and values are omitted from the request, resources are returned regardless of whether they have tag keys or values associated with them.
     */
  def describeTags(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeTagsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TaggedResourceListMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.TaggedResourceListMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     */
  def disableLogging(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     */
  def disableLogging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     */
  def disableLogging(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DisableLoggingMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     */
  def disableLogging(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DisableLoggingMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables the automatic copying of snapshots from one region to another region for a specified cluster. If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use DeleteSnapshotCopyGrant to delete the grant that grants Amazon Redshift permission to the CMK in the destination region. 
     */
  def disableSnapshotCopy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DisableSnapshotCopyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables the automatic copying of snapshots from one region to another region for a specified cluster. If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use DeleteSnapshotCopyGrant to delete the grant that grants Amazon Redshift permission to the CMK in the destination region. 
     */
  def disableSnapshotCopy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DisableSnapshotCopyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DisableSnapshotCopyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables the automatic copying of snapshots from one region to another region for a specified cluster. If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use DeleteSnapshotCopyGrant to delete the grant that grants Amazon Redshift permission to the CMK in the destination region. 
     */
  def disableSnapshotCopy(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DisableSnapshotCopyMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DisableSnapshotCopyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables the automatic copying of snapshots from one region to another region for a specified cluster. If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use DeleteSnapshotCopyGrant to delete the grant that grants Amazon Redshift permission to the CMK in the destination region. 
     */
  def disableSnapshotCopy(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DisableSnapshotCopyMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DisableSnapshotCopyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DisableSnapshotCopyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     */
  def enableLogging(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     */
  def enableLogging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     */
  def enableLogging(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EnableLoggingMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     */
  def enableLogging(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EnableLoggingMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.LoggingStatus, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
     */
  def enableSnapshotCopy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EnableSnapshotCopyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
     */
  def enableSnapshotCopy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EnableSnapshotCopyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EnableSnapshotCopyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
     */
  def enableSnapshotCopy(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EnableSnapshotCopyMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EnableSnapshotCopyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
     */
  def enableSnapshotCopy(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EnableSnapshotCopyMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EnableSnapshotCopyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.EnableSnapshotCopyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift database. The action returns the database user name prefixed with IAM: if AutoCreate is False or IAMA: if AutoCreate is True. You can optionally specify one or more database user groups that the user will join at log on. By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes). For more information, see Using IAM Authentication to Generate Database User Credentials in the Amazon Redshift Cluster Management Guide. The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM policy attached that allows access to all necessary actions and resources. For more information about permissions, see Resource Policies for GetClusterCredentials in the Amazon Redshift Cluster Management Guide. If the DbGroups parameter is specified, the IAM policy must allow the redshift:JoinGroup action with access to the listed dbgroups.  In addition, if the AutoCreate parameter is set to True, then the policy must include the redshift:CreateClusterUser privilege. If the DbName parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name. 
     */
  def getClusterCredentials(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterCredentials, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift database. The action returns the database user name prefixed with IAM: if AutoCreate is False or IAMA: if AutoCreate is True. You can optionally specify one or more database user groups that the user will join at log on. By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes). For more information, see Using IAM Authentication to Generate Database User Credentials in the Amazon Redshift Cluster Management Guide. The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM policy attached that allows access to all necessary actions and resources. For more information about permissions, see Resource Policies for GetClusterCredentials in the Amazon Redshift Cluster Management Guide. If the DbGroups parameter is specified, the IAM policy must allow the redshift:JoinGroup action with access to the listed dbgroups.  In addition, if the AutoCreate parameter is set to True, then the policy must include the redshift:CreateClusterUser privilege. If the DbName parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name. 
     */
  def getClusterCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterCredentials, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterCredentials, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift database. The action returns the database user name prefixed with IAM: if AutoCreate is False or IAMA: if AutoCreate is True. You can optionally specify one or more database user groups that the user will join at log on. By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes). For more information, see Using IAM Authentication to Generate Database User Credentials in the Amazon Redshift Cluster Management Guide. The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM policy attached that allows access to all necessary actions and resources. For more information about permissions, see Resource Policies for GetClusterCredentials in the Amazon Redshift Cluster Management Guide. If the DbGroups parameter is specified, the IAM policy must allow the redshift:JoinGroup action with access to the listed dbgroups.  In addition, if the AutoCreate parameter is set to True, then the policy must include the redshift:CreateClusterUser privilege. If the DbName parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name. 
     */
  def getClusterCredentials(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.GetClusterCredentialsMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterCredentials, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift database. The action returns the database user name prefixed with IAM: if AutoCreate is False or IAMA: if AutoCreate is True. You can optionally specify one or more database user groups that the user will join at log on. By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes). For more information, see Using IAM Authentication to Generate Database User Credentials in the Amazon Redshift Cluster Management Guide. The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM policy attached that allows access to all necessary actions and resources. For more information about permissions, see Resource Policies for GetClusterCredentials in the Amazon Redshift Cluster Management Guide. If the DbGroups parameter is specified, the IAM policy must allow the redshift:JoinGroup action with access to the listed dbgroups.  In addition, if the AutoCreate parameter is set to True, then the policy must include the redshift:CreateClusterUser privilege. If the DbName parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name. 
     */
  def getClusterCredentials(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.GetClusterCredentialsMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterCredentials, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterCredentials, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given DC1 reserved node.
     */
  def getReservedNodeExchangeOfferings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.GetReservedNodeExchangeOfferingsOutputMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given DC1 reserved node.
     */
  def getReservedNodeExchangeOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.GetReservedNodeExchangeOfferingsOutputMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.GetReservedNodeExchangeOfferingsOutputMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given DC1 reserved node.
     */
  def getReservedNodeExchangeOfferings(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.GetReservedNodeExchangeOfferingsInputMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.GetReservedNodeExchangeOfferingsOutputMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given DC1 reserved node.
     */
  def getReservedNodeExchangeOfferings(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.GetReservedNodeExchangeOfferingsInputMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.GetReservedNodeExchangeOfferingsOutputMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.GetReservedNodeExchangeOfferingsOutputMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the settings for a cluster. For example, you can add another security or parameter group, update the preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a reboot for parameters to take effect. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster, you must specify both the number of nodes and the node type even if one of the parameters does not change.
     */
  def modifyCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the settings for a cluster. For example, you can add another security or parameter group, update the preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a reboot for parameters to take effect. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster, you must specify both the number of nodes and the node type even if one of the parameters does not change.
     */
  def modifyCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the settings for a cluster. For example, you can add another security or parameter group, update the preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a reboot for parameters to take effect. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster, you must specify both the number of nodes and the node type even if one of the parameters does not change.
     */
  def modifyCluster(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the settings for a cluster. For example, you can add another security or parameter group, update the preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a reboot for parameters to take effect. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster, you must specify both the number of nodes and the node type even if one of the parameters does not change.
     */
  def modifyCluster(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the database revision of a cluster. The database revision is a unique revision of the database running in a cluster.
     */
  def modifyClusterDbRevision(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterDbRevisionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the database revision of a cluster. The database revision is a unique revision of the database running in a cluster.
     */
  def modifyClusterDbRevision(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterDbRevisionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterDbRevisionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the database revision of a cluster. The database revision is a unique revision of the database running in a cluster.
     */
  def modifyClusterDbRevision(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterDbRevisionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterDbRevisionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the database revision of a cluster. The database revision is a unique revision of the database running in a cluster.
     */
  def modifyClusterDbRevision(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterDbRevisionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterDbRevisionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterDbRevisionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. A cluster can have up to 10 IAM roles associated at any time.
     */
  def modifyClusterIamRoles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterIamRolesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. A cluster can have up to 10 IAM roles associated at any time.
     */
  def modifyClusterIamRoles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterIamRolesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterIamRolesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. A cluster can have up to 10 IAM roles associated at any time.
     */
  def modifyClusterIamRoles(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterIamRolesMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterIamRolesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. A cluster can have up to 10 IAM roles associated at any time.
     */
  def modifyClusterIamRoles(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterIamRolesMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterIamRolesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterIamRolesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the parameters of a parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def modifyClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the parameters of a parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def modifyClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the parameters of a parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def modifyClusterParameterGroup(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the parameters of a parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
     */
  def modifyClusterParameterGroup(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing list of subnets with the new list of subnets.
     */
  def modifyClusterSubnetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing list of subnets with the new list of subnets.
     */
  def modifyClusterSubnetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing list of subnets with the new list of subnets.
     */
  def modifyClusterSubnetGroup(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing list of subnets with the new list of subnets.
     */
  def modifyClusterSubnetGroup(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterSubnetGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterSubnetGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyClusterSubnetGroupResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies an existing Amazon Redshift event notification subscription.
     */
  def modifyEventSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies an existing Amazon Redshift event notification subscription.
     */
  def modifyEventSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies an existing Amazon Redshift event notification subscription.
     */
  def modifyEventSubscription(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies an existing Amazon Redshift event notification subscription.
     */
  def modifyEventSubscription(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyEventSubscriptionMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyEventSubscriptionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifyEventSubscriptionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the number of days to retain automated snapshots in the destination region after they are copied from the source region.
     */
  def modifySnapshotCopyRetentionPeriod(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifySnapshotCopyRetentionPeriodResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the number of days to retain automated snapshots in the destination region after they are copied from the source region.
     */
  def modifySnapshotCopyRetentionPeriod(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifySnapshotCopyRetentionPeriodResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifySnapshotCopyRetentionPeriodResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the number of days to retain automated snapshots in the destination region after they are copied from the source region.
     */
  def modifySnapshotCopyRetentionPeriod(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifySnapshotCopyRetentionPeriodMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifySnapshotCopyRetentionPeriodResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the number of days to retain automated snapshots in the destination region after they are copied from the source region.
     */
  def modifySnapshotCopyRetentionPeriod(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifySnapshotCopyRetentionPeriodMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifySnapshotCopyRetentionPeriodResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ModifySnapshotCopyRetentionPeriodResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You can purchase one or more of the offerings. You can call the DescribeReservedNodeOfferings API to obtain the available reserved node offerings. You can call this API by providing a specific reserved node offering and the number of nodes you want to reserve.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
     */
  def purchaseReservedNodeOffering(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.PurchaseReservedNodeOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You can purchase one or more of the offerings. You can call the DescribeReservedNodeOfferings API to obtain the available reserved node offerings. You can call this API by providing a specific reserved node offering and the number of nodes you want to reserve.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
     */
  def purchaseReservedNodeOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.PurchaseReservedNodeOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.PurchaseReservedNodeOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You can purchase one or more of the offerings. You can call the DescribeReservedNodeOfferings API to obtain the available reserved node offerings. You can call this API by providing a specific reserved node offering and the number of nodes you want to reserve.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
     */
  def purchaseReservedNodeOffering(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.PurchaseReservedNodeOfferingMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.PurchaseReservedNodeOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You can purchase one or more of the offerings. You can call the DescribeReservedNodeOfferings API to obtain the available reserved node offerings. You can call this API by providing a specific reserved node offering and the number of nodes you want to reserve.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
     */
  def purchaseReservedNodeOffering(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.PurchaseReservedNodeOfferingMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.PurchaseReservedNodeOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.PurchaseReservedNodeOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster, during which the cluster status is set to rebooting. A cluster event is created when the reboot is completed. Any pending cluster modifications (see ModifyCluster) are applied at this reboot. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. 
     */
  def rebootCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RebootClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster, during which the cluster status is set to rebooting. A cluster event is created when the reboot is completed. Any pending cluster modifications (see ModifyCluster) are applied at this reboot. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. 
     */
  def rebootCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RebootClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RebootClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster, during which the cluster status is set to rebooting. A cluster event is created when the reboot is completed. Any pending cluster modifications (see ModifyCluster) are applied at this reboot. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. 
     */
  def rebootCluster(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RebootClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RebootClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster, during which the cluster status is set to rebooting. A cluster event is created when the reboot is completed. Any pending cluster modifications (see ModifyCluster) are applied at this reboot. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. 
     */
  def rebootCluster(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RebootClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RebootClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RebootClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets one or more parameters of the specified parameter group to their default values and sets the source values of the parameters to "engine-default". To reset the entire parameter group specify the ResetAllParameters parameter. For parameter changes to take effect you must reboot any associated clusters. 
     */
  def resetClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets one or more parameters of the specified parameter group to their default values and sets the source values of the parameters to "engine-default". To reset the entire parameter group specify the ResetAllParameters parameter. For parameter changes to take effect you must reboot any associated clusters. 
     */
  def resetClusterParameterGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets one or more parameters of the specified parameter group to their default values and sets the source values of the parameters to "engine-default". To reset the entire parameter group specify the ResetAllParameters parameter. For parameter changes to take effect you must reboot any associated clusters. 
     */
  def resetClusterParameterGroup(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResetClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets one or more parameters of the specified parameter group to their default values and sets the source values of the parameters to "engine-default". To reset the entire parameter group specify the ResetAllParameters parameter. For parameter changes to take effect you must reboot any associated clusters. 
     */
  def resetClusterParameterGroup(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResetClusterParameterGroupMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClusterParameterGroupNameMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The default behavior is to use the elastic resize method. With an elastic resize your cluster is avaialble for read and write operations more quickly than with the classic resize method.  Elastic resize operations have the following restrictions:   You can only resize clusters of the following types:   dc2.large   dc2.8xlarge   ds2.xlarge   ds2.8xlarge     The type of nodes you add must match the node type for the cluster.  
     */
  def resizeCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The default behavior is to use the elastic resize method. With an elastic resize your cluster is avaialble for read and write operations more quickly than with the classic resize method.  Elastic resize operations have the following restrictions:   You can only resize clusters of the following types:   dc2.large   dc2.8xlarge   ds2.xlarge   ds2.8xlarge     The type of nodes you add must match the node type for the cluster.  
     */
  def resizeCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The default behavior is to use the elastic resize method. With an elastic resize your cluster is avaialble for read and write operations more quickly than with the classic resize method.  Elastic resize operations have the following restrictions:   You can only resize clusters of the following types:   dc2.large   dc2.8xlarge   ds2.xlarge   ds2.8xlarge     The type of nodes you add must match the node type for the cluster.  
     */
  def resizeCluster(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeClusterMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The default behavior is to use the elastic resize method. With an elastic resize your cluster is avaialble for read and write operations more quickly than with the classic resize method.  Elastic resize operations have the following restrictions:   You can only resize clusters of the following types:   dc2.large   dc2.8xlarge   ds2.xlarge   ds2.8xlarge     The type of nodes you add must match the node type for the cluster.  
     */
  def resizeCluster(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeClusterMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ResizeClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same configuration as the original cluster from which the snapshot was created, except that the new cluster is created with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use the ModifyCluster API to associate a different security group and different parameter group with the restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the same size during restore. If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def restoreFromClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreFromClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same configuration as the original cluster from which the snapshot was created, except that the new cluster is created with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use the ModifyCluster API to associate a different security group and different parameter group with the restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the same size during restore. If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def restoreFromClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreFromClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreFromClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same configuration as the original cluster from which the snapshot was created, except that the new cluster is created with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use the ModifyCluster API to associate a different security group and different parameter group with the restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the same size during restore. If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def restoreFromClusterSnapshot(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreFromClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreFromClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same configuration as the original cluster from which the snapshot was created, except that the new cluster is created with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use the ModifyCluster API to associate a different security group and different parameter group with the restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the same size during restore. If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def restoreFromClusterSnapshot(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreFromClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreFromClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreFromClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the Amazon Redshift cluster that the snapshot was taken from. You cannot use RestoreTableFromClusterSnapshot to restore a table with the same name as an existing table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored table. If you want to replace your original table with a new, restored table, then rename or drop your original table before you call RestoreTableFromClusterSnapshot. When you have renamed your original table, then you can pass the original name of the table as the NewTableName parameter value in the call to RestoreTableFromClusterSnapshot. This way, you can replace the original table with the table created from the snapshot.
     */
  def restoreTableFromClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreTableFromClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the Amazon Redshift cluster that the snapshot was taken from. You cannot use RestoreTableFromClusterSnapshot to restore a table with the same name as an existing table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored table. If you want to replace your original table with a new, restored table, then rename or drop your original table before you call RestoreTableFromClusterSnapshot. When you have renamed your original table, then you can pass the original name of the table as the NewTableName parameter value in the call to RestoreTableFromClusterSnapshot. This way, you can replace the original table with the table created from the snapshot.
     */
  def restoreTableFromClusterSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreTableFromClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreTableFromClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the Amazon Redshift cluster that the snapshot was taken from. You cannot use RestoreTableFromClusterSnapshot to restore a table with the same name as an existing table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored table. If you want to replace your original table with a new, restored table, then rename or drop your original table before you call RestoreTableFromClusterSnapshot. When you have renamed your original table, then you can pass the original name of the table as the NewTableName parameter value in the call to RestoreTableFromClusterSnapshot. This way, you can replace the original table with the table created from the snapshot.
     */
  def restoreTableFromClusterSnapshot(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreTableFromClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreTableFromClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the Amazon Redshift cluster that the snapshot was taken from. You cannot use RestoreTableFromClusterSnapshot to restore a table with the same name as an existing table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored table. If you want to replace your original table with a new, restored table, then rename or drop your original table before you call RestoreTableFromClusterSnapshot. When you have renamed your original table, then you can pass the original name of the table as the NewTableName parameter value in the call to RestoreTableFromClusterSnapshot. This way, you can replace the original table with the table created from the snapshot.
     */
  def restoreTableFromClusterSnapshot(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreTableFromClusterSnapshotMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreTableFromClusterSnapshotResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RestoreTableFromClusterSnapshotResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2 security group. To add an ingress rule, see AuthorizeClusterSecurityGroupIngress. For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. 
     */
  def revokeClusterSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeClusterSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2 security group. To add an ingress rule, see AuthorizeClusterSecurityGroupIngress. For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. 
     */
  def revokeClusterSecurityGroupIngress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeClusterSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeClusterSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2 security group. To add an ingress rule, see AuthorizeClusterSecurityGroupIngress. For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. 
     */
  def revokeClusterSecurityGroupIngress(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeClusterSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeClusterSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2 security group. To add an ingress rule, see AuthorizeClusterSecurityGroupIngress. For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. 
     */
  def revokeClusterSecurityGroupIngress(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeClusterSecurityGroupIngressMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeClusterSecurityGroupIngressResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeClusterSecurityGroupIngressResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is currently restoring the snapshot, the restore will run to completion.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def revokeSnapshotAccess(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeSnapshotAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is currently restoring the snapshot, the restore will run to completion.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def revokeSnapshotAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeSnapshotAccessResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeSnapshotAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is currently restoring the snapshot, the restore will run to completion.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def revokeSnapshotAccess(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeSnapshotAccessMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeSnapshotAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is currently restoring the snapshot, the restore will run to completion.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
     */
  def revokeSnapshotAccess(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeSnapshotAccessMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeSnapshotAccessResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RevokeSnapshotAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rotates the encryption keys for a cluster.
     */
  def rotateEncryptionKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RotateEncryptionKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rotates the encryption keys for a cluster.
     */
  def rotateEncryptionKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RotateEncryptionKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RotateEncryptionKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rotates the encryption keys for a cluster.
     */
  def rotateEncryptionKey(params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RotateEncryptionKeyMessage): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RotateEncryptionKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Rotates the encryption keys for a cluster.
     */
  def rotateEncryptionKey(
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RotateEncryptionKeyMessage,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RotateEncryptionKeyResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.RotateEncryptionKeyResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterAvailable state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.clusterAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterAvailable state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterAvailable state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterAvailable,
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClustersMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterAvailable state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterAvailable,
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClustersMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterDeleted state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterDeleted state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterDeleted state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClustersMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterDeleted state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClustersMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterRestored state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterRestored(state: awsDashSdkLib.awsDashSdkLibStrings.clusterRestored): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterRestored state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterRestored(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterRestored,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterRestored state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterRestored(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterRestored,
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClustersMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the clusterRestored state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
     */
  @JSName("waitFor")
  def waitFor_clusterRestored(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterRestored,
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClustersMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.ClustersMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the snapshotAvailable state by periodically calling the underlying Redshift.describeClusterSnapshotsoperation every 15 seconds (at most 20 times).
     */
  @JSName("waitFor")
  def waitFor_snapshotAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.snapshotAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the snapshotAvailable state by periodically calling the underlying Redshift.describeClusterSnapshotsoperation every 15 seconds (at most 20 times).
     */
  @JSName("waitFor")
  def waitFor_snapshotAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.snapshotAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the snapshotAvailable state by periodically calling the underlying Redshift.describeClusterSnapshotsoperation every 15 seconds (at most 20 times).
     */
  @JSName("waitFor")
  def waitFor_snapshotAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.snapshotAvailable,
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterSnapshotsMessage with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the snapshotAvailable state by periodically calling the underlying Redshift.describeClusterSnapshotsoperation every 15 seconds (at most 20 times).
     */
  @JSName("waitFor")
  def waitFor_snapshotAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.snapshotAvailable,
    params: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.DescribeClusterSnapshotsMessage with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotMessage, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

