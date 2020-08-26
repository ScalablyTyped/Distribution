package typings.androiduix.android.view.animation

import typings.androiduix.java_.util.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationSet extends Animation {
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

