package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberAssociation extends js.Object {
  /**
    * The timestamp of the phone number association, in ISO 8601 format.
    */
  var AssociatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * Defines the association with an Amazon Chime account ID, user ID, Amazon Chime Voice Connector ID, or Amazon Chime Voice Connector group ID.
    */
  var Name: js.UndefOr[PhoneNumberAssociationName] = js.native
  /**
    * Contains the ID for the entity specified in Name.
    */
  var Value: js.UndefOr[String] = js.native
}

object PhoneNumberAssociation {
  @scala.inline
  def apply(
    AssociatedTimestamp: Iso8601Timestamp = null,
    Name: PhoneNumberAssociationName = null,
    Value: String = null
  ): PhoneNumberAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociatedTimestamp != null) __obj.updateDynamic("AssociatedTimestamp")(AssociatedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberAssociation]
  }
}

