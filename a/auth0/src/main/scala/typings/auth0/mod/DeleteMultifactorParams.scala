package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMultifactorParams extends js.Object {
  var id: String = js.native
  var provider: DeleteDeleteMultifactorParamsProvider = js.native
}

object DeleteMultifactorParams {
  @scala.inline
  def apply(id: String, provider: DeleteDeleteMultifactorParamsProvider): DeleteMultifactorParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultifactorParams]
  }
  @scala.inline
  implicit class DeleteMultifactorParamsOps[Self <: DeleteMultifactorParams] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: DeleteDeleteMultifactorParamsProvider): Self = this.set("provider", value.asInstanceOf[js.Any])
  }
  
}

