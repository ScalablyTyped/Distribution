package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNotebookInstanceLifecycleConfigInput extends js.Object {
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigName
  /**
    * A shell script that runs only once, when you create a notebook instance. The shell script must be a base64-encoded string.
    */
  var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
  /**
    * A shell script that runs every time you start a notebook instance, including when you create the notebook instance. The shell script must be a base64-encoded string.
    */
  var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.undefined
}

object CreateNotebookInstanceLifecycleConfigInput {
  @scala.inline
  def apply(
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName,
    OnCreate: NotebookInstanceLifecycleConfigList = null,
    OnStart: NotebookInstanceLifecycleConfigList = null
  ): CreateNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName)
    if (OnCreate != null) __obj.updateDynamic("OnCreate")(OnCreate)
    if (OnStart != null) __obj.updateDynamic("OnStart")(OnStart)
    __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigInput]
  }
}

