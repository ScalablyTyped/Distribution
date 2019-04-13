package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNotebookInstanceLifecycleConfigOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: js.UndefOr[NotebookInstanceLifecycleConfigArn] = js.undefined
}

object CreateNotebookInstanceLifecycleConfigOutput {
  @scala.inline
  def apply(NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn = null): CreateNotebookInstanceLifecycleConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (NotebookInstanceLifecycleConfigArn != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigArn")(NotebookInstanceLifecycleConfigArn)
    __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigOutput]
  }
}

