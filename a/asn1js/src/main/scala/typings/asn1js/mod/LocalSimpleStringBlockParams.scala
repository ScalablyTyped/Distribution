package typings.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSimpleStringBlockParams extends js.Object {
  var value: js.UndefOr[String] = js.native
}

object LocalSimpleStringBlockParams {
  @scala.inline
  def apply(): LocalSimpleStringBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSimpleStringBlockParams]
  }
  @scala.inline
  implicit class LocalSimpleStringBlockParamsOps[Self <: LocalSimpleStringBlockParams] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

