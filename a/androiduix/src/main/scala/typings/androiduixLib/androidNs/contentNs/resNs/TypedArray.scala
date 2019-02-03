package typings
package androiduixLib.androidNs.contentNs.resNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.res.TypedArray")
@js.native
class TypedArray protected () extends js.Object {
  def this(res: Resources, attrMap: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var attrMap: js.Any = js.native
  var attrMapKeysCache: js.Any = js.native
  var mRecycled: js.Any = js.native
  var mResources: js.Any = js.native
  /* private */ def checkRecycled(): js.Any = js.native
  def getAttrValue(attrName: java.lang.String): java.lang.String = js.native
  def getBoolean(attrName: java.lang.String, defValue: scala.Boolean): scala.Boolean = js.native
  def getColor(attrName: java.lang.String, defValue: scala.Double): scala.Double = js.native
  def getColorStateList(attrName: java.lang.String): ColorStateList = js.native
  def getDimension(attrName: java.lang.String, defValue: scala.Double): scala.Double = js.native
  def getDimensionPixelOffset(attrName: java.lang.String, defValue: scala.Double): scala.Double = js.native
  def getDimensionPixelSize(attrName: java.lang.String, defValue: scala.Double): scala.Double = js.native
  def getDrawable(attrName: java.lang.String): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getFloat(attrName: java.lang.String, defValue: scala.Double): scala.Double = js.native
  def getIndex(keyIndex: scala.Double): java.lang.String = js.native
  def getInt(attrName: java.lang.String, defValue: scala.Double): scala.Double = js.native
  def getInteger(attrName: java.lang.String, defValue: scala.Double): scala.Double = js.native
  def getLayoutDimension(attrName: java.lang.String, defValue: scala.Double): scala.Double = js.native
  def getLowerCaseNoNamespaceAttrNames(): js.Array[java.lang.String] = js.native
  def getResourceId(attrName: java.lang.String, defaultResourceId: java.lang.String): java.lang.String = js.native
  def getResources(): Resources = js.native
  def getString(attrName: java.lang.String): java.lang.String = js.native
  def getText(attrName: java.lang.String): java.lang.String = js.native
  def getTextArray(attrName: java.lang.String): js.Array[java.lang.String] = js.native
  def hasValue(attrName: java.lang.String): scala.Boolean = js.native
  def hasValueOrEmpty(attrName: java.lang.String): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def recycle(): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.content.res.TypedArray")
@js.native
object TypedArray extends js.Object {
  def obtain(res: androiduixLib.androidNs.contentNs.resNs.Resources, xml: stdLib.HTMLElement): androiduixLib.androidNs.contentNs.resNs.TypedArray = js.native
  def obtain(
    res: androiduixLib.androidNs.contentNs.resNs.Resources,
    xml: stdLib.HTMLElement,
    defStyleAttr: stdLib.Map[java.lang.String, java.lang.String]
  ): androiduixLib.androidNs.contentNs.resNs.TypedArray = js.native
}

