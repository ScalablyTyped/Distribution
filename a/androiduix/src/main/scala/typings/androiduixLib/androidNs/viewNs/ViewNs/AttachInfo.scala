package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.View.AttachInfo")
@js.native
class AttachInfo protected () extends js.Object {
  def this(mViewRootImpl: androiduixLib.androidNs.viewNs.ViewRootImpl, mHandler: androiduixLib.androidNs.osNs.Handler) = this()
  var mHandler: androiduixLib.androidNs.osNs.Handler = js.native
  var mHasWindowFocus: scala.Boolean = js.native
  var mInvalidateChildLocation: js.Array[scala.Double] = js.native
  var mKeyDispatchState: androiduixLib.androidNs.viewNs.KeyEventNs.DispatcherState = js.native
  var mPoint: androiduixLib.androidNs.graphicsNs.Point = js.native
  var mRootView: androiduixLib.androidNs.viewNs.View = js.native
  var mScrollContainers: stdLib.Set[androiduixLib.androidNs.viewNs.View] = js.native
  var mTmpInvalRect: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mTmpMatrix: androiduixLib.androidNs.graphicsNs.Matrix = js.native
  var mTmpTransformLocation: js.Array[scala.Double] = js.native
  var mTmpTransformRect: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mTmpTransformation: androiduixLib.androidNs.viewNs.animationNs.Transformation = js.native
  var mViewRequestingLayout: androiduixLib.androidNs.viewNs.View = js.native
  var mViewRootImpl: androiduixLib.androidNs.viewNs.ViewRootImpl = js.native
  var mWindowVisibility: scala.Double = js.native
}

