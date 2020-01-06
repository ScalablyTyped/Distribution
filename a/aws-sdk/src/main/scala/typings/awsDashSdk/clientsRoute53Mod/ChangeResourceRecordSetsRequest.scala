package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeResourceRecordSetsRequest extends js.Object {
  /**
    * A complex type that contains an optional comment and the Changes element.
    */
  var ChangeBatch: typings.awsDashSdk.clientsRoute53Mod.ChangeBatch = js.native
  /**
    * The ID of the hosted zone that contains the resource record sets that you want to change.
    */
  var HostedZoneId: ResourceId = js.native
}

object ChangeResourceRecordSetsRequest {
  @scala.inline
  def apply(ChangeBatch: ChangeBatch, HostedZoneId: ResourceId): ChangeResourceRecordSetsRequest = {
    val __obj = js.Dynamic.literal(ChangeBatch = ChangeBatch.asInstanceOf[js.Any], HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeResourceRecordSetsRequest]
  }
}

