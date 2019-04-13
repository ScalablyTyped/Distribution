package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeDeploy
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CodeDeploy: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds tags to on-premises instances.
    */
  def addTagsToOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToOnPremisesInstances(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds tags to on-premises instances.
    */
  def addTagsToOnPremisesInstances(params: AddTagsToOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToOnPremisesInstances(
    params: AddTagsToOnPremisesInstancesInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more application revisions.
    */
  def batchGetApplicationRevisions(): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetApplicationRevisions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetApplicationRevisionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more application revisions.
    */
  def batchGetApplicationRevisions(params: BatchGetApplicationRevisionsInput): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetApplicationRevisions(
    params: BatchGetApplicationRevisionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetApplicationRevisionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more applications.
    */
  def batchGetApplications(): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetApplicationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more applications.
    */
  def batchGetApplications(params: BatchGetApplicationsInput): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetApplications(
    params: BatchGetApplicationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetApplicationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more deployment groups.
    */
  def batchGetDeploymentGroups(): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetDeploymentGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetDeploymentGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more deployment groups.
    */
  def batchGetDeploymentGroups(params: BatchGetDeploymentGroupsInput): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetDeploymentGroups(
    params: BatchGetDeploymentGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetDeploymentGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *   This method works, but is deprecated. Use BatchGetDeploymentTargets instead.    Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda compute platforms. The newer BatchGetDeploymentTargets works with all compute platforms. 
    */
  def batchGetDeploymentInstances(): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetDeploymentInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetDeploymentInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *   This method works, but is deprecated. Use BatchGetDeploymentTargets instead.    Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda compute platforms. The newer BatchGetDeploymentTargets works with all compute platforms. 
    */
  def batchGetDeploymentInstances(params: BatchGetDeploymentInstancesInput): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetDeploymentInstances(
    params: BatchGetDeploymentInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetDeploymentInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns an array of targets associated with a deployment. This method works with all compute types and should be used instead of the deprecated BatchGetDeploymentInstances.   The type of targets returned depends on the deployment's compute platform:     EC2/On-premises: Information about EC2 instance targets.     AWS Lambda: Information about Lambda functions targets.     Amazon ECS: Information about Amazon ECS service targets.   
    */
  def batchGetDeploymentTargets(): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetDeploymentTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetDeploymentTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns an array of targets associated with a deployment. This method works with all compute types and should be used instead of the deprecated BatchGetDeploymentInstances.   The type of targets returned depends on the deployment's compute platform:     EC2/On-premises: Information about EC2 instance targets.     AWS Lambda: Information about Lambda functions targets.     Amazon ECS: Information about Amazon ECS service targets.   
    */
  def batchGetDeploymentTargets(params: BatchGetDeploymentTargetsInput): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetDeploymentTargets(
    params: BatchGetDeploymentTargetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetDeploymentTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more deployments.
    */
  def batchGetDeployments(): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetDeploymentsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more deployments.
    */
  def batchGetDeployments(params: BatchGetDeploymentsInput): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetDeployments(
    params: BatchGetDeploymentsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetDeploymentsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more on-premises instances.
    */
  def batchGetOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[BatchGetOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetOnPremisesInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetOnPremisesInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about one or more on-premises instances.
    */
  def batchGetOnPremisesInstances(params: BatchGetOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[BatchGetOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetOnPremisesInstances(
    params: BatchGetOnPremisesInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetOnPremisesInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can start as soon as all instances have a status of Ready.) 
    */
  def continueDeployment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def continueDeployment(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can start as soon as all instances have a status of Ready.) 
    */
  def continueDeployment(params: ContinueDeploymentInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def continueDeployment(
    params: ContinueDeploymentInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an application.
    */
  def createApplication(): awsDashSdkLib.libRequestMod.Request[CreateApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an application.
    */
  def createApplication(params: CreateApplicationInput): awsDashSdkLib.libRequestMod.Request[CreateApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApplication(
    params: CreateApplicationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deploys an application revision through the specified deployment group.
    */
  def createDeployment(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deploys an application revision through the specified deployment group.
    */
  def createDeployment(params: CreateDeploymentInput): awsDashSdkLib.libRequestMod.Request[CreateDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates a deployment configuration. 
    */
  def createDeploymentConfig(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeploymentConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Creates a deployment configuration. 
    */
  def createDeploymentConfig(params: CreateDeploymentConfigInput): awsDashSdkLib.libRequestMod.Request[CreateDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeploymentConfig(
    params: CreateDeploymentConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a deployment group to which application revisions are deployed.
    */
  def createDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeploymentGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a deployment group to which application revisions are deployed.
    */
  def createDeploymentGroup(params: CreateDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[CreateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeploymentGroup(
    params: CreateDeploymentGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an application.
    */
  def deleteApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApplication(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an application.
    */
  def deleteApplication(params: DeleteApplicationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a deployment configuration.  A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be deleted. 
    */
  def deleteDeploymentConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeploymentConfig(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a deployment configuration.  A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be deleted. 
    */
  def deleteDeploymentConfig(params: DeleteDeploymentConfigInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeploymentConfig(
    params: DeleteDeploymentConfigInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a deployment group.
    */
  def deleteDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[DeleteDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeploymentGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a deployment group.
    */
  def deleteDeploymentGroup(params: DeleteDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[DeleteDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeploymentGroup(
    params: DeleteDeploymentGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a GitHub account connection.
    */
  def deleteGitHubAccountToken(): awsDashSdkLib.libRequestMod.Request[DeleteGitHubAccountTokenOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGitHubAccountToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGitHubAccountTokenOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGitHubAccountTokenOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a GitHub account connection.
    */
  def deleteGitHubAccountToken(params: DeleteGitHubAccountTokenInput): awsDashSdkLib.libRequestMod.Request[DeleteGitHubAccountTokenOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGitHubAccountToken(
    params: DeleteGitHubAccountTokenInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGitHubAccountTokenOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGitHubAccountTokenOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters an on-premises instance.
    */
  def deregisterOnPremisesInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterOnPremisesInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters an on-premises instance.
    */
  def deregisterOnPremisesInstance(params: DeregisterOnPremisesInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterOnPremisesInstance(
    params: DeregisterOnPremisesInstanceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about an application.
    */
  def getApplication(): awsDashSdkLib.libRequestMod.Request[GetApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about an application.
    */
  def getApplication(params: GetApplicationInput): awsDashSdkLib.libRequestMod.Request[GetApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApplication(
    params: GetApplicationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApplicationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about an application revision.
    */
  def getApplicationRevision(): awsDashSdkLib.libRequestMod.Request[GetApplicationRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApplicationRevision(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApplicationRevisionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApplicationRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about an application revision.
    */
  def getApplicationRevision(params: GetApplicationRevisionInput): awsDashSdkLib.libRequestMod.Request[GetApplicationRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApplicationRevision(
    params: GetApplicationRevisionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetApplicationRevisionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetApplicationRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a deployment.   The content property of the appSpecContent object in the returned revision is always null. Use GetApplicationRevision and the sha256 property of the returned appSpecContent object to get the content of the deployment’s AppSpec file.  
    */
  def getDeployment(): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a deployment.   The content property of the appSpecContent object in the returned revision is always null. Use GetApplicationRevision and the sha256 property of the returned appSpecContent object to get the content of the deployment’s AppSpec file.  
    */
  def getDeployment(params: GetDeploymentInput): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployment(
    params: GetDeploymentInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a deployment configuration.
    */
  def getDeploymentConfig(): awsDashSdkLib.libRequestMod.Request[GetDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeploymentConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a deployment configuration.
    */
  def getDeploymentConfig(params: GetDeploymentConfigInput): awsDashSdkLib.libRequestMod.Request[GetDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeploymentConfig(
    params: GetDeploymentConfigInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentConfigOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a deployment group.
    */
  def getDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[GetDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeploymentGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a deployment group.
    */
  def getDeploymentGroup(params: GetDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[GetDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeploymentGroup(
    params: GetDeploymentGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about an instance as part of a deployment.
    */
  def getDeploymentInstance(): awsDashSdkLib.libRequestMod.Request[GetDeploymentInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeploymentInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about an instance as part of a deployment.
    */
  def getDeploymentInstance(params: GetDeploymentInstanceInput): awsDashSdkLib.libRequestMod.Request[GetDeploymentInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeploymentInstance(
    params: GetDeploymentInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns information about a deployment target. 
    */
  def getDeploymentTarget(): awsDashSdkLib.libRequestMod.Request[GetDeploymentTargetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeploymentTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentTargetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentTargetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns information about a deployment target. 
    */
  def getDeploymentTarget(params: GetDeploymentTargetInput): awsDashSdkLib.libRequestMod.Request[GetDeploymentTargetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeploymentTarget(
    params: GetDeploymentTargetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentTargetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentTargetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Gets information about an on-premises instance. 
    */
  def getOnPremisesInstance(): awsDashSdkLib.libRequestMod.Request[GetOnPremisesInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOnPremisesInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOnPremisesInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOnPremisesInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Gets information about an on-premises instance. 
    */
  def getOnPremisesInstance(params: GetOnPremisesInstanceInput): awsDashSdkLib.libRequestMod.Request[GetOnPremisesInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOnPremisesInstance(
    params: GetOnPremisesInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOnPremisesInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOnPremisesInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists information about revisions for an application.
    */
  def listApplicationRevisions(): awsDashSdkLib.libRequestMod.Request[ListApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplicationRevisions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationRevisionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists information about revisions for an application.
    */
  def listApplicationRevisions(params: ListApplicationRevisionsInput): awsDashSdkLib.libRequestMod.Request[ListApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplicationRevisions(
    params: ListApplicationRevisionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationRevisionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the applications registered with the IAM user or AWS account.
    */
  def listApplications(): awsDashSdkLib.libRequestMod.Request[ListApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the applications registered with the IAM user or AWS account.
    */
  def listApplications(params: ListApplicationsInput): awsDashSdkLib.libRequestMod.Request[ListApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApplications(
    params: ListApplicationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApplicationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the deployment configurations with the IAM user or AWS account.
    */
  def listDeploymentConfigs(): awsDashSdkLib.libRequestMod.Request[ListDeploymentConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeploymentConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the deployment configurations with the IAM user or AWS account.
    */
  def listDeploymentConfigs(params: ListDeploymentConfigsInput): awsDashSdkLib.libRequestMod.Request[ListDeploymentConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeploymentConfigs(
    params: ListDeploymentConfigsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentConfigsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the deployment groups for an application registered with the IAM user or AWS account.
    */
  def listDeploymentGroups(): awsDashSdkLib.libRequestMod.Request[ListDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeploymentGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the deployment groups for an application registered with the IAM user or AWS account.
    */
  def listDeploymentGroups(params: ListDeploymentGroupsInput): awsDashSdkLib.libRequestMod.Request[ListDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeploymentGroups(
    params: ListDeploymentGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *   The newer BatchGetDeploymentTargets should be used instead because it works with all compute types. ListDeploymentInstances throws an exception if it is used with a compute platform other than EC2/On-premises or AWS Lambda.    Lists the instance for a deployment associated with the IAM user or AWS account. 
    */
  def listDeploymentInstances(): awsDashSdkLib.libRequestMod.Request[ListDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeploymentInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *   The newer BatchGetDeploymentTargets should be used instead because it works with all compute types. ListDeploymentInstances throws an exception if it is used with a compute platform other than EC2/On-premises or AWS Lambda.    Lists the instance for a deployment associated with the IAM user or AWS account. 
    */
  def listDeploymentInstances(params: ListDeploymentInstancesInput): awsDashSdkLib.libRequestMod.Request[ListDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeploymentInstances(
    params: ListDeploymentInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns an array of target IDs that are associated a deployment. 
    */
  def listDeploymentTargets(): awsDashSdkLib.libRequestMod.Request[ListDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeploymentTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Returns an array of target IDs that are associated a deployment. 
    */
  def listDeploymentTargets(params: ListDeploymentTargetsInput): awsDashSdkLib.libRequestMod.Request[ListDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeploymentTargets(
    params: ListDeploymentTargetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.
    */
  def listDeployments(): awsDashSdkLib.libRequestMod.Request[ListDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.
    */
  def listDeployments(params: ListDeploymentsInput): awsDashSdkLib.libRequestMod.Request[ListDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeployments(
    params: ListDeploymentsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the names of stored connections to GitHub accounts.
    */
  def listGitHubAccountTokenNames(): awsDashSdkLib.libRequestMod.Request[ListGitHubAccountTokenNamesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGitHubAccountTokenNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGitHubAccountTokenNamesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGitHubAccountTokenNamesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the names of stored connections to GitHub accounts.
    */
  def listGitHubAccountTokenNames(params: ListGitHubAccountTokenNamesInput): awsDashSdkLib.libRequestMod.Request[ListGitHubAccountTokenNamesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGitHubAccountTokenNames(
    params: ListGitHubAccountTokenNamesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGitHubAccountTokenNamesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGitHubAccountTokenNamesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of names for one or more on-premises instances. Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only registered or deregistered on-premises instance names, use the registration status parameter.
    */
  def listOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[ListOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOnPremisesInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOnPremisesInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of names for one or more on-premises instances. Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only registered or deregistered on-premises instance names, use the registration status parameter.
    */
  def listOnPremisesInstances(params: ListOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[ListOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOnPremisesInstances(
    params: ListOnPremisesInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOnPremisesInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Sets the result of a Lambda validation function. The function validates one or both lifecycle events (BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or Failed. 
    */
  def putLifecycleEventHookExecutionStatus(): awsDashSdkLib.libRequestMod.Request[PutLifecycleEventHookExecutionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLifecycleEventHookExecutionStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutLifecycleEventHookExecutionStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutLifecycleEventHookExecutionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Sets the result of a Lambda validation function. The function validates one or both lifecycle events (BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or Failed. 
    */
  def putLifecycleEventHookExecutionStatus(params: PutLifecycleEventHookExecutionStatusInput): awsDashSdkLib.libRequestMod.Request[PutLifecycleEventHookExecutionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLifecycleEventHookExecutionStatus(
    params: PutLifecycleEventHookExecutionStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutLifecycleEventHookExecutionStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutLifecycleEventHookExecutionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers with AWS CodeDeploy a revision for the specified application.
    */
  def registerApplicationRevision(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerApplicationRevision(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers with AWS CodeDeploy a revision for the specified application.
    */
  def registerApplicationRevision(params: RegisterApplicationRevisionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerApplicationRevision(
    params: RegisterApplicationRevisionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers an on-premises instance.  Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both. 
    */
  def registerOnPremisesInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerOnPremisesInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers an on-premises instance.  Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both. 
    */
  def registerOnPremisesInstance(params: RegisterOnPremisesInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerOnPremisesInstance(
    params: RegisterOnPremisesInstanceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from one or more on-premises instances.
    */
  def removeTagsFromOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromOnPremisesInstances(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from one or more on-premises instances.
    */
  def removeTagsFromOnPremisesInstances(params: RemoveTagsFromOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromOnPremisesInstances(
    params: RemoveTagsFromOnPremisesInstancesInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is complete.
    */
  def skipWaitTimeForInstanceTermination(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def skipWaitTimeForInstanceTermination(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is complete.
    */
  def skipWaitTimeForInstanceTermination(params: SkipWaitTimeForInstanceTerminationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def skipWaitTimeForInstanceTermination(
    params: SkipWaitTimeForInstanceTerminationInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attempts to stop an ongoing deployment.
    */
  def stopDeployment(): awsDashSdkLib.libRequestMod.Request[StopDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attempts to stop an ongoing deployment.
    */
  def stopDeployment(params: StopDeploymentInput): awsDashSdkLib.libRequestMod.Request[StopDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopDeployment(
    params: StopDeploymentInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the name of an application.
    */
  def updateApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApplication(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the name of an application.
    */
  def updateApplication(params: UpdateApplicationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about a deployment group.
    */
  def updateDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeploymentGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes information about a deployment group.
    */
  def updateDeploymentGroup(params: UpdateDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeploymentGroup(
    params: UpdateDeploymentGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeploymentGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the deploymentSuccessful state by periodically calling the underlying CodeDeploy.getDeploymentoperation every 15 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the deploymentSuccessful state by periodically calling the underlying CodeDeploy.getDeploymentoperation every 15 seconds (at most 120 times).
    */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
    params: GetDeploymentInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
    params: GetDeploymentInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

