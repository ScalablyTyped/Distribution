package typings.appframework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssPrefix extends js.Object {
  var cssPrefix: String
  var cssTransformEnd: String
  var cssTransformStart: String
  var nativeTouchScroll: Boolean
}

object CssPrefix {
  @scala.inline
  def apply(cssPrefix: String, cssTransformEnd: String, cssTransformStart: String, nativeTouchScroll: Boolean): CssPrefix = {
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix.asInstanceOf[js.Any], cssTransformEnd = cssTransformEnd.asInstanceOf[js.Any], cssTransformStart = cssTransformStart.asInstanceOf[js.Any], nativeTouchScroll = nativeTouchScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssPrefix]
  }
}

