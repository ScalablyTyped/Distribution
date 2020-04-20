package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressCircularProvider extends js.Object {
  def configure(options: IProgressCircularConfig): Unit
}

object IProgressCircularProvider {
  @scala.inline
  def apply(configure: IProgressCircularConfig => Unit): IProgressCircularProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
    __obj.asInstanceOf[IProgressCircularProvider]
  }
}

