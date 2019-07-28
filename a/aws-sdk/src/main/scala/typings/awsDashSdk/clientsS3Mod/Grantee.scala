package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grantee extends js.Object {
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DisplayName] = js.undefined
  /**
    * Email address of the grantee.
    */
  var EmailAddress: js.UndefOr[typings.awsDashSdk.clientsS3Mod.EmailAddress] = js.undefined
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ID] = js.undefined
  /**
    * Type of grantee
    */
  var Type: typings.awsDashSdk.clientsS3Mod.Type
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[typings.awsDashSdk.clientsS3Mod.URI] = js.undefined
}

object Grantee {
  @scala.inline
  def apply(
    Type: Type,
    DisplayName: DisplayName = null,
    EmailAddress: EmailAddress = null,
    ID: ID = null,
    URI: URI = null
  ): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (URI != null) __obj.updateDynamic("URI")(URI)
    __obj.asInstanceOf[Grantee]
  }
}

