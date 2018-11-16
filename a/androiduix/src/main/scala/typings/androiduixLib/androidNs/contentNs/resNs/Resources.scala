package typings
package androiduixLib.androidNs.contentNs.resNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.res.Resources")
@js.native
class Resources () extends js.Object {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  var context: js.Any = js.native
  var displayMetrics: js.Any = js.native
  var mTypedArrayPool: androiduixLib.androidNs.utilNs.PoolsNs.SynchronizedPool[TypedArray] = js.native
  /* private */ def fillDisplayMetrics(displayMetrics: js.Any): js.Any = js.native
  def getAnimation(refString: java.lang.String): androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  def getBoolean(refString: java.lang.String): scala.Boolean = js.native
  def getColor(refString: java.lang.String): scala.Double = js.native
  def getColorStateList(refString: java.lang.String): ColorStateList = js.native
  def getDefStyle(refString: java.lang.String): js.Any = js.native
  def getDimension(refString: java.lang.String): scala.Double = js.native
  def getDimension(refString: java.lang.String, baseValue: scala.Double): scala.Double = js.native
  def getDimensionPixelOffset(refString: java.lang.String): scala.Double = js.native
  def getDimensionPixelOffset(refString: java.lang.String, baseValue: scala.Double): scala.Double = js.native
  def getDimensionPixelSize(refString: java.lang.String): scala.Double = js.native
  def getDimensionPixelSize(refString: java.lang.String, baseValue: scala.Double): scala.Double = js.native
  def getDisplayMetrics(): androiduixLib.androidNs.utilNs.DisplayMetrics = js.native
  def getDrawable(refString: java.lang.String): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getFloat(refString: java.lang.String): scala.Double = js.native
  def getIntArray(refString: java.lang.String): js.Array[scala.Double] = js.native
  def getInteger(refString: java.lang.String): scala.Double = js.native
  def getLayout(refString: java.lang.String): stdLib.HTMLElement = js.native
  def getString(refString: java.lang.String): java.lang.String = js.native
  def getStringArray(refString: java.lang.String): js.Array[java.lang.String] = js.native
  /* private */ def getStyleAsMap(refString: js.Any): js.Any = js.native
  def getValue(refString: java.lang.String): stdLib.HTMLElement = js.native
  def getValue(refString: java.lang.String, resolveRefs: scala.Boolean): stdLib.HTMLElement = js.native
  def getXml(refString: java.lang.String): stdLib.HTMLElement = js.native
  def obtainAttributes(attrs: stdLib.HTMLElement): TypedArray = js.native
  def obtainStyledAttributes(attrs: stdLib.HTMLElement, defStyleAttr: stdLib.Map[java.lang.String, java.lang.String]): TypedArray = js.native
}

@JSGlobal("android.content.res.Resources")
@js.native
object Resources extends js.Object {
  var instance: js.Any = js.native
  def _AppBuildImageFileFinder(refString: java.lang.String): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def _AppBuildValueFinder(refString: java.lang.String): stdLib.HTMLElement = js.native
  def _AppBuildXmlFinder(refString: java.lang.String): stdLib.HTMLElement = js.native
  /* private */ def from(context: js.Any): js.Any = js.native
  def getDisplayMetrics(): androiduixLib.androidNs.utilNs.DisplayMetrics = js.native
  def getSystem(): androiduixLib.androidNs.contentNs.resNs.Resources = js.native
}

