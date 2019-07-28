package typings.androiduix.androidNs.viewNs.ViewNs

import typings.androiduix.androidNs.graphicsNs.Matrix
import typings.androiduix.androidNs.graphicsNs.Point
import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.osNs.Handler
import typings.androiduix.androidNs.viewNs.KeyEventNs.DispatcherState
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewRootImpl
import typings.androiduix.androidNs.viewNs.animationNs.Transformation
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.View.AttachInfo")
@js.native
class AttachInfo protected () extends js.Object {
  def this(mViewRootImpl: ViewRootImpl, mHandler: Handler) = this()
  var mHandler: Handler = js.native
  var mHasWindowFocus: Boolean = js.native
  var mInvalidateChildLocation: js.Array[Double] = js.native
  var mKeyDispatchState: DispatcherState = js.native
  var mPoint: Point = js.native
  var mRootView: View = js.native
  var mScrollContainers: Set[View] = js.native
  var mTmpInvalRect: Rect = js.native
  var mTmpMatrix: Matrix = js.native
  var mTmpTransformLocation: js.Array[Double] = js.native
  var mTmpTransformRect: Rect = js.native
  var mTmpTransformation: Transformation = js.native
  var mViewRequestingLayout: View = js.native
  var mViewRootImpl: ViewRootImpl = js.native
  var mWindowVisibility: Double = js.native
}

