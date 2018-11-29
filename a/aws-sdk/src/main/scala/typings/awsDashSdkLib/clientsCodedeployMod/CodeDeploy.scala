package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeDeploy
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CodeDeploy: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ClientConfiguration = js.native
  /**
     * Adds tags to on-premises instances.
     */
  def addTagsToOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds tags to on-premises instances.
     */
  def addTagsToOnPremisesInstances(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds tags to on-premises instances.
     */
  def addTagsToOnPremisesInstances(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.AddTagsToOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds tags to on-premises instances.
     */
  def addTagsToOnPremisesInstances(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.AddTagsToOnPremisesInstancesInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Gets information about one or more application revisions.
     */
  def batchGetApplicationRevisions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationRevisionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more application revisions.
     */
  def batchGetApplicationRevisions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationRevisionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationRevisionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more application revisions.
     */
  def batchGetApplicationRevisions(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationRevisionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationRevisionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more application revisions.
     */
  def batchGetApplicationRevisions(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationRevisionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationRevisionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationRevisionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more applications.
     */
  def batchGetApplications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more applications.
     */
  def batchGetApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more applications.
     */
  def batchGetApplications(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more applications.
     */
  def batchGetApplications(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetApplicationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more deployment groups.
     */
  def batchGetDeploymentGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more deployment groups.
     */
  def batchGetDeploymentGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more deployment groups.
     */
  def batchGetDeploymentGroups(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentGroupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more deployment groups.
     */
  def batchGetDeploymentGroups(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *   This method works, but is considered deprecated. Use BatchGetDeploymentTargets instead.    Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda compute platforms. The newer BatchGetDeploymentTargets works with all compute platforms. 
     */
  def batchGetDeploymentInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *   This method works, but is considered deprecated. Use BatchGetDeploymentTargets instead.    Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda compute platforms. The newer BatchGetDeploymentTargets works with all compute platforms. 
     */
  def batchGetDeploymentInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *   This method works, but is considered deprecated. Use BatchGetDeploymentTargets instead.    Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda compute platforms. The newer BatchGetDeploymentTargets works with all compute platforms. 
     */
  def batchGetDeploymentInstances(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *   This method works, but is considered deprecated. Use BatchGetDeploymentTargets instead.    Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda compute platforms. The newer BatchGetDeploymentTargets works with all compute platforms. 
     */
  def batchGetDeploymentInstances(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns an array of targets associated with a deployment. This method works with all compute types and should be used instead of the deprecated BatchGetDeploymentInstances.   The type of targets returned depends on the deployment's compute platform:     EC2/On-premises - Information about EC2 instance targets.     AWS Lambda - Information about Lambda functions targets.     Amazon ECS - Information about ECS service targets.   
     */
  def batchGetDeploymentTargets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns an array of targets associated with a deployment. This method works with all compute types and should be used instead of the deprecated BatchGetDeploymentInstances.   The type of targets returned depends on the deployment's compute platform:     EC2/On-premises - Information about EC2 instance targets.     AWS Lambda - Information about Lambda functions targets.     Amazon ECS - Information about ECS service targets.   
     */
  def batchGetDeploymentTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns an array of targets associated with a deployment. This method works with all compute types and should be used instead of the deprecated BatchGetDeploymentInstances.   The type of targets returned depends on the deployment's compute platform:     EC2/On-premises - Information about EC2 instance targets.     AWS Lambda - Information about Lambda functions targets.     Amazon ECS - Information about ECS service targets.   
     */
  def batchGetDeploymentTargets(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentTargetsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns an array of targets associated with a deployment. This method works with all compute types and should be used instead of the deprecated BatchGetDeploymentInstances.   The type of targets returned depends on the deployment's compute platform:     EC2/On-premises - Information about EC2 instance targets.     AWS Lambda - Information about Lambda functions targets.     Amazon ECS - Information about ECS service targets.   
     */
  def batchGetDeploymentTargets(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentTargetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more deployments.
     */
  def batchGetDeployments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more deployments.
     */
  def batchGetDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more deployments.
     */
  def batchGetDeployments(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more deployments.
     */
  def batchGetDeployments(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetDeploymentsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more on-premises instances.
     */
  def batchGetOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetOnPremisesInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more on-premises instances.
     */
  def batchGetOnPremisesInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetOnPremisesInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetOnPremisesInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more on-premises instances.
     */
  def batchGetOnPremisesInstances(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetOnPremisesInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about one or more on-premises instances.
     */
  def batchGetOnPremisesInstances(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetOnPremisesInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetOnPremisesInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.BatchGetOnPremisesInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can start as soon as all instances have a status of Ready.) 
     */
  def continueDeployment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can start as soon as all instances have a status of Ready.) 
     */
  def continueDeployment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can start as soon as all instances have a status of Ready.) 
     */
  def continueDeployment(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ContinueDeploymentInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can start as soon as all instances have a status of Ready.) 
     */
  def continueDeployment(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ContinueDeploymentInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates an application.
     */
  def createApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateApplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an application.
     */
  def createApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateApplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateApplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an application.
     */
  def createApplication(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateApplicationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateApplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an application.
     */
  def createApplication(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateApplicationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateApplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateApplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deploys an application revision through the specified deployment group.
     */
  def createDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deploys an application revision through the specified deployment group.
     */
  def createDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deploys an application revision through the specified deployment group.
     */
  def createDeployment(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deploys an application revision through the specified deployment group.
     */
  def createDeployment(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a deployment configuration. 
     */
  def createDeploymentConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a deployment configuration. 
     */
  def createDeploymentConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a deployment configuration. 
     */
  def createDeploymentConfig(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentConfigInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Creates a deployment configuration. 
     */
  def createDeploymentConfig(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a deployment group to which application revisions will be deployed.
     */
  def createDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a deployment group to which application revisions will be deployed.
     */
  def createDeploymentGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a deployment group to which application revisions will be deployed.
     */
  def createDeploymentGroup(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a deployment group to which application revisions will be deployed.
     */
  def createDeploymentGroup(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.CreateDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an application.
     */
  def deleteApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an application.
     */
  def deleteApplication(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an application.
     */
  def deleteApplication(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteApplicationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes an application.
     */
  def deleteApplication(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteApplicationInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a deployment configuration.  A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be deleted. 
     */
  def deleteDeploymentConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a deployment configuration.  A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be deleted. 
     */
  def deleteDeploymentConfig(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a deployment configuration.  A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be deleted. 
     */
  def deleteDeploymentConfig(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteDeploymentConfigInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a deployment configuration.  A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be deleted. 
     */
  def deleteDeploymentConfig(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteDeploymentConfigInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a deployment group.
     */
  def deleteDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a deployment group.
     */
  def deleteDeploymentGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a deployment group.
     */
  def deleteDeploymentGroup(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a deployment group.
     */
  def deleteDeploymentGroup(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteDeploymentGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a GitHub account connection.
     */
  def deleteGitHubAccountToken(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteGitHubAccountTokenOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a GitHub account connection.
     */
  def deleteGitHubAccountToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteGitHubAccountTokenOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteGitHubAccountTokenOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a GitHub account connection.
     */
  def deleteGitHubAccountToken(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteGitHubAccountTokenInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteGitHubAccountTokenOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a GitHub account connection.
     */
  def deleteGitHubAccountToken(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteGitHubAccountTokenInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteGitHubAccountTokenOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeleteGitHubAccountTokenOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deregisters an on-premises instance.
     */
  def deregisterOnPremisesInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an on-premises instance.
     */
  def deregisterOnPremisesInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an on-premises instance.
     */
  def deregisterOnPremisesInstance(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeregisterOnPremisesInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an on-premises instance.
     */
  def deregisterOnPremisesInstance(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.DeregisterOnPremisesInstanceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Gets information about an application.
     */
  def getApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an application.
     */
  def getApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an application.
     */
  def getApplication(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an application.
     */
  def getApplication(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an application revision.
     */
  def getApplicationRevision(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationRevisionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an application revision.
     */
  def getApplicationRevision(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationRevisionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationRevisionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an application revision.
     */
  def getApplicationRevision(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationRevisionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationRevisionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an application revision.
     */
  def getApplicationRevision(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationRevisionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationRevisionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetApplicationRevisionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment.
     */
  def getDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment.
     */
  def getDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment.
     */
  def getDeployment(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment.
     */
  def getDeployment(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment configuration.
     */
  def getDeploymentConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment configuration.
     */
  def getDeploymentConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment configuration.
     */
  def getDeploymentConfig(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentConfigInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment configuration.
     */
  def getDeploymentConfig(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentConfigOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment group.
     */
  def getDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment group.
     */
  def getDeploymentGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment group.
     */
  def getDeploymentGroup(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a deployment group.
     */
  def getDeploymentGroup(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an instance as part of a deployment.
     */
  def getDeploymentInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an instance as part of a deployment.
     */
  def getDeploymentInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an instance as part of a deployment.
     */
  def getDeploymentInstance(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInstanceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an instance as part of a deployment.
     */
  def getDeploymentInstance(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns information about a deployment target. 
     */
  def getDeploymentTarget(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentTargetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns information about a deployment target. 
     */
  def getDeploymentTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentTargetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentTargetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns information about a deployment target. 
     */
  def getDeploymentTarget(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentTargetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentTargetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns information about a deployment target. 
     */
  def getDeploymentTarget(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentTargetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentTargetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentTargetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Gets information about an on-premises instance. 
     */
  def getOnPremisesInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetOnPremisesInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Gets information about an on-premises instance. 
     */
  def getOnPremisesInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetOnPremisesInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetOnPremisesInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Gets information about an on-premises instance. 
     */
  def getOnPremisesInstance(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetOnPremisesInstanceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetOnPremisesInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Gets information about an on-premises instance. 
     */
  def getOnPremisesInstance(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetOnPremisesInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetOnPremisesInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetOnPremisesInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about revisions for an application.
     */
  def listApplicationRevisions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationRevisionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about revisions for an application.
     */
  def listApplicationRevisions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationRevisionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationRevisionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about revisions for an application.
     */
  def listApplicationRevisions(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationRevisionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationRevisionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists information about revisions for an application.
     */
  def listApplicationRevisions(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationRevisionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationRevisionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationRevisionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the applications registered with the applicable IAM user or AWS account.
     */
  def listApplications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the applications registered with the applicable IAM user or AWS account.
     */
  def listApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the applications registered with the applicable IAM user or AWS account.
     */
  def listApplications(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the applications registered with the applicable IAM user or AWS account.
     */
  def listApplications(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListApplicationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployment configurations with the applicable IAM user or AWS account.
     */
  def listDeploymentConfigs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployment configurations with the applicable IAM user or AWS account.
     */
  def listDeploymentConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployment configurations with the applicable IAM user or AWS account.
     */
  def listDeploymentConfigs(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentConfigsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployment configurations with the applicable IAM user or AWS account.
     */
  def listDeploymentConfigs(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentConfigsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentConfigsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployment groups for an application registered with the applicable IAM user or AWS account.
     */
  def listDeploymentGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployment groups for an application registered with the applicable IAM user or AWS account.
     */
  def listDeploymentGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployment groups for an application registered with the applicable IAM user or AWS account.
     */
  def listDeploymentGroups(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentGroupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployment groups for an application registered with the applicable IAM user or AWS account.
     */
  def listDeploymentGroups(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *   The newer BatchGetDeploymentTargets should be used instead because it works with all compute types. ListDeploymentInstances throws an exception if it is used with a compute platform other than EC2/On-premises or AWS Lambda.    Lists the instance for a deployment associated with the applicable IAM user or AWS account. 
     */
  def listDeploymentInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *   The newer BatchGetDeploymentTargets should be used instead because it works with all compute types. ListDeploymentInstances throws an exception if it is used with a compute platform other than EC2/On-premises or AWS Lambda.    Lists the instance for a deployment associated with the applicable IAM user or AWS account. 
     */
  def listDeploymentInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *   The newer BatchGetDeploymentTargets should be used instead because it works with all compute types. ListDeploymentInstances throws an exception if it is used with a compute platform other than EC2/On-premises or AWS Lambda.    Lists the instance for a deployment associated with the applicable IAM user or AWS account. 
     */
  def listDeploymentInstances(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *   The newer BatchGetDeploymentTargets should be used instead because it works with all compute types. ListDeploymentInstances throws an exception if it is used with a compute platform other than EC2/On-premises or AWS Lambda.    Lists the instance for a deployment associated with the applicable IAM user or AWS account. 
     */
  def listDeploymentInstances(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns an array of target IDs that are associated a deployment. 
     */
  def listDeploymentTargets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns an array of target IDs that are associated a deployment. 
     */
  def listDeploymentTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns an array of target IDs that are associated a deployment. 
     */
  def listDeploymentTargets(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentTargetsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Returns an array of target IDs that are associated a deployment. 
     */
  def listDeploymentTargets(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentTargetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployments in a deployment group for an application registered with the applicable IAM user or AWS account.
     */
  def listDeployments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployments in a deployment group for an application registered with the applicable IAM user or AWS account.
     */
  def listDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployments in a deployment group for an application registered with the applicable IAM user or AWS account.
     */
  def listDeployments(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the deployments in a deployment group for an application registered with the applicable IAM user or AWS account.
     */
  def listDeployments(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListDeploymentsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of stored connections to GitHub accounts.
     */
  def listGitHubAccountTokenNames(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListGitHubAccountTokenNamesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of stored connections to GitHub accounts.
     */
  def listGitHubAccountTokenNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListGitHubAccountTokenNamesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListGitHubAccountTokenNamesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of stored connections to GitHub accounts.
     */
  def listGitHubAccountTokenNames(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListGitHubAccountTokenNamesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListGitHubAccountTokenNamesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the names of stored connections to GitHub accounts.
     */
  def listGitHubAccountTokenNames(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListGitHubAccountTokenNamesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListGitHubAccountTokenNamesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListGitHubAccountTokenNamesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of names for one or more on-premises instances. Unless otherwise specified, both registered and deregistered on-premises instance names will be listed. To list only registered or deregistered on-premises instance names, use the registration status parameter.
     */
  def listOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListOnPremisesInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of names for one or more on-premises instances. Unless otherwise specified, both registered and deregistered on-premises instance names will be listed. To list only registered or deregistered on-premises instance names, use the registration status parameter.
     */
  def listOnPremisesInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListOnPremisesInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListOnPremisesInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of names for one or more on-premises instances. Unless otherwise specified, both registered and deregistered on-premises instance names will be listed. To list only registered or deregistered on-premises instance names, use the registration status parameter.
     */
  def listOnPremisesInstances(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListOnPremisesInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of names for one or more on-premises instances. Unless otherwise specified, both registered and deregistered on-premises instance names will be listed. To list only registered or deregistered on-premises instance names, use the registration status parameter.
     */
  def listOnPremisesInstances(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListOnPremisesInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListOnPremisesInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.ListOnPremisesInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Sets the result of a Lambda validation function. The function validates one or both lifecycle events (BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or Failed. 
     */
  def putLifecycleEventHookExecutionStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.PutLifecycleEventHookExecutionStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Sets the result of a Lambda validation function. The function validates one or both lifecycle events (BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or Failed. 
     */
  def putLifecycleEventHookExecutionStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.PutLifecycleEventHookExecutionStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.PutLifecycleEventHookExecutionStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Sets the result of a Lambda validation function. The function validates one or both lifecycle events (BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or Failed. 
     */
  def putLifecycleEventHookExecutionStatus(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.PutLifecycleEventHookExecutionStatusInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.PutLifecycleEventHookExecutionStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Sets the result of a Lambda validation function. The function validates one or both lifecycle events (BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or Failed. 
     */
  def putLifecycleEventHookExecutionStatus(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.PutLifecycleEventHookExecutionStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.PutLifecycleEventHookExecutionStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.PutLifecycleEventHookExecutionStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers with AWS CodeDeploy a revision for the specified application.
     */
  def registerApplicationRevision(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers with AWS CodeDeploy a revision for the specified application.
     */
  def registerApplicationRevision(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers with AWS CodeDeploy a revision for the specified application.
     */
  def registerApplicationRevision(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.RegisterApplicationRevisionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers with AWS CodeDeploy a revision for the specified application.
     */
  def registerApplicationRevision(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.RegisterApplicationRevisionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers an on-premises instance.  Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both. 
     */
  def registerOnPremisesInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers an on-premises instance.  Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both. 
     */
  def registerOnPremisesInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers an on-premises instance.  Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both. 
     */
  def registerOnPremisesInstance(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.RegisterOnPremisesInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers an on-premises instance.  Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both. 
     */
  def registerOnPremisesInstance(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.RegisterOnPremisesInstanceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes one or more tags from one or more on-premises instances.
     */
  def removeTagsFromOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes one or more tags from one or more on-premises instances.
     */
  def removeTagsFromOnPremisesInstances(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes one or more tags from one or more on-premises instances.
     */
  def removeTagsFromOnPremisesInstances(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.RemoveTagsFromOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes one or more tags from one or more on-premises instances.
     */
  def removeTagsFromOnPremisesInstances(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.RemoveTagsFromOnPremisesInstancesInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is completed.
     */
  def skipWaitTimeForInstanceTermination(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is completed.
     */
  def skipWaitTimeForInstanceTermination(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is completed.
     */
  def skipWaitTimeForInstanceTermination(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.SkipWaitTimeForInstanceTerminationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is completed.
     */
  def skipWaitTimeForInstanceTermination(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.SkipWaitTimeForInstanceTerminationInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attempts to stop an ongoing deployment.
     */
  def stopDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.StopDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attempts to stop an ongoing deployment.
     */
  def stopDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.StopDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.StopDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attempts to stop an ongoing deployment.
     */
  def stopDeployment(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.StopDeploymentInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.StopDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attempts to stop an ongoing deployment.
     */
  def stopDeployment(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.StopDeploymentInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.StopDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.StopDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes the name of an application.
     */
  def updateApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the name of an application.
     */
  def updateApplication(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the name of an application.
     */
  def updateApplication(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.UpdateApplicationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes the name of an application.
     */
  def updateApplication(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.UpdateApplicationInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Changes information about a deployment group.
     */
  def updateDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.UpdateDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes information about a deployment group.
     */
  def updateDeploymentGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.UpdateDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.UpdateDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes information about a deployment group.
     */
  def updateDeploymentGroup(params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.UpdateDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.UpdateDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes information about a deployment group.
     */
  def updateDeploymentGroup(
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.UpdateDeploymentGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.UpdateDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.UpdateDeploymentGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the deploymentSuccessful state by periodically calling the underlying CodeDeploy.getDeploymentoperation every 15 seconds (at most 120 times).
     */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the deploymentSuccessful state by periodically calling the underlying CodeDeploy.getDeploymentoperation every 15 seconds (at most 120 times).
     */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the deploymentSuccessful state by periodically calling the underlying CodeDeploy.getDeploymentoperation every 15 seconds (at most 120 times).
     */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the deploymentSuccessful state by periodically calling the underlying CodeDeploy.getDeploymentoperation every 15 seconds (at most 120 times).
     */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
    params: awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCodedeployMod.CodeDeployNs.GetDeploymentOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

