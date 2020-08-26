package typings.awsSdk.anon

import typings.awsSdk.sagemakerMod.NotebookInstanceName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeNotebookInstanceInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
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
  def apply(NotebookInstanceName: NotebookInstanceName): DescribeNotebookInstanceI = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookInstanceI]
  }
  @scala.inline
  implicit class DescribeNotebookInstanceIOps[Self <: DescribeNotebookInstanceI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotebookInstanceName(value: NotebookInstanceName): Self = this.set("NotebookInstanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
  }
  
}

