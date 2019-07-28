package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHostedZoneRequest extends js.Object {
  /**
    * The ID of the hosted zone you want to delete.
    */
  var Id: ResourceId
}

object DeleteHostedZoneRequest {
  @scala.inline
  def apply(Id: ResourceId): DeleteHostedZoneRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeleteHostedZoneRequest]
  }
}

