package typings.angularDashStrap.mgcrea.ngStrap.tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabService extends js.Object {
  var controller: js.Any
  var defaults: ITabOptions
}

object ITabService {
  @scala.inline
  def apply(controller: js.Any, defaults: ITabOptions): ITabService = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITabService]
  }
}

