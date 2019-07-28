package typings.autoprefixerDashCore.autoprefixerDashCoreMod

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
    val __obj = js.Dynamic.literal(css = css, map = map, opts = opts)
  
    __obj.asInstanceOf[Result]
  }
}

