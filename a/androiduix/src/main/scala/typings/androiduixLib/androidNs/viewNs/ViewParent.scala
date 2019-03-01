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
    bringChildToFront: js.Function1[View, js.Any],
    childDrawableStateChanged: js.Function1[View, js.Any],
    childHasTransientStateChanged: js.Function2[View, scala.Boolean, js.Any],
    clearChildFocus: js.Function1[View, js.Any],
    focusSearch: js.Function2[View, scala.Double, View],
    focusableViewAvailable: js.Function1[View, js.Any],
    getChildVisibleRect: js.Function3[
      View, 
      androiduixLib.androidNs.graphicsNs.Rect, 
      androiduixLib.androidNs.graphicsNs.Point, 
      scala.Boolean
    ],
    getParent: js.Function0[ViewParent],
    invalidateChild: js.Function2[View, androiduixLib.androidNs.graphicsNs.Rect, js.Any],
    invalidateChildInParent: js.Function2[js.Array[scala.Double], androiduixLib.androidNs.graphicsNs.Rect, ViewParent],
    isLayoutRequested: js.Function0[scala.Boolean],
    requestChildFocus: js.Function2[View, View, js.Any],
    requestChildRectangleOnScreen: js.Function3[View, androiduixLib.androidNs.graphicsNs.Rect, scala.Boolean, scala.Boolean],
    requestDisallowInterceptTouchEvent: js.Function1[scala.Boolean, js.Any],
    requestLayout: js.Function0[js.Any]
  ): ViewParent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bringChildToFront")(bringChildToFront)
    __obj.updateDynamic("childDrawableStateChanged")(childDrawableStateChanged)
    __obj.updateDynamic("childHasTransientStateChanged")(childHasTransientStateChanged)
    __obj.updateDynamic("clearChildFocus")(clearChildFocus)
    __obj.updateDynamic("focusSearch")(focusSearch)
    __obj.updateDynamic("focusableViewAvailable")(focusableViewAvailable)
    __obj.updateDynamic("getChildVisibleRect")(getChildVisibleRect)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("invalidateChild")(invalidateChild)
    __obj.updateDynamic("invalidateChildInParent")(invalidateChildInParent)
    __obj.updateDynamic("isLayoutRequested")(isLayoutRequested)
    __obj.updateDynamic("requestChildFocus")(requestChildFocus)
    __obj.updateDynamic("requestChildRectangleOnScreen")(requestChildRectangleOnScreen)
    __obj.updateDynamic("requestDisallowInterceptTouchEvent")(requestDisallowInterceptTouchEvent)
    __obj.updateDynamic("requestLayout")(requestLayout)
    __obj.asInstanceOf[ViewParent]
  }
}

