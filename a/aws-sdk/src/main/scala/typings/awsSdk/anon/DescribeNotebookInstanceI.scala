package typings.awsSdk.anon

import typings.awsSdk.sagemakerMod.NotebookInstanceName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeNotebookInstanceInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeNotebookInstanceI extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the notebook instance that you want information about.
    */
  var NotebookInstanceName: typings.awsSdk.sagemakerMod.NotebookInstanceName = js.native
}

object DescribeNotebookInstanceI {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName, $waiter: WaiterConfiguration = null): DescribeNotebookInstanceI = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookInstanceI]
  }
}

