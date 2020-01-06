package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grantee extends js.Object {
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[String] = js.native
  /**
    * Email address of the grantee.
    */
  var EmailAddress: js.UndefOr[String] = js.native
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[String] = js.native
  /**
    * Type of grantee
    */
  var Type: typings.awsDashSdk.clientsGlacierMod.Type = js.native
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[String] = js.native
}

object Grantee {
  @scala.inline
  def apply(
    Type: Type,
    DisplayName: String = null,
    EmailAddress: String = null,
    ID: String = null,
    URI: String = null
  ): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (URI != null) __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
}

