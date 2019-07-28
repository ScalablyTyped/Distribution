package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateNotebookInstanceLifecycleConfigInput extends js.Object {
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigName
  /**
    * The shell script that runs only once, when you create a notebook instance
    */
  var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
  /**
    * The shell script that runs every time you start a notebook instance, including when you create the notebook instance.
    */
  var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
}

object UpdateNotebookInstanceLifecycleConfigInput {
  @scala.inline
  def apply(
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
    OnCreate: NotebookInstanceLifecycleConfigList = null,
    OnStart: NotebookInstanceLifecycleConfigList = null
  ): UpdateNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName)
    if (OnCreate != null) __obj.updateDynamic("OnCreate")(OnCreate)
    if (OnStart != null) __obj.updateDynamic("OnStart")(OnStart)
    __obj.asInstanceOf[UpdateNotebookInstanceLifecycleConfigInput]
  }
}

