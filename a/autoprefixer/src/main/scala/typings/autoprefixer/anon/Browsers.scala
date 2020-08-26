package typings.autoprefixer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browsers extends js.Object {
  var browsers: js.Any = js.native
  var prefixes: js.Any = js.native
}

object Browsers {
  @scala.inline
  def apply(browsers: js.Any, prefixes: js.Any): Browsers = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browsers]
  }
  @scala.inline
  implicit class BrowsersOps[Self <: Browsers] (val x: Self) extends AnyVal {
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
    def setBrowsers(value: js.Any): Self = this.set("browsers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixes(value: js.Any): Self = this.set("prefixes", value.asInstanceOf[js.Any])
  }
  
}

