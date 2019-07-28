package typings.appframework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssPrefix extends js.Object {
  var cssPrefix: String
  var cssTransformEnd: String
  var cssTransformStart: String
  var nativeTouchScroll: Boolean
}

object Anon_CssPrefix {
  @scala.inline
  def apply(cssPrefix: String, cssTransformEnd: String, cssTransformStart: String, nativeTouchScroll: Boolean): Anon_CssPrefix = {
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix, cssTransformEnd = cssTransformEnd, cssTransformStart = cssTransformStart, nativeTouchScroll = nativeTouchScroll)
  
    __obj.asInstanceOf[Anon_CssPrefix]
  }
}

