package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNotebookInstanceOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notebook instance. 
    */
  var NotebookInstanceArn: js.UndefOr[NotebookInstanceArn] = js.undefined
}

object CreateNotebookInstanceOutput {
  @scala.inline
  def apply(NotebookInstanceArn: NotebookInstanceArn = null): CreateNotebookInstanceOutput = {
    val __obj = js.Dynamic.literal()
    if (NotebookInstanceArn != null) __obj.updateDynamic("NotebookInstanceArn")(NotebookInstanceArn)
    __obj.asInstanceOf[CreateNotebookInstanceOutput]
  }
}

