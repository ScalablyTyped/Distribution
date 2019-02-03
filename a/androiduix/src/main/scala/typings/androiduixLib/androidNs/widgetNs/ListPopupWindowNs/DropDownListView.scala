package typings
package androiduixLib.androidNs.widgetNs.ListPopupWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListPopupWindow.DropDownListView")
@js.native
class DropDownListView protected ()
  extends androiduixLib.androidNs.widgetNs.ListView {
  def this(context: androiduixLib.androidNs.contentNs.Context, hijackFocus: scala.Boolean) = this()
  var mDrawsInPressedState: js.Any = js.native
  var mHijackFocus: js.Any = js.native
  var mListSelectionHidden: js.Any = js.native
  /* private */ def clearPressedItem(): js.Any = js.native
  /* private */ def clickPressedItem(child: js.Any, position: js.Any): js.Any = js.native
  def onForwardedEvent(event: androiduixLib.androidNs.viewNs.MotionEvent, activePointerId: scala.Double): scala.Boolean = js.native
  /* private */ def setPressedItem(child: js.Any, position: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.ListPopupWindow.DropDownListView")
@js.native
object DropDownListView extends js.Object {
  var CLICK_ANIM_ALPHA: js.Any = js.native
  var CLICK_ANIM_DURATION: js.Any = js.native
}

