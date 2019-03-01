package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressCircularProvider extends js.Object {
  def configure(options: IProgressCircularConfig): scala.Unit
}

object IProgressCircularProvider {
  @scala.inline
  def apply(configure: js.Function1[IProgressCircularConfig, scala.Unit]): IProgressCircularProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configure")(configure)
    __obj.asInstanceOf[IProgressCircularProvider]
  }
}

