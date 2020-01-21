package typings.autoprefixerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var css: String
  var map: String
  var opts: Options
}

object Result {
  @scala.inline
  def apply(css: String, map: String, opts: Options): Result = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

