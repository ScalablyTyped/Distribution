package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneRequest extends js.Object {
  /**
    * The ID of the hosted zone that you want to get information about.
    */
  var Id: ResourceId
}

object GetHostedZoneRequest {
  @scala.inline
  def apply(Id: ResourceId): GetHostedZoneRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetHostedZoneRequest]
  }
}

