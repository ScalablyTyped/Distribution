package typings
package appframeworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssPrefix extends js.Object {
  var cssPrefix: java.lang.String
  var cssTransformEnd: java.lang.String
  var cssTransformStart: java.lang.String
  var nativeTouchScroll: scala.Boolean
}

object Anon_CssPrefix {
  @scala.inline
  def apply(
    cssPrefix: java.lang.String,
    cssTransformEnd: java.lang.String,
    cssTransformStart: java.lang.String,
    nativeTouchScroll: scala.Boolean
  ): Anon_CssPrefix = {
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix, cssTransformEnd = cssTransformEnd, cssTransformStart = cssTransformStart, nativeTouchScroll = nativeTouchScroll)
  
    __obj.asInstanceOf[Anon_CssPrefix]
  }
}

