package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormation
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudFormation: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ClientConfiguration = js.native
  /**
    * Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and reverts to the previous stack configuration.  You can cancel only stacks that are in the UPDATE_IN_PROGRESS state. 
    */
  def cancelUpdateStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelUpdateStack(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and reverts to the previous stack configuration.  You can cancel only stacks that are in the UPDATE_IN_PROGRESS state. 
    */
  def cancelUpdateStack(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CancelUpdateStackInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelUpdateStack(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CancelUpdateStackInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For a specified stack that is in the UPDATE_ROLLBACK_FAILED state, continues rolling it back to the UPDATE_ROLLBACK_COMPLETE state. Depending on the cause of the failure, you can manually  fix the error and continue the rollback. By continuing the rollback, you can return your stack to a working state (the UPDATE_ROLLBACK_COMPLETE state), and then try to update the stack again. A stack goes into the UPDATE_ROLLBACK_FAILED state when AWS CloudFormation cannot roll back all changes after a failed stack update. For example, you might have a stack that is rolling back to an old database instance that was deleted outside of AWS CloudFormation. Because AWS CloudFormation doesn't know the database was deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update rollback to fail.
    */
  def continueUpdateRollback(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ContinueUpdateRollbackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def continueUpdateRollback(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ContinueUpdateRollbackOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ContinueUpdateRollbackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For a specified stack that is in the UPDATE_ROLLBACK_FAILED state, continues rolling it back to the UPDATE_ROLLBACK_COMPLETE state. Depending on the cause of the failure, you can manually  fix the error and continue the rollback. By continuing the rollback, you can return your stack to a working state (the UPDATE_ROLLBACK_COMPLETE state), and then try to update the stack again. A stack goes into the UPDATE_ROLLBACK_FAILED state when AWS CloudFormation cannot roll back all changes after a failed stack update. For example, you might have a stack that is rolling back to an old database instance that was deleted outside of AWS CloudFormation. Because AWS CloudFormation doesn't know the database was deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update rollback to fail.
    */
  def continueUpdateRollback(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ContinueUpdateRollbackInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ContinueUpdateRollbackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def continueUpdateRollback(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ContinueUpdateRollbackInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ContinueUpdateRollbackOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ContinueUpdateRollbackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a list of changes that will be applied to a stack so that you can review the changes before executing them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set for a stack that doesn't exist, the change set shows all of the resources that AWS CloudFormation will create. If you create a change set for an existing stack, AWS CloudFormation compares the stack's information with the information that you submit in the change set and lists the differences. Use change sets to understand which resources AWS CloudFormation will create or change, and how it will change resources in an existing stack, before you create or update a stack. To create a change set for a stack that doesn't exist, for the ChangeSetType parameter, specify CREATE. To create a change set for an existing stack, specify UPDATE for the ChangeSetType parameter. After the CreateChangeSet call successfully completes, AWS CloudFormation starts creating the change set. To check the status of the change set or to review it, use the DescribeChangeSet action. When you are satisfied with the changes the change set will make, execute the change set by using the ExecuteChangeSet action. AWS CloudFormation doesn't make changes until you execute the change set.
    */
  def createChangeSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createChangeSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateChangeSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a list of changes that will be applied to a stack so that you can review the changes before executing them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set for a stack that doesn't exist, the change set shows all of the resources that AWS CloudFormation will create. If you create a change set for an existing stack, AWS CloudFormation compares the stack's information with the information that you submit in the change set and lists the differences. Use change sets to understand which resources AWS CloudFormation will create or change, and how it will change resources in an existing stack, before you create or update a stack. To create a change set for a stack that doesn't exist, for the ChangeSetType parameter, specify CREATE. To create a change set for an existing stack, specify UPDATE for the ChangeSetType parameter. After the CreateChangeSet call successfully completes, AWS CloudFormation starts creating the change set. To check the status of the change set or to review it, use the DescribeChangeSet action. When you are satisfied with the changes the change set will make, execute the change set by using the ExecuteChangeSet action. AWS CloudFormation doesn't make changes until you execute the change set.
    */
  def createChangeSet(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateChangeSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createChangeSet(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateChangeSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateChangeSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a stack as specified in the template. After the call completes successfully, the stack creation starts. You can check the status of the stack via the DescribeStacks API.
    */
  def createStack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a stack as specified in the template. After the call completes successfully, the stack creation starts. You can check the status of the stack via the DescribeStacks API.
    */
  def createStack(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStack(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates stack instances for the specified accounts, within the specified regions. A stack instance refers to a stack in a specific account and region. Accounts and Regions are required parameters—you must specify at least one account and one region. 
    */
  def createStackInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStackInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates stack instances for the specified accounts, within the specified regions. A stack instance refers to a stack in a specific account and region. Accounts and Regions are required parameters—you must specify at least one account and one region. 
    */
  def createStackInstances(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStackInstances(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a stack set.
    */
  def createStackSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStackSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a stack set.
    */
  def createStackSet(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStackSet(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.CreateStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set. If the call successfully completes, AWS CloudFormation successfully deleted the change set.
    */
  def deleteChangeSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteChangeSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteChangeSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set. If the call successfully completes, AWS CloudFormation successfully deleted the change set.
    */
  def deleteChangeSet(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteChangeSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteChangeSet(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteChangeSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteChangeSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not show up in the DescribeStacks API if the deletion has been completed successfully.
    */
  def deleteStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStack(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not show up in the DescribeStacks API if the deletion has been completed successfully.
    */
  def deleteStack(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteStack(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes stack instances for the specified accounts, in the specified regions. 
    */
  def deleteStackInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteStackInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes stack instances for the specified accounts, in the specified regions. 
    */
  def deleteStackInstances(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteStackInstances(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a stack set. Before you can delete a stack set, all of its member stack instances must be deleted. For more information about how to do this, see DeleteStackInstances. 
    */
  def deleteStackSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteStackSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a stack set. Before you can delete a stack set, all of its member stack instances must be deleted. For more information about how to do this, see DeleteStackInstances. 
    */
  def deleteStackSet(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteStackSet(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DeleteStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in your account.
    */
  def describeAccountLimits(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeAccountLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeAccountLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeAccountLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in your account.
    */
  def describeAccountLimits(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeAccountLimitsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeAccountLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountLimits(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeAccountLimitsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeAccountLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeAccountLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the change set. For more information, see Updating Stacks Using Change Sets in the AWS CloudFormation User Guide.
    */
  def describeChangeSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeChangeSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the change set. For more information, see Updating Stacks Using Change Sets in the AWS CloudFormation User Guide.
    */
  def describeChangeSet(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeChangeSet(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a stack drift detection operation. A stack drift detection operation detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted. For more information on stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to initiate a stack drift detection operation. DetectStackDrift returns a StackDriftDetectionId you can use to monitor the progress of the operation using DescribeStackDriftDetectionStatus. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources.
    */
  def describeStackDriftDetectionStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackDriftDetectionStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackDriftDetectionStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackDriftDetectionStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackDriftDetectionStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a stack drift detection operation. A stack drift detection operation detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted. For more information on stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to initiate a stack drift detection operation. DetectStackDrift returns a StackDriftDetectionId you can use to monitor the progress of the operation using DescribeStackDriftDetectionStatus. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources.
    */
  def describeStackDriftDetectionStatus(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackDriftDetectionStatusInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackDriftDetectionStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackDriftDetectionStatus(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackDriftDetectionStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackDriftDetectionStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackDriftDetectionStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all stack related events for a specified stack in reverse chronological order. For more information about a stack's event history, go to Stacks in the AWS CloudFormation User Guide.  You can list events for stacks that have failed to create or have been deleted by specifying the unique stack identifier (stack ID). 
    */
  def describeStackEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackEventsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all stack related events for a specified stack in reverse chronological order. For more information about a stack's event history, go to Stacks in the AWS CloudFormation User Guide.  You can list events for stacks that have failed to create or have been deleted by specifying the unique stack identifier (stack ID). 
    */
  def describeStackEvents(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackEventsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackEvents(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackEventsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackEventsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the stack instance that's associated with the specified stack set, AWS account, and region. For a list of stack instances that are associated with a specific stack set, use ListStackInstances.
    */
  def describeStackInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the stack instance that's associated with the specified stack set, AWS account, and region. For a list of stack instances that are associated with a specific stack set, use ListStackInstances.
    */
  def describeStackInstance(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackInstanceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackInstance(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackInstanceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackInstanceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackInstanceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a description of the specified resource in the specified stack. For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been deleted.
    */
  def describeStackResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a description of the specified resource in the specified stack. For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been deleted.
    */
  def describeStackResource(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackResource(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns drift information for the resources that have been checked for drift in the specified stack. This includes actual and expected configuration values for resources where AWS CloudFormation detects configuration drift. For a given stack, there will be one StackResourceDrift for each stack resource that has been checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not currently support drift detection are not checked, and so not included. For a list of resources that support drift detection, see Resources that Support Drift Detection. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all supported resources for a given stack.
    */
  def describeStackResourceDrifts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceDriftsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackResourceDrifts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceDriftsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceDriftsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns drift information for the resources that have been checked for drift in the specified stack. This includes actual and expected configuration values for resources where AWS CloudFormation detects configuration drift. For a given stack, there will be one StackResourceDrift for each stack resource that has been checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not currently support drift detection are not checked, and so not included. For a list of resources that support drift detection, see Resources that Support Drift Detection. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all supported resources for a given stack.
    */
  def describeStackResourceDrifts(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceDriftsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceDriftsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackResourceDrifts(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceDriftsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceDriftsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourceDriftsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns AWS resource descriptions for running and deleted stacks. If StackName is specified, all the associated resources that are part of the stack are returned. If PhysicalResourceId is specified, the associated resources of the stack that the resource belongs to are returned.  Only the first 100 resources will be returned. If your stack has more resources than this, you should use ListStackResources instead.  For deleted stacks, DescribeStackResources returns resource information for up to 90 days after the stack has been deleted. You must specify either StackName or PhysicalResourceId, but not both. In addition, you can specify LogicalResourceId to filter the returned result. For more information about resources, the LogicalResourceId and PhysicalResourceId, go to the AWS CloudFormation User Guide.  A ValidationError is returned if you specify both StackName and PhysicalResourceId in the same request. 
    */
  def describeStackResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns AWS resource descriptions for running and deleted stacks. If StackName is specified, all the associated resources that are part of the stack are returned. If PhysicalResourceId is specified, the associated resources of the stack that the resource belongs to are returned.  Only the first 100 resources will be returned. If your stack has more resources than this, you should use ListStackResources instead.  For deleted stacks, DescribeStackResources returns resource information for up to 90 days after the stack has been deleted. You must specify either StackName or PhysicalResourceId, but not both. In addition, you can specify LogicalResourceId to filter the returned result. For more information about resources, the LogicalResourceId and PhysicalResourceId, go to the AWS CloudFormation User Guide.  A ValidationError is returned if you specify both StackName and PhysicalResourceId in the same request. 
    */
  def describeStackResources(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourcesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackResources(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the description of the specified stack set. 
    */
  def describeStackSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the description of the specified stack set. 
    */
  def describeStackSet(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackSet(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the description of the specified stack set operation. 
    */
  def describeStackSetOperation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOperationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackSetOperation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOperationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOperationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the description of the specified stack set operation. 
    */
  def describeStackSetOperation(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOperationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOperationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStackSetOperation(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOperationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOperationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStackSetOperationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the description for the specified stack; if no stack name was specified, then it returns the description for all the stacks created.  If the stack does not exist, an AmazonCloudFormationException is returned. 
    */
  def describeStacks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStacks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the description for the specified stack; if no stack name was specified, then it returns the description for all the stacks created.  If the stack does not exist, an AmazonCloudFormationException is returned. 
    */
  def describeStacks(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStacks(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For each resource in the stack that supports drift detection, AWS CloudFormation compares the actual configuration of the resource with its expected template configuration. Only resource properties explicitly defined in the stack template are checked for drift. A stack is considered to have drifted if one or more of its resources differ from their expected template configurations. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to detect drift on all supported resources for a given stack, or DetectStackResourceDrift to detect drift on individual resources. For a list of stack resources that currently support drift detection, see Resources that Support Drift Detection.  DetectStackDrift can take up to several minutes, depending on the number of resources contained within the stack. Use DescribeStackDriftDetectionStatus to monitor the progress of a detect stack drift operation. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources. When detecting drift on a stack, AWS CloudFormation does not detect drift on any nested stacks belonging to that stack. Perform DetectStackDrift directly on the nested stack itself.
    */
  def detectStackDrift(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackDriftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectStackDrift(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackDriftOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackDriftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For each resource in the stack that supports drift detection, AWS CloudFormation compares the actual configuration of the resource with its expected template configuration. Only resource properties explicitly defined in the stack template are checked for drift. A stack is considered to have drifted if one or more of its resources differ from their expected template configurations. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to detect drift on all supported resources for a given stack, or DetectStackResourceDrift to detect drift on individual resources. For a list of stack resources that currently support drift detection, see Resources that Support Drift Detection.  DetectStackDrift can take up to several minutes, depending on the number of resources contained within the stack. Use DescribeStackDriftDetectionStatus to monitor the progress of a detect stack drift operation. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources. When detecting drift on a stack, AWS CloudFormation does not detect drift on any nested stacks belonging to that stack. Perform DetectStackDrift directly on the nested stack itself.
    */
  def detectStackDrift(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackDriftInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackDriftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectStackDrift(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackDriftInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackDriftOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackDriftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about whether a resource's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. This information includes actual and expected property values for resources in which AWS CloudFormation detects drift. Only resource properties explicitly defined in the stack template are checked for drift. For more information about stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all resources in a given stack that support drift detection. Resources that do not currently support drift detection cannot be checked. For a list of resources that support drift detection, see Resources that Support Drift Detection.
    */
  def detectStackResourceDrift(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackResourceDriftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectStackResourceDrift(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackResourceDriftOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackResourceDriftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about whether a resource's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. This information includes actual and expected property values for resources in which AWS CloudFormation detects drift. Only resource properties explicitly defined in the stack template are checked for drift. For more information about stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all resources in a given stack that support drift detection. Resources that do not currently support drift detection cannot be checked. For a list of resources that support drift detection, see Resources that Support Drift Detection.
    */
  def detectStackResourceDrift(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackResourceDriftInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackResourceDriftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectStackResourceDrift(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackResourceDriftInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackResourceDriftOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DetectStackResourceDriftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the estimated monthly cost of a template. The return value is an AWS Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
    */
  def estimateTemplateCost(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.EstimateTemplateCostOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def estimateTemplateCost(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.EstimateTemplateCostOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.EstimateTemplateCostOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the estimated monthly cost of a template. The return value is an AWS Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
    */
  def estimateTemplateCost(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.EstimateTemplateCostInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.EstimateTemplateCostOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def estimateTemplateCost(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.EstimateTemplateCostInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.EstimateTemplateCostOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.EstimateTemplateCostOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a stack using the input information that was provided when the specified change set was created. After the call successfully completes, AWS CloudFormation starts updating the stack. Use the DescribeStacks action to view the status of the update. When you execute a change set, AWS CloudFormation deletes all other change sets associated with the stack because they aren't valid for the updated stack. If a stack policy is associated with the stack, AWS CloudFormation enforces the policy during the update. You can't specify a temporary stack policy that overrides the current policy.
    */
  def executeChangeSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ExecuteChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def executeChangeSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ExecuteChangeSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ExecuteChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a stack using the input information that was provided when the specified change set was created. After the call successfully completes, AWS CloudFormation starts updating the stack. Use the DescribeStacks action to view the status of the update. When you execute a change set, AWS CloudFormation deletes all other change sets associated with the stack because they aren't valid for the updated stack. If a stack policy is associated with the stack, AWS CloudFormation enforces the policy during the update. You can't specify a temporary stack policy that overrides the current policy.
    */
  def executeChangeSet(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ExecuteChangeSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ExecuteChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def executeChangeSet(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ExecuteChangeSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ExecuteChangeSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ExecuteChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.
    */
  def getStackPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetStackPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStackPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetStackPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetStackPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.
    */
  def getStackPolicy(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetStackPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetStackPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getStackPolicy(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetStackPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetStackPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetStackPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the template body for a specified stack. You can get the template for running or deleted stacks. For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.   If the template does not exist, a ValidationError is returned.  
    */
  def getTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the template body for a specified stack. You can get the template for running or deleted stacks. For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.   If the template does not exist, a ValidationError is returned.  
    */
  def getTemplate(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTemplate(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a new or existing template. The GetTemplateSummary action is useful for viewing parameter information, such as default parameter values and parameter types, before you create or update a stack or stack set. You can use the GetTemplateSummary action when you submit a template, or you can get template information for a stack set, or a running or deleted stack. For deleted stacks, GetTemplateSummary returns the template information for up to 90 days after the stack has been deleted. If the template does not exist, a ValidationError is returned.
    */
  def getTemplateSummary(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateSummaryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTemplateSummary(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateSummaryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateSummaryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a new or existing template. The GetTemplateSummary action is useful for viewing parameter information, such as default parameter values and parameter types, before you create or update a stack or stack set. You can use the GetTemplateSummary action when you submit a template, or you can get template information for a stack set, or a running or deleted stack. For deleted stacks, GetTemplateSummary returns the template information for up to 90 days after the stack has been deleted. If the template does not exist, a ValidationError is returned.
    */
  def getTemplateSummary(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateSummaryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateSummaryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTemplateSummary(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateSummaryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateSummaryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.GetTemplateSummaryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the ID and status of each active change set for a stack. For example, AWS CloudFormation lists change sets that are in the CREATE_IN_PROGRESS or CREATE_PENDING state.
    */
  def listChangeSets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListChangeSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listChangeSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListChangeSetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListChangeSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the ID and status of each active change set for a stack. For example, AWS CloudFormation lists change sets that are in the CREATE_IN_PROGRESS or CREATE_PENDING state.
    */
  def listChangeSets(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListChangeSetsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListChangeSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listChangeSets(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListChangeSetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListChangeSetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListChangeSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all exported output values in the account and region in which you call this action. Use this action to see the exported output values that you can import into other stacks. To import values, use the  Fn::ImportValue  function.  For more information, see  AWS CloudFormation Export Stack Output Values.
    */
  def listExports(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListExportsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listExports(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListExportsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListExportsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all exported output values in the account and region in which you call this action. Use this action to see the exported output values that you can import into other stacks. To import values, use the  Fn::ImportValue  function.  For more information, see  AWS CloudFormation Export Stack Output Values.
    */
  def listExports(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListExportsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListExportsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listExports(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListExportsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListExportsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListExportsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first use this action to see which stacks are using it. To see the exported output values in your account, see ListExports.  For more information about importing an exported output value, see the  Fn::ImportValue  function. 
    */
  def listImports(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListImportsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listImports(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListImportsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListImportsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first use this action to see which stacks are using it. To see the exported output values in your account, see ListExports.  For more information about importing an exported output value, see the  Fn::ImportValue  function. 
    */
  def listImports(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListImportsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListImportsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listImports(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListImportsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListImportsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListImportsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summary information about stack instances that are associated with the specified stack set. You can filter for stack instances that are associated with a specific AWS account name or region.
    */
  def listStackInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStackInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summary information about stack instances that are associated with the specified stack set. You can filter for stack instances that are associated with a specific AWS account name or region.
    */
  def listStackInstances(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStackInstances(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns descriptions of all resources of the specified stack. For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been deleted.
    */
  def listStackResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStackResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns descriptions of all resources of the specified stack. For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been deleted.
    */
  def listStackResources(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackResourcesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStackResources(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summary information about the results of a stack set operation. 
    */
  def listStackSetOperationResults(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationResultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStackSetOperationResults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationResultsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationResultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summary information about the results of a stack set operation. 
    */
  def listStackSetOperationResults(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationResultsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationResultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStackSetOperationResults(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationResultsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationResultsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationResultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summary information about operations performed on a stack set. 
    */
  def listStackSetOperations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStackSetOperations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summary information about operations performed on a stack set. 
    */
  def listStackSetOperations(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStackSetOperations(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetOperationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summary information about stack sets that are associated with the user.
    */
  def listStackSets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStackSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summary information about stack sets that are associated with the user.
    */
  def listStackSets(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStackSets(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStackSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and stacks that have been deleted).
    */
  def listStacks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStacks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and stacks that have been deleted).
    */
  def listStacks(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStacksInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStacks(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStacksInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ListStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets a stack policy for a specified stack.
    */
  def setStackPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setStackPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets a stack policy for a specified stack.
    */
  def setStackPolicy(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.SetStackPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setStackPolicy(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.SetStackPolicyInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends a signal to the specified resource with a success or failure status. You can use the SignalResource API in conjunction with a creation policy or update policy. AWS CloudFormation doesn't proceed with a stack creation or update until resources receive the required number of signals or the timeout period is exceeded. The SignalResource API is useful in cases where you want to send signals from anywhere other than an Amazon EC2 instance.
    */
  def signalResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def signalResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends a signal to the specified resource with a success or failure status. You can use the SignalResource API in conjunction with a creation policy or update policy. AWS CloudFormation doesn't proceed with a stack creation or update until resources receive the required number of signals or the timeout period is exceeded. The SignalResource API is useful in cases where you want to send signals from anywhere other than an Amazon EC2 instance.
    */
  def signalResource(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.SignalResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def signalResource(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.SignalResourceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops an in-progress operation on a stack set and its associated stack instances. 
    */
  def stopStackSetOperation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.StopStackSetOperationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopStackSetOperation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.StopStackSetOperationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.StopStackSetOperationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops an in-progress operation on a stack set and its associated stack instances. 
    */
  def stopStackSetOperation(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.StopStackSetOperationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.StopStackSetOperationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopStackSetOperation(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.StopStackSetOperationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.StopStackSetOperationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.StopStackSetOperationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You can check the status of the stack via the DescribeStacks action. To get a copy of the template for an existing stack, you can use the GetTemplate action. For more information about creating an update template, updating a stack, and monitoring the progress of the update, see Updating a Stack.
    */
  def updateStack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You can check the status of the stack via the DescribeStacks action. To get a copy of the template for an existing stack, you can use the GetTemplate action. For more information about creating an update template, updating a stack, and monitoring the progress of the update, see Updating a Stack.
    */
  def updateStack(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateStack(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the parameter values for stack instances for the specified accounts, within the specified regions. A stack instance refers to a stack in a specific account and region.  You can only update stack instances in regions and accounts where they already exist; to create additional stack instances, use CreateStackInstances.  During stack set updates, any parameters overridden for a stack instance are not updated, but retain their overridden value. You can only update the parameter values that are specified in the stack set; to add or delete a parameter itself, use UpdateStackSet to update the stack set template. If you add a parameter to a template, before you can override the parameter value specified in the stack set you must first use UpdateStackSet to update all stack instances with the updated template and parameter value specified in the stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter value using UpdateStackInstances.
    */
  def updateStackInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateStackInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the parameter values for stack instances for the specified accounts, within the specified regions. A stack instance refers to a stack in a specific account and region.  You can only update stack instances in regions and accounts where they already exist; to create additional stack instances, use CreateStackInstances.  During stack set updates, any parameters overridden for a stack instance are not updated, but retain their overridden value. You can only update the parameter values that are specified in the stack set; to add or delete a parameter itself, use UpdateStackSet to update the stack set template. If you add a parameter to a template, before you can override the parameter value specified in the stack set you must first use UpdateStackSet to update all stack instances with the updated template and parameter value specified in the stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter value using UpdateStackInstances.
    */
  def updateStackInstances(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateStackInstances(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the stack set, and associated stack instances in the specified accounts and regions. Even if the stack set operation created by updating the stack set fails (completely or partially, below or above a specified failure tolerance), the stack set is updated with your changes. Subsequent CreateStackInstances calls on the specified stack set use the updated stack set.
    */
  def updateStackSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateStackSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the stack set, and associated stack instances in the specified accounts and regions. Even if the stack set operation created by updating the stack set fails (completely or partially, below or above a specified failure tolerance), the stack set is updated with your changes. Subsequent CreateStackInstances calls on the specified stack set use the updated stack set.
    */
  def updateStackSet(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateStackSet(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateStackSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates termination protection for the specified stack. If a user attempts to delete a stack with termination protection enabled, the operation fails and the stack remains unchanged. For more information, see Protecting a Stack From Being Deleted in the AWS CloudFormation User Guide.  For nested stacks, termination protection is set on the root stack and cannot be changed directly on the nested stack.
    */
  def updateTerminationProtection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateTerminationProtectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateTerminationProtection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateTerminationProtectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateTerminationProtectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates termination protection for the specified stack. If a user attempts to delete a stack with termination protection enabled, the operation fails and the stack remains unchanged. For more information, see Protecting a Stack From Being Deleted in the AWS CloudFormation User Guide.  For nested stacks, termination protection is set on the root stack and cannot be changed directly on the nested stack.
    */
  def updateTerminationProtection(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateTerminationProtectionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateTerminationProtectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateTerminationProtection(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateTerminationProtectionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateTerminationProtectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.UpdateTerminationProtectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Validates a specified template. AWS CloudFormation first checks if the template is valid JSON. If it isn't, AWS CloudFormation checks if the template is valid YAML. If both these checks fail, AWS CloudFormation returns a template validation error.
    */
  def validateTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ValidateTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def validateTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ValidateTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ValidateTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Validates a specified template. AWS CloudFormation first checks if the template is valid JSON. If it isn't, AWS CloudFormation checks if the template is valid YAML. If both these checks fail, AWS CloudFormation returns a template validation error.
    */
  def validateTemplate(params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ValidateTemplateInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ValidateTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def validateTemplate(
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ValidateTemplateInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ValidateTemplateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.ValidateTemplateOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the changeSetCreateComplete state by periodically calling the underlying CloudFormation.describeChangeSetoperation every 30 seconds (at most 120 times). Wait until change set status is CREATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_changeSetCreateComplete(state: awsDashSdkLib.awsDashSdkLibStrings.changeSetCreateComplete): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_changeSetCreateComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.changeSetCreateComplete,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the changeSetCreateComplete state by periodically calling the underlying CloudFormation.describeChangeSetoperation every 30 seconds (at most 120 times). Wait until change set status is CREATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_changeSetCreateComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.changeSetCreateComplete,
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_changeSetCreateComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.changeSetCreateComplete,
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeChangeSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the stackCreateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is CREATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackCreateComplete(state: awsDashSdkLib.awsDashSdkLibStrings.stackCreateComplete): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_stackCreateComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackCreateComplete,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the stackCreateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is CREATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackCreateComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackCreateComplete,
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_stackCreateComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackCreateComplete,
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the stackDeleteComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is DELETE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackDeleteComplete(state: awsDashSdkLib.awsDashSdkLibStrings.stackDeleteComplete): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_stackDeleteComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackDeleteComplete,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the stackDeleteComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is DELETE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackDeleteComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackDeleteComplete,
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_stackDeleteComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackDeleteComplete,
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the stackExists state by periodically calling the underlying CloudFormation.describeStacksoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_stackExists(state: awsDashSdkLib.awsDashSdkLibStrings.stackExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_stackExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the stackExists state by periodically calling the underlying CloudFormation.describeStacksoperation every 5 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_stackExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackExists,
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_stackExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackExists,
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the stackUpdateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is UPDATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackUpdateComplete(state: awsDashSdkLib.awsDashSdkLibStrings.stackUpdateComplete): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_stackUpdateComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackUpdateComplete,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the stackUpdateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is UPDATE_COMPLETE.
    */
  @JSName("waitFor")
  def waitFor_stackUpdateComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackUpdateComplete,
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_stackUpdateComplete(
    state: awsDashSdkLib.awsDashSdkLibStrings.stackUpdateComplete,
    params: awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudformationMod.CloudFormationNs.DescribeStacksOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

