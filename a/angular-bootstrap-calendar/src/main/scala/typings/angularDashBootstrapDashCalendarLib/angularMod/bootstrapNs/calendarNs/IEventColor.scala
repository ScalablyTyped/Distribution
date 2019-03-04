package typings
package angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventColor extends js.Object {
  /**
  	         * The primary color of the event, should be darker than secondary
  	         */
  var primary: java.lang.String
  /**
  	         * The secondary color of the event, should be lighter than primary
  	         */
  var secondary: java.lang.String
}

object IEventColor {
  @scala.inline
  def apply(primary: java.lang.String, secondary: java.lang.String): IEventColor = {
    val __obj = js.Dynamic.literal(primary = primary, secondary = secondary)
  
    __obj.asInstanceOf[IEventColor]
  }
}

