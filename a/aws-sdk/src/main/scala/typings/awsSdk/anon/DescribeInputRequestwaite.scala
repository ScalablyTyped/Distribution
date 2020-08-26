package typings.awsSdk.anon

import typings.awsSdk.medialiveMod.string
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/medialive.DescribeInputRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeInputRequestwaite extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Unique ID of the input
    */
  var InputId: string = js.native
}

object DescribeInputRequestwaite {
  @scala.inline
  def apply(InputId: string): DescribeInputRequestwaite = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputRequestwaite]
  }
  @scala.inline
  implicit class DescribeInputRequestwaiteOps[Self <: DescribeInputRequestwaite] (val x: Self) extends AnyVal {
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
    def setInputId(value: string): Self = this.set("InputId", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
  }
  
}

