package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAliasRequest extends js.Object {
  /**
    * The alias to add to the member set.
    */
  var Alias: EmailAddress
  /**
    * The member (user or group) to which this alias is added.
    */
  var EntityId: WorkMailIdentifier
  /**
    * The organization under which the member (user or group) exists.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
}

object CreateAliasRequest {
  @scala.inline
  def apply(Alias: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias, EntityId = EntityId, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[CreateAliasRequest]
  }
}

