package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAttributeList extends js.Object {
  /**
    * A list of attributes assigned to an account.
    */
  var AccountAttributes: js.UndefOr[AttributeList] = js.undefined
}

object AccountAttributeList {
  @scala.inline
  def apply(AccountAttributes: AttributeList = null): AccountAttributeList = {
    val __obj = js.Dynamic.literal()
    if (AccountAttributes != null) __obj.updateDynamic("AccountAttributes")(AccountAttributes)
    __obj.asInstanceOf[AccountAttributeList]
  }
}

