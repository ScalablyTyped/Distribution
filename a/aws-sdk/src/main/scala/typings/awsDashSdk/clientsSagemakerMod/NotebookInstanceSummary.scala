package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookInstanceSummary extends js.Object {
  /**
    * An array of up to three Git repositories associated with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in AWS CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined
  /**
    * A timestamp that shows when the notebook instance was created.
    */
  var CreationTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CreationTime] = js.undefined
  /**
    * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in AWS CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
  /**
    * The type of ML compute instance that the notebook instance is running on.
    */
  var InstanceType: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.InstanceType] = js.undefined
  /**
    * A timestamp that shows when the notebook instance was last modified.
    */
  var LastModifiedTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LastModifiedTime] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the notebook instance.
    */
  var NotebookInstanceArn: typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceArn
  /**
    * The name of a notebook instance lifecycle configuration associated with this notebook instance. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  var NotebookInstanceLifecycleConfigName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigName] = js.undefined
  /**
    * The name of the notebook instance that you want a summary for.
    */
  var NotebookInstanceName: typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceName
  /**
    * The status of the notebook instance.
    */
  var NotebookInstanceStatus: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceStatus] = js.undefined
  /**
    * The URL that you use to connect to the Jupyter instance running in your notebook instance. 
    */
  var Url: js.UndefOr[NotebookInstanceUrl] = js.undefined
}

object NotebookInstanceSummary {
  @scala.inline
  def apply(
    NotebookInstanceArn: NotebookInstanceArn,
    NotebookInstanceName: NotebookInstanceName,
    AdditionalCodeRepositories: AdditionalCodeRepositoryNamesOrUrls = null,
    CreationTime: CreationTime = null,
    DefaultCodeRepository: CodeRepositoryNameOrUrl = null,
    InstanceType: InstanceType = null,
    LastModifiedTime: LastModifiedTime = null,
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName = null,
    NotebookInstanceStatus: NotebookInstanceStatus = null,
    Url: NotebookInstanceUrl = null
  ): NotebookInstanceSummary = {
    val __obj = js.Dynamic.literal(NotebookInstanceArn = NotebookInstanceArn, NotebookInstanceName = NotebookInstanceName)
    if (AdditionalCodeRepositories != null) __obj.updateDynamic("AdditionalCodeRepositories")(AdditionalCodeRepositories)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DefaultCodeRepository != null) __obj.updateDynamic("DefaultCodeRepository")(DefaultCodeRepository)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (NotebookInstanceLifecycleConfigName != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(NotebookInstanceLifecycleConfigName)
    if (NotebookInstanceStatus != null) __obj.updateDynamic("NotebookInstanceStatus")(NotebookInstanceStatus.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[NotebookInstanceSummary]
  }
}

