package typings
package agDashGridLib.distLibRenderingCellRenderersICellRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellRenderer extends js.Object {
  /** Get the cell to refresh. Return true if successful. Return false if not (or you don't have refresh logic),
    * then the grid will refresh the cell for you. */
  def refresh(params: js.Any): scala.Boolean
}

object ICellRenderer {
  @scala.inline
  def apply(refresh: js.Any => scala.Boolean): ICellRenderer = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction1(refresh))
  
    __obj.asInstanceOf[ICellRenderer]
  }
}

