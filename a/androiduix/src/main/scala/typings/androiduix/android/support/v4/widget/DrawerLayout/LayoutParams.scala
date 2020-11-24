package typings.androiduix.android.support.v4.widget.DrawerLayout

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutParams extends MarginLayoutParams {
  
  var gravity: Double = js.native
  
  var isPeeking: Boolean = js.native
  
  var knownOpen: Boolean = js.native
  
  var onScreen: Double = js.native
}
object LayoutParams {
  
  @scala.inline
  def apply(
    _attrBinder: js.Any,
    bottomMargin: Double,
    createClassAttrBinder: () => ClassBinderMap,
    equals: js.Any => Boolean,
    getAttrBinder: () => AttrBinder,
    getLayoutDirection: () => Double,
    gravity: Double,
    hash: js.Any,
    height: Double,
    initBindAttr: () => js.Any,
    isLayoutRtl: () => Boolean,
    isPeeking: Boolean,
    knownOpen: Boolean,
    leftMargin: Double,
    onScreen: Double,
    resolveLayoutDirection: Double => Unit,
    rightMargin: Double,
    setBaseAttributes: (TypedArray, String, String) => Unit,
    setLayoutDirection: Double => Unit,
    setMargins: (Double, Double, Double, Double) => Unit,
    topMargin: Double,
    width: Double
  ): LayoutParams = {
    val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), equals = js.Any.fromFunction1(equals), getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), isPeeking = isPeeking.asInstanceOf[js.Any], knownOpen = knownOpen.asInstanceOf[js.Any], leftMargin = leftMargin.asInstanceOf[js.Any], onScreen = onScreen.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), topMargin = topMargin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParams]
  }
  
  @scala.inline
  implicit class LayoutParamsOps[Self <: LayoutParams] (val x: Self) extends AnyVal {
    
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
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPeeking(value: Boolean): Self = this.set("isPeeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownOpen(value: Boolean): Self = this.set("knownOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScreen(value: Double): Self = this.set("onScreen", value.asInstanceOf[js.Any])
  }
}
