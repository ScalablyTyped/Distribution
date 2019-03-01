package typings
package angularDashLocalforageLib.angularMod.localForageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalForageProvider extends js.Object {
  def config(config: LocalForageConfig): scala.Unit
  def setNotify(onItemSet: scala.Boolean, onItemRemove: scala.Boolean): scala.Unit
}

object ILocalForageProvider {
  @scala.inline
  def apply(
    config: js.Function1[LocalForageConfig, scala.Unit],
    setNotify: js.Function2[scala.Boolean, scala.Boolean, scala.Unit]
  ): ILocalForageProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("setNotify")(setNotify)
    __obj.asInstanceOf[ILocalForageProvider]
  }
}

