package typings.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[N /* <: String */] extends js.Object {
  var `type`: N = js.native
}

object Type {
  @scala.inline
  def apply[/* <: java.lang.String */ N](`type`: N): Type[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[N]]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type[_], /* <: java.lang.String */ N] (val x: Self with Type[N]) extends AnyVal {
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
    def setType(value: N): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

