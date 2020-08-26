package typings.androiduix.global.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewRootImpl")
@js.native
class ViewRootImpl ()
  extends typings.androiduix.android.view.ViewRootImpl

/* static members */
@JSGlobal("android.view.ViewRootImpl")
@js.native
object ViewRootImpl extends js.Object {
  @js.native
  class RunQueue ()
    extends typings.androiduix.android.view.ViewRootImpl.RunQueue
  
  var ContinueEventToDom: js.Symbol = js.native
  var DBG: js.Any = js.native
  var DEBUG_CONFIGURATION: Boolean = js.native
  var DEBUG_DRAW: Boolean = js.native
  var DEBUG_FPS: Boolean = js.native
  var DEBUG_INPUT_RESIZE: Boolean = js.native
  var DEBUG_LAYOUT: Boolean = js.native
  var DEBUG_ORIENTATION: Boolean = js.native
  var LOCAL_LOGV: Boolean = js.native
  var RunQueueInstance: js.Any = js.native
  var TAG: String = js.native
  /* private */ def findAncestorToTakeFocusInTouchMode(focused: js.Any): js.Any = js.native
  /* private */ def getRootMeasureSpec(windowSize: js.Any, rootDimension: js.Any): js.Any = js.native
  def getRunQueue(): typings.androiduix.android.view.ViewRootImpl.RunQueue = js.native
  def getRunQueue(viewRoot: typings.androiduix.android.view.ViewRootImpl): typings.androiduix.android.view.ViewRootImpl.RunQueue = js.native
  /* private */ def isNavigationKey(keyEvent: js.Any): js.Any = js.native
  /* private */ def isTypingKey(keyEvent: js.Any): js.Any = js.native
  def isViewDescendantOf(child: typings.androiduix.android.view.View, parent: typings.androiduix.android.view.View): js.Any = js.native
}

