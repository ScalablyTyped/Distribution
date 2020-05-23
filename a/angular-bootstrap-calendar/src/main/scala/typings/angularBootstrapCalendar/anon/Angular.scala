package typings.angularBootstrapCalendar.anon

import typings.angularBootstrapCalendar.mod.bootstrap.calendar.IFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Angular extends js.Object {
  var angular: IFormats
  var moment: IFormats
}

object Angular {
  @scala.inline
  def apply(angular: IFormats, moment: IFormats): Angular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], moment = moment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angular]
  }
}

