package typings.androiduix.androidNs.widgetNs.ListPopupWindowNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.viewNs.MotionEvent
import typings.androiduix.androidNs.widgetNs.ListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListPopupWindow.DropDownListView")
@js.native
class DropDownListView protected () extends ListView {
  def this(context: Context, hijackFocus: Boolean) = this()
  var mDrawsInPressedState: js.Any = js.native
  var mHijackFocus: js.Any = js.native
  var mListSelectionHidden: js.Any = js.native
  /* private */ def clearPressedItem(): js.Any = js.native
  /* private */ def clickPressedItem(child: js.Any, position: js.Any): js.Any = js.native
  def onForwardedEvent(event: MotionEvent, activePointerId: Double): Boolean = js.native
  /* private */ def setPressedItem(child: js.Any, position: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.ListPopupWindow.DropDownListView")
@js.native
object DropDownListView extends js.Object {
  var CLICK_ANIM_ALPHA: js.Any = js.native
  var CLICK_ANIM_DURATION: js.Any = js.native
}

