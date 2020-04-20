package typings.angularStrap.mgcrea.ngStrap.alert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlertProvider extends js.Object {
  var defaults: IAlertOptions
}

object IAlertProvider {
  @scala.inline
  def apply(defaults: IAlertOptions): IAlertProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlertProvider]
  }
}

