package typings
package awsDashSdkLib.clientsCloudformationMod

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
  def apply(Name: LimitName = null, Value: js.UndefOr[LimitValue] = js.undefined): AccountLimit = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[AccountLimit]
  }
}

