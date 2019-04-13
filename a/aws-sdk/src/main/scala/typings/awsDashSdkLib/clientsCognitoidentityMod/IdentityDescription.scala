package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityDescription extends js.Object {
  /**
    * Date on which the identity was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[IdentityId] = js.undefined
  /**
    * Date on which the identity was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The provider names.
    */
  var Logins: js.UndefOr[LoginsList] = js.undefined
}

object IdentityDescription {
  @scala.inline
  def apply(
    CreationDate: DateType = null,
    IdentityId: IdentityId = null,
    LastModifiedDate: DateType = null,
    Logins: LoginsList = null
  ): IdentityDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Logins != null) __obj.updateDynamic("Logins")(Logins)
    __obj.asInstanceOf[IdentityDescription]
  }
}

