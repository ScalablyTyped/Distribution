package typings.angularBootstrapCalendar

import typings.angularBootstrapCalendar.mod.bootstrap.calendar.IFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAngular extends js.Object {
  var angular: IFormats
  var moment: IFormats
}

object AnonAngular {
  @scala.inline
  def apply(angular: IFormats, moment: IFormats): AnonAngular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], moment = moment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAngular]
  }
}

