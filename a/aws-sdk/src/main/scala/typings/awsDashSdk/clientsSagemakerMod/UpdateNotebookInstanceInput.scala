package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotebookInstanceInput extends js.Object {
  /**
    * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one EI instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.native
  /**
    * An array of up to three Git repositories to associate with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in AWS CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.native
  /**
    * The Git repository to associate with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in AWS CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.native
  /**
    * A list of the Elastic Inference (EI) instance types to remove from this notebook instance. This operation is idempotent. If you specify an accelerator type that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes] = js.native
  /**
    * A list of names or URLs of the default Git repositories to remove from this notebook instance. This operation is idempotent. If you specify a Git repository that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateAdditionalCodeRepositories: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DisassociateAdditionalCodeRepositories] = js.native
  /**
    * The name or URL of the default Git repository to remove from this notebook instance. This operation is idempotent. If you specify a Git repository that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateDefaultCodeRepository: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DisassociateDefaultCodeRepository] = js.native
  /**
    * Set to true to remove the notebook instance lifecycle configuration currently associated with the notebook instance. This operation is idempotent. If you specify a lifecycle configuration that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.native
  /**
    * The Amazon ML compute instance type.
    */
  var InstanceType: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.InstanceType] = js.native
  /**
    * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.native
  /**
    * The name of the notebook instance to update.
    */
  var NotebookInstanceName: typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceName = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var RoleArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.RoleArn] = js.native
  /**
    * Whether root access is enabled or disabled for users of the notebook instance. The default value is Enabled.  If you set this to Disabled, users don't have root access on the notebook instance, but lifecycle configuration scripts still run with root permissions. 
    */
  var RootAccess: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.RootAccess] = js.native
  /**
    * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB. ML storage volumes are encrypted, so Amazon SageMaker can't determine the amount of available free space on the volume. Because of this, you can increase the volume size when you update a notebook instance, but you can't decrease the volume size. If you want to decrease the size of the ML storage volume in use, create a new notebook instance with the desired size.
    */
  var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.native
}

object UpdateNotebookInstanceInput {
  @scala.inline
  def apply(
    NotebookInstanceName: NotebookInstanceName,
    AcceleratorTypes: NotebookInstanceAcceleratorTypes = null,
    AdditionalCodeRepositories: AdditionalCodeRepositoryNamesOrUrls = null,
    DefaultCodeRepository: CodeRepositoryNameOrUrl = null,
    DisassociateAcceleratorTypes: js.UndefOr[scala.Boolean] = js.undefined,
    DisassociateAdditionalCodeRepositories: js.UndefOr[scala.Boolean] = js.undefined,
    DisassociateDefaultCodeRepository: js.UndefOr[scala.Boolean] = js.undefined,
    DisassociateLifecycleConfig: js.UndefOr[scala.Boolean] = js.undefined,
    InstanceType: InstanceType = null,
    LifecycleConfigName: NotebookInstanceLifecycleConfigName = null,
    RoleArn: RoleArn = null,
    RootAccess: RootAccess = null,
    VolumeSizeInGB: Int | Double = null
  ): UpdateNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    if (AcceleratorTypes != null) __obj.updateDynamic("AcceleratorTypes")(AcceleratorTypes.asInstanceOf[js.Any])
    if (AdditionalCodeRepositories != null) __obj.updateDynamic("AdditionalCodeRepositories")(AdditionalCodeRepositories.asInstanceOf[js.Any])
    if (DefaultCodeRepository != null) __obj.updateDynamic("DefaultCodeRepository")(DefaultCodeRepository.asInstanceOf[js.Any])
    if (!js.isUndefined(DisassociateAcceleratorTypes)) __obj.updateDynamic("DisassociateAcceleratorTypes")(DisassociateAcceleratorTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(DisassociateAdditionalCodeRepositories)) __obj.updateDynamic("DisassociateAdditionalCodeRepositories")(DisassociateAdditionalCodeRepositories.asInstanceOf[js.Any])
    if (!js.isUndefined(DisassociateDefaultCodeRepository)) __obj.updateDynamic("DisassociateDefaultCodeRepository")(DisassociateDefaultCodeRepository.asInstanceOf[js.Any])
    if (!js.isUndefined(DisassociateLifecycleConfig)) __obj.updateDynamic("DisassociateLifecycleConfig")(DisassociateLifecycleConfig.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LifecycleConfigName != null) __obj.updateDynamic("LifecycleConfigName")(LifecycleConfigName.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (RootAccess != null) __obj.updateDynamic("RootAccess")(RootAccess.asInstanceOf[js.Any])
    if (VolumeSizeInGB != null) __obj.updateDynamic("VolumeSizeInGB")(VolumeSizeInGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotebookInstanceInput]
  }
}

