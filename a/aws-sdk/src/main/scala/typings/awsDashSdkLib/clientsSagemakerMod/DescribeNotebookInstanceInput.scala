package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNotebookInstanceInput extends js.Object {
  /**
    * The name of the notebook instance that you want information about.
    */
  var NotebookInstanceName: awsDashSdkLib.clientsSagemakerMod.NotebookInstanceName
}

object DescribeNotebookInstanceInput {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): DescribeNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName)
  
    __obj.asInstanceOf[DescribeNotebookInstanceInput]
  }
}

