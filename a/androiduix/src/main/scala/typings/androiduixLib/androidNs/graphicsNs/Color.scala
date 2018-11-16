package typings
package androiduixLib.androidNs.graphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.Color")
@js.native
class Color () extends js.Object

@JSGlobal("android.graphics.Color")
@js.native
object Color extends js.Object {
  var BLACK: scala.Double = js.native
  var BLUE: scala.Double = js.native
  var CYAN: scala.Double = js.native
  var DKGRAY: scala.Double = js.native
  var GRAY: scala.Double = js.native
  var GREEN: scala.Double = js.native
  var LTGRAY: scala.Double = js.native
  var MAGENTA: scala.Double = js.native
  var RED: scala.Double = js.native
  var TRANSPARENT: scala.Double = js.native
  var WHITE: scala.Double = js.native
  var YELLOW: scala.Double = js.native
  var sColorNameMap: stdLib.Map[java.lang.String, scala.Double] = js.native
  def alpha(color: scala.Double): scala.Double = js.native
  def argb(alpha: scala.Double, red: scala.Double, green: scala.Double, blue: scala.Double): scala.Double = js.native
  def blue(color: scala.Double): scala.Double = js.native
  def getHtmlColor(color: java.lang.String): scala.Double = js.native
  def green(color: scala.Double): scala.Double = js.native
  def parseColor(colorString: java.lang.String): scala.Double = js.native
  def parseColor(colorString: java.lang.String, defaultColor: scala.Double): scala.Double = js.native
  def red(color: scala.Double): scala.Double = js.native
  def rgb(red: scala.Double, green: scala.Double, blue: scala.Double): scala.Double = js.native
  def rgba(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double): scala.Double = js.native
  def toARGBHex(color: scala.Double): java.lang.String = js.native
  def toRGBAFunc(color: scala.Double): java.lang.String = js.native
}

