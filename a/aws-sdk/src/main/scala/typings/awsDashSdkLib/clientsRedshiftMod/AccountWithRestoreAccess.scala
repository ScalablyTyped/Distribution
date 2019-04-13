package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountWithRestoreAccess extends js.Object {
  /**
    * The identifier of an AWS support account authorized to restore a snapshot. For AWS support, the identifier is amazon-redshift-support. 
    */
  var AccountAlias: js.UndefOr[String] = js.undefined
  /**
    * The identifier of an AWS customer account authorized to restore a snapshot.
    */
  var AccountId: js.UndefOr[String] = js.undefined
}

object AccountWithRestoreAccess {
  @scala.inline
  def apply(AccountAlias: String = null, AccountId: String = null): AccountWithRestoreAccess = {
    val __obj = js.Dynamic.literal()
    if (AccountAlias != null) __obj.updateDynamic("AccountAlias")(AccountAlias)
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    __obj.asInstanceOf[AccountWithRestoreAccess]
  }
}

