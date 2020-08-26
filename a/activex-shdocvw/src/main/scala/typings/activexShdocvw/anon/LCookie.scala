package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LCookie extends js.Object {
  val lCookie: Double = js.native
}

object LCookie {
  @scala.inline
  def apply(lCookie: Double): LCookie = {
    val __obj = js.Dynamic.literal(lCookie = lCookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCookie]
  }
  @scala.inline
  implicit class LCookieOps[Self <: LCookie] (val x: Self) extends AnyVal {
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
    def setLCookie(value: Double): Self = this.set("lCookie", value.asInstanceOf[js.Any])
  }
  
}

