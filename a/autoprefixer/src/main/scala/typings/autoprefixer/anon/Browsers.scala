package typings.autoprefixer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browsers extends js.Object {
  var browsers: js.Any
  var prefixes: js.Any
}

object Browsers {
  @scala.inline
  def apply(browsers: js.Any, prefixes: js.Any): Browsers = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browsers]
  }
}

