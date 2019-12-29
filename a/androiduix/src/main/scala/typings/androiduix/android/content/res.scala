package typings.androiduix.android.content

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.util.DisplayMetrics
import typings.androiduix.android.util.Pools.SynchronizedPool
import typings.androiduix.android.view.animation.Animation
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.res")
@js.native
object res extends js.Object {
  @js.native
  class ColorStateList protected () extends js.Object {
    def this(states: js.Array[js.Array[Double]], colors: js.Array[Double]) = this()
    var mColors: js.Array[Double] = js.native
    var mDefaultColor: Double = js.native
    var mStateSpecs: js.Array[js.Array[Double]] = js.native
    def getColorForState(stateSet: js.Array[Double], defaultColor: Double): Double = js.native
    def getDefaultColor(): Double = js.native
    def isStateful(): Boolean = js.native
    def withAlpha(alpha: Double): ColorStateList = js.native
  }
  
  @js.native
  class Resources () extends js.Object {
    def this(context: Context) = this()
    var context: js.Any = js.native
    var displayMetrics: js.Any = js.native
    var mTypedArrayPool: SynchronizedPool[TypedArray] = js.native
    /* private */ def fillDisplayMetrics(displayMetrics: js.Any): js.Any = js.native
    def getAnimation(refString: String): Animation = js.native
    def getBoolean(refString: String): Boolean = js.native
    def getColor(refString: String): Double = js.native
    def getColorStateList(refString: String): ColorStateList = js.native
    def getDefStyle(refString: String): js.Any = js.native
    def getDimension(refString: String): Double = js.native
    def getDimension(refString: String, baseValue: Double): Double = js.native
    def getDimensionPixelOffset(refString: String): Double = js.native
    def getDimensionPixelOffset(refString: String, baseValue: Double): Double = js.native
    def getDimensionPixelSize(refString: String): Double = js.native
    def getDimensionPixelSize(refString: String, baseValue: Double): Double = js.native
    def getDisplayMetrics(): DisplayMetrics = js.native
    def getDrawable(refString: String): Drawable = js.native
    def getFloat(refString: String): Double = js.native
    def getIntArray(refString: String): js.Array[Double] = js.native
    def getInteger(refString: String): Double = js.native
    def getLayout(refString: String): HTMLElement = js.native
    def getString(refString: String): String = js.native
    def getStringArray(refString: String): js.Array[String] = js.native
    /* private */ def getStyleAsMap(refString: js.Any): js.Any = js.native
    def getValue(refString: String): HTMLElement = js.native
    def getValue(refString: String, resolveRefs: Boolean): HTMLElement = js.native
    def getXml(refString: String): HTMLElement = js.native
    def obtainAttributes(attrs: HTMLElement): TypedArray = js.native
    def obtainStyledAttributes(attrs: HTMLElement, defStyleAttr: Map[String, String]): TypedArray = js.native
  }
  
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
  @js.native
  object ColorStateList extends js.Object {
    var EMPTY: js.Any = js.native
    var sCache: js.Any = js.native
    def createFromXml(r: Resources, parser: HTMLElement): ColorStateList = js.native
    def valueOf(color: Double): ColorStateList = js.native
  }
  
  /* static members */
  @js.native
  object Resources extends js.Object {
    var instance: js.Any = js.native
    def _AppBuildImageFileFinder(refString: String): Drawable = js.native
    def _AppBuildValueFinder(refString: String): HTMLElement = js.native
    def _AppBuildXmlFinder(refString: String): HTMLElement = js.native
    /* private */ def from(context: js.Any): js.Any = js.native
    def getDisplayMetrics(): DisplayMetrics = js.native
    def getSystem(): Resources = js.native
  }
  
  /* static members */
  @js.native
  object TypedArray extends js.Object {
    def obtain(res: Resources, xml: HTMLElement): TypedArray = js.native
    def obtain(res: Resources, xml: HTMLElement, defStyleAttr: Map[String, String]): TypedArray = js.native
  }
  
}

