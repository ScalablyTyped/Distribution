package typings
package agDashGridLib.distLibFilterTextAndNumberFilterParametersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAndNumberFilterParameters extends js.Object {
  /** What to do when new rows are loaded. The default is to reset the filter, to keep it in line with 'set' filters. If you want to keep the selection, then set this value to 'keep'. */
  var newRowsAction: js.UndefOr[java.lang.String] = js.undefined
}

object TextAndNumberFilterParameters {
  @scala.inline
  def apply(newRowsAction: java.lang.String = null): TextAndNumberFilterParameters = {
    val __obj = js.Dynamic.literal()
    if (newRowsAction != null) __obj.updateDynamic("newRowsAction")(newRowsAction)
    __obj.asInstanceOf[TextAndNumberFilterParameters]
  }
}

