package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAngularBootstrapConfig extends js.Object {
  var strictDi: js.UndefOr[Boolean] = js.native
}

object IAngularBootstrapConfig {
  @scala.inline
  def apply(): IAngularBootstrapConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAngularBootstrapConfig]
  }
  @scala.inline
  implicit class IAngularBootstrapConfigOps[Self <: IAngularBootstrapConfig] (val x: Self) extends AnyVal {
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
    def setStrictDi(value: Boolean): Self = this.set("strictDi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictDi: Self = this.set("strictDi", js.undefined)
  }
  
}

