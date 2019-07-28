package typings.androiduix.androiduiNs.attrNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.contentNs.resNs.ColorStateList
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewGroupNs.LayoutParams
import typings.androiduix.androiduiNs.attrNs.AttrBinderNs.ClassBinderMap
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.attr.AttrBinder")
@js.native
class AttrBinder protected () extends js.Object {
  def this(host: View) = this()
  def this(host: LayoutParams) = this()
  var attrChangeMap: js.Any = js.native
  var attrStashMap: js.Any = js.native
  var classAttrBindMap: js.Any = js.native
  var host: js.Any = js.native
  var mContext: js.Any = js.native
  var objectRefs: js.Any = js.native
  def addAttr(attrName: String, onAttrChange: js.Function1[/* newValue */ js.Any, Unit]): Unit = js.native
  def addAttr(
    attrName: String,
    onAttrChange: js.Function1[/* newValue */ js.Any, Unit],
    stashAttrValueWhenStateChange: js.Function0[_]
  ): Unit = js.native
  def getAttrValue(attrName: String): String = js.native
  /* private */ def getRefObject(ref: js.Any): js.Any = js.native
  def onAttrChange(attrName: String, attrValue: js.Any, context: Context): Unit = js.native
  def parseBoolean(value: js.Any): Boolean = js.native
  def parseBoolean(value: js.Any, defaultValue: Boolean): Boolean = js.native
  def parseColor(value: String): Double = js.native
  def parseColor(value: String, defaultValue: Double): Double = js.native
  def parseColorList(value: String): ColorStateList = js.native
  def parseDimension(value: js.Any): Double = js.native
  def parseDimension(value: js.Any, defaultValue: Double): Double = js.native
  def parseDimension(value: js.Any, defaultValue: Double, baseValue: Double): Double = js.native
  def parseDrawable(s: String): Drawable = js.native
  def parseEnum(value: js.Any, enumMap: Map[String, Double], defaultValue: Double): Double = js.native
  def parseFloat(value: js.Any): Double = js.native
  def parseFloat(value: js.Any, defaultValue: Double): Double = js.native
  def parseGravity(s: String): Double = js.native
  def parseGravity(s: String, defaultValue: Double): Double = js.native
  def parseInt(value: js.Any): Double = js.native
  def parseInt(value: js.Any, defaultValue: Double): Double = js.native
  def parseNumberPixelOffset(value: js.Any): Double = js.native
  def parseNumberPixelOffset(value: js.Any, defaultValue: Double): Double = js.native
  def parseNumberPixelOffset(value: js.Any, defaultValue: Double, baseValue: Double): Double = js.native
  def parseNumberPixelSize(value: js.Any): Double = js.native
  def parseNumberPixelSize(value: js.Any, defaultValue: Double): Double = js.native
  def parseNumberPixelSize(value: js.Any, defaultValue: Double, baseValue: Double): Double = js.native
  def parsePaddingMarginTRBL(value: js.Any): js.Array[Double] = js.native
  def parseString(value: js.Any): String = js.native
  def parseString(value: js.Any, defaultValue: String): String = js.native
  def parseStringArray(value: js.Any): js.Array[String] = js.native
  def setClassAttrBind(classAttrBind: ClassBinderMap): Unit = js.native
  /* private */ def setRefObject(obj: js.Any): js.Any = js.native
}

