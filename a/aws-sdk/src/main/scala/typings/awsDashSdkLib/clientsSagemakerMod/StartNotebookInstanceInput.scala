package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartNotebookInstanceInput extends js.Object {
  /**
    * The name of the notebook instance to start.
    */
  var NotebookInstanceName: awsDashSdkLib.clientsSagemakerMod.NotebookInstanceName
}

object StartNotebookInstanceInput {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): StartNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName)
  
    __obj.asInstanceOf[StartNotebookInstanceInput]
  }
}

