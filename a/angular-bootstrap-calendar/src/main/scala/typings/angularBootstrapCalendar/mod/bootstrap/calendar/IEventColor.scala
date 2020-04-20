package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventColor extends js.Object {
  /**
  	         * The primary color of the event, should be darker than secondary
  	         */
  var primary: String
  /**
  	         * The secondary color of the event, should be lighter than primary
  	         */
  var secondary: String
}

object IEventColor {
  @scala.inline
  def apply(primary: String, secondary: String): IEventColor = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventColor]
  }
}

