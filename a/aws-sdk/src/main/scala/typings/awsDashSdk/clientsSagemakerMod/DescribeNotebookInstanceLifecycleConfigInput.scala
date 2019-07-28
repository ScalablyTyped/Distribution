package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNotebookInstanceLifecycleConfigInput extends js.Object {
  /**
    * The name of the lifecycle configuration to describe.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceLifecycleConfigName
}

object DescribeNotebookInstanceLifecycleConfigInput {
  @scala.inline
  def apply(NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName): DescribeNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName)
  
    __obj.asInstanceOf[DescribeNotebookInstanceLifecycleConfigInput]
  }
}

