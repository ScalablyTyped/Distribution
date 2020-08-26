package typings.alexaSdk.mod

import typings.alexaSdk.alexaSdkStrings.active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateListParams extends js.Object {
  var name: String = js.native
  var state: active = js.native
}

object CreateListParams {
  @scala.inline
  def apply(name: String, state: active): CreateListParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateListParams]
  }
  @scala.inline
  implicit class CreateListParamsOps[Self <: CreateListParams] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: active): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

