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

