package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventColor extends js.Object {
  /**
    * The primary color of the event, should be darker than secondary
    */
  var primary: String = js.native
  /**
    * The secondary color of the event, should be lighter than primary
    */
  var secondary: String = js.native
}

object IEventColor {
  @scala.inline
  def apply(primary: String, secondary: String): IEventColor = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventColor]
  }
  @scala.inline
  implicit class IEventColorOps[Self <: IEventColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondary(value: String): Self = this.set("secondary", value.asInstanceOf[js.Any])
  }
  
}

