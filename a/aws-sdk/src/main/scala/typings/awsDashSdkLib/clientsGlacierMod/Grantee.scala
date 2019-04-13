package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grantee extends js.Object {
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Email address of the grantee.
    */
  var EmailAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of grantee
    */
  var Type: awsDashSdkLib.clientsGlacierMod.Type
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[java.lang.String] = js.undefined
}

object Grantee {
  @scala.inline
  def apply(
    Type: Type,
    DisplayName: java.lang.String = null,
    EmailAddress: java.lang.String = null,
    ID: java.lang.String = null,
    URI: java.lang.String = null
  ): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (URI != null) __obj.updateDynamic("URI")(URI)
    __obj.asInstanceOf[Grantee]
  }
}

