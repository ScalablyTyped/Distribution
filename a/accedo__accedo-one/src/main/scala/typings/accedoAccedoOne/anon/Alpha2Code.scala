package typings.accedoAccedoOne.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alpha2Code extends js.Object {
  var alpha2Code: String = js.native
  var alpha3Code: String = js.native
}

object Alpha2Code {
  @scala.inline
  def apply(alpha2Code: String, alpha3Code: String): Alpha2Code = {
    val __obj = js.Dynamic.literal(alpha2Code = alpha2Code.asInstanceOf[js.Any], alpha3Code = alpha3Code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha2Code]
  }
  @scala.inline
  implicit class Alpha2CodeOps[Self <: Alpha2Code] (val x: Self) extends AnyVal {
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
    def setAlpha2Code(value: String): Self = this.set("alpha2Code", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha3Code(value: String): Self = this.set("alpha3Code", value.asInstanceOf[js.Any])
  }
  
}

