package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EMR
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_EMR: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsEmrMod.EMRNs.ClientConfiguration = js.native
  /**
    * Adds an instance fleet to a running cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x. 
    */
  def addInstanceFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceFleetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addInstanceFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceFleetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceFleetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an instance fleet to a running cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x. 
    */
  def addInstanceFleet(params: awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceFleetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceFleetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addInstanceFleet(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceFleetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceFleetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceFleetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds one or more instance groups to a running cluster.
    */
  def addInstanceGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addInstanceGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds one or more instance groups to a running cluster.
    */
  def addInstanceGroups(params: awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceGroupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addInstanceGroups(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddInstanceGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each step is performed by the main function of the main class of the JAR file. The main class can be specified either in the manifest of the JAR or by using the MainFunction parameter of the step. Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run successfully. You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
    */
  def addJobFlowSteps(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddJobFlowStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addJobFlowSteps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.AddJobFlowStepsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddJobFlowStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each step is performed by the main function of the main class of the JAR file. The main class can be specified either in the manifest of the JAR or by using the MainFunction parameter of the step. Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run successfully. You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
    */
  def addJobFlowSteps(params: awsDashSdkLib.clientsEmrMod.EMRNs.AddJobFlowStepsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddJobFlowStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addJobFlowSteps(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.AddJobFlowStepsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.AddJobFlowStepsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddJobFlowStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters. 
    */
  def addTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.AddTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters. 
    */
  def addTags(params: awsDashSdkLib.clientsEmrMod.EMRNs.AddTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTags(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.AddTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.AddTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully submitted. You can only cancel steps that are in a PENDING state.
    */
  def cancelSteps(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.CancelStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelSteps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.CancelStepsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.CancelStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully submitted. You can only cancel steps that are in a PENDING state.
    */
  def cancelSteps(params: awsDashSdkLib.clientsEmrMod.EMRNs.CancelStepsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.CancelStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelSteps(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.CancelStepsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.CancelStepsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.CancelStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
    */
  def createSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.CreateSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSecurityConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.CreateSecurityConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.CreateSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
    */
  def createSecurityConfiguration(params: awsDashSdkLib.clientsEmrMod.EMRNs.CreateSecurityConfigurationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.CreateSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSecurityConfiguration(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.CreateSecurityConfigurationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.CreateSecurityConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.CreateSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a security configuration.
    */
  def deleteSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DeleteSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSecurityConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DeleteSecurityConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DeleteSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a security configuration.
    */
  def deleteSecurityConfiguration(params: awsDashSdkLib.clientsEmrMod.EMRNs.DeleteSecurityConfigurationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DeleteSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSecurityConfiguration(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DeleteSecurityConfigurationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DeleteSecurityConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DeleteSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on. 
    */
  def describeCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on. 
    */
  def describeCluster(params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCluster(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This API is deprecated and will eventually be removed. We recommend you use ListClusters, DescribeCluster, ListSteps, ListInstanceGroups and ListBootstrapActions instead. DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time. Regardless of supplied parameters, only job flows created within the last two months are returned. If no parameters are supplied, then job flows matching either of the following criteria are returned:   Job flows created and completed in the last two weeks    Job flows created within the last two months that are in one of the following states: RUNNING, WAITING, SHUTTING_DOWN, STARTING    Amazon EMR can return a maximum of 512 job flow descriptions.
    */
  def describeJobFlows(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeJobFlowsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeJobFlows(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeJobFlowsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeJobFlowsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This API is deprecated and will eventually be removed. We recommend you use ListClusters, DescribeCluster, ListSteps, ListInstanceGroups and ListBootstrapActions instead. DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time. Regardless of supplied parameters, only job flows created within the last two months are returned. If no parameters are supplied, then job flows matching either of the following criteria are returned:   Job flows created and completed in the last two weeks    Job flows created within the last two months that are in one of the following states: RUNNING, WAITING, SHUTTING_DOWN, STARTING    Amazon EMR can return a maximum of 512 job flow descriptions.
    */
  def describeJobFlows(params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeJobFlowsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeJobFlowsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeJobFlows(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeJobFlowsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeJobFlowsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeJobFlowsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the details of a security configuration by returning the configuration JSON.
    */
  def describeSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSecurityConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeSecurityConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the details of a security configuration by returning the configuration JSON.
    */
  def describeSecurityConfiguration(params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeSecurityConfigurationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSecurityConfiguration(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeSecurityConfigurationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeSecurityConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeSecurityConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides more detail about the cluster step.
    */
  def describeStep(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStep(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides more detail about the cluster step.
    */
  def describeStep(params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStep(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information about the bootstrap actions associated with a cluster.
    */
  def listBootstrapActions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListBootstrapActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBootstrapActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListBootstrapActionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListBootstrapActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information about the bootstrap actions associated with a cluster.
    */
  def listBootstrapActions(params: awsDashSdkLib.clientsEmrMod.EMRNs.ListBootstrapActionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListBootstrapActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBootstrapActions(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.ListBootstrapActionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListBootstrapActionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListBootstrapActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListClusters calls.
    */
  def listClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListClustersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListClustersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListClustersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListClusters calls.
    */
  def listClusters(params: awsDashSdkLib.clientsEmrMod.EMRNs.ListClustersInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListClustersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listClusters(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.ListClustersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListClustersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListClustersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all available details about the instance fleets in a cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  def listInstanceFleets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceFleetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInstanceFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceFleetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceFleetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all available details about the instance fleets in a cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  def listInstanceFleets(params: awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceFleetsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceFleetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInstanceFleets(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceFleetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceFleetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceFleetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides all available details about the instance groups in a cluster.
    */
  def listInstanceGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInstanceGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides all available details about the instance groups in a cluster.
    */
  def listInstanceGroups(params: awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceGroupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInstanceGroups(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstanceGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING.
    */
  def listInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING.
    */
  def listInstances(params: awsDashSdkLib.clientsEmrMod.EMRNs.ListInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInstances(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.ListInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all the security configurations visible to this account, providing their creation dates and times, and their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListSecurityConfigurations calls.
    */
  def listSecurityConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListSecurityConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSecurityConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListSecurityConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListSecurityConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all the security configurations visible to this account, providing their creation dates and times, and their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListSecurityConfigurations calls.
    */
  def listSecurityConfigurations(params: awsDashSdkLib.clientsEmrMod.EMRNs.ListSecurityConfigurationsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListSecurityConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSecurityConfigurations(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.ListSecurityConfigurationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListSecurityConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListSecurityConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.
    */
  def listSteps(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSteps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListStepsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.
    */
  def listSteps(params: awsDashSdkLib.clientsEmrMod.EMRNs.ListStepsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listSteps(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.ListStepsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.ListStepsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.ListStepsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  def modifyInstanceFleet(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyInstanceFleet(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  def modifyInstanceFleet(params: awsDashSdkLib.clientsEmrMod.EMRNs.ModifyInstanceFleetInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyInstanceFleet(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.ModifyInstanceFleetInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input parameters include the new target instance count for the group and the instance group ID. The call will either succeed or fail atomically.
    */
  def modifyInstanceGroups(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyInstanceGroups(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input parameters include the new target instance count for the group and the instance group ID. The call will either succeed or fail atomically.
    */
  def modifyInstanceGroups(params: awsDashSdkLib.clientsEmrMod.EMRNs.ModifyInstanceGroupsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyInstanceGroups(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.ModifyInstanceGroupsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric.
    */
  def putAutoScalingPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.PutAutoScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAutoScalingPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.PutAutoScalingPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.PutAutoScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric.
    */
  def putAutoScalingPolicy(params: awsDashSdkLib.clientsEmrMod.EMRNs.PutAutoScalingPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.PutAutoScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAutoScalingPolicy(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.PutAutoScalingPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.PutAutoScalingPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.PutAutoScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
    */
  def removeAutoScalingPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RemoveAutoScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeAutoScalingPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.RemoveAutoScalingPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RemoveAutoScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
    */
  def removeAutoScalingPolicy(params: awsDashSdkLib.clientsEmrMod.EMRNs.RemoveAutoScalingPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RemoveAutoScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeAutoScalingPolicy(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.RemoveAutoScalingPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.RemoveAutoScalingPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RemoveAutoScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.  The following example removes the stack tag with value Prod from a cluster:
    */
  def removeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.RemoveTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.  The following example removes the stack tag with value Prod from a cluster:
    */
  def removeTags(params: awsDashSdkLib.clientsEmrMod.EMRNs.RemoveTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeTags(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.RemoveTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.RemoveTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last step of the job flow to store results in Amazon S3. If the JobFlowInstancesConfig KeepJobFlowAliveWhenNoSteps parameter is set to TRUE, the cluster transitions to the WAITING state rather than shutting down after the steps have completed.  For additional protection, you can set the JobFlowInstancesConfig TerminationProtected parameter to TRUE to lock the cluster and prevent it from being terminated by API call, user intervention, or in the event of a job flow error. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. For long running clusters, we recommend that you periodically store your results.  The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not both. 
    */
  def runJobFlow(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RunJobFlowOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def runJobFlow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.RunJobFlowOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RunJobFlowOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last step of the job flow to store results in Amazon S3. If the JobFlowInstancesConfig KeepJobFlowAliveWhenNoSteps parameter is set to TRUE, the cluster transitions to the WAITING state rather than shutting down after the steps have completed.  For additional protection, you can set the JobFlowInstancesConfig TerminationProtected parameter to TRUE to lock the cluster and prevent it from being terminated by API call, user intervention, or in the event of a job flow error. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. For long running clusters, we recommend that you periodically store your results.  The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not both. 
    */
  def runJobFlow(params: awsDashSdkLib.clientsEmrMod.EMRNs.RunJobFlowInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RunJobFlowOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def runJobFlow(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.RunJobFlowInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.RunJobFlowOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.RunJobFlowOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful completion of the job flow. Calling SetTerminationProtection on a cluster is similar to calling the Amazon EC2 DisableAPITermination API on all EC2 instances in a cluster.  SetTerminationProtection is used to prevent accidental termination of a cluster and to ensure that in the event of an error, the instances persist so that you can recover any data stored in their ephemeral instance storage.  To terminate a cluster that has been locked by setting SetTerminationProtection to true, you must first unlock the job flow by a subsequent call to SetTerminationProtection in which you set the value to false.   For more information, seeManaging Cluster Termination in the Amazon EMR Management Guide. 
    */
  def setTerminationProtection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setTerminationProtection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful completion of the job flow. Calling SetTerminationProtection on a cluster is similar to calling the Amazon EC2 DisableAPITermination API on all EC2 instances in a cluster.  SetTerminationProtection is used to prevent accidental termination of a cluster and to ensure that in the event of an error, the instances persist so that you can recover any data stored in their ephemeral instance storage.  To terminate a cluster that has been locked by setting SetTerminationProtection to true, you must first unlock the job flow by a subsequent call to SetTerminationProtection in which you set the value to false.   For more information, seeManaging Cluster Termination in the Amazon EMR Management Guide. 
    */
  def setTerminationProtection(params: awsDashSdkLib.clientsEmrMod.EMRNs.SetTerminationProtectionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setTerminationProtection(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.SetTerminationProtectionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when you launch it using the VisibleToAllUsers parameter of RunJobFlow. The SetVisibleToAllUsers action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.
    */
  def setVisibleToAllUsers(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setVisibleToAllUsers(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when you launch it using the VisibleToAllUsers parameter of RunJobFlow. The SetVisibleToAllUsers action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.
    */
  def setVisibleToAllUsers(params: awsDashSdkLib.clientsEmrMod.EMRNs.SetVisibleToAllUsersInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setVisibleToAllUsers(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.SetVisibleToAllUsersInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created. The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous. Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely terminate and release allocated resources, such as Amazon EC2 instances.
    */
  def terminateJobFlows(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateJobFlows(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created. The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous. Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely terminate and release allocated resources, such as Amazon EC2 instances.
    */
  def terminateJobFlows(params: awsDashSdkLib.clientsEmrMod.EMRNs.TerminateJobFlowsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateJobFlows(
    params: awsDashSdkLib.clientsEmrMod.EMRNs.TerminateJobFlowsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the clusterRunning state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_clusterRunning(state: awsDashSdkLib.awsDashSdkLibStrings.clusterRunning): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_clusterRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterRunning,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the clusterRunning state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_clusterRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterRunning,
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_clusterRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterRunning,
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the clusterTerminated state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_clusterTerminated(state: awsDashSdkLib.awsDashSdkLibStrings.clusterTerminated): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_clusterTerminated(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterTerminated,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the clusterTerminated state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_clusterTerminated(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterTerminated,
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_clusterTerminated(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterTerminated,
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeClusterOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the stepComplete state by periodically calling the underlying EMR.describeStepoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_stepComplete(state: awsDashSdkLib.awsDashSdkLibStrings.stepComplete): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_stepComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stepComplete,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the stepComplete state by periodically calling the underlying EMR.describeStepoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_stepComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stepComplete,
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_stepComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stepComplete,
    params: awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEmrMod.EMRNs.DescribeStepOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

