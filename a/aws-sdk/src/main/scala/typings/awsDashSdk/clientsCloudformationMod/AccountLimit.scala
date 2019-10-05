package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountLimit extends js.Object {
  /**
    * The name of the account limit.
    */
  var Name: js.UndefOr[LimitName] = js.undefined
  /**
    * The value that is associated with the account limit name.
    */
  var Value: js.UndefOr[LimitValue] = js.undefined
}

object AccountLimit {
  @scala.inline
  def apply(Name: LimitName = null, Value: Int | Double = null): AccountLimit = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLimit]
  }
}

