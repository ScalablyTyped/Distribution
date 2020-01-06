package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  /**
    * The category code for the support case.
    */
  var code: js.UndefOr[CategoryCode] = js.native
  /**
    * The category name for the support case.
    */
  var name: js.UndefOr[CategoryName] = js.native
}

object Category {
  @scala.inline
  def apply(code: CategoryCode = null, name: CategoryName = null): Category = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

