package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// All service providers extend this interface
@js.native
trait IServiceProvider extends js.Object {
  @JSName("$get")
  var $get: js.Any = js.native
}

object IServiceProvider {
  @scala.inline
  def apply($get: js.Any): IServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceProvider]
  }
  @scala.inline
  implicit class IServiceProviderOps[Self <: IServiceProvider] (val x: Self) extends AnyVal {
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
    def set$get(value: js.Any): Self = this.set("$get", value.asInstanceOf[js.Any])
  }
  
}

