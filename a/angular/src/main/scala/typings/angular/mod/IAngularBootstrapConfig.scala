package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAngularBootstrapConfig extends js.Object {
  var strictDi: js.UndefOr[Boolean] = js.undefined
}

object IAngularBootstrapConfig {
  @scala.inline
  def apply(strictDi: js.UndefOr[Boolean] = js.undefined): IAngularBootstrapConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strictDi)) __obj.updateDynamic("strictDi")(strictDi.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAngularBootstrapConfig]
  }
}

