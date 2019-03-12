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
  def apply(configure: IProgressCircularConfig => scala.Unit): IProgressCircularProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
  
    __obj.asInstanceOf[IProgressCircularProvider]
  }
}

