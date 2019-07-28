package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNotebookInstanceLifecycleConfigOutput extends js.Object {
  /**
    * A timestamp that tells when the lifecycle configuration was created.
    */
  var CreationTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CreationTime] = js.undefined
  /**
    * A timestamp that tells when the lifecycle configuration was last modified.
    */
  var LastModifiedTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LastModifiedTime] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigArn] = js.undefined
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigName] = js.undefined
  /**
    * The shell script that runs only once, when you create a notebook instance.
    */
  var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
  /**
    * The shell script that runs every time you start a notebook instance, including when you create the notebook instance.
    */
  var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
}

object DescribeNotebookInstanceLifecycleConfigOutput {
  @scala.inline
  def apply(
    CreationTime: CreationTime = null,
    LastModifiedTime: LastModifiedTime = null,
    NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn = null,
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName = null,
    OnCreate: NotebookInstanceLifecycleConfigList = null,
    OnStart: NotebookInstanceLifecycleConfigList = null
  ): DescribeNotebookInstanceLifecycleConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (NotebookInstanceLifecycleConfigArn != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigArn")(NotebookInstanceLifecycleConfigArn)
    if (NotebookInstanceLifecycleConfigName != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(NotebookInstanceLifecycleConfigName)
    if (OnCreate != null) __obj.updateDynamic("OnCreate")(OnCreate)
    if (OnStart != null) __obj.updateDynamic("OnStart")(OnStart)
    __obj.asInstanceOf[DescribeNotebookInstanceLifecycleConfigOutput]
  }
}

