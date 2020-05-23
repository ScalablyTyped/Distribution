package typings.awsSdk.anon

import typings.awsSdk.elastictranscoderMod.Id
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/elastictranscoder.ReadJobRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait ReadJobRequestwaiterWaite extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The identifier of the job for which you want to get detailed information.
    */
  var Id: typings.awsSdk.elastictranscoderMod.Id = js.native
}

object ReadJobRequestwaiterWaite {
  @scala.inline
  def apply(Id: Id, $waiter: WaiterConfiguration = null): ReadJobRequestwaiterWaite = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadJobRequestwaiterWaite]
  }
}

