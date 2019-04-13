package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNotebookInstanceLifecycleConfigsOutput extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle configurations, use it in the next request. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of NotebookInstanceLifecycleConfiguration objects, each listing a lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList] = js.undefined
}

object ListNotebookInstanceLifecycleConfigsOutput {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    NotebookInstanceLifecycleConfigs: NotebookInstanceLifecycleConfigSummaryList = null
  ): ListNotebookInstanceLifecycleConfigsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (NotebookInstanceLifecycleConfigs != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigs")(NotebookInstanceLifecycleConfigs)
    __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsOutput]
  }
}

