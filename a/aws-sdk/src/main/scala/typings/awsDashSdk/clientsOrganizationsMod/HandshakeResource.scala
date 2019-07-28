package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandshakeResource extends js.Object {
  /**
    * When needed, contains an additional array of HandshakeResource objects.
    */
  var Resources: js.UndefOr[HandshakeResources] = js.undefined
  /**
    * The type of information being passed, specifying how the value is to be interpreted by the other party:    ACCOUNT - Specifies an AWS account ID number.    ORGANIZATION - Specifies an organization ID number.    EMAIL - Specifies the email address that is associated with the account that receives the handshake.     OWNER_EMAIL - Specifies the email address associated with the master account. Included as information about an organization.     OWNER_NAME - Specifies the name associated with the master account. Included as information about an organization.     NOTES - Additional text provided by the handshake initiator and intended for the recipient to read.  
    */
  var Type: js.UndefOr[HandshakeResourceType] = js.undefined
  /**
    * The information that is passed to the other party in the handshake. The format of the value string must match the requirements of the specified type.
    */
  var Value: js.UndefOr[HandshakeResourceValue] = js.undefined
}

object HandshakeResource {
  @scala.inline
  def apply(
    Resources: HandshakeResources = null,
    Type: HandshakeResourceType = null,
    Value: HandshakeResourceValue = null
  ): HandshakeResource = {
    val __obj = js.Dynamic.literal()
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[HandshakeResource]
  }
}

