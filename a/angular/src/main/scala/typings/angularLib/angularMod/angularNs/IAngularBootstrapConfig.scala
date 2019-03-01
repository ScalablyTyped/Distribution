package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAngularBootstrapConfig extends js.Object {
  var strictDi: js.UndefOr[scala.Boolean] = js.undefined
}

object IAngularBootstrapConfig {
  @scala.inline
  def apply(strictDi: js.UndefOr[scala.Boolean] = js.undefined): IAngularBootstrapConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strictDi)) __obj.updateDynamic("strictDi")(strictDi)
    __obj.asInstanceOf[IAngularBootstrapConfig]
  }
}

