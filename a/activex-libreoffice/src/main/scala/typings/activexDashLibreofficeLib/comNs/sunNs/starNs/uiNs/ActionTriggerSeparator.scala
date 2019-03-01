package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a separator entry. Such entries are of interest for components rendering an {@link ActionTriggerContainer} . */
trait ActionTriggerSeparator extends js.Object {
  /** determines the type of the separator using constants from {@link ActionTriggerSeparatorType} . */
  var SeparatorType: scala.Double
}

object ActionTriggerSeparator {
  @scala.inline
  def apply(SeparatorType: scala.Double): ActionTriggerSeparator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SeparatorType")(SeparatorType)
    __obj.asInstanceOf[ActionTriggerSeparator]
  }
}

