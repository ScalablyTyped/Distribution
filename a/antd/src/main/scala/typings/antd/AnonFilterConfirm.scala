package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterConfirm extends js.Object {
  var filterConfirm: String
  var filterReset: String
  var filterTitle: String
  var selectAll: String
  var selectInvert: String
}

object AnonFilterConfirm {
  @scala.inline
  def apply(
    filterConfirm: String,
    filterReset: String,
    filterTitle: String,
    selectAll: String,
    selectInvert: String
  ): AnonFilterConfirm = {
    val __obj = js.Dynamic.literal(filterConfirm = filterConfirm.asInstanceOf[js.Any], filterReset = filterReset.asInstanceOf[js.Any], filterTitle = filterTitle.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilterConfirm]
  }
}

