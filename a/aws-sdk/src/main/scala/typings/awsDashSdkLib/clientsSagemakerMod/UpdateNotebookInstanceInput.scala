package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateNotebookInstanceInput extends js.Object {
  /**
    * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one EI instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined
  /**
    * An array of up to three Git repositories to associate with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in AWS CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined
  /**
    * The Git repository to associate with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in AWS CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
  /**
    * A list of the Elastic Inference (EI) instance types to remove from this notebook instance.
    */
  var DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes] = js.undefined
  /**
    * A list of names or URLs of the default Git repositories to remove from this notebook instance.
    */
  var DisassociateAdditionalCodeRepositories: js.UndefOr[DisassociateAdditionalCodeRepositories] = js.undefined
  /**
    * The name or URL of the default Git repository to remove from this notebook instance.
    */
  var DisassociateDefaultCodeRepository: js.UndefOr[DisassociateDefaultCodeRepository] = js.undefined
  /**
    * Set to true to remove the notebook instance lifecycle configuration currently associated with the notebook instance.
    */
  var DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.undefined
  /**
    * The Amazon ML compute instance type.
    */
  var InstanceType: js.UndefOr[InstanceType] = js.undefined
  /**
    * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined
  /**
    * The name of the notebook instance to update.
    */
  var NotebookInstanceName: awsDashSdkLib.clientsSagemakerMod.NotebookInstanceName
  /**
    * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var RoleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * Whether root access is enabled or disabled for users of the notebook instance. The default value is Enabled.  If you set this to Disabled, users don't have root access on the notebook instance, but lifecycle configuration scripts still run with root permissions. 
    */
  var RootAccess: js.UndefOr[RootAccess] = js.undefined
  /**
    * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
    */
  var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
}

object UpdateNotebookInstanceInput {
  @scala.inline
  def apply(
    NotebookInstanceName: NotebookInstanceName,
    AcceleratorTypes: NotebookInstanceAcceleratorTypes = null,
    AdditionalCodeRepositories: AdditionalCodeRepositoryNamesOrUrls = null,
    DefaultCodeRepository: CodeRepositoryNameOrUrl = null,
    DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes] = js.undefined,
    DisassociateAdditionalCodeRepositories: js.UndefOr[DisassociateAdditionalCodeRepositories] = js.undefined,
    DisassociateDefaultCodeRepository: js.UndefOr[DisassociateDefaultCodeRepository] = js.undefined,
    DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.undefined,
    InstanceType: InstanceType = null,
    LifecycleConfigName: NotebookInstanceLifecycleConfigName = null,
    RoleArn: RoleArn = null,
    RootAccess: RootAccess = null,
    VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
  ): UpdateNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName)
    if (AcceleratorTypes != null) __obj.updateDynamic("AcceleratorTypes")(AcceleratorTypes)
    if (AdditionalCodeRepositories != null) __obj.updateDynamic("AdditionalCodeRepositories")(AdditionalCodeRepositories)
    if (DefaultCodeRepository != null) __obj.updateDynamic("DefaultCodeRepository")(DefaultCodeRepository)
    if (!js.isUndefined(DisassociateAcceleratorTypes)) __obj.updateDynamic("DisassociateAcceleratorTypes")(DisassociateAcceleratorTypes)
    if (!js.isUndefined(DisassociateAdditionalCodeRepositories)) __obj.updateDynamic("DisassociateAdditionalCodeRepositories")(DisassociateAdditionalCodeRepositories)
    if (!js.isUndefined(DisassociateDefaultCodeRepository)) __obj.updateDynamic("DisassociateDefaultCodeRepository")(DisassociateDefaultCodeRepository)
    if (!js.isUndefined(DisassociateLifecycleConfig)) __obj.updateDynamic("DisassociateLifecycleConfig")(DisassociateLifecycleConfig)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LifecycleConfigName != null) __obj.updateDynamic("LifecycleConfigName")(LifecycleConfigName)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (RootAccess != null) __obj.updateDynamic("RootAccess")(RootAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(VolumeSizeInGB)) __obj.updateDynamic("VolumeSizeInGB")(VolumeSizeInGB)
    __obj.asInstanceOf[UpdateNotebookInstanceInput]
  }
}

