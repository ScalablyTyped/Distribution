package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopNotebookInstanceInput extends js.Object {
  /**
    * The name of the notebook instance to terminate.
    */
  var NotebookInstanceName: awsDashSdkLib.clientsSagemakerMod.NotebookInstanceName
}

object StopNotebookInstanceInput {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): StopNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName)
  
    __obj.asInstanceOf[StopNotebookInstanceInput]
  }
}

