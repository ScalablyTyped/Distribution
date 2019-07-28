package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAliasRequest extends js.Object {
  /**
    * The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into single entries (the list is transformed into a set).
    */
  var Alias: EmailAddress
  /**
    * The identifier for the member (user or group) from which to have the aliases removed.
    */
  var EntityId: WorkMailIdentifier
  /**
    * The identifier for the organization under which the user exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
}

object DeleteAliasRequest {
  @scala.inline
  def apply(Alias: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias, EntityId = EntityId, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[DeleteAliasRequest]
  }
}

