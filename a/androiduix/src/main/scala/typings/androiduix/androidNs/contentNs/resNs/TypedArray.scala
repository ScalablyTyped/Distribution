package typings.androiduix.androidNs.contentNs.resNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.res.TypedArray")
@js.native
class TypedArray protected () extends js.Object {
  def this(res: Resources, attrMap: Map[String, String]) = this()
  var attrMap: js.Any = js.native
  var attrMapKeysCache: js.Any = js.native
  var mRecycled: js.Any = js.native
  var mResources: js.Any = js.native
  /* private */ def checkRecycled(): js.Any = js.native
  def getAttrValue(attrName: String): String = js.native
  def getBoolean(attrName: String, defValue: Boolean): Boolean = js.native
  def getColor(attrName: String, defValue: Double): Double = js.native
  def getColorStateList(attrName: String): ColorStateList = js.native
  def getDimension(attrName: String, defValue: Double): Double = js.native
  def getDimensionPixelOffset(attrName: String, defValue: Double): Double = js.native
  def getDimensionPixelSize(attrName: String, defValue: Double): Double = js.native
  def getDrawable(attrName: String): Drawable = js.native
  def getFloat(attrName: String, defValue: Double): Double = js.native
  def getIndex(keyIndex: Double): String = js.native
  def getInt(attrName: String, defValue: Double): Double = js.native
  def getInteger(attrName: String, defValue: Double): Double = js.native
  def getLayoutDimension(attrName: String, defValue: Double): Double = js.native
  def getLowerCaseNoNamespaceAttrNames(): js.Array[String] = js.native
  def getResourceId(attrName: String, defaultResourceId: String): String = js.native
  def getResources(): Resources = js.native
  def getString(attrName: String): String = js.native
  def getText(attrName: String): String = js.native
  def getTextArray(attrName: String): js.Array[String] = js.native
  def hasValue(attrName: String): Boolean = js.native
  def hasValueOrEmpty(attrName: String): Boolean = js.native
  def length(): Double = js.native
  def recycle(): Unit = js.native
}

/* static members */
@JSGlobal("android.content.res.TypedArray")
@js.native
object TypedArray extends js.Object {
  def obtain(res: Resources, xml: HTMLElement): TypedArray = js.native
  def obtain(res: Resources, xml: HTMLElement, defStyleAttr: Map[String, String]): TypedArray = js.native
}

