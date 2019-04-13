package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grantee extends js.Object {
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * Email address of the grantee.
    */
  var EmailAddress: js.UndefOr[EmailAddress] = js.undefined
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[ID] = js.undefined
  /**
    * Type of grantee
    */
  var Type: awsDashSdkLib.clientsS3Mod.Type
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[URI] = js.undefined
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

