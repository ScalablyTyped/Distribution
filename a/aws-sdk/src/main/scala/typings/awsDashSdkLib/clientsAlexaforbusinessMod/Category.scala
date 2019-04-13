package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  /**
    * The ID of the skill store category.
    */
  var CategoryId: js.UndefOr[CategoryId] = js.undefined
  /**
    * The name of the skill store category.
    */
  var CategoryName: js.UndefOr[CategoryName] = js.undefined
}

object Category {
  @scala.inline
  def apply(CategoryId: js.UndefOr[CategoryId] = js.undefined, CategoryName: CategoryName = null): Category = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CategoryId)) __obj.updateDynamic("CategoryId")(CategoryId)
    if (CategoryName != null) __obj.updateDynamic("CategoryName")(CategoryName)
    __obj.asInstanceOf[Category]
  }
}

