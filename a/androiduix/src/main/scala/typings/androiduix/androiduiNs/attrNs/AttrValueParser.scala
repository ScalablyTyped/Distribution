package typings.androiduix.androiduiNs.attrNs

import typings.androiduix.androidNs.contentNs.resNs.ColorStateList
import typings.androiduix.androidNs.contentNs.resNs.Resources
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.attr.AttrValueParser")
@js.native
class AttrValueParser () extends js.Object

/* static members */
@JSGlobal("androidui.attr.AttrValueParser")
@js.native
object AttrValueParser extends js.Object {
  def parseBoolean(r: Resources, value: String, defValue: Boolean): Boolean = js.native
  def parseColor(r: Resources, value: String, defValue: Double): Double = js.native
  def parseColorStateList(r: Resources, value: String): ColorStateList = js.native
  def parseDimension(r: Resources, value: String, defValue: Double): Double = js.native
  def parseDimension(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
  def parseDimensionPixelOffset(r: Resources, value: String, defValue: Double): Double = js.native
  def parseDimensionPixelOffset(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
  def parseDimensionPixelSize(r: Resources, value: String, defValue: Double): Double = js.native
  def parseDimensionPixelSize(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
  def parseDrawable(r: Resources, value: String): Drawable = js.native
  def parseFloat(r: Resources, value: String, defValue: Double): Double = js.native
  def parseInt(r: Resources, value: String, defValue: Double): Double = js.native
  def parseString(r: Resources, value: String): String = js.native
  def parseString(r: Resources, value: String, defValue: String): String = js.native
  def parseTextArray(r: Resources, value: String): js.Array[String] = js.native
}

