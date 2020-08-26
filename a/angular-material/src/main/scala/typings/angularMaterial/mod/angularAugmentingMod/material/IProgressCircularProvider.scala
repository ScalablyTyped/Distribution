package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressCircularProvider extends js.Object {
  def configure(options: IProgressCircularConfig): Unit = js.native
}

object IProgressCircularProvider {
  @scala.inline
  def apply(configure: IProgressCircularConfig => Unit): IProgressCircularProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
    __obj.asInstanceOf[IProgressCircularProvider]
  }
  @scala.inline
  implicit class IProgressCircularProviderOps[Self <: IProgressCircularProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigure(value: IProgressCircularConfig => Unit): Self = this.set("configure", js.Any.fromFunction1(value))
  }
  
}

