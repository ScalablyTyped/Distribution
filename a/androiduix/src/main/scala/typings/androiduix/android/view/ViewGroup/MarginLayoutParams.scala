package typings.androiduix.android.view.ViewGroup

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginLayoutParams extends LayoutParams {
  
  var bottomMargin: Double = js.native
  
  def getLayoutDirection(): Double = js.native
  
  def isLayoutRtl(): Boolean = js.native
  
  var leftMargin: Double = js.native
  
  def resolveLayoutDirection(layoutDirection: Double): Unit = js.native
  
  var rightMargin: Double = js.native
  
  def setLayoutDirection(layoutDirection: Double): Unit = js.native
  
  def setMargins(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  var topMargin: Double = js.native
}
object MarginLayoutParams {
  
  @scala.inline
  def apply(
    _attrBinder: js.Any,
    bottomMargin: Double,
    createClassAttrBinder: () => ClassBinderMap,
    equals: js.Any => Boolean,
    getAttrBinder: () => AttrBinder,
    getLayoutDirection: () => Double,
    hash: js.Any,
    height: Double,
    initBindAttr: () => js.Any,
    isLayoutRtl: () => Boolean,
    leftMargin: Double,
    resolveLayoutDirection: Double => Unit,
    rightMargin: Double,
    setBaseAttributes: (TypedArray, String, String) => Unit,
    setLayoutDirection: Double => Unit,
    setMargins: (Double, Double, Double, Double) => Unit,
    topMargin: Double,
    width: Double
  ): MarginLayoutParams = {
    val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), equals = js.Any.fromFunction1(equals), getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), leftMargin = leftMargin.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), topMargin = topMargin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLayoutParams]
  }
  
  @scala.inline
  implicit class MarginLayoutParamsOps[Self <: MarginLayoutParams] (val x: Self) extends AnyVal {
    
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
    def setBottomMargin(value: Double): Self = this.set("bottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLayoutDirection(value: () => Double): Self = this.set("getLayoutDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLayoutRtl(value: () => Boolean): Self = this.set("isLayoutRtl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveLayoutDirection(value: Double => Unit): Self = this.set("resolveLayoutDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLayoutDirection(value: Double => Unit): Self = this.set("setLayoutDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMargins(value: (Double, Double, Double, Double) => Unit): Self = this.set("setMargins", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("topMargin", value.asInstanceOf[js.Any])
  }
}
