package typings.androiduix.android.content.res

import typings.androiduix.android.graphics.drawable.Drawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedArray extends js.Object {
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

object TypedArray {
  @scala.inline
  def apply(
    attrMap: js.Any,
    attrMapKeysCache: js.Any,
    checkRecycled: () => js.Any,
    getAttrValue: String => String,
    getBoolean: (String, Boolean) => Boolean,
    getColor: (String, Double) => Double,
    getColorStateList: String => ColorStateList,
    getDimension: (String, Double) => Double,
    getDimensionPixelOffset: (String, Double) => Double,
    getDimensionPixelSize: (String, Double) => Double,
    getDrawable: String => Drawable,
    getFloat: (String, Double) => Double,
    getIndex: Double => String,
    getInt: (String, Double) => Double,
    getInteger: (String, Double) => Double,
    getLayoutDimension: (String, Double) => Double,
    getLowerCaseNoNamespaceAttrNames: () => js.Array[String],
    getResourceId: (String, String) => String,
    getResources: () => Resources,
    getString: String => String,
    getText: String => String,
    getTextArray: String => js.Array[String],
    hasValue: String => Boolean,
    hasValueOrEmpty: String => Boolean,
    length: () => Double,
    mRecycled: js.Any,
    mResources: js.Any,
    recycle: () => Unit
  ): TypedArray = {
    val __obj = js.Dynamic.literal(attrMap = attrMap.asInstanceOf[js.Any], attrMapKeysCache = attrMapKeysCache.asInstanceOf[js.Any], checkRecycled = js.Any.fromFunction0(checkRecycled), getAttrValue = js.Any.fromFunction1(getAttrValue), getBoolean = js.Any.fromFunction2(getBoolean), getColor = js.Any.fromFunction2(getColor), getColorStateList = js.Any.fromFunction1(getColorStateList), getDimension = js.Any.fromFunction2(getDimension), getDimensionPixelOffset = js.Any.fromFunction2(getDimensionPixelOffset), getDimensionPixelSize = js.Any.fromFunction2(getDimensionPixelSize), getDrawable = js.Any.fromFunction1(getDrawable), getFloat = js.Any.fromFunction2(getFloat), getIndex = js.Any.fromFunction1(getIndex), getInt = js.Any.fromFunction2(getInt), getInteger = js.Any.fromFunction2(getInteger), getLayoutDimension = js.Any.fromFunction2(getLayoutDimension), getLowerCaseNoNamespaceAttrNames = js.Any.fromFunction0(getLowerCaseNoNamespaceAttrNames), getResourceId = js.Any.fromFunction2(getResourceId), getResources = js.Any.fromFunction0(getResources), getString = js.Any.fromFunction1(getString), getText = js.Any.fromFunction1(getText), getTextArray = js.Any.fromFunction1(getTextArray), hasValue = js.Any.fromFunction1(hasValue), hasValueOrEmpty = js.Any.fromFunction1(hasValueOrEmpty), length = js.Any.fromFunction0(length), mRecycled = mRecycled.asInstanceOf[js.Any], mResources = mResources.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle))
    __obj.asInstanceOf[TypedArray]
  }
  @scala.inline
  implicit class TypedArrayOps[Self <: TypedArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttrMap(value: js.Any): Self = this.set("attrMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttrMapKeysCache(value: js.Any): Self = this.set("attrMapKeysCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckRecycled(value: () => js.Any): Self = this.set("checkRecycled", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAttrValue(value: String => String): Self = this.set("getAttrValue", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBoolean(value: (String, Boolean) => Boolean): Self = this.set("getBoolean", js.Any.fromFunction2(value))
    @scala.inline
    def setGetColor(value: (String, Double) => Double): Self = this.set("getColor", js.Any.fromFunction2(value))
    @scala.inline
    def setGetColorStateList(value: String => ColorStateList): Self = this.set("getColorStateList", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDimension(value: (String, Double) => Double): Self = this.set("getDimension", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDimensionPixelOffset(value: (String, Double) => Double): Self = this.set("getDimensionPixelOffset", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDimensionPixelSize(value: (String, Double) => Double): Self = this.set("getDimensionPixelSize", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDrawable(value: String => Drawable): Self = this.set("getDrawable", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFloat(value: (String, Double) => Double): Self = this.set("getFloat", js.Any.fromFunction2(value))
    @scala.inline
    def setGetIndex(value: Double => String): Self = this.set("getIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInt(value: (String, Double) => Double): Self = this.set("getInt", js.Any.fromFunction2(value))
    @scala.inline
    def setGetInteger(value: (String, Double) => Double): Self = this.set("getInteger", js.Any.fromFunction2(value))
    @scala.inline
    def setGetLayoutDimension(value: (String, Double) => Double): Self = this.set("getLayoutDimension", js.Any.fromFunction2(value))
    @scala.inline
    def setGetLowerCaseNoNamespaceAttrNames(value: () => js.Array[String]): Self = this.set("getLowerCaseNoNamespaceAttrNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetResourceId(value: (String, String) => String): Self = this.set("getResourceId", js.Any.fromFunction2(value))
    @scala.inline
    def setGetResources(value: () => Resources): Self = this.set("getResources", js.Any.fromFunction0(value))
    @scala.inline
    def setGetString(value: String => String): Self = this.set("getString", js.Any.fromFunction1(value))
    @scala.inline
    def setGetText(value: String => String): Self = this.set("getText", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTextArray(value: String => js.Array[String]): Self = this.set("getTextArray", js.Any.fromFunction1(value))
    @scala.inline
    def setHasValue(value: String => Boolean): Self = this.set("hasValue", js.Any.fromFunction1(value))
    @scala.inline
    def setHasValueOrEmpty(value: String => Boolean): Self = this.set("hasValueOrEmpty", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setMRecycled(value: js.Any): Self = this.set("mRecycled", value.asInstanceOf[js.Any])
    @scala.inline
    def setMResources(value: js.Any): Self = this.set("mResources", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecycle(value: () => Unit): Self = this.set("recycle", js.Any.fromFunction0(value))
  }
  
}

