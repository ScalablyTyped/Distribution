package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grantee extends js.Object {
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * Email address of the grantee.
    */
  var EmailAddress: js.UndefOr[String] = js.undefined
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[String] = js.undefined
  /**
    * Type of grantee
    */
  var Type: typings.awsDashSdk.clientsGlacierMod.Type
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[String] = js.undefined
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
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (URI != null) __obj.updateDynamic("URI")(URI)
    __obj.asInstanceOf[Grantee]
  }
}

