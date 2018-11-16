package typings
package androiduixLib.androiduiNs.attrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.attr.AttrBinder")
@js.native
class AttrBinder protected () extends js.Object {
  def this(host: androiduixLib.androidNs.viewNs.View) = this()
  def this(host: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams) = this()
  var attrChangeMap: js.Any = js.native
  var attrStashMap: js.Any = js.native
  var classAttrBindMap: js.Any = js.native
  var host: js.Any = js.native
  var mContext: js.Any = js.native
  var objectRefs: js.Any = js.native
  def addAttr(attrName: java.lang.String, onAttrChange: js.Function1[/* newValue */ js.Any, scala.Unit]): scala.Unit = js.native
  def addAttr(
    attrName: java.lang.String,
    onAttrChange: js.Function1[/* newValue */ js.Any, scala.Unit],
    stashAttrValueWhenStateChange: js.Function0[_]
  ): scala.Unit = js.native
  def getAttrValue(attrName: java.lang.String): java.lang.String = js.native
  /* private */ def getRefObject(ref: js.Any): js.Any = js.native
  def onAttrChange(attrName: java.lang.String, attrValue: js.Any, context: androiduixLib.androidNs.contentNs.Context): scala.Unit = js.native
  def parseBoolean(value: js.Any): scala.Boolean = js.native
  def parseBoolean(value: js.Any, defaultValue: scala.Boolean): scala.Boolean = js.native
  def parseColor(value: java.lang.String): scala.Double = js.native
  def parseColor(value: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  def parseColorList(value: java.lang.String): androiduixLib.androidNs.contentNs.resNs.ColorStateList = js.native
  def parseDimension(value: js.Any): scala.Double = js.native
  def parseDimension(value: js.Any, defaultValue: scala.Double): scala.Double = js.native
  def parseDimension(value: js.Any, defaultValue: scala.Double, baseValue: scala.Double): scala.Double = js.native
  def parseDrawable(s: java.lang.String): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def parseEnum(value: js.Any, enumMap: stdLib.Map[java.lang.String, scala.Double], defaultValue: scala.Double): scala.Double = js.native
  def parseFloat(value: js.Any): scala.Double = js.native
  def parseFloat(value: js.Any, defaultValue: scala.Double): scala.Double = js.native
  def parseGravity(s: java.lang.String): scala.Double = js.native
  def parseGravity(s: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  def parseInt(value: js.Any): scala.Double = js.native
  def parseInt(value: js.Any, defaultValue: scala.Double): scala.Double = js.native
  def parseNumberPixelOffset(value: js.Any): scala.Double = js.native
  def parseNumberPixelOffset(value: js.Any, defaultValue: scala.Double): scala.Double = js.native
  def parseNumberPixelOffset(value: js.Any, defaultValue: scala.Double, baseValue: scala.Double): scala.Double = js.native
  def parseNumberPixelSize(value: js.Any): scala.Double = js.native
  def parseNumberPixelSize(value: js.Any, defaultValue: scala.Double): scala.Double = js.native
  def parseNumberPixelSize(value: js.Any, defaultValue: scala.Double, baseValue: scala.Double): scala.Double = js.native
  def parsePaddingMarginTRBL(value: js.Any): js.Array[scala.Double] = js.native
  def parseString(value: js.Any): java.lang.String = js.native
  def parseString(value: js.Any, defaultValue: java.lang.String): java.lang.String = js.native
  def parseStringArray(value: js.Any): js.Array[java.lang.String] = js.native
  def setClassAttrBind(classAttrBind: androiduixLib.androiduiNs.attrNs.AttrBinderNs.ClassBinderMap): scala.Unit = js.native
  /* private */ def setRefObject(obj: js.Any): js.Any = js.native
}

