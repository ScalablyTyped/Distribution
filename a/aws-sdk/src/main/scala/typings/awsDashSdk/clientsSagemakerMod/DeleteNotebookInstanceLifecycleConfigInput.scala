package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNotebookInstanceLifecycleConfigInput extends js.Object {
  /**
    * The name of the lifecycle configuration to delete.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigName
}

object DeleteNotebookInstanceLifecycleConfigInput {
  @scala.inline
  def apply(NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName): DeleteNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName)
  
    __obj.asInstanceOf[DeleteNotebookInstanceLifecycleConfigInput]
  }
}

