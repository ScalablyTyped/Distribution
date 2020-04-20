package typings.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<autolinker.autolinker/dist/commonjs/autolinker.StripPrefixConfigObj> */
trait RequiredStripPrefixConfig extends js.Object {
  var scheme: Boolean
  var www: Boolean
}

object RequiredStripPrefixConfig {
  @scala.inline
  def apply(scheme: Boolean, www: Boolean): RequiredStripPrefixConfig = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any], www = www.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredStripPrefixConfig]
  }
}

