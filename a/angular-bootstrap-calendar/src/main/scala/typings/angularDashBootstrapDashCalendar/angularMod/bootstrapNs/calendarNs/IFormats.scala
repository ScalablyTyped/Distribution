package typings.angularDashBootstrapDashCalendar.angularMod.bootstrapNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormats extends js.Object {
  var date: IDateFormats
  var title: ITitleFormats
}

object IFormats {
  @scala.inline
  def apply(date: IDateFormats, title: ITitleFormats): IFormats = {
    val __obj = js.Dynamic.literal(date = date, title = title)
  
    __obj.asInstanceOf[IFormats]
  }
}

