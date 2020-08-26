package typings.angularOdataResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Just a reference to facilitate describing new actions
@js.native
trait IActionDescriptor extends js.Object {
  var headers: js.UndefOr[js.Any] = js.native
  var isArray: js.UndefOr[Boolean] = js.native
  var method: String = js.native
  var params: js.UndefOr[js.Any] = js.native
  var url: js.UndefOr[String] = js.native
}

object IActionDescriptor {
  @scala.inline
  def apply(method: String): IActionDescriptor = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionDescriptor]
  }
  @scala.inline
  implicit class IActionDescriptorOps[Self <: IActionDescriptor] (val x: Self) extends AnyVal {
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIsArray(value: Boolean): Self = this.set("isArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsArray: Self = this.set("isArray", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

