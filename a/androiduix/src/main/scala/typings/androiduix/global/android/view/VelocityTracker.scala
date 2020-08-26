package typings.androiduix.global.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.VelocityTracker")
@js.native
class VelocityTracker ()
  extends typings.androiduix.android.view.VelocityTracker

/* static members */
@JSGlobal("android.view.VelocityTracker")
@js.native
object VelocityTracker extends js.Object {
  var DEBUG: js.Any = js.native
  var MAX_AGE_MILLISECONDS: js.Any = js.native
  var NUM_PAST: js.Any = js.native
  var POINTER_POOL_CAPACITY: js.Any = js.native
  var TAG: js.Any = js.native
  var localLOGV: js.Any = js.native
  var sPool: js.Any = js.native
  var sRecycledPointerCount: js.Any = js.native
  var sRecycledPointerListHead: js.Any = js.native
  def obtain(): typings.androiduix.android.view.VelocityTracker = js.native
  /* private */ def obtainPointer(): js.Any = js.native
  /* private */ def releasePointer(pointer: js.Any): js.Any = js.native
  /* private */ def releasePointerList(pointer: js.Any): js.Any = js.native
}

