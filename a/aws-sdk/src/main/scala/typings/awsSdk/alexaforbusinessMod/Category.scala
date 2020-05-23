package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  /**
    * The ID of the skill store category.
    */
  var CategoryId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.CategoryId] = js.native
  /**
    * The name of the skill store category.
    */
  var CategoryName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.CategoryName] = js.native
}

object Category {
  @scala.inline
  def apply(CategoryId: js.UndefOr[CategoryId] = js.undefined, CategoryName: CategoryName = null): Category = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CategoryId)) __obj.updateDynamic("CategoryId")(CategoryId.get.asInstanceOf[js.Any])
    if (CategoryName != null) __obj.updateDynamic("CategoryName")(CategoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

