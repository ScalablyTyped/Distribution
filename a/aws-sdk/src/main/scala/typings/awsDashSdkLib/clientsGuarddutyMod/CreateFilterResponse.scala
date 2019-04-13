package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFilterResponse extends js.Object {
  /**
    * The name of the successfully created filter.
    */
  var Name: js.UndefOr[FilterName] = js.undefined
}

object CreateFilterResponse {
  @scala.inline
  def apply(Name: FilterName = null): CreateFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CreateFilterResponse]
  }
}

