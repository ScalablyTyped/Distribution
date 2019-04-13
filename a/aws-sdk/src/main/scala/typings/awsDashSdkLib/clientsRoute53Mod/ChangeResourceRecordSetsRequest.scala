package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeResourceRecordSetsRequest extends js.Object {
  /**
    * A complex type that contains an optional comment and the Changes element.
    */
  var ChangeBatch: awsDashSdkLib.clientsRoute53Mod.ChangeBatch
  /**
    * The ID of the hosted zone that contains the resource record sets that you want to change.
    */
  var HostedZoneId: ResourceId
}

object ChangeResourceRecordSetsRequest {
  @scala.inline
  def apply(ChangeBatch: ChangeBatch, HostedZoneId: ResourceId): ChangeResourceRecordSetsRequest = {
    val __obj = js.Dynamic.literal(ChangeBatch = ChangeBatch, HostedZoneId = HostedZoneId)
  
    __obj.asInstanceOf[ChangeResourceRecordSetsRequest]
  }
}

