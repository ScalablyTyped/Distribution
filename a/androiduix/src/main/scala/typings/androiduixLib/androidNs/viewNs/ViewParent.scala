package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewParent extends js.Object {
  def bringChildToFront(child: View): js.Any
  def childDrawableStateChanged(child: View): js.Any
  def childHasTransientStateChanged(child: View, hasTransientState: scala.Boolean): js.Any
  def clearChildFocus(child: View): js.Any
  def focusSearch(v: View, direction: scala.Double): View
  def focusableViewAvailable(v: View): js.Any
  def getChildVisibleRect(
    child: View,
    r: androiduixLib.androidNs.graphicsNs.Rect,
    offset: androiduixLib.androidNs.graphicsNs.Point
  ): scala.Boolean
  def getParent(): ViewParent
  def invalidateChild(child: View, r: androiduixLib.androidNs.graphicsNs.Rect): js.Any
  def invalidateChildInParent(location: js.Array[scala.Double], r: androiduixLib.androidNs.graphicsNs.Rect): ViewParent
  def isLayoutRequested(): scala.Boolean
  def requestChildFocus(child: View, focused: View): js.Any
  def requestChildRectangleOnScreen(child: View, rectangle: androiduixLib.androidNs.graphicsNs.Rect, immediate: scala.Boolean): scala.Boolean
  def requestDisallowInterceptTouchEvent(disallowIntercept: scala.Boolean): js.Any
  def requestLayout(): js.Any
}

object ViewParent {
  @scala.inline
  def apply(
    bringChildToFront: View => js.Any,
    childDrawableStateChanged: View => js.Any,
    childHasTransientStateChanged: (View, scala.Boolean) => js.Any,
    clearChildFocus: View => js.Any,
    focusSearch: (View, scala.Double) => View,
    focusableViewAvailable: View => js.Any,
    getChildVisibleRect: (View, androiduixLib.androidNs.graphicsNs.Rect, androiduixLib.androidNs.graphicsNs.Point) => scala.Boolean,
    getParent: () => ViewParent,
    invalidateChild: (View, androiduixLib.androidNs.graphicsNs.Rect) => js.Any,
    invalidateChildInParent: (js.Array[scala.Double], androiduixLib.androidNs.graphicsNs.Rect) => ViewParent,
    isLayoutRequested: () => scala.Boolean,
    requestChildFocus: (View, View) => js.Any,
    requestChildRectangleOnScreen: (View, androiduixLib.androidNs.graphicsNs.Rect, scala.Boolean) => scala.Boolean,
    requestDisallowInterceptTouchEvent: scala.Boolean => js.Any,
    requestLayout: () => js.Any
  ): ViewParent = {
    val __obj = js.Dynamic.literal(bringChildToFront = js.Any.fromFunction1(bringChildToFront), childDrawableStateChanged = js.Any.fromFunction1(childDrawableStateChanged), childHasTransientStateChanged = js.Any.fromFunction2(childHasTransientStateChanged), clearChildFocus = js.Any.fromFunction1(clearChildFocus), focusSearch = js.Any.fromFunction2(focusSearch), focusableViewAvailable = js.Any.fromFunction1(focusableViewAvailable), getChildVisibleRect = js.Any.fromFunction3(getChildVisibleRect), getParent = js.Any.fromFunction0(getParent), invalidateChild = js.Any.fromFunction2(invalidateChild), invalidateChildInParent = js.Any.fromFunction2(invalidateChildInParent), isLayoutRequested = js.Any.fromFunction0(isLayoutRequested), requestChildFocus = js.Any.fromFunction2(requestChildFocus), requestChildRectangleOnScreen = js.Any.fromFunction3(requestChildRectangleOnScreen), requestDisallowInterceptTouchEvent = js.Any.fromFunction1(requestDisallowInterceptTouchEvent), requestLayout = js.Any.fromFunction0(requestLayout))
  
    __obj.asInstanceOf[ViewParent]
  }
}

