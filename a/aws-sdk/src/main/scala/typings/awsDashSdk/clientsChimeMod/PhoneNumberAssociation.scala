package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumberAssociation extends js.Object {
  /**
    * The timestamp of the phone number association, in ISO 8601 format.
    */
  var AssociatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  /**
    * Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
    */
  var Name: js.UndefOr[PhoneNumberAssociationName] = js.undefined
  /**
    * Contains the ID for the entity specified in Name.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object PhoneNumberAssociation {
  @scala.inline
  def apply(
    AssociatedTimestamp: Iso8601Timestamp = null,
    Name: PhoneNumberAssociationName = null,
    Value: String = null
  ): PhoneNumberAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociatedTimestamp != null) __obj.updateDynamic("AssociatedTimestamp")(AssociatedTimestamp)
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[PhoneNumberAssociation]
  }
}

