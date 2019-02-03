package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.FocusFinder")
@js.native
class FocusFinder () extends js.Object {
  var mBestCandidateRect: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mFocusedRect: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mOtherRect: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mSequentialFocusComparator: js.Any = js.native
  var mTempList: js.Any = js.native
  /* private */ def __findNextFocus(root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any, focusables: js.Any): js.Any = js.native
  /* private */ def _findNextFocus(root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any): js.Any = js.native
  def beamBeats(
    direction: scala.Double,
    source: androiduixLib.androidNs.graphicsNs.Rect,
    rect1: androiduixLib.androidNs.graphicsNs.Rect,
    rect2: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Boolean = js.native
  def beamsOverlap(
    direction: scala.Double,
    rect1: androiduixLib.androidNs.graphicsNs.Rect,
    rect2: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Boolean = js.native
  def findNearestTouchable(
    root: ViewGroup,
    x: scala.Double,
    y: scala.Double,
    direction: scala.Double,
    deltas: js.Array[scala.Double]
  ): View = js.native
  def findNextFocus(root: ViewGroup, focused: View, direction: scala.Double): View = js.native
  def findNextFocusFromRect(root: ViewGroup, focusedRect: androiduixLib.androidNs.graphicsNs.Rect, direction: scala.Double): View = js.native
  /* private */ def findNextFocusInAbsoluteDirection(focusables: js.Any, root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any): js.Any = js.native
  /* private */ def findNextFocusInRelativeDirection(focusables: js.Any, root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any): js.Any = js.native
  /* private */ def findNextUserSpecifiedFocus(root: js.Any, focused: js.Any, direction: js.Any): js.Any = js.native
  def getWeightedDistanceFor(majorAxisDistance: scala.Double, minorAxisDistance: scala.Double): scala.Double = js.native
  def isBetterCandidate(
    direction: scala.Double,
    source: androiduixLib.androidNs.graphicsNs.Rect,
    rect1: androiduixLib.androidNs.graphicsNs.Rect,
    rect2: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Boolean = js.native
  def isCandidate(
    srcRect: androiduixLib.androidNs.graphicsNs.Rect,
    destRect: androiduixLib.androidNs.graphicsNs.Rect,
    direction: scala.Double
  ): scala.Boolean = js.native
  def isToDirectionOf(
    direction: scala.Double,
    src: androiduixLib.androidNs.graphicsNs.Rect,
    dest: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Boolean = js.native
  /* private */ def isTouchCandidate(x: js.Any, y: js.Any, destRect: js.Any, direction: js.Any): js.Any = js.native
  /* private */ def setFocusBottomRight(root: js.Any, focusedRect: js.Any): js.Any = js.native
  /* private */ def setFocusTopLeft(root: js.Any, focusedRect: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.view.FocusFinder")
@js.native
object FocusFinder extends js.Object {
  var sFocusFinder: js.Any = js.native
  def getInstance(): androiduixLib.androidNs.viewNs.FocusFinder = js.native
  /* private */ def getNextFocusable(focused: js.Any, focusables: js.Any, count: js.Any): js.Any = js.native
  /* private */ def getPreviousFocusable(focused: js.Any, focusables: js.Any, count: js.Any): js.Any = js.native
  def majorAxisDistance(
    direction: scala.Double,
    source: androiduixLib.androidNs.graphicsNs.Rect,
    dest: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Double = js.native
  def majorAxisDistanceRaw(
    direction: scala.Double,
    source: androiduixLib.androidNs.graphicsNs.Rect,
    dest: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Double = js.native
  def majorAxisDistanceToFarEdge(
    direction: scala.Double,
    source: androiduixLib.androidNs.graphicsNs.Rect,
    dest: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Double = js.native
  def majorAxisDistanceToFarEdgeRaw(
    direction: scala.Double,
    source: androiduixLib.androidNs.graphicsNs.Rect,
    dest: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Double = js.native
  def minorAxisDistance(
    direction: scala.Double,
    source: androiduixLib.androidNs.graphicsNs.Rect,
    dest: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Double = js.native
}

