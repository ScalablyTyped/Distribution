package typings.androiduix.android.widget

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameLayout extends ViewGroup {
  
  def getForeground(): Drawable = js.native
  
  def getForegroundGravity(): Double = js.native
  
  def getMeasureAllChildren(): Boolean = js.native
  
  def getPaddingBottomWithForeground(): Double = js.native
  
  def getPaddingLeftWithForeground(): Double = js.native
  
  def getPaddingRightWithForeground(): Double = js.native
  
  def getPaddingTopWithForeground(): Double = js.native
  
  def layoutChildren(left: Double, top: Double, right: Double, bottom: Double, forceLeftGravity: Boolean): Unit = js.native
  
  var mForeground: Drawable = js.native
  
  var mForegroundBoundsChanged: Boolean = js.native
  
  var mForegroundGravity: js.Any = js.native
  
  var mForegroundInPadding: Boolean = js.native
  
  var mForegroundPaddingBottom: js.Any = js.native
  
  var mForegroundPaddingLeft: js.Any = js.native
  
  var mForegroundPaddingRight: js.Any = js.native
  
  var mForegroundPaddingTop: js.Any = js.native
  
  var mMatchParentChildren: js.Any = js.native
  
  var mMeasureAllChildren: Boolean = js.native
  
  var mOverlayBounds: js.Any = js.native
  
  var mSelfBounds: js.Any = js.native
  
  def setForeground(drawable: Drawable): Unit = js.native
  
  def setForegroundGravity(foregroundGravity: Double): Unit = js.native
  
  def setMeasureAllChildren(measureAll: Boolean): Unit = js.native
}
object FrameLayout {
  
  @js.native
  trait LayoutParams extends MarginLayoutParams {
    
    var gravity: Double = js.native
  }
  object LayoutParams {
    
    @scala.inline
    def apply(
      _attrBinder: js.Any,
      bottomMargin: Double,
      createClassAttrBinder: () => ClassBinderMap,
      equals_ : js.Any => Boolean,
      getAttrBinder: () => AttrBinder,
      getLayoutDirection: () => Double,
      gravity: Double,
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
    ): LayoutParams = {
      val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), leftMargin = leftMargin.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), topMargin = topMargin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[LayoutParams]
    }
    
    @scala.inline
    implicit class LayoutParamsMutableBuilder[Self <: LayoutParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    }
  }
}
