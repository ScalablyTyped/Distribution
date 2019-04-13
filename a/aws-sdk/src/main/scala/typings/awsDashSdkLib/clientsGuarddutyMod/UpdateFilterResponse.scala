package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFilterResponse extends js.Object {
  /**
    * The name of the filter.
    */
  var Name: js.UndefOr[FilterName] = js.undefined
}

object UpdateFilterResponse {
  @scala.inline
  def apply(Name: FilterName = null): UpdateFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateFilterResponse]
  }
}

