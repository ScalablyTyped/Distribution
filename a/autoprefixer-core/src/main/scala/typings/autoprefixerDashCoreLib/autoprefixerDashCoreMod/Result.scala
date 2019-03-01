package typings
package autoprefixerDashCoreLib.autoprefixerDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var css: java.lang.String
  var map: java.lang.String
  var opts: Options
}

object Result {
  @scala.inline
  def apply(css: java.lang.String, map: java.lang.String, opts: Options): Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("opts")(opts)
    __obj.asInstanceOf[Result]
  }
}

