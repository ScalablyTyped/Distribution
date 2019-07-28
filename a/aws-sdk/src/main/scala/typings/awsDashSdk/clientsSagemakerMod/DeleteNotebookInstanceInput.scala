package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNotebookInstanceInput extends js.Object {
  /**
    * The name of the Amazon SageMaker notebook instance to delete.
    */
  var NotebookInstanceName: typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceName
}

object DeleteNotebookInstanceInput {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): DeleteNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName)
  
    __obj.asInstanceOf[DeleteNotebookInstanceInput]
  }
}

