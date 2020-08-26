package typings.androiduix.android.view

import typings.androiduix.android.graphics.Point
import typings.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewParent extends js.Object {
  def bringChildToFront(child: View): js.Any = js.native
  def childDrawableStateChanged(child: View): js.Any = js.native
  def childHasTransientStateChanged(child: View, hasTransientState: Boolean): js.Any = js.native
  def clearChildFocus(child: View): js.Any = js.native
  def focusSearch(v: View, direction: Double): View = js.native
  def focusableViewAvailable(v: View): js.Any = js.native
  def getChildVisibleRect(child: View, r: Rect, offset: Point): Boolean = js.native
  def getParent(): ViewParent = js.native
  def invalidateChild(child: View, r: Rect): js.Any = js.native
  def invalidateChildInParent(location: js.Array[Double], r: Rect): ViewParent = js.native
  def isLayoutRequested(): Boolean = js.native
  def requestChildFocus(child: View, focused: View): js.Any = js.native
  def requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean = js.native
  def requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): js.Any = js.native
  def requestLayout(): js.Any = js.native
}

object ViewParent {
  @scala.inline
  def apply(
    bringChildToFront: View => js.Any,
    childDrawableStateChanged: View => js.Any,
    childHasTransientStateChanged: (View, Boolean) => js.Any,
    clearChildFocus: View => js.Any,
    focusSearch: (View, Double) => View,
    focusableViewAvailable: View => js.Any,
    getChildVisibleRect: (View, Rect, Point) => Boolean,
    getParent: () => ViewParent,
    invalidateChild: (View, Rect) => js.Any,
    invalidateChildInParent: (js.Array[Double], Rect) => ViewParent,
    isLayoutRequested: () => Boolean,
    requestChildFocus: (View, View) => js.Any,
    requestChildRectangleOnScreen: (View, Rect, Boolean) => Boolean,
    requestDisallowInterceptTouchEvent: Boolean => js.Any,
    requestLayout: () => js.Any
  ): ViewParent = {
    val __obj = js.Dynamic.literal(bringChildToFront = js.Any.fromFunction1(bringChildToFront), childDrawableStateChanged = js.Any.fromFunction1(childDrawableStateChanged), childHasTransientStateChanged = js.Any.fromFunction2(childHasTransientStateChanged), clearChildFocus = js.Any.fromFunction1(clearChildFocus), focusSearch = js.Any.fromFunction2(focusSearch), focusableViewAvailable = js.Any.fromFunction1(focusableViewAvailable), getChildVisibleRect = js.Any.fromFunction3(getChildVisibleRect), getParent = js.Any.fromFunction0(getParent), invalidateChild = js.Any.fromFunction2(invalidateChild), invalidateChildInParent = js.Any.fromFunction2(invalidateChildInParent), isLayoutRequested = js.Any.fromFunction0(isLayoutRequested), requestChildFocus = js.Any.fromFunction2(requestChildFocus), requestChildRectangleOnScreen = js.Any.fromFunction3(requestChildRectangleOnScreen), requestDisallowInterceptTouchEvent = js.Any.fromFunction1(requestDisallowInterceptTouchEvent), requestLayout = js.Any.fromFunction0(requestLayout))
    __obj.asInstanceOf[ViewParent]
  }
  @scala.inline
  implicit class ViewParentOps[Self <: ViewParent] (val x: Self) extends AnyVal {
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
    def setBringChildToFront(value: View => js.Any): Self = this.set("bringChildToFront", js.Any.fromFunction1(value))
    @scala.inline
    def setChildDrawableStateChanged(value: View => js.Any): Self = this.set("childDrawableStateChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setChildHasTransientStateChanged(value: (View, Boolean) => js.Any): Self = this.set("childHasTransientStateChanged", js.Any.fromFunction2(value))
    @scala.inline
    def setClearChildFocus(value: View => js.Any): Self = this.set("clearChildFocus", js.Any.fromFunction1(value))
    @scala.inline
    def setFocusSearch(value: (View, Double) => View): Self = this.set("focusSearch", js.Any.fromFunction2(value))
    @scala.inline
    def setFocusableViewAvailable(value: View => js.Any): Self = this.set("focusableViewAvailable", js.Any.fromFunction1(value))
    @scala.inline
    def setGetChildVisibleRect(value: (View, Rect, Point) => Boolean): Self = this.set("getChildVisibleRect", js.Any.fromFunction3(value))
    @scala.inline
    def setGetParent(value: () => ViewParent): Self = this.set("getParent", js.Any.fromFunction0(value))
    @scala.inline
    def setInvalidateChild(value: (View, Rect) => js.Any): Self = this.set("invalidateChild", js.Any.fromFunction2(value))
    @scala.inline
    def setInvalidateChildInParent(value: (js.Array[Double], Rect) => ViewParent): Self = this.set("invalidateChildInParent", js.Any.fromFunction2(value))
    @scala.inline
    def setIsLayoutRequested(value: () => Boolean): Self = this.set("isLayoutRequested", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestChildFocus(value: (View, View) => js.Any): Self = this.set("requestChildFocus", js.Any.fromFunction2(value))
    @scala.inline
    def setRequestChildRectangleOnScreen(value: (View, Rect, Boolean) => Boolean): Self = this.set("requestChildRectangleOnScreen", js.Any.fromFunction3(value))
    @scala.inline
    def setRequestDisallowInterceptTouchEvent(value: Boolean => js.Any): Self = this.set("requestDisallowInterceptTouchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestLayout(value: () => js.Any): Self = this.set("requestLayout", js.Any.fromFunction0(value))
  }
  
}

