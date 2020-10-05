package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedCount extends js.Object {
  var selectedCount: Double = js.native
  var totalCount: Double = js.native
}

object SelectedCount {
  @scala.inline
  def apply(selectedCount: Double, totalCount: Double): SelectedCount = {
    val __obj = js.Dynamic.literal(selectedCount = selectedCount.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedCount]
  }
  @scala.inline
  implicit class SelectedCountOps[Self <: SelectedCount] (val x: Self) extends AnyVal {
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
    def setSelectedCount(value: Double): Self = this.set("selectedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
  }
  
}

