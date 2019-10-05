package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  /**
    * The ID of the skill store category.
    */
  var CategoryId: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.CategoryId] = js.undefined
  /**
    * The name of the skill store category.
    */
  var CategoryName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.CategoryName] = js.undefined
}

object Category {
  @scala.inline
  def apply(CategoryId: Int | Double = null, CategoryName: CategoryName = null): Category = {
    val __obj = js.Dynamic.literal()
    if (CategoryId != null) __obj.updateDynamic("CategoryId")(CategoryId.asInstanceOf[js.Any])
    if (CategoryName != null) __obj.updateDynamic("CategoryName")(CategoryName)
    __obj.asInstanceOf[Category]
  }
}

