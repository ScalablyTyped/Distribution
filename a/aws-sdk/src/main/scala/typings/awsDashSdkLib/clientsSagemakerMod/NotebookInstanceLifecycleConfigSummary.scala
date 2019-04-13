package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookInstanceLifecycleConfigSummary extends js.Object {
  /**
    * A timestamp that tells when the lifecycle configuration was created.
    */
  var CreationTime: js.UndefOr[CreationTime] = js.undefined
  /**
    * A timestamp that tells when the lifecycle configuration was last modified.
    */
  var LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: awsDashSdkLib.clientsSagemakerMod.NotebookInstanceLifecycleConfigArn
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: awsDashSdkLib.clientsSagemakerMod.NotebookInstanceLifecycleConfigName
}

object NotebookInstanceLifecycleConfigSummary {
  @scala.inline
  def apply(
    NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn,
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
    CreationTime: CreationTime = null,
    LastModifiedTime: LastModifiedTime = null
  ): NotebookInstanceLifecycleConfigSummary = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigArn = NotebookInstanceLifecycleConfigArn, NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    __obj.asInstanceOf[NotebookInstanceLifecycleConfigSummary]
  }
}

