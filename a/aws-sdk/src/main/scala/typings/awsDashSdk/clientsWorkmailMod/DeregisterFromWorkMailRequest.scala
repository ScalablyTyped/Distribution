package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterFromWorkMailRequest extends js.Object {
  /**
    * The identifier for the member (user or group) to be updated.
    */
  var EntityId: WorkMailIdentifier
  /**
    * The identifier for the organization under which the Amazon WorkMail entity exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
}

object DeregisterFromWorkMailRequest {
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): DeregisterFromWorkMailRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[DeregisterFromWorkMailRequest]
  }
}

