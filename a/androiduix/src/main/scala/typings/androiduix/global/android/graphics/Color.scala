package typings.androiduix.global.android.graphics

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.graphics.Color")
@js.native
class Color ()
  extends typings.androiduix.android.graphics.Color
/* static members */
@JSGlobal("android.graphics.Color")
@js.native
object Color extends js.Object {
  
  var BLACK: Double = js.native
  
  var BLUE: Double = js.native
  
  var CYAN: Double = js.native
  
  var DKGRAY: Double = js.native
  
  var GRAY: Double = js.native
  
  var GREEN: Double = js.native
  
  var LTGRAY: Double = js.native
  
  var MAGENTA: Double = js.native
  
  var RED: Double = js.native
  
  var TRANSPARENT: Double = js.native
  
  var WHITE: Double = js.native
  
  var YELLOW: Double = js.native
  
  def alpha(color: Double): Double = js.native
  
  def argb(alpha: Double, red: Double, green: Double, blue: Double): Double = js.native
  
  def blue(color: Double): Double = js.native
  
  def getHtmlColor(color: String): Double = js.native
  
  def green(color: Double): Double = js.native
  
  def parseColor(colorString: String): Double = js.native
  def parseColor(colorString: String, defaultColor: Double): Double = js.native
  
  def red(color: Double): Double = js.native
  
  def rgb(red: Double, green: Double, blue: Double): Double = js.native
  
  def rgba(red: Double, green: Double, blue: Double, alpha: Double): Double = js.native
  
  var sColorNameMap: Map[String, Double] = js.native
  
  def toARGBHex(color: Double): String = js.native
  
  def toRGBAFunc(color: Double): String = js.native
}
