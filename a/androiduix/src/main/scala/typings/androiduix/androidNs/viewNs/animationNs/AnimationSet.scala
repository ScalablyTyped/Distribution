package typings.androiduix.androidNs.viewNs.animationNs

import typings.androiduix.javaNs.utilNs.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.animation.AnimationSet")
@js.native
class AnimationSet () extends Animation {
  def this(shareInterpolator: Boolean) = this()
  var mAnimations: js.Any = js.native
  var mDirty: js.Any = js.native
  var mFlags: js.Any = js.native
  var mHasAlpha: js.Any = js.native
  var mLastEnd: js.Any = js.native
  var mStoredOffsets: js.Any = js.native
  var mTempTransformation: js.Any = js.native
  def addAnimation(a: Animation): Unit = js.native
  def getAnimations(): List[Animation] = js.native
  /* private */ def init(): js.Any = js.native
  def restoreChildrenStartOffset(): Unit = js.native
  /* private */ def setFlag(mask: js.Any, value: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.view.animation.AnimationSet")
@js.native
object AnimationSet extends js.Object {
  var PROPERTY_CHANGE_BOUNDS_MASK: js.Any = js.native
  var PROPERTY_DURATION_MASK: js.Any = js.native
  var PROPERTY_FILL_AFTER_MASK: js.Any = js.native
  var PROPERTY_FILL_BEFORE_MASK: js.Any = js.native
  var PROPERTY_MORPH_MATRIX_MASK: js.Any = js.native
  var PROPERTY_REPEAT_MODE_MASK: js.Any = js.native
  var PROPERTY_SHARE_INTERPOLATOR_MASK: js.Any = js.native
  var PROPERTY_START_OFFSET_MASK: js.Any = js.native
}

