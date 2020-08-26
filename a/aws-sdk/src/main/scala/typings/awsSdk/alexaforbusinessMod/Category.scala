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
  def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategoryId(value: CategoryId): Self = this.set("CategoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryId: Self = this.set("CategoryId", js.undefined)
    @scala.inline
    def setCategoryName(value: CategoryName): Self = this.set("CategoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryName: Self = this.set("CategoryName", js.undefined)
  }
  
}

