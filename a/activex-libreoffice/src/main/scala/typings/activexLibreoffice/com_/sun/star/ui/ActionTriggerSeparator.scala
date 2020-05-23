package typings.activexLibreoffice.com_.sun.star.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a separator entry. Such entries are of interest for components rendering an {@link ActionTriggerContainer} . */
trait ActionTriggerSeparator extends js.Object {
  /** determines the type of the separator using constants from {@link ActionTriggerSeparatorType} . */
  var SeparatorType: Double
}

object ActionTriggerSeparator {
  @scala.inline
  def apply(SeparatorType: Double): ActionTriggerSeparator = {
    val __obj = js.Dynamic.literal(SeparatorType = SeparatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTriggerSeparator]
  }
}

