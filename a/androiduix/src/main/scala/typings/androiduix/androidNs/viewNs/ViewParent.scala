package typings.androiduix.androidNs.viewNs

import typings.androiduix.androidNs.graphicsNs.Point
import typings.androiduix.androidNs.graphicsNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewParent extends js.Object {
  def bringChildToFront(child: View): js.Any
  def childDrawableStateChanged(child: View): js.Any
  def childHasTransientStateChanged(child: View, hasTransientState: Boolean): js.Any
  def clearChildFocus(child: View): js.Any
  def focusSearch(v: View, direction: Double): View
  def focusableViewAvailable(v: View): js.Any
  def getChildVisibleRect(child: View, r: Rect, offset: Point): Boolean
  def getParent(): ViewParent
  def invalidateChild(child: View, r: Rect): js.Any
  def invalidateChildInParent(location: js.Array[Double], r: Rect): ViewParent
  def isLayoutRequested(): Boolean
  def requestChildFocus(child: View, focused: View): js.Any
  def requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean
  def requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): js.Any
  def requestLayout(): js.Any
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
}

