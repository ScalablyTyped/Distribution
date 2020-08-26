package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URL extends js.Object {
  val URL: String = js.native
}

object URL {
  @scala.inline
  def apply(URL: String): URL = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[URL]
  }
  @scala.inline
  implicit class URLOps[Self <: URL] (val x: Self) extends AnyVal {
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
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
  }
  
}

