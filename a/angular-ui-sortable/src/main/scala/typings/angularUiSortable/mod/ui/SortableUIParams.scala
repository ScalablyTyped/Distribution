package typings.angularUiSortable.mod.ui

import typings.angular.mod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableUIParams extends js.Object {
  var helper: IAugmentedJQuery = js.native
  var item: IAugmentedJQuery = js.native
  var offset: js.Any = js.native
  var originalPosition: js.Any = js.native
  var placeholder: IAugmentedJQuery = js.native
  var position: js.Any = js.native
  var sender: IAugmentedJQuery = js.native
}

object SortableUIParams {
  @scala.inline
  def apply(
    helper: IAugmentedJQuery,
    item: IAugmentedJQuery,
    offset: js.Any,
    originalPosition: js.Any,
    placeholder: IAugmentedJQuery,
    position: js.Any,
    sender: IAugmentedJQuery
  ): SortableUIParams = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableUIParams]
  }
  @scala.inline
  implicit class SortableUIParamsOps[Self <: SortableUIParams] (val x: Self) extends AnyVal {
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
    def setHelper(value: IAugmentedJQuery): Self = this.set("helper", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: IAugmentedJQuery): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalPosition(value: js.Any): Self = this.set("originalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: IAugmentedJQuery): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: IAugmentedJQuery): Self = this.set("sender", value.asInstanceOf[js.Any])
  }
  
}

