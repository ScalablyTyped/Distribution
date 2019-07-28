package typings.androiduix.androidNs.viewNs

import typings.androiduix.androidNs.graphicsNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.FocusFinder")
@js.native
class FocusFinder () extends js.Object {
  var mBestCandidateRect: Rect = js.native
  var mFocusedRect: Rect = js.native
  var mOtherRect: Rect = js.native
  var mSequentialFocusComparator: js.Any = js.native
  var mTempList: js.Any = js.native
  /* private */ def __findNextFocus(root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any, focusables: js.Any): js.Any = js.native
  /* private */ def _findNextFocus(root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any): js.Any = js.native
  def beamBeats(direction: Double, source: Rect, rect1: Rect, rect2: Rect): Boolean = js.native
  def beamsOverlap(direction: Double, rect1: Rect, rect2: Rect): Boolean = js.native
  def findNearestTouchable(root: ViewGroup, x: Double, y: Double, direction: Double, deltas: js.Array[Double]): View = js.native
  def findNextFocus(root: ViewGroup, focused: View, direction: Double): View = js.native
  def findNextFocusFromRect(root: ViewGroup, focusedRect: Rect, direction: Double): View = js.native
  /* private */ def findNextFocusInAbsoluteDirection(focusables: js.Any, root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any): js.Any = js.native
  /* private */ def findNextFocusInRelativeDirection(focusables: js.Any, root: js.Any, focused: js.Any, focusedRect: js.Any, direction: js.Any): js.Any = js.native
  /* private */ def findNextUserSpecifiedFocus(root: js.Any, focused: js.Any, direction: js.Any): js.Any = js.native
  def getWeightedDistanceFor(majorAxisDistance: Double, minorAxisDistance: Double): Double = js.native
  def isBetterCandidate(direction: Double, source: Rect, rect1: Rect, rect2: Rect): Boolean = js.native
  def isCandidate(srcRect: Rect, destRect: Rect, direction: Double): Boolean = js.native
  def isToDirectionOf(direction: Double, src: Rect, dest: Rect): Boolean = js.native
  /* private */ def isTouchCandidate(x: js.Any, y: js.Any, destRect: js.Any, direction: js.Any): js.Any = js.native
  /* private */ def setFocusBottomRight(root: js.Any, focusedRect: js.Any): js.Any = js.native
  /* private */ def setFocusTopLeft(root: js.Any, focusedRect: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.view.FocusFinder")
@js.native
object FocusFinder extends js.Object {
  var sFocusFinder: js.Any = js.native
  def getInstance(): FocusFinder = js.native
  /* private */ def getNextFocusable(focused: js.Any, focusables: js.Any, count: js.Any): js.Any = js.native
  /* private */ def getPreviousFocusable(focused: js.Any, focusables: js.Any, count: js.Any): js.Any = js.native
  def majorAxisDistance(direction: Double, source: Rect, dest: Rect): Double = js.native
  def majorAxisDistanceRaw(direction: Double, source: Rect, dest: Rect): Double = js.native
  def majorAxisDistanceToFarEdge(direction: Double, source: Rect, dest: Rect): Double = js.native
  def majorAxisDistanceToFarEdgeRaw(direction: Double, source: Rect, dest: Rect): Double = js.native
  def minorAxisDistance(direction: Double, source: Rect, dest: Rect): Double = js.native
}

