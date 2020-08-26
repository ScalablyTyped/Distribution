package typings.awsSdk.anon

import typings.awsSdk.sagemakerMod.TransformJobName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeTransformJobRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeTransformJobReque extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the transform job that you want to view details of.
    */
  var TransformJobName: typings.awsSdk.sagemakerMod.TransformJobName = js.native
}

object DescribeTransformJobReque {
  @scala.inline
  def apply(TransformJobName: TransformJobName): DescribeTransformJobReque = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransformJobReque]
  }
  @scala.inline
  implicit class DescribeTransformJobRequeOps[Self <: DescribeTransformJobReque] (val x: Self) extends AnyVal {
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
    def setTransformJobName(value: TransformJobName): Self = this.set("TransformJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
  }
  
}

