package typings.autoprefixer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrowsers extends js.Object {
  var browsers: js.Any
  var prefixes: js.Any
}

object AnonBrowsers {
  @scala.inline
  def apply(browsers: js.Any, prefixes: js.Any): AnonBrowsers = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrowsers]
  }
}

