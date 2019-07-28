package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  /**
    * The category code for the support case.
    */
  var code: js.UndefOr[CategoryCode] = js.undefined
  /**
    * The category name for the support case.
    */
  var name: js.UndefOr[CategoryName] = js.undefined
}

object Category {
  @scala.inline
  def apply(code: CategoryCode = null, name: CategoryName = null): Category = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Category]
  }
}

