package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolutions extends js.Object {
  var resolutionsPerAuthority: js.Array[Resolution] = js.native
}

object Resolutions {
  @scala.inline
  def apply(resolutionsPerAuthority: js.Array[Resolution]): Resolutions = {
    val __obj = js.Dynamic.literal(resolutionsPerAuthority = resolutionsPerAuthority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolutions]
  }
  @scala.inline
  implicit class ResolutionsOps[Self <: Resolutions] (val x: Self) extends AnyVal {
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
    def setResolutionsPerAuthorityVarargs(value: Resolution*): Self = this.set("resolutionsPerAuthority", js.Array(value :_*))
    @scala.inline
    def setResolutionsPerAuthority(value: js.Array[Resolution]): Self = this.set("resolutionsPerAuthority", value.asInstanceOf[js.Any])
  }
  
}

