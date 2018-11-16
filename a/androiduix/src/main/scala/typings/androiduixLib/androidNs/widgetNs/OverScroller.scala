package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.OverScroller")
@js.native
class OverScroller () extends js.Object {
  def this(interpolator: androiduixLib.androidNs.viewNs.animationNs.Interpolator) = this()
  def this(interpolator: androiduixLib.androidNs.viewNs.animationNs.Interpolator, flywheel: scala.Boolean) = this()
  var mFlywheel: js.Any = js.native
  var mInterpolator: js.Any = js.native
  var mMode: js.Any = js.native
  var mScrollerX: js.Any = js.native
  var mScrollerY: js.Any = js.native
  def abortAnimation(): scala.Unit = js.native
  def computeScrollOffset(): scala.Boolean = js.native
  def fling(
    startX: scala.Double,
    startY: scala.Double,
    velocityX: scala.Double,
    velocityY: scala.Double,
    minX: scala.Double,
    maxX: scala.Double,
    minY: scala.Double,
    maxY: scala.Double
  ): scala.Unit = js.native
  def fling(
    startX: scala.Double,
    startY: scala.Double,
    velocityX: scala.Double,
    velocityY: scala.Double,
    minX: scala.Double,
    maxX: scala.Double,
    minY: scala.Double,
    maxY: scala.Double,
    overX: scala.Double
  ): scala.Unit = js.native
  def fling(
    startX: scala.Double,
    startY: scala.Double,
    velocityX: scala.Double,
    velocityY: scala.Double,
    minX: scala.Double,
    maxX: scala.Double,
    minY: scala.Double,
    maxY: scala.Double,
    overX: scala.Double,
    overY: scala.Double
  ): scala.Unit = js.native
  def forceFinished(finished: scala.Boolean): scala.Unit = js.native
  def getCurrVelocity(): scala.Double = js.native
  def getCurrX(): scala.Double = js.native
  def getCurrY(): scala.Double = js.native
  def getDuration(): scala.Double = js.native
  def getFinalX(): scala.Double = js.native
  def getFinalY(): scala.Double = js.native
  def getStartX(): scala.Double = js.native
  def getStartY(): scala.Double = js.native
  def isFinished(): scala.Boolean = js.native
  def isOverScrolled(): scala.Boolean = js.native
  def isScrollingInDirection(xvel: scala.Double, yvel: scala.Double): scala.Boolean = js.native
  def notifyHorizontalEdgeReached(startX: scala.Double, finalX: scala.Double, overX: scala.Double): scala.Unit = js.native
  def notifyVerticalEdgeReached(startY: scala.Double, finalY: scala.Double, overY: scala.Double): scala.Unit = js.native
  def setFriction(friction: scala.Double): scala.Unit = js.native
  def setInterpolator(interpolator: androiduixLib.androidNs.viewNs.animationNs.Interpolator): scala.Unit = js.native
  def springBack(
    startX: scala.Double,
    startY: scala.Double,
    minX: scala.Double,
    maxX: scala.Double,
    minY: scala.Double,
    maxY: scala.Double
  ): scala.Boolean = js.native
  def startScroll(startX: scala.Double, startY: scala.Double, dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  def startScroll(
    startX: scala.Double,
    startY: scala.Double,
    dx: scala.Double,
    dy: scala.Double,
    duration: scala.Double
  ): scala.Unit = js.native
  def timePassed(): scala.Double = js.native
}

@JSGlobal("android.widget.OverScroller")
@js.native
object OverScroller extends js.Object {
  var DEFAULT_DURATION: scala.Double = js.native
  var FLING_MODE: scala.Double = js.native
  var SCROLL_MODE: scala.Double = js.native
}

