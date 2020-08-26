package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pathname extends js.Object {
  var pathname: js.UndefOr[String] = js.native
}

object Pathname {
  @scala.inline
  def apply(): Pathname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pathname]
  }
  @scala.inline
  implicit class PathnameOps[Self <: Pathname] (val x: Self) extends AnyVal {
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
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
  }
  
}

