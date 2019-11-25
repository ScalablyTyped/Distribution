package typings.agDashGrid.distLibFilterTextAndNumberFilterParametersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAndNumberFilterParameters extends js.Object {
  /** What to do when new rows are loaded. The default is to reset the filter, to keep it in line with 'set' filters. If you want to keep the selection, then set this value to 'keep'. */
  var newRowsAction: js.UndefOr[String] = js.undefined
}

object TextAndNumberFilterParameters {
  @scala.inline
  def apply(newRowsAction: String = null): TextAndNumberFilterParameters = {
    val __obj = js.Dynamic.literal()
    if (newRowsAction != null) __obj.updateDynamic("newRowsAction")(newRowsAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAndNumberFilterParameters]
  }
}

