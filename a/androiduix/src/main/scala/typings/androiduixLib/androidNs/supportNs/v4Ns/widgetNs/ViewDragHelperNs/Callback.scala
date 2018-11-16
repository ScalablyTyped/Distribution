package typings
package androiduixLib.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.widget.ViewDragHelper.Callback")
@js.native
abstract class Callback () extends js.Object {
  def clampViewPositionHorizontal(child: androiduixLib.androidNs.viewNs.View, left: scala.Double, dx: scala.Double): scala.Double = js.native
  def clampViewPositionVertical(child: androiduixLib.androidNs.viewNs.View, top: scala.Double, dy: scala.Double): scala.Double = js.native
  def getOrderedChildIndex(index: scala.Double): scala.Double = js.native
  def getViewHorizontalDragRange(child: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  def getViewVerticalDragRange(child: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  def onEdgeDragStarted(edgeFlags: scala.Double, pointerId: scala.Double): scala.Unit = js.native
  def onEdgeLock(edgeFlags: scala.Double): scala.Boolean = js.native
  def onEdgeTouched(edgeFlags: scala.Double, pointerId: scala.Double): scala.Unit = js.native
  def onViewCaptured(capturedChild: androiduixLib.androidNs.viewNs.View, activePointerId: scala.Double): scala.Unit = js.native
  def onViewDragStateChanged(state: scala.Double): scala.Unit = js.native
  def onViewPositionChanged(
    changedView: androiduixLib.androidNs.viewNs.View,
    left: scala.Double,
    top: scala.Double,
    dx: scala.Double,
    dy: scala.Double
  ): scala.Unit = js.native
  def onViewReleased(releasedChild: androiduixLib.androidNs.viewNs.View, xvel: scala.Double, yvel: scala.Double): scala.Unit = js.native
  def tryCaptureView(child: androiduixLib.androidNs.viewNs.View, pointerId: scala.Double): scala.Boolean = js.native
}

