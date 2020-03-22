package typings.awsSdk

import typings.awsSdk.route53Mod.ResourceId
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/route53.GetChangeRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetChangeRequestwaiterWai extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The ID of the change batch request. The value that you specify here is the value that ChangeResourceRecordSets returned in the Id element when you submitted the request.
    */
  var Id: ResourceId = js.native
}

