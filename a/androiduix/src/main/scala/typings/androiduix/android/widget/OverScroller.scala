package typings.androiduix.android.widget

import typings.androiduix.android.view.animation.Interpolator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverScroller extends js.Object {
  
  def abortAnimation(): Unit = js.native
  
  def computeScrollOffset(): Boolean = js.native
  
  def fling(
    startX: Double,
    startY: Double,
    velocityX: Double,
    velocityY: Double,
    minX: Double,
    maxX: Double,
    minY: Double,
    maxY: Double
  ): Unit = js.native
  def fling(
    startX: Double,
    startY: Double,
    velocityX: Double,
    velocityY: Double,
    minX: Double,
    maxX: Double,
    minY: Double,
    maxY: Double,
    overX: js.UndefOr[scala.Nothing],
    overY: Double
  ): Unit = js.native
  def fling(
    startX: Double,
    startY: Double,
    velocityX: Double,
    velocityY: Double,
    minX: Double,
    maxX: Double,
    minY: Double,
    maxY: Double,
    overX: Double
  ): Unit = js.native
  def fling(
    startX: Double,
    startY: Double,
    velocityX: Double,
    velocityY: Double,
    minX: Double,
    maxX: Double,
    minY: Double,
    maxY: Double,
    overX: Double,
    overY: Double
  ): Unit = js.native
  
  def forceFinished(finished: Boolean): Unit = js.native
  
  def getCurrVelocity(): Double = js.native
  
  def getCurrX(): Double = js.native
  
  def getCurrY(): Double = js.native
  
  def getDuration(): Double = js.native
  
  def getFinalX(): Double = js.native
  
  def getFinalY(): Double = js.native
  
  def getStartX(): Double = js.native
  
  def getStartY(): Double = js.native
  
  def isFinished(): Boolean = js.native
  
  def isOverScrolled(): Boolean = js.native
  
  def isScrollingInDirection(xvel: Double, yvel: Double): Boolean = js.native
  
  var mFlywheel: js.Any = js.native
  
  var mInterpolator: js.Any = js.native
  
  var mMode: js.Any = js.native
  
  var mScrollerX: js.Any = js.native
  
  var mScrollerY: js.Any = js.native
  
  def notifyHorizontalEdgeReached(startX: Double, finalX: Double, overX: Double): Unit = js.native
  
  def notifyVerticalEdgeReached(startY: Double, finalY: Double, overY: Double): Unit = js.native
  
  def setFriction(friction: Double): Unit = js.native
  
  def setInterpolator(interpolator: Interpolator): Unit = js.native
  
  def springBack(startX: Double, startY: Double, minX: Double, maxX: Double, minY: Double, maxY: Double): Boolean = js.native
  
  def startScroll(startX: Double, startY: Double, dx: Double, dy: Double): Unit = js.native
  def startScroll(startX: Double, startY: Double, dx: Double, dy: Double, duration: Double): Unit = js.native
  
  def timePassed(): Double = js.native
}
