package typings.androiduix.android.view

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.widget.FrameLayout
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowManager extends StObject {
  
  def addWindow(window: Window): Unit = js.native
  
  def getWindowsLayout(): ViewGroup = js.native
  
  var mActiveWindow: Window = js.native
  
  var mWindowsLayout: js.Any = js.native
  
  def removeWindow(window: Window): Unit = js.native
  
  def updateWindowLayout(window: Window, params: LayoutParams): Unit = js.native
}
object WindowManager {
  
  @scala.inline
  def apply(
    addWindow: Window => Unit,
    getWindowsLayout: () => ViewGroup,
    mActiveWindow: Window,
    mWindowsLayout: js.Any,
    removeWindow: Window => Unit,
    updateWindowLayout: (Window, typings.androiduix.android.view.ViewGroup.LayoutParams) => Unit
  ): WindowManager = {
    val __obj = js.Dynamic.literal(addWindow = js.Any.fromFunction1(addWindow), getWindowsLayout = js.Any.fromFunction0(getWindowsLayout), mActiveWindow = mActiveWindow.asInstanceOf[js.Any], mWindowsLayout = mWindowsLayout.asInstanceOf[js.Any], removeWindow = js.Any.fromFunction1(removeWindow), updateWindowLayout = js.Any.fromFunction2(updateWindowLayout))
    __obj.asInstanceOf[WindowManager]
  }
  
  @js.native
  trait Layout extends FrameLayout {
    
    def getTopFocusableWindowView(): ViewGroup = js.native
    def getTopFocusableWindowView(findParent: Boolean): ViewGroup = js.native
    
    var mWindowManager: js.Any = js.native
  }
  
  @js.native
  trait LayoutParams
    extends typings.androiduix.android.widget.FrameLayout.LayoutParams {
    
    def copyFrom(o: typings.androiduix.android.view.WindowManager.LayoutParams): Double = js.native
    
    var dimAmount: Double = js.native
    
    var enterAnimation: Animation = js.native
    
    var exitAnimation: Animation = js.native
    
    var flags: Double = js.native
    
    def getTitle(): String = js.native
    
    var hideAnimation: Animation = js.native
    
    /* private */ def isFloating(): js.Any = js.native
    
    /* private */ def isFocusable(): js.Any = js.native
    
    /* private */ def isSplitTouch(): js.Any = js.native
    
    /* private */ def isTouchModal(): js.Any = js.native
    
    /* private */ def isTouchable(): js.Any = js.native
    
    /* private */ def isWatchTouchOutside(): js.Any = js.native
    
    var mTitle: js.Any = js.native
    
    var resumeAnimation: Animation = js.native
    
    def setTitle(title: String): Unit = js.native
    
    var `type`: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object LayoutParams {
    
    @scala.inline
    def apply(
      _attrBinder: js.Any,
      bottomMargin: Double,
      copyFrom: typings.androiduix.android.view.WindowManager.LayoutParams => Double,
      createClassAttrBinder: () => ClassBinderMap,
      dimAmount: Double,
      enterAnimation: Animation,
      equals_ : js.Any => Boolean,
      exitAnimation: Animation,
      flags: Double,
      getAttrBinder: () => AttrBinder,
      getLayoutDirection: () => Double,
      getTitle: () => String,
      gravity: Double,
      hash: js.Any,
      height: Double,
      hideAnimation: Animation,
      initBindAttr: () => js.Any,
      isFloating: () => js.Any,
      isFocusable: () => js.Any,
      isLayoutRtl: () => Boolean,
      isSplitTouch: () => js.Any,
      isTouchModal: () => js.Any,
      isTouchable: () => js.Any,
      isWatchTouchOutside: () => js.Any,
      leftMargin: Double,
      mTitle: js.Any,
      resolveLayoutDirection: Double => Unit,
      resumeAnimation: Animation,
      rightMargin: Double,
      setBaseAttributes: (TypedArray, String, String) => Unit,
      setLayoutDirection: Double => Unit,
      setMargins: (Double, Double, Double, Double) => Unit,
      setTitle: String => Unit,
      topMargin: Double,
      `type`: Double,
      width: Double,
      x: Double,
      y: Double
    ): typings.androiduix.android.view.WindowManager.LayoutParams = {
      val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], copyFrom = js.Any.fromFunction1(copyFrom), createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), dimAmount = dimAmount.asInstanceOf[js.Any], enterAnimation = enterAnimation.asInstanceOf[js.Any], exitAnimation = exitAnimation.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), getTitle = js.Any.fromFunction0(getTitle), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideAnimation = hideAnimation.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isFloating = js.Any.fromFunction0(isFloating), isFocusable = js.Any.fromFunction0(isFocusable), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), isSplitTouch = js.Any.fromFunction0(isSplitTouch), isTouchModal = js.Any.fromFunction0(isTouchModal), isTouchable = js.Any.fromFunction0(isTouchable), isWatchTouchOutside = js.Any.fromFunction0(isWatchTouchOutside), leftMargin = leftMargin.asInstanceOf[js.Any], mTitle = mTitle.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), resumeAnimation = resumeAnimation.asInstanceOf[js.Any], rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), setTitle = js.Any.fromFunction1(setTitle), topMargin = topMargin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.androiduix.android.view.WindowManager.LayoutParams]
    }
    
    @scala.inline
    implicit class LayoutParamsMutableBuilder[Self <: typings.androiduix.android.view.WindowManager.LayoutParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyFrom(value: typings.androiduix.android.view.WindowManager.LayoutParams => Double): Self = StObject.set(x, "copyFrom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDimAmount(value: Double): Self = StObject.set(x, "dimAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterAnimation(value: Animation): Self = StObject.set(x, "enterAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitAnimation(value: Animation): Self = StObject.set(x, "exitAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideAnimation(value: Animation): Self = StObject.set(x, "hideAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFloating(value: () => js.Any): Self = StObject.set(x, "isFloating", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFocusable(value: () => js.Any): Self = StObject.set(x, "isFocusable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSplitTouch(value: () => js.Any): Self = StObject.set(x, "isSplitTouch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTouchModal(value: () => js.Any): Self = StObject.set(x, "isTouchModal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTouchable(value: () => js.Any): Self = StObject.set(x, "isTouchable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsWatchTouchOutside(value: () => js.Any): Self = StObject.set(x, "isWatchTouchOutside", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMTitle(value: js.Any): Self = StObject.set(x, "mTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResumeAnimation(value: Animation): Self = StObject.set(x, "resumeAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  implicit class WindowManagerMutableBuilder[Self <: WindowManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddWindow(value: Window => Unit): Self = StObject.set(x, "addWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWindowsLayout(value: () => ViewGroup): Self = StObject.set(x, "getWindowsLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMActiveWindow(value: Window): Self = StObject.set(x, "mActiveWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMWindowsLayout(value: js.Any): Self = StObject.set(x, "mWindowsLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveWindow(value: Window => Unit): Self = StObject.set(x, "removeWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateWindowLayout(value: (Window, typings.androiduix.android.view.ViewGroup.LayoutParams) => Unit): Self = StObject.set(x, "updateWindowLayout", js.Any.fromFunction2(value))
  }
}
