package typings.androiduix.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelperNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.widget.ViewDragHelper.Callback")
@js.native
abstract class Callback () extends js.Object {
  def clampViewPositionHorizontal(child: View, left: Double, dx: Double): Double = js.native
  def clampViewPositionVertical(child: View, top: Double, dy: Double): Double = js.native
  def getOrderedChildIndex(index: Double): Double = js.native
  def getViewHorizontalDragRange(child: View): Double = js.native
  def getViewVerticalDragRange(child: View): Double = js.native
  def onEdgeDragStarted(edgeFlags: Double, pointerId: Double): Unit = js.native
  def onEdgeLock(edgeFlags: Double): Boolean = js.native
  def onEdgeTouched(edgeFlags: Double, pointerId: Double): Unit = js.native
  def onViewCaptured(capturedChild: View, activePointerId: Double): Unit = js.native
  def onViewDragStateChanged(state: Double): Unit = js.native
  def onViewPositionChanged(changedView: View, left: Double, top: Double, dx: Double, dy: Double): Unit = js.native
  def onViewReleased(releasedChild: View, xvel: Double, yvel: Double): Unit = js.native
  def tryCaptureView(child: View, pointerId: Double): Boolean = js.native
}

