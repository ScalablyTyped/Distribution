package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneRequest extends js.Object {
  /**
    * The ID of the hosted zone that you want to get information about.
    */
  var Id: ResourceId = js.native
}

object GetHostedZoneRequest {
  @scala.inline
  def apply(Id: ResourceId): GetHostedZoneRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetHostedZoneRequest]
  }
}

