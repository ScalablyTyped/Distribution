package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotebookInstancesOutput extends js.Object {
  /**
    * If the response to the previous ListNotebookInstances request was truncated, Amazon SageMaker returns this token. To retrieve the next set of notebook instances, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.native
  /**
    * An array of NotebookInstanceSummary objects, one for each notebook instance.
    */
  var NotebookInstances: js.UndefOr[NotebookInstanceSummaryList] = js.native
}

object ListNotebookInstancesOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, NotebookInstances: NotebookInstanceSummaryList = null): ListNotebookInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (NotebookInstances != null) __obj.updateDynamic("NotebookInstances")(NotebookInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNotebookInstancesOutput]
  }
}

