package typings
package angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventAction extends js.Object {
  /**
  	         * CSS class to be added to the action element
  	         */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	         * The label of the action
  	         */
  var label: java.lang.String
  /**
  	         * The action that occurs when it's clicked
  	         * @param args - the IEvent whose action was clicked
  	         */
  def onClick(args: js.Any): scala.Unit
}

object IEventAction {
  @scala.inline
  def apply(
    label: java.lang.String,
    onClick: js.Function1[js.Any, scala.Unit],
    cssClass: java.lang.String = null
  ): IEventAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("onClick")(onClick)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    __obj.asInstanceOf[IEventAction]
  }
}

